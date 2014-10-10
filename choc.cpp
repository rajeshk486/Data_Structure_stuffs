#include <iostream>
using namespace std;
int main() {
int n,c,m;
    cin>>n>>c>>m;
    int choc=0;
    int wrappers= n/c;
    choc =n/c;
    //cout<< m<<wrappers;
    while(wrappers >= m)
	{
		//cout<< choc<<"inside";
		wrappers =wrappers/ m;
		//cout<<"wrappers: "<<wrappers;
	    choc =choc+ wrappers;
	   
	}
    cout<<choc;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
