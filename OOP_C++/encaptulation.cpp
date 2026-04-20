// Encptulation->waraping up of data and functions into a single unit.
// banking systeam
#include <bits/stdc++.h>
using namespace std;
class BankAccount
{
private:
    double balance;
    string password; // data hiding
    string accountHolderName;

public:
    string accountId;//
    string accountType;
    string username;
    string phoneNumber;



    void setPassword(string pass)
    {
        password = pass;
    }
    string getPassword()
    {
        return password;
    }
    void setBalance(double bal)
    {
        balance = bal;
    }
    double getBalance()
    {
        return balance;
    }
    void setAccountHolderName(string name)
    {
        accountHolderName = name;
    }
    string getAccountHolderName()
    {
        return accountHolderName;
    }
};

int main()
{

    system("cls");
    BankAccount account1;//constructor is called here

    // Setting values directly (not recommended for private members)
    account1.accountId = "1234567890";
    account1.accountType = "Savings";
    account1.username = "JohnDoe";
    account1.phoneNumber = "1234567890";

    // Setting values using setter methods
    account1.setPassword("password123");
    account1.setBalance(1000.0);
    account1.setAccountHolderName("Md.Emon Hossain");

    cout << "Bank Account Details:" << endl
         << endl;
    cout << "Account ID: " << account1.accountId << endl;
    cout << "Account Type: " << account1.accountType << endl;
    cout << "Username: " << account1.username << endl;
    cout << "Phone Number: " << account1.phoneNumber << endl;
    cout << "Password: " << account1.getPassword() << endl;
    cout << "Balance: " << account1.getBalance() << endl;
    cout << "Account Holder Name: " << account1.getAccountHolderName() << endl;
    return 0;
}
