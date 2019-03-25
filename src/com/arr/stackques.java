package com.arr;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class stackques {

	Stack sk = new Stack();
	Queue<Character> qk = new LinkedList<Character>();

	public void pushCharacter(char c) {
		sk.push(c);

	}

	public void enqueueCharacter(char c) {
		qk.add(c);
	}

	public char popCharacter() {
		return (char) sk.pop();

	}

	public char dequeueCharacter() {
		return qk.poll();
	}

	// Write your code here.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		stackques p = new stackques();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}
}