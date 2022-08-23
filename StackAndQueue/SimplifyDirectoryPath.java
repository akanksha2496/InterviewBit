Simplify Directory Path

Bookmark
Medium
20.2% Success

162

251
Asked In:
Microsoft
Given a string A representing an absolute path for a file (Unix-style).

Return the string A after simplifying the absolute path.

Note:

In Unix-style file system:

A period '.' refers to the current directory.
A double period '..' refers to the directory up a level.
Any multiple consecutive slashes '//' are treated as a single slash '/'.
In Simplified Absolute path:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path doesn't end with trailing slashes '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Path will not have whitespace characters.



Input Format

The only argument given is string A.
Output Format

Return a string denoting the simplified absolue path for a file (Unix-style).
For Example

Input 1:
    A = "/home/"
Output 1:
    "/home"

Input 2:
    A = "/a/./b/../../c/"
Output 2:
    "/c"
    
    
    code:
    public class Solution {
    public String simplifyPath(String A) {
        Stack<String> stack=new Stack<String>();
        for(int i=0;i<A.length();i++)
        {
           String path="";
           while(i<A.length() && A.charAt(i)!='/') 
           path+=A.charAt(i++);
           if(path.equals(".") || path.equals("")) continue;
           else if(path.equals("..")) 
           {
               if(stack.size()>0)
               stack.pop();
           }
           else
           stack.push(path);
        //    System.out.println((path.equals(".")));
           
        }
        String a="";
        // System.out.println(stack);
        String[] arr=new String[stack.size()];
        int i=0;
        while(stack.size()>0)
        {
            arr[i++]=stack.pop();
        }
        for(int i1=arr.length-1;i1>=0;i1--)
        a+="/"+arr[i1];
        if(arr.length==0)
        return "/";
        return a;
    }
}
