package com.longestPath.main;

import java.util.*;
import com.longestPath.model.*;
import com.longestPath.service.*;

public class DriverClass {
	public static void main(String[] args) {
		Node root = new Node(100);
    	root.left = new Node(20);
    	root.right = new Node(130);
    	root.left.left = new Node(10);
    	root.left.right = new Node(50);
    	root.left.left.right = new Node(5);
    	root.right.left = new Node(110);
    	root.right.right = new Node(140);
    	
    	LongestPath longestPath = new LongestPath();
		
    	ArrayList<Integer> longestPathNodeList = longestPath.getLongestPath(root);
    	System.out.println("Longest Path Nodes : "+longestPathNodeList);

    	System.out.println("Longest Path:");
    	// String longestPathString = "";
    	System.out.print(longestPathNodeList.get(longestPathNodeList.size()-1)); 
    	for(int i=longestPathNodeList.size()-2;i>=0;i--){
    		// longestPathString += longestPathNodeList.get(i).toString()+" -> ";
    		System.out.print(" -> "+longestPathNodeList.get(i));
    	}
    	
    	/*if(longestPathString.length()>0){
    		longestPathString = longestPathString.substring(0,longestPathString.length()-4);
    	}*/
    	
    	// System.out.println(longestPathString);
    	// System.out.println(""); 

	}
}
