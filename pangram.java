//check if the given string is pangram or not.
//pangram- a string containing all the english alphabets

import java.io.*;
import java.util.*;

public class pangram{
    public static void main(String args[])throws InstantiationException{
        Scanner sc = new Scanner(System.in);
        //reading user input
        System.out.println("Enter a sentence to check for pangram checking");
        String st=sc.nextLine();
        
        if(pangram_check(st))
        System.out.println("The entered sentence is a pangram!!");
        else
        System.out.println("Not a pangram");
    }
    
    //function to check for pangram
    static boolean pangram_check(String st)
    {
        int i;
        //initialize a frequency array to 0 to count 
        //the frequency of each character in the sentence/string
        int fr[]=new int[26]; 
        Arrays.fill(fr,0);
        st=st.toLowerCase();
        
        //counting the frequency of each character
        for(i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch==' ')
            continue;
            fr[(int)(ch)-97]++;
        }
        
        //check if there is a caracter of english alphabets
        //which is not present in the sentence
        for(i=0;i<26;i++)
        {
            if(fr[i]==0)
            return false ;
        }
        return true;
    }
}

//-cody by Nikita Tiwari.