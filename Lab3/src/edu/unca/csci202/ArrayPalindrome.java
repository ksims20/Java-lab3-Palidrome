package edu.unca.csci202;

/**
 * 
 * @author kamren
 *
 * Checks to see if a word in a palindrome, examines the string one character at a time.
 */


public class ArrayPalindrome {
	ArrayStack<String> stack;
	ArrayStack<String> stack2;
	ArrayStack<String> stack3;
	
	public static void main(String[] args) {
		ArrayStack<String> Stack = new ArrayStack<>();

		Stack.push("Hello World");
		
		System.out.println(Stack);
		
		ArrayPalindrome palindrome = new ArrayPalindrome();
		
		palindrome.isPalindrome("racecar");
		System.out.println(palindrome.stack);
		System.out.println(palindrome.stack2);
		System.out.println(palindrome.stack3);
	
		
		
		
	}
	
	//Constructor that creates the three stacks.
	
	public ArrayPalindrome() {
		stack = new ArrayStack<String>();;
		stack2 = new ArrayStack<String>();;
		stack3 = new ArrayStack<String>();;
		
	
   }
	
	public boolean isPalindrome(String a) {
	
		for(int i = 0; i < a.length();i++) {
			System.out.println(a.charAt(i));
			String Word = Character.toString(a.charAt(i));
			
			stack.push(Word);
			stack2.push(Word);
		}
		
		for(int i = 0; i < a.length();i++) {
			stack3.push(stack2.pop());   //Pushes the letters in stack2 to stack3
		}
		
		if(stack == stack3) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	
}
