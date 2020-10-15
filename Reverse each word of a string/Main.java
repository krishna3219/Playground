#include <iostream>
#include<string.h>
#include<stdio.h>
using namespace std;

int main() 
{
    string str;
    getline(cin,str);
    int i,j,len, startindex,endindex;
    len = str.size();
    endindex = len -1;
    
  
    for( i= len -1;i>=0;i--)
    {
      if( str[i] == ' ' ||  i == 0)
      {
         if(i==0)
         {
           startindex = 0;
         }
        else
        {
          startindex = i +1;
        }
        
        
        for( j= startindex ; j <=  endindex;j++)
        {
          cout<<str[j];
        }
        
        
        endindex = i-1;
        cout<<" ";
      }
    }
  return 0;
}

          
        
 