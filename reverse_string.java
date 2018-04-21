//geeksforgeeks _ data structures_strings
//reversing string using recursion
import java.io.*;
import java.util.*;

public class reverse_string
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string to reverse");
        //input string
        String st= sc.nextLine();
        System.out.println("#METHOD 1");
        //calling recursive function to reverse the string
        rev_string(st,st.length()-1);
        System.out.println("\n#METHOD 2");
        reverse_str(st);
        
    }
    
    //recursive function to reverse the string   #METHOD 1
    
    static void rev_string(String st, int l)
    {
        if(l==0)
            System.out.print(st.charAt(l));
        else 
        {
            System.out.print(st.charAt(l));
            l=l-1;
            rev_string(st,l);
        }
    }
    
    static void reverse_str(String st)
    {
        if ((st==null)||(st.length() <= 1))
           System.out.println(st);
        else
        {
            System.out.print(st.charAt(st.length()-1));
            reverse_str(st.substring(0,st.length()-1));
        }
    }
}