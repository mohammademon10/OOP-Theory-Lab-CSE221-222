#include <iostream>
using namespace std;

class Example {
private:
    int value;

public:
    // Default Constructor
    Example() {
        value = 0;
        cout << "Default Constructor called! Value: " << value << endl;
    }

    // Parameterized Constructor
    Example(int v) {
        value = v;
        cout << "Parameterized Constructor called! Value: " << value << endl;
    }

    // Copy Constructor
    Example(const Example &obj) {
        value = obj.value;
        cout << "Copy Constructor called! Value: " << value << endl;
    }

    // Function to display the value
    void display() {
        cout << "Value: " << value << endl;
    }
};

int main() {
    // Default Constructor
    Example obj1;
    obj1.display();

    // Parameterized Constructor
    Example obj2(42);
    obj2.display();

    // Copy Constructor
    Example obj3 = obj2;
    obj3.display();

    return 0;
}