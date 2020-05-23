#include <iostream>
using namespace std;
int main(){
   //n is the number of elements in the array
   int n, largest;
   int num[50];
   cin>>n;
   for(int i = 0; i < n; i++) {
      cin>>num[i];
   }
   largest = num[0];
   for(int i = 1;i < n; i++) {
    
      if(largest < num[i])
         largest = num[i];
   } 
   cout<<largest;
   return 0;
}