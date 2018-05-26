//remove characters from the first string that are present in the second string

import java.io.*;
import java.util.*;

public class remove_char{
    public static void main(String args[])throws InstantiationException{
        Scanner sc=new Scanner(System.in);
    
        //reading input
        String st1,st2;
        System.out.println("Enter two Strings");
        st1=sc.nextLine();
        st2=sc.nextLine();
        st1=st1.toLowerCase();
        st2=st2.toLowerCase();
    
        int fr2[]=new int[26];
        int i;
        
        //counting frequency of characters in st2
        for(i=0;i<st2.length();i++)
        {
            char ch=st2.charAt(i);
            fr2[(int)(ch)-97]++;
        }
        String s="";
        for(i=0;i<st1.length();i++)
        {
            char ch=st1.charAt(i);
            if(fr2[(int)(ch)-97]==0)
            s=s+ch;
        }
        System.out.println(s);
    }
}


//--nt