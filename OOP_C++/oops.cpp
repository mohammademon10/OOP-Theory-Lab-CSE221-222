#include <iostream>
#include <string>
using namespace std;

class Teacher
{
private:
    double salary;

public:
    string name;
    string subject;
    string dept;
    //double salary;

   /* 
   void changeDepartment(string newDept)
    {
        dept = newDept;
    }
     */

    // setter->to set the value of private member variable salary
    void setSalary(double salary)
    {
     this-> salary = salary; // this->salary = salary; // this->salary is used to refer to the class member variable
    }
    // getter->to get the value of private member variable salary
    double getSalary()
    {
        return salary;
    }
};
class Student
{
public:
    string name;
    int rollNo;
    string dept;
    double cgpa;
};

class StudentDetails
{
public:
    string name;
    int rollNo;
    string dept;
    double cgpa;
};

int main()
{
    system("cls");

    // objects of Teacher class
    Teacher t1;
    t1.name = "John Doe";
    t1.subject = "Mathematics";
    t1.dept = "Science";
    // t1.salary = 50000.0;
    t1.setSalary(60000.01); // setting the salary using setter function

    cout << "Teacher Name: " << t1.name << endl;
    cout << "Subject: " << t1.subject << endl;
    cout << "Department: " << t1.dept << endl
         << endl;
    // cout << "Salary: $" << t1.salary << endl;//public member variable salary can be accessed directly
    cout << "Salary: " << t1.getSalary() << endl; // getting the salary using getter function
    cout << endl;

    // objects of Student class
    Student s1, s2, s3;
    s1.name = "Alice";
    s1.rollNo = 101;
    s1.dept = "Computer Science";
    s1.cgpa = 3.8;

    s2.name = "Bob";
    s2.rollNo = 102;
    s2.dept = "Mathematics";
    s2.cgpa = 3.6;

    s3.name = "Charlie";
    s3.rollNo = 103;
    s3.dept = "Physics";
    s3.cgpa = 3.9;

    cout << "Student 1 Name: " << s1.name << endl;
    cout << "Roll No: " << s1.rollNo << endl;
    cout << "Department: " << s1.dept << endl;
    cout << "CGPA: " << s1.cgpa << endl
         << endl;

    cout << "Student 2 Name: " << s2.name << endl;
    cout << "Roll No: " << s2.rollNo << endl;
    cout << "Department: " << s2.dept << endl;
    cout << "CGPA: " << s2.cgpa << endl
         << endl;

    cout << "Student 3 Name: " << s3.name << endl;
    cout << "Roll No: " << s3.rollNo << endl;
    cout << "Department: " << s3.dept << endl;
    cout << "CGPA: " << s3.cgpa << endl;

    return 0;
}
