#include<iostream>
using namespace std;
int main()
{
  float item1,item2,r1,r2,r3;
  float disc;
  cin>>item1>>item2>>disc;
  r1=item1+item2;
  r2=r1*(disc/100);
  r3=r1-r2;
  cout<<r1<<"\n"<<r3<<"\n"<<r2;
}