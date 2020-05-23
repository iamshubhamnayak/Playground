#include<iostream>
using namespace std;
int main()
{
 float x,m;
  int p,d;
  cin>>m;
  cin>>p>>d;
  x=m*p;
  if(d<=x)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;

}