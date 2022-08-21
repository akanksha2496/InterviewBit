First Non-Repeating Character In A Stream Of Characters
First non-repeating character in a stream of characters

Bookmark
Medium
31.8% Success

338

30
Asked In:
Amazon
Flipkart
Problem Description

Given a string A denoting a stream of lowercase alphabets. You have to make new string B.

B is formed such that we have to find first non-repeating character each time a character is inserted to the stream and append it at the end to B. If no non-repeating character is found then append '#' at the end of B.



Problem Constraints
1 <= length of the string <= 100000



Input Format
The only argument given is string A.



Output Format
Return a string B after processing the stream of lowercase alphabets A.



Example Input
Input 1:

 A = "abadbc"
Input 2:

 A = "abcabc"


Example Output
Output 1:

 "aabbdd"
Output 2:

 "aaabc#"


Example Explanation
Explanation 1:

    "a"      -   first non repeating character 'a'
    "ab"     -   first non repeating character 'a'
    "aba"    -   first non repeating character 'b'
    "abad"   -   first non repeating character 'b'
    "abadb"  -   first non repeating character 'd'
    "abadbc" -   first non repeating character 'd'
Explanation 2:

    "a"      -   first non repeating character 'a'
    "ab"     -   first non repeating character 'a'
    "abc"    -   first non repeating character 'a'
    "abca"   -   first non repeating character 'b'
    "abcab"  -   first non repeating character 'c'
    "abcabc" -   no non repeating character so '#'
    
    
    code:
    public class Solution {
    public String solve(String A) {
        //to store the characters in the order they come, and allow deletion from front when needed.
        Queue<Character> q = new LinkedList<>();
        //to keep track of characters already there.
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder B = new StringBuilder();
        for(int i = 0;i<A.length();++i){
            //if character was already there, we increment its value by 1. ELse we put it with a value of 1.
            if(map.containsKey(A.charAt(i))) map.replace(A.charAt(i), map.get(A.charAt(i))+1);
            else map.put(A.charAt(i),1);
            //adding current character to queue
            q.add(A.charAt(i));
            //map has the count of characters. So we remove the characters from front until we find a character whose count is not >1
            while(!q.isEmpty() && map.get(q.peek())>1){
                q.poll();
            }
            //if queue is empty, means no unrepeated characters presednt. Hence, we add #, else we add the character in front of the queue.
            if(q.isEmpty()) B.append("#");
            else B.append(q.peek());
        }
        //we return the required string.
        return B.toString();
    }
}
    
    
code 2 - mine:

public class Solution {
    public String solve(String A) {
        StringBuilder ans = new StringBuilder();
        Queue<Character> q=new LinkedList<>();
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<A.length();i++)
        {
            q.add(A.charAt(i));
            if(map.containsKey(A.charAt(i)))
            map.put(A.charAt(i),map.get(A.charAt(i))+1);
            else
            map.put(A.charAt(i),1);
            while(q.size()>0 && map.get(q.peek())>1)
            {
                q.poll();
            }
            if(q.size()==0)
            ans.append("#");
            else
            ans.append(q.peek());
        }
        return ans.toString();
    }
}

