//remove spaces from a given String

import java.io.*;
import java.util.*;

public class remove_spaces{
    public static void main(String args[])throws InstantiationException{
        Scanner sc = new Scanner(System.in);
        //reading user input
        System.out.println("Enter a sentence with spaces");
        String st=sc.nextLine();
        
        //method 1 - using replaceAll()
        st=st.replaceAll(" ", "");
        System.out.println("String after removing spaces :");
        System.out.println("Method 1 : using replaceAll():- "+st);
        rem_space(st);
    }
    
    //function to remove spaces
    static void rem_space(String st)
    {
        int i;String str="";
        for(i=0;i<st.length();i++)
        {
            //if a character is space then skip 
            if(st.charAt(i)==' ')
            continue;
            //form a new string of non space characters
            str=str+st.charAt(i);
        }
        System.out.println("Method 2 : using for loop:- "+str);
    }
}
//-cody by Nikita Tiwari.