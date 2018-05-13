//check whether the given two strings are anagram of each other or not 
//Anagrams are those strings that have same letters (same frequency) but in different order.

import java.io.*;
import java.util.*;

public class anagrams{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        String st1,st2;
        //read user's input
        System.out.println("Enter two strings in new lines to check for anagrams");
        st1=sc.nextLine();
        st2=sc.nextLine();
        
        if(st1.length()!=st2.length())
        System.out.println("Not anagrams");
        
        System.out.println("Method 1");
        //method 1 is to sort the strings and then compare each Character
        if(sort_check(st1,st2))
        System.out.println("Given strings are anagrams");
        else
        System.out.println("Not anagrams");
        
        System.out.println("Method 2");        
        
        //method 2
        if(check_anagrams(st1,st2))
        System.out.println("Given strings are anagrams");
        else
        System.out.println("Not anagrams");
    }
    
    //method 1
    //function to check if strings are anagrams
    //by sorting and matching each character
    static boolean sort_check(String st1,String st2)
    {
        //function to sort the strings
        st1=bubblesort(st1);
        st2=bubblesort(st2);
        int i;
        //comparing each character
        for(i=0;i<st1.length();i++)
        {
            if(st1.charAt(i)!=st2.charAt(i))
            return false;
        }
        return true;
    }
    
    //method 2
    //function to check if strings are anagrams
    //by counting the frequency of each letter
    static boolean check_anagrams(String st1,String st2)
    {
        int i;
        char ch1,ch2;
        st1=st1.toLowerCase();
        st2=st2.toLowerCase();
        //arrays to count the frequency of each letter
        int fr1[]=new int[26];
        int fr2[]=new int[26];
        Arrays.fill(fr1,0);
        Arrays.fill(fr2,0);
        //counting frequencies
        for(i=0;i<st1.length();i++)
        {
            ch1=st1.charAt(i);
            ch2=st2.charAt(i);
            fr1[(int)(ch1)-97]++;
            fr2[(int)(ch2)-97]++;
        }
        //comparing frequencies
        for(i=0;i<26;i++)
        {
            if(fr1[i]!=fr2[i])
            return false;
        }
        return true;
    }
    
    static String bubblesort(String st)
    {
        int i, j;
        char[] chr = st.toCharArray();
        boolean flag;char temp;
        for (i = 0; i < st.length() - 1; i++) 
        {
            flag = false;
            for (j = 0; j < st.length() - i - 1; j++) 
            {
                if (chr[j] > chr[j + 1]) 
                {
                    // swap arr[j] and arr[j+1]
                    temp = chr[j];
                    chr[j] = chr[j + 1];
                    chr[j + 1] = temp;
                    flag = true;
                }
            }
 
            // IF no two elements were 
            // swapped by inner loop, then break
            if (flag == false)
                break;
        }
        return (String.valueOf(chr));
    }
}

//code by Nikita Tiwari.
    