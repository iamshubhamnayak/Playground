#include<iostream>
using namespace std;
int main()
{
  int x,y,op;
  cin>>x>>y;
  if(x>y)
    op=(100-x)+y;
  else
    op=y-x;
  cout<<op;
  return 0;
}