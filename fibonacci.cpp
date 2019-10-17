#include <iostream>
#include <iomanip>
using namespace std;



const int MIN_INDEX = 0 ;
const int MAX_INDEX = 50 ;


int fib( int n );


int main () {
	cout << "this program is fibnacci sequence " <<endl;
	for ( int i = MIN_INDEX ; i<= MAX_INDEX ; i++ ){
		if (i < 10){ 
			cout << " ";}
		cout << "fib(" << i << ")";
		cout << " = " << setw(9) << fib(i) << endl;
	}
	return 0;
}


int fib (int n){
	if(n < 2){
		return n;

	}	else {
		return fib(n - 1) + fib (n - 2);
	}
}
