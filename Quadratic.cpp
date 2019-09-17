#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;



void get(double & a, double & b, double & c);
void solve(double a, double b, double c, double & x1, double & x2);
void printRoots(double x1, double x2);
void error(string msg);


int main() {
	double a, b, c, x1, x2;
	get(a, b, c);
	solve(a, b, c, x1, x2);
	printRoots(x1, x2);
	return 0;
	}


void get(double & a, double & b, double & c) {
	cout << "sgs   " <<endl;
	cout << "a" << endl;
	cin >> a;
	cout << "b" << endl;
	cin >> b; 
	cout << "c" << endl;
	cin >> c;
	}


void solve(double a, double b, double c,
		double & x1, double & x2) {
	if(a == 0) error("nonzero");
	double Disc = b * b - 4 * a *c;
	if(Disc < 0) error("roots");
        double sqrtDisc = sqrt(Disc);
	x1 =  (-b + sqrtDisc) / (2 * a);
  	x2 =  (-b - sqrtDisc) / (2 * a);
	}


void printRoots(double x1, double x2){
	if(x1 == x2){
		cout << "there is a double root at" << x1 << endl;
	}
	else{
		cout << "there root are " << x1 <<  "and"  << x2 <<endl;
	}
}



void error(string msg) {
	cerr << msg << endl;
	exit(EXIT_FAILURE);
} 

