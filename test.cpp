include <iostream>
#include <string>
using namespace std;

int main()
{

    int n = 512;
    string str = "";
    string newStr = "";
    str = to_string(n);

    for (int i = 0; i < str.length(); i++)
    {
        newStr += str[i];
        newStr += " ";
    }
    cout << newStr;
}