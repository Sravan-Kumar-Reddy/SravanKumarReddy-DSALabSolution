package com.longestPath.service;

import java.util.*;
import com.longestPath.model.*;

public class LongestPath {
	public ArrayList<Integer> getLongestPath(Node root){
		if(root == null){
			return new ArrayList<Integer>();
		}

		ArrayList<Integer> leftNodeList = getLongestPath(root.left);
		ArrayList<Integer> rightNodeList = getLongestPath(root.right);

		if(leftNodeList.size()>=rightNodeList.size()){
			leftNodeList.add(root.data);
		}else{
			rightNodeList.add(root.data);
		}		
		if(rightNodeList.size()>leftNodeList.size()){
			return rightNodeList;
		}else {
			return leftNodeList;
		}

	}
}
