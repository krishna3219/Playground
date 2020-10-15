#include <iostream>
using namespace std;

int main() 
{
  int n,t;
  cin>>n;
  int a[20],b[20];
  for(int i=0;i<n;i++)
  {
   cin >> a[i];
  }
  for(int i=0;i< n;i++)
  {
    int sum =0;
    while(a[i]!=0)
    {
      t =a[i] % 10;
      a[i] = a[i] /10;
      sum = sum+t;
    }
    b[i] = sum;
  }
  
  for(int i =0;i< n;i++)
  {
    cout<<b[i]<<" ";
  }
  return 0;
      
     
}