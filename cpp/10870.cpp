#include <iostream>
using namespace std;

int fibonachi(int num) {
    if(num == 0)
        return 0;
    if(num == 1)
        return 1;
    return fibonachi(num-2) + fibonachi(num-1);
}

int main(void) {
    int num;
    cin >> num;
    cout << fibonachi(num);
}
