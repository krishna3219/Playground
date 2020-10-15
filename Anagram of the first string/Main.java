#include <stdio.h>
#include<string.h>

int main()
{
    char a[20],b[20];
    int  i,x,y,freq[128]={0};
    gets(a);
    gets(b);
    x= strlen(a);
    y= strlen(b);
    for(i=0;i<x;i++)
    {
        freq[a[i]]++;
    }
    for(i=0;i<y;i++)
    {
        freq[b[i]]--;
    }
    for(i=0;i<128;i++)
    {
        if(freq[i]!=0)
        {
            printf("Not anagrams");
            return 0;
        }
    }
    printf("Anagram");
}