
#include<iostream>
#include<fstream>
#include <regex>
#include<string>
using namespace std;

int main(int argc,char* fname[]) {
	string data;        
	regex r("(0x|0X)[0-9|a-f|A-F]*.?[0-9|a-f|A-F]*[p|P][+|-]?[0-9]*[f|F|l|L]?$");
	ifstream inputfile;
	inputfile.open(fname[1]);
		while (inputfile>>data)
	       (regex_match(data,r))?cout<<"\nMatched:: "<<data : cout << "\nNot Matched :: " << data;
	inputfile.close();
	return 0;
}




