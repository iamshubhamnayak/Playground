#include<iostream>
using namespace std;
int main()
{
  int x,y,r1,r2;
  cin>>x>>y;
  r1=x/y;
  r2=x%y;
  cout<<"The number of students in each team is "<<r1<<" and left out is "<<r2;
}