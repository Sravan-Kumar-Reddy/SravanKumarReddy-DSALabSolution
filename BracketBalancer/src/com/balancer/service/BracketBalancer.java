package com.balancer.service;

import java.util.*;

public class BracketBalancer {
	public boolean isBracketsBalanced(String inputString){
		
		Stack<Character> characterStack = new Stack<Character>();
		if((inputString.length()%2)==1){
			return false;
		}else{
			for(int i=0;i<inputString.length();i++){
				char inputChar = inputString.charAt(i);
				if((inputChar=='[')||(inputChar=='{')||(inputChar=='(')){
					characterStack.push(inputChar);
				}else{
					if(characterStack.isEmpty()){
						return false;
					}
					switch(inputChar){
						case ']':
							if(characterStack.pop()!='[') {
								return false;
							}
							break;
						case '}':
							if(characterStack.pop()!='{'){
								return false;
							}
							break;
						case ')':
							if(characterStack.pop()!='('){							
								return false;
							}
							break;
						default:
							System.out.println("Invalid character");
							return false;
					}
				}
			}
		}

		if(characterStack.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
}
