#include<iostream>
using namespace std;
int main()
{
 int x1,y1,x2,y2;
  float r1,r2;
  cin>>x1>>y1>>x2>>y2;
  r1=float(x1+x2)/2;
  r2=float(y1+y2)/2;
  cout<<"Binoy's house is located at "<<"("<<r1<<", "<<r2<<")";
}