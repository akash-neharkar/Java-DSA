// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;

void pattern(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cout << "* ";
        }
    cout << endl;
    }
}

void pattern1(int n){
    for(int i = 0; i <= n; i++){
        for(int j = 0; j <= i; j++){
            cout << "* ";
        }
    cout << endl;
    }
}

void pattern2(int n){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            cout << j;
        }
    cout << endl;
    }
}

void pattern3(int n){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            cout << i;
        }
    cout << endl;
    }
}

void pattern4(int n){
    for(int i = 0; i <= n; i++){
        for(int j = 0; j < n-i+1; j++){
            cout << "* ";
        }
    cout << endl;
    }
}

void pattern5(int n){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i+1; j++){
            cout << j;
        }
    cout << endl;
    }
}

void pattern6(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n - i - 1; j++){
            cout << " ";
        }
        for(int j = 0; j < 2 * i + 1; j++){
            cout << "*";
        }
        for(int j = 0; j < n - i - 1; j++){
            cout << " ";
        }
        cout << endl;
    }
}

void pattern7(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < i; j++){
            cout << " ";
        }
        for(int j = 0; j < 2 * n - (2*i + 1); j++){
            cout << "*";
        }
        for(int j = 0; j < i; j++){
            cout << " ";
        }
        cout << endl;
    }
}

void pattern8(int n){
    for(int i = 1; i <= 2*n-1; i++ ){
        int stars = i;
        if (i >= n) stars = 2*n-i;
        for(int j = 1; j <= stars; j++){
            cout << "*";
        }
        cout << endl;
    }
}

void pattern9(int n){
    int start = 1;
    for(int i = 0; i < n; i++){
        if(i%2==0) start = 1;
        else start = 0;
        for(int j = 0; j<=i; j++){
            cout << start;
            start = 1 - start;
        }
        cout << endl;
    }
}

void pattern10(int n){
    int num = 1;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            cout << num << " ";
            num = num + 1;
        }
        cout << endl;
    }
}

void pattern11(int n){
    for(int i =0; i < n; i++){
        for(char j = 'A'; j <= 'A' + i; j++){
            cout << j << " ";
        }
        cout<<endl;
    }
}

void pattern12(int n){
    for(int i =1; i <= n; i++){
        for(char j = 'A'; j <= 'A'+(n-i); j++){
            cout << j << " ";
        }
        cout<<endl;
    }
}

void pattern13(int n){
    int initS = 0;
    for(int i = 1; i < n; i++){
        //stars
        for(int j = 1; j <= n - i; j++){
            cout << "*";
        }
        //spaces
        for(int j = 0; j<initS; j++){
            cout << " ";
        }
        //stars
        for(int j = 1; j <= n - i; j++){
            cout << "*";
        }
        initS += 2;
        cout << endl;
    }
}

int main() {
    pattern13(5);
    return 0;
}