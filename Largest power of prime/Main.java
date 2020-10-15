#include <iostream>
using namespace std;

int res(int n, int p)
{
  int x=0;
   while(n)
   {
     n/=p;
     x+=n;
   }
  return x;
}

int main() 
{
   int n,p,t;
   cin>>t;
   while(t--)
   {
     cin>>n>>p;
     cout<<res(n,p);
     cout<<endl;
   }
   return 0;
}