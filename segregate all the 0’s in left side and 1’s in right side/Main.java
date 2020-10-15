#include <stdio.h>
int main()
{
   // Try out your code here
   int n,a[128],t;
   scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    }
  
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     {
       if(a[i]<=a[j])
       {
         t=a[j];
         a[j]=a[i];
         a[i]=t;
       }
     }
   }
     for(int i=0;i<n;i++)
     {
       printf("%d",a[i]);
     }
   return 0;
}