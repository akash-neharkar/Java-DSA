// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;

// void passbyvalue(int n){
//         n++;
// }

// void passbyreference(int &n){
//         n++;
// }

// void swap(int* a, int* b){
//     int temp = *a;
//     *a = *b;
//     *b = temp; 
//}
int main() {
    int a = 10;
    int *aptr;
    aptr = &a;
    cout << a << endl;
    cout << *aptr << endl;
    cout << &a << endl;
    cout << aptr << endl;
    aptr--;
    cout << aptr;
    
    // int arr[] = {4,5,6,7,8,9};
    // int* ptr = arr;
    
    // for(int i=0; i<6;i++){
    //     cout<<*ptr<<" ";
    //     ptr++;
    // }
    
    // for(int i=0; i<6;i++){
    //     cout<<*(arr+i)<<" ";
    // }
    
    // int n = 10;
    // int* p = &n;
    // int** q = &p;
    
    // cout << n << endl;
    // cout << p << endl;
    // cout << q << endl;
    // cout << *p << endl;
    // cout << *q << endl;
    // cout << **q << endl;
    
    // int a = 10;
    // int b = 12;
    // passbyvalue(a);
    // passbyreference(b);
    // cout << a << endl;
    // cout << b << endl;
    // swap(&a, &b);
    // cout << a <<" "<< b;
    
    
    return 0;
}