#include<iostream>
using namespace std;
int main()
{
  int a,b,c,r1,r2,r3;
  cin>>a>>b>>c;
  r1=(a*b)/100;
  r2=((a-r1)*c)/100;
  r3=(a-r1-r2)/3;
  cout<<r1<<"\n"<<r2<<"\n"<<r3;
  return 0;
}