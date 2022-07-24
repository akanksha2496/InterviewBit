Question - https://www.interviewbit.com/problems/find-duplicate-in-array/hints/

Find Duplicate in Array

Easy

412

82
Asked In:
Amazon
VMWare
Riverbed
more
Problem Description

Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
Sample Input:

[3 4 1 4 1]

Sample Output:

1

If there are multiple possible answers ( like in the sample case above ), output any one.

If there is no duplicate, output -1

Solution :

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<A.length;i++)
        {
            if(!map.containsKey(A[i]))
            {
                map.put(A[i],1);
            }
            else
            map.put(A[i],map.get(A[i])+1);
        }
        for(Integer key: map.keySet())
        {
            if(map.get(key)!=1)
            return key;
        }
        return -1;
    }
}


Reduce space Complexity-

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] a) {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int index=Math.abs(a[i]);
           
            if(a[index]<0)//if this happens it will mean that a[temp] is already visited
            return index;//which means that temp is already present in the array
            else
            a[index]=-a[index];
        }
        return -1;
    }
}


