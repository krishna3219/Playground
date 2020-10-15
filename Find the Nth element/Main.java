#include <iostream>
using namespace std;
int n;
struct Node
{
  int data;
  struct Node *next;
 };
 
struct Node *head = NULL;

void push_front(int value)
{
  Node *newnode = new Node;
  newnode -> data = value;
  newnode -> next = head;
  head = newnode;
}


int print_value(int search)
{
  Node *temp = head;
  if(head == NULL)
  {
    return -1;
  }
  else
  { 
    
    int i=::n;
    while(i != search)
    {
      temp =temp->next;
      i--;
    }
    int z;
    z=temp-> data;
    return z;    
  }
}
      
  

  

int main() 
{
   cin>> ::n;
  int i=0;
   while(i < ::n)
   {
     int x;
     cin>>x;
     push_front(x);
     i++;
   }
   int y;
  cin >>y;
  
  if(y<n)
  { 
    int a;
    a= print_value(y);
    if(a== -1)
    {
      cout<<"Linked list is empty";
      
    }
    else
    {
      cout<< a;
    }     
  }
  else
  {
    cout<<"No node found";
  }
  return 0;
}