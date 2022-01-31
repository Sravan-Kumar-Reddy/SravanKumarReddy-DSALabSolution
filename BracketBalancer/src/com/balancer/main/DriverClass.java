package com.balancer.main;

import java.util.*;
import com.balancer.service.*;

public class DriverClass {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter the Character format to check if the brackets are balanced:");
		String inputString = scanner.nextLine();
		inputString = inputString.replaceAll("\\s","");
		

		BracketBalancer balancer = new BracketBalancer();
		if(balancer.isBracketsBalanced(inputString)){
			System.out.println("The entered String has Balanced Brackets");
		}else{
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
