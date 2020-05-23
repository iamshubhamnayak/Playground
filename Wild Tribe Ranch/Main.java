#include<iostream>
using namespace std;
int main()
{
  int n,k;
  cin>>n;
  cin>>k;
  if(k<n)
    cout<<"Yes, you can enter.";
  else if(k==n)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
  return 0;
}
    