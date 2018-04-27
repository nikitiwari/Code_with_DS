//find the second most frequent Character

import java.io.*;
import java.util.*;

public class second_frequent
{
    public static void main(String args[])throws InstantiationException{
        Scanner sc=new Scanner(System.in);
        //reading input
        String st;
        System.out.println("Enter a string to find the second most frequent character");
        st=sc.nextLine();
        
        find_frequent(st);
    }
    
    //function to find the second most frequent character in the string
    static void find_frequent(String st)
    {
        //to store the frequency of each character
        int fr[]=new int[26];
        Arrays.fill(fr,0);
        st=st.toLowerCase();
        int i,max=0,max2=0;char ch;
        
        //find the frequency of the character and update the corresponding position
        for(i=0;i<st.length();i++)
        {
            ch=st.charAt(i);
            fr[(int)(ch)-97]++;
        }
        
        for(i=0;i<26;i++)
        {
            if(fr[i]>max&& fr[i]!=0)
                max=fr[i];
            if(fr[i]>max2&&fr[i]<max)
            max2=fr[i];
        }
        if(max2==0)
        {
            System.out.println("No second most frequent character");
            System.exit(0);
        }
        for(i=0;i<26;i++)
        {
            if(fr[i]==max2)
            System.out.print((char)(i+97)+"  ");
        }
    }
}

//-code by Nikita Tiwari