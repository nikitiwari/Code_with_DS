//reverse string without affecting special characters

import java.io.*;
import java.util.*;

public class reverse_str_char{
    public static void main(String args[])throws InstantiationException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse without affecting special characters");
        String st=sc.next();
        char ch[] = st.toCharArray();
        int i;
        String w="";
        //forming a word out of the letters in the array
        for(i=0;i<st.length();i++)
        {
            if(Character.isLetter(ch[i]))
            {
                w=w+ch[i];
                //insert 0 in the array where there is a letter
                ch[i]='0';
            }
        }
        
        //storing the length of w - 1 
        int k=w.length()-1;
        
        for(i=0;i<st.length();i++)
        {
            //insert the word in reverse order in places with 0
            if(ch[i]=='0')
            {
                ch[i]=w.charAt(k);
                k--;
            }
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}

//code by Nikita 