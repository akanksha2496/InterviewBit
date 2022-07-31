N/3 Repeat Number

Medium

303

14
Asked In:
Google
Problem Description

You're given a read only array of n integers. Find out if any integer occurs more than n/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Example:

Input: [1 2 3 1 1]
Output: 1 
1 occurs 3 times which is more than 5/3 times.


Solution : n extra space:
public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> A) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<A.size();i++)
        {
            if(!hm.containsKey(A.get(i)))
            hm.put(A.get(i),1);
            else
            hm.put(A.get(i),hm.get(A.get(i))+1);
        }
        int n=A.size()/3;
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)>n)
            {return i;}
        }
        return -1;
	}
}


Soltuion : with more time complexity:
public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> A) {
	    int num;
	    int n = A.size();
	    
	    Collections.sort(A);
	    
	    for (int i = 0; i < n;) {
	        int freq = 0;
	        num = A.get(i);
	        
	        while (i < n && A.get(i) == num) {
	            freq++;
	            i++;
	        }
	        
	        if (freq * 3 > n)
	            return num;
	        
	    }

	    return -1;
	}
	
}
