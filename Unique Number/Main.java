#include <iostream>
using namespace std;

int main() 
{
  int l,u,c=0,x,z;
  cin>>l;
  cin>>u;
  for(int i=l;i<=u;i++)
  {
   
    x= i%10;
    z = i/10;
    if(x!=z)
    {
      c++;
    }
  }
  if (c==0)
  {
    cout<<"No Unique Number";
  }
  else
  {
    cout<<c;
  } 
}