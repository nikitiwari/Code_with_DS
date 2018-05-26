//Print the string after the specified character has occurred given no. of times

import java.io.*;
import java.util.*;

public class string_freq{
    public static void main(String args[])throws IOException{
        
        Scanner sc=new Scanner(System.in);
        //reading user input
        String st;char ch;int fr;
        System.out.println("Enter the string");
        st=sc.nextLine();
        System.out.println("Enter the character after which the string is to be printed");
        ch=sc.next().charAt(0);
        System.out.println("Enter the frequency of above character");
        fr=sc.nextInt();
        
        int i,x=0;
        //count the frequency of the character that matches the given character
        for(i=0;i<st.length();i++)
        {
            char c=st.charAt(i);
            if(ch==c)
                x++;
            //if the frequency of given character matches that i the string break;
            if(x==fr)
            break;
        }
        
        //extract the substring from the value of i at which loop break
        System.out.println(st.substring(i+1,st.length()));
    }
}