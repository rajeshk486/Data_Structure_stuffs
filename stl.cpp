// vector::begin/end
#include <iostream>
#include <vector>
using namespace std;

int main ()
{
  vector<int> myvector;
  vector<int>::iterator it=myvector.begin();
  for (int i=1; i<=5; i++) myvector.push_back(i);

  cout << "myvector contains:";
  for (std::vector<int>::iterator it = myvector.begin() ; it != myvector.end(); ++it)
  	cout << ' ' << *it;
cout << '\n';

  return 0;
}
