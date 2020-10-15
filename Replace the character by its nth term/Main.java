#include <iostream>
#include<string.h>
#include<stdio.h>
using namespace std;

int main() 
{
  string a;
  getline(cin,a);
  int l = a.size();
  int n;
  cin>>n;
  
  for(int i=1;i<=l;i++)
  {
    if(a[i] == a[n])
    {
      for(int j=1;j<=l;j++)
      {
        cout<<a[n-1];
      }
      
    }
  
    
  }
  return 0;
}