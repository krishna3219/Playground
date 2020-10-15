#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
    int s,n,m,x,y,z,a;
  cin>> s>>n>>m;
    x = pow(s,n);
    y = x % 10;
    z = pow(y,m);
    a = z % 1000000007;
    cout<< a;
    return 0;
}