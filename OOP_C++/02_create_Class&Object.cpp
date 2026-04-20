#include <bits/stdc++.h>
using namespace std;
#define ll long long

class MyClass
{                    // The class
public:              // Access specifier
    int myNum;       // Attribute (int variable)
    string myString; // Attribute (string variable)
};
int main()
{
    MyClass myObj; // Create an object of MyClass

    // Access attributes and set values
    myObj.myNum = 818;
    myObj.myString = "Md. Emon Hossain";

    // Print attribute values
    cout << myObj.myNum << endl;
    cout << myObj.myString << endl;
    return 0;
}
