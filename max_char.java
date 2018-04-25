//print maximum occurring character in the string

import java.io.*;
import java.util.*;

public class max_char{
    public static void main(String args[])throws InstantiationException{
        Scanner sc = new Scanner(System.in);
        //reading user input
        System.out.println("Enter a sentence with spaces");
        String st=sc.nextLine();
        
        max_freq_char(st);
    }
    
    //fuunction to count the frequency and  
    //print the maximum frequency character
    static void max_freq_char(String st)
    {
        int i;
        //for counting the frequency of each character
        int fr[]=new int[26];
        Arrays.fill(fr,0);
        
        for(i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            fr[(int)(ch)-97]++;
        }
        //finding the maximum frequency
        int max=0,pos=0;
        for(i=0;i<26;i++)
        {
            if(fr[i]>max)
            {
                max=fr[i];
                pos=i;    ///storing the position of max frequency 
            }
        }
        System.out.println("Maximum occurring character in the input string: "+(char)(pos+97));
    }
}
        
//-cody by Nikita Tiwari.