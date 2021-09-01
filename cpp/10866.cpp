#include <iostream>
#include <deque>

using namespace std;
 
int main(void)
{
	ios::sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
 
	int N, X;
	deque<int> D;
	string str;
	cin >> N;
 
	for (int i = 0; i < N; i++) {
		cin >> str;
		if (str == "push_front") {
			cin >> X;
			D.push_front(X);
		}
		else if (str == "push_back") {
			cin >> X;
			D.push_back(X);
		}
		else if (str == "pop_front") {
			if (D.empty()) cout << -1 << '\n';
			else {
				cout << D.front() << '\n';
				D.pop_front();
			}
		}
		else if (str == "pop_back") {
			if (D.empty()) cout << -1 << '\n';
			else {
				cout << D.back() << '\n';
				D.pop_back();
			}
		}
		else if (str == "size") {
			cout << D.size() << '\n';
		}
		else if (str == "empty") {
			cout << D.empty() << '\n';
		}
		else if (str == "front") {
			if (D.empty()) cout << -1 << '\n';
			else cout << D.front() << '\n';
		}
		else if (str == "back") {
			if (D.empty()) cout << -1 << '\n';
			else cout << D.back() << '\n';
		}
	}
 
	return 0;
}
