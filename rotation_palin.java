import java.io.*;
import java.util.*;
public class rotation_palin
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String st;
        //read input
        System.out.println("Enter a string to check whether after rotaion it is palindrome or not");
        st=sc.nextLine();int i;
        //check if the string is already a palindrome
        if(check_palin(st))
        System.out.println("Already a palindrome");
        else
        rotate_palin(st);
    }
        
    //function to rotate the string and check for palindrome
    
    static void rotate_palin(String st)
    {
        int f=0,i;String str;
        
        //rotating the string
        for(i=0;i<st.length();i++)
        {
            //add the starting part of the string at the end
            str=st.substring(i+1,st.length())+st.substring(0,i+1);
            
            if(check_palin(str))
            {
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println("After "+(i+1)+" rotations string will be palindrome");
        else
        System.out.println("not possible");
    }
    
    static boolean check_palin(String st)
    {
        String s1, s2;
        //dividing the string in two halves
        s1=st.substring(0,st.length()/2);
        if(st.length()%2==0)
	    s2=st.substring(st.length()/2,st.length());
        else
        s2=st.substring(st.length()/2+1,st.length());
        
        //reverse the second half string
        s2=reverse(s2);
        //check if first half and reversed second half string are equal or not
        if(s1.equals(s2))
            return true;
        else 
            return false;
    }
    
    static String reverse(String s)
    {
        StringBuilder i1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        i1.append(s);
        // reverse StringBuilder input1
        i1 = i1.reverse();
        
        return(i1.toString());
    }
}

//-code by Nikita Tiwari
    