/*
 * Teena Xiong
 * POST LAB 8
 * 
 * User will be asked to enter a number between 0 and 511. It will then call the method array,
 * in which the array will be filled with either 0 or 1. It will then use another method name
 * printArray to print out the array to the screen, with 0 corresponding to H and 1 to T. 
 */


import java.util.Scanner; 
public class HeadsAndTails {
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
	
		System.out.print("Enter a number between 0 and 511");
		int userInput = input.nextInt(); //stores user's input. 
		
		char [][] array = new char [3][3]; //create and initialize the array
		
		fillArray (array, userInput);	//calling fillArray with array and userInput parameters
		printArray (array); //calling printArray with array as parameters. 
		
	}
	
	//the method fillArray. Will fill array with either 0 or 1. 
	public static void fillArray(char [] [] array, int userInput)
	{
		int middleNumber = 256; //this number is the number from 0 to 511. 
		for(int row=0; row<array.length; row++)
		{
			for(int column=0; column < array[row].length; column++)
			{
				if(userInput >=middleNumber) //comparing users input the the middle number. 
				{
					array[row][column] = '1'; //Initializing it to 1
					userInput = userInput - middleNumber; //
					middleNumber = middleNumber/2; 
					
				}
				else if(userInput <middleNumber) //if user input is less than the middle number, this is ran
				{
					 middleNumber = middleNumber /2; //the middle number is divided in half. 
					 array[row][column] = '0'; //Initializing it to 0 
				}
	
			}		
		}
	}
	
	//the printArray method, with the array as argument. 
	public static void printArray(char [][] array)
	{
		for(int row = 0; row<array.length; row++)
		{
			for(int column = 0; column<array[row].length; column++)
			{
				if(array[row][column] == '0')//if the element is 0, it is replace with H
					array[row][column] = 'H'; 
				else array[row][column] = 'T'; //else, it is replace with T
				System.out.print(array[row][column] + " "); //PRINT out the the screen the array
			}
			System.out.println(); 
		}
	}
	
	

}
