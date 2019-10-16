package com.exercise101subprogam.app;

import java.util.Scanner;
public class SubPrograms {
		public static void main(String[] args) {
			// Variables declaration
			int num1 = 0;
			int num2 = 0;
			int result = 0;
			
			// Object construction
			Scanner scan = new Scanner(System.in);
			// Calling the method 'ShowTunnedMessage' that ask for a String to work
			System.out.println(ShowTunnedMessage("Ale"));
			ShowMessage();
			num1 = scan.nextInt();
			ShowMessage();
			num2 = scan.nextInt();
			// Calling the method 'AddNumbers'
			result = AddNumbers(num1,num2);
			
			System.out.println("Result is " + result);
			
			scan.close();
			
		}
		// Method to ask number
		public static void ShowMessage() {
			System.out.println("Input a number ");
		}
		// Method to show a tuned message
		public static String ShowTunnedMessage(String message) {
			return "Hola " + message;
		}
		// Method add numbers
		public static int AddNumbers(int num1, int num2) {
			return num1 + num2;
		}

}
