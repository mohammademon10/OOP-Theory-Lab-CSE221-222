#include <bits/stdc++.h>
using namespace std;

class Teacher
{
private:
    double salary;

public:
    string name;
    string subject;
    string dept;
    // non_perametertized constructor->default constructor
    Teacher()
    {
        cout << "Department Of CSE" << endl;
    }

    // parameterized constructor
    Teacher(string n, string s, string dept)
    {
        name = n;
        subject = s;
        dept = dept;
    }
    /*
    //parameterized constructor(same as above)
    Teacher(string name, string subject, string dept)
    {
        this->name = name;
        this->subject = subject;
        this->dept = dept;
    }
   */

    // cpoy constructor
    Teacher(const Teacher &t)//passing object as reference
    {
        cout<<"i am coustum constructor"<<endl;
        this->name = t.name;
        this->subject = t.subject;
       this-> dept = t.dept;
    }


    void getDetails()
    {
        cout << "Name: " << name << endl;
        cout << "Subject: " << subject << endl;
        cout << "Department: " << dept << endl;
    }

    // when two or more types onstructors are defined in a class, it is called constructor overloading
};

int main()
{
    Teacher t1("John Doe", "Mathematics", "Science");
    Teacher t2("Jane Smith", "Physics", "Science");
    Teacher t3("Alice Johnson", "Chemistry", "Science");
    //Teacher t4(t1); //default copy constructor
    // t1.getDetails();
    t1.getDetails();
}