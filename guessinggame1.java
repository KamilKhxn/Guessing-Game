package guessinggame1;
import java.util.Scanner;

public class guessinggame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare a scanning type for reading input from user
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int guess; 
		int answer = 7;
		boolean win = false; 
		
	while(win == false) {	
		
		System.out.println("Guess a number from 1 - 20");
		guess = input.nextInt();
		
		if (guess == answer) {
	
			win = true;
		}
		else if (guess <answer) {
			System.out.println("Your answer is too low");	
		}
		else if(guess > answer) {
			System.out.println("Your answer is too high");
		
			

	}
		}		System.out.println("you win");

	}
		}
	
	
	
		
	