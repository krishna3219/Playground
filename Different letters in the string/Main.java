#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
    string s1,s2;
    cin>>s1;
    cin>>s2;
    for(int i=0,j=0;i< s1.length();i++)
    {
      if(s1[i]==s2[j])
      {
        j++;
      }
      else
      {
        cout<<s1[i];
      }
       if(j==s1.length())
      {
        cout<<"NA";
      }
    }
    return 0;
}