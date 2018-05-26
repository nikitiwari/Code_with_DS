//Print common characters of two Strings in alphabetical order

import java.io.*;
import java.util.*;

public class print_common
{
    public static void main(String args[])throws IOException{
        
        Scanner sc=new Scanner(System.in);
        
        String st1,st2;
        System.out.println("Enter two strings");
        st1=sc.nextLine();
        st2=sc.nextLine();
        
        st1=st1.toLowerCase();
        st2=st2.toLowerCase();
        int fr1[]=new int[26];
        int fr2[]=new int[26];
        int i,x=0;
        
        //counting frequency of each character in string1
        for(i=0;i<st1.length();i++)
        fr1[(int)(st1.charAt(i))-97]++;
        
        //counting frequency of each character in string2
        for(i=0;i<st2.length();i++)
        fr2[(int)(st2.charAt(i))-97]++;
        
        for(i=0;i<26;i++)
        {
            if(fr1[i]>0&&fr2[i]>0)
            {
                if(fr1[i]>fr2[i])
                x=fr2[i];
                else
                x=fr1[i];
                while(x!=0)
                {
                   System.out.print((char)(i+97));
                   x--;
                }
            }
            
        }
        
    }
}

//code by nikita