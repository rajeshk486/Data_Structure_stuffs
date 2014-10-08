#include <iostream>

using namespace std;

// Singleton class
class MySingleton {

    //public:
    
    public:
        static MySingleton* GetInstance();

    private:
    	    static MySingleton* iInstance;

        // private constructor
        MySingleton();

};

MySingleton* MySingleton::iInstance = NULL;

MySingleton::MySingleton()
{
    cout << "In construtor ..." << endl;
}

MySingleton* MySingleton::GetInstance()
{
	cout<<"Rajesh comes here\n";
    if ( iInstance == NULL ) {
    iInstance = new MySingleton();
    cout<<"Rajesh in creation\n";
    }

    return iInstance;
}

int main()
{
    MySingleton* obj;
    MySingleton* obj1;
  MySingleton* obj2;
    obj = MySingleton::GetInstance();
    obj1 = MySingleton::GetInstance();
	obj2 = MySingleton::GetInstance();
    return 0;
}
