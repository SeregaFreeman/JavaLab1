#include <iostream>
#include <cmath>
#include <windows.h>

using namespace std;

int term(char symb)
{
    switch (symb)
    {
    case '0':
        ;
    case '1':
        ;
    case '2':
        ;
    case '3':
        ;
    case '4':
        ;
    case '5':
        ;
    case '6':
        ;
    case '7':
        ;
    case '8':
        ;
    case '9':
        return 0;
    case '.':
        return 1;
    case 'e':
        ;
    case 'E':
        return 2;
    case '+':
        ;
    case '-':
        return 3;
    default :
        return 4;
    }
}

int main(int argc,char argv[])
{
    int avt[8][5]= {1,3,8,2,8, //0
                    1,3,5,8,8, //1
                    1,3,8,8,8, //2
                    4,8,8,8,8, //3
                    4,8,5,8,8, //4
                    7,8,8,6,8, //5
                    7,8,8,8,8, //6
                    7,8,8,8,8
                   };//7
    int fv[8]= {0,1,0,0,1,0,0,1};
    int top_index=0;
    string s;

    cout << "Give me a float> ";
    cin >> s;
    for (int i=0; i<s.length(); i++)
    {
        top_index=avt[top_index][term(s[i])];
        cout << top_index << "->";
        if (top_index==8)
        {
            cout << "Oh, no... it's incorrect.\n";
            return 1;
        }
    }

    if (fv[top_index])
    {
        cout << "Yeah! This float is correct.\n";
    }
    else
    {
        cout << "Oh, no... it's incorrect.\n";
    }
    return 0;
}
