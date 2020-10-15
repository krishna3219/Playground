#include <iostream>
using namespace std;

int main() 
{
    int a,b[15],i=0,j,s,t,u,n=0;
    cin>>a;
    while(a!=0)
    {
      b[i++]= a%10;
      a/= 10;
      n++;
    }
    for(s=0;s<n;s++)
    {
      for(t =s+1;t<n;t++)
      {
        if(b[s]>b[t])
        {
          u= b[s];
          b[s] = b[t];
          b[t] = u;
        }
      }
    }
  for( j =0;j<n;j++)
  {
    cout<<b[j]<<" ";
  }
  
    return 0;
}