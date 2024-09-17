//Below line includes all the libraries 
#include <bits/stdc++.h>
using namespace std;

//Function
void printname(string name){
    cout << "Hey " << name << endl;
}

int sum(int num1, int num2){
    int num3 = num1 + num2;
    return num3;
} 


int main() {
    //Input Output
    // int x;
    // cout << "Try programiz" << "\n";
    // cout << "Akash" << "\n";
    // cin >> x;
    // cout << "Value of X = " << x;
    
    //Datatypes
    //Int
    int a = 10;
    
    //Long
    long b =  10;
    
    //Long Long
    long long c = 1500000000;
    
    //Float
    float d = 13.9;
    
    //Double
    double e = 13.23;
    
    //String
    // string s;
    // getline(cin, s);
    // cout << s;
    
    //Char (256 chars available)
    char g = 'h';
    
    //if else
    // int age;
    // cin >> age;
    // cout << "Age = " << age << endl;
    
    // if(age >= 18){
    //     cout << "Person is an adult!";
    // }
    // else {
    //     cout << "Person is not an adult!";
    // }
    
    
    //Switch
    // int day;
    // cin >> day;
    // cout << "Entered number = " << day << endl;
    
    // switch(day){
    //     case 1: 
    //         cout << "Monday";
    //         break;
    //     case 2: 
    //         cout << "Tuesday";
    //         break;
    //     case 3: 
    //         cout << "Wednesday";
    //         break;
    //     case 4: 
    //         cout << "Thursday"; 
    //         break;
    //     case 5: 
    //         cout << "Friday";
    //         break;
    //     case 6: 
    //         cout << "Saturday"; 
    //         break;
    //     case 7: 
    //         cout << "Sunday";
    //         break;
    //     cout << "Check";
    // }
    
    
    //Array
    //1D
    // int arr[5];
    // cin >> arr[0] >> arr[1] >> arr[2] >> arr[3] >> arr[4];
    // arr[3] += 10;
    // cout << arr[3];
    
    //2D
    // int arr1 [3][5];
    // cin >> arr1[1][1];
    // cout << arr1[1][1];
    
    //String
    // string m = "Akash";
    // cout << m[1];
    // cout << m[m.size() - 1];
    
    //For loop
    // for (int i = 1; i <= 5; i++){
    //     cout << i << " " << "Akash" <<endl;
    // }
    
    //Reverse for loop
    // for (int i = 5; i > 0; i--){
    //     cout << i << " " << "Akash" <<endl;
    // }
    
    //While Loop
    // int i = 0;
    // while(i <= 5){
    //     cout << "Akash" << endl;
    //     i++;
    // }
    
    //Do while (Do will execute its part no matter what)
    // int i = 2;
    // do {
    //     cout << "Akash" << endl;
    //     i++;
    // } while (i <= 1);
    
    string l;
    cin >> l;
    printname(l);
    
    int res = sum(3,4);
    cout << "Addition = " << res;
    
    return 0;
}


