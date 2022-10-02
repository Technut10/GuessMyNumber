/*Copyright (c) 2022 TechNut DevOps

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package com.devops.technut;


import java.util.Scanner;


/**
* Simple number guessing game where user tries to guess the programs number.
*
* @author Anthony Putman
* @version 1.0.0
*
*/
public class 	GuessMyNumber {

    public static void main (String[] args) {

	// Scanner for user input

        Scanner scan = new Scanner(System.in);

	// Declarations & Init

		double  randomNumber =  Math.random() * 100 +1;

		randomNumber = (int) randomNumber;
		double  userGuess;
		int count = 0;

	// Statements

	System.out.println("Hello and welcome to Guess My Number!");
	System.out.println("All you have you have to do is guess the number I am thinking." );
	System.out.println("I will pick a number between 0 - 100. You type a number then press enter for entry. \nLet's begin.");

	// Initial Guess
	System.out.println("Guess the number I am thinking of... \nWhat is your guess? ");
	userGuess = scan.nextInt();

	// Check Number Against Random Number

	while(userGuess != randomNumber){

		if(userGuess < randomNumber) {
			System.out.println("Sorry, your guess is too low \ntry again: ");
		}else{
			System.out.println("Sorry, your guess is too high \ntry again:");
		}
		userGuess = scan.nextInt();

		++count; // increments and then prints for number of tries as count is set to 0.

		if(userGuess == randomNumber){
			System.out.println("You got it! Congratulations!");
			System.out.println("Number of tries:" + count);

		}

	}


// Area for error check. Leaving like this to practice branch ops for through git.
//	if(userGuess("[a-z]")){
//		System.out.println("You did not enter a number. Game Over");
//
//	}

    }
}




    
