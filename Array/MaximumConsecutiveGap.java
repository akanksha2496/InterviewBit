Maximum Consecutive Gap

Medium

170

39
Asked In:
Hunan Asset
Given an unsorted array, find the maximum difference between the successive elements in its sorted form.

Try to solve it in linear time/space.

Example :

Input : [1, 10, 5]
Output : 5 

Soltuion: extra space
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
      if(A.length==1)
      return 0;
      int[] t=A.clone();
      Arrays.sort(t);
      int ans=0;
      for(int i=1;i<A.length;i++)
      {
          ans=Math.max(ans,t[i]-t[i-1]);
      }
      return ans;
    }
}

Solution: wihtout extra space
