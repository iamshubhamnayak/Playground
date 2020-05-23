#include<iostream>
#include<math.h>

using namespace std;
int main()
{
  float n;
  float x,y,z;
  cin>>n;
  x=1/sqrt(n);
  z=n*x;
  y=floor(n+z)+1;
  cout<<y;
}