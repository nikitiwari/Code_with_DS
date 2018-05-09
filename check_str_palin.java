//palindrome is a string which is equal to its reversed string like mom .
//check if the given string is palindrome or Not

import java.io.*;
import java.util.*;

public class check_str_palin{
    public static void main(String args[])throws IOException 
    {
        Scanner sc = new Scanner (System.in);
        
        //reading input from the user
        System.out.println("Enter a string to check of it is palindrome or not");
        String st=sc.nextLine();
        //upper and lower cases same
        st=st.toLowerCase();
        
        //method 1
        //function to check palindrome
        if(palindrome(st))
        System.out.println("Palindrome!!(method 1)");
        else
        System.out.println("Not a palindrome");
    	//method 2
    	palin(st);
    }
    
    //method 1
    //function to check palindrome
    static boolean palindrome(String st)
    {
        int i,l=st.length();
        char ch,chr;
        
        //check i and l-i-1 characters for equality
        for(i=0;i<l/2;i++)
        {
            ch=st.charAt(i);
            chr = st.charAt(l-i-1);
            if(ch!=chr)
            return false;
        }
        return true;
    }

    //function to check palindrome
    static void palin(String st)
    {
        String s2;
    	//divide the string in two halves
    	String s1=st.substring(0,st.length()/2);
    	
    	if(st.length()%2==0)
    	    s2=st.substring(st.length()/2,st.length());
        else
            s2=st.substring(st.length()/2+1,st.length());

        //reverse the second half of the string
        StringBuilder i1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        i1.append(s2);
        // reverse StringBuilder input1
        i1 = i1.reverse();

        //compare the first half and second half(reversed)

        if(s1.equals(i1.toString()))
        	System.out.println("Palindrome string(method 2)");
        else
        	System.out.println("Not a palindrome");
    }
        
}

//code by Nikita Tiwari