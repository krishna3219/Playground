#include <iostream>
using namespace std;

int countexp(int i)
{
  int c =0;
  while((i%2==0) && (i!=0))
  {
    c++;
    i = i/2;
  }
  return c;
}

int maxexp(int a,int b)
{
  int max = -1, num =0,temp;
  for(int i = a;i<= b;i++)
  {
    temp = countexp(i);
    if(temp>max)
    {
      max =temp;
      num = i;
    }
  }
  return num;
}
    
int main() 
{
    int a,b;
    cin>>a>>b;
    cout<< maxexp(a,b);
    return 0;
}