

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
    
    Teacher( string name, string subject, string dept)
    {
        this->name = name;
        this->subject = subject;
        this->dept = dept;
    }

    Teacher(const Teacher &t)//passing object as reference
    {
        cout<<"i am coustum constructor"<<endl;
        this->name = t.name;
        this->subject = t.subject;
        this->dept = t.dept;
    }


    void getDetails()
    {
        cout << "Name: " << name << endl;
        cout << "Subject: " << subject << endl;
        cout << "Department: " << dept << endl;
    }

   
};

int main()
{
    Teacher t1("Md. Emon Hossain", "Mathematics", "Science");
   
    Teacher t4(t1); //coustum  copy constructor
     t4.getDetails();
  
}
