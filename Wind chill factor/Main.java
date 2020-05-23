#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  double t,v,m,n,o,p,q;
  double wcf;
  cin>>t>>v;
  m=35.74;
  n=0.6215*t;
  o=((0.4275)*t)-(35.75);
  p=pow(v,0.16);
  q=o*p;
  wcf=m+n+q;
  cout<<wcf;
  
}