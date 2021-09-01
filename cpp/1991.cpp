#include <iostream>

using namespace std;

int A[27][2];

void preorder(int x)
{
    if (x == -1)return;
    cout << (char)(x + 'A');
    preorder(A[x][0]);
    preorder(A[x][1]);
 
}
void inorder(int x)
{
    if (x == -1)return;
    inorder(A[x][0]);
    cout << (char)(x + 'A');
    inorder(A[x][1]);
    
}
void postorder(int x)
{
    if (x == -1)return;
    postorder(A[x][0]);
    postorder(A[x][1]);
    cout << (char)(x + 'A');
}

int main(void) {
    int n;
    char x, y, z;
    cin >> n;
    
    for (int i = 1; i <= n; i++)
    {
        cin >> x >> y >> z;
        x -= 'A';
        if (y == '.')
        {
            A[x][0] = -1;
        }
        else
        {
            A[x][0] = y - 'A';
        }
 
        if (z == '.')
        {
            A[x][1] = -1;
        }
        else
        {
            A[x][1] = z - 'A';
        }
        
    }
    preorder(0);
    cout << '\n';
    inorder(0);
    cout << '\n';
    postorder(0);
    cout << '\n';
}
