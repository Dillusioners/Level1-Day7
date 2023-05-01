# include <iostream>
# include <vector>

/*
	Author: LeeTuah
	Program: Average of 'n' amount of numbers
	For: A League in SuperB events.
*/

// returns the average of the numbers
float average(std::vector<int> numbers){
	int avg = 0;
	
	// iterating through all the numbers to get their sum
	for(auto i = numbers.begin(); i != numbers.end(); i++){
		avg += *i;
	}
	
	// returning the number divided by the total numbers
	return avg / (float)(numbers.size());
}

int main(int argc, char *argv[]){
	std::vector<int> numbers;
	int size, num;
	
	std::cout << "How many numbers do you want to average?: ";
	std::cin >> size;
	
	// to verify that the size is positive
	if(size < 0) size *= -1;
	else if(size == 0) size += 1;
	
	// iterating to get all the numbers user wants to average
	for(int i = 0; i < size; i++){
		std::cout << "Enter your number(#" << i+1 << "): ";
		std::cin >> num;
		numbers.push_back(num);
	}
	
	// calling the function and getting the result
	std::cout << "The average is " << average(numbers);
	
	return 0;	
}
