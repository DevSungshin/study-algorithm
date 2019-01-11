#include <iostream>
using namespace std;

int main() {

  //Please Enter Your Code Here
  int n, m;
  
  cin >> n >> m;
  
  for (int i = n; i <= m; i++) {
    bool flag = true;
    if (i == 1) {
      continue;
    }
    for (int j = 2; j < i; j++) {
      if (i % j == 0) {
        flag = false;
      }
    }
    if (flag == true) {
      cout << i << " ";
    }
  }
  
  return 0;
}
