#include<iostream>

using namespace std;

class my
{
public:
    int a,b;
    static int x;

    void getData(void)
    {
        cout<<"Enter 2 numbers"<<endl;
        cin>>a>>b;
    }

    void add(void)
    {
        cout<<"the sum is "<<(a+b)<<endl;
    }
    void subtract(void)
    {
        cout<<"the subtract is "<<(a-b)<<endl;
    }
    void multipy(void)
    {
        cout<<"the product is "<<(a*b)<<endl;
    }
    void quotient(void)
    {
        cout<<"the quotient is "<<(a/b)<<endl;
    }
};

int main()
{
    ;
    my obj;
    obj.getData();
    obj.add();
    obj.subtract();
    obj.multipy();
    obj.quotient();
    return 0;
}
