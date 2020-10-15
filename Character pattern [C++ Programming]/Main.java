#include<iostream>
using namespace std;

void printpattern(int n)
{
	for(int i=0;i<n;i++)
    {
      for(int j=0;j<=i;j++)
      {
        if(j%2 == 0)
        {
          cout<<"*";
        }
        else
        {
          cout<<"#";
        }
      }
      cout<<"\n";
    }
}


int main()
{
    int a;
    cin>>a;
    printpattern(a);
    return 0;
}
