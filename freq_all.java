//Check if frequency of all characters can become same by one removal

import java.io.*;
import java.util.*;

public class freq_all{
    public static void main(String args[])throws InstantiationException{
        Scanner sc=new Scanner(System.in);
        
        String st;
        st=sc.nextLine();
        st=st.toLowerCase();
        int l=st.length();
        int fr[]=new int[26];
        int i,c=0;
        for(i=0;i<l;i++)
        {
            char ch=st.charAt(i);
            if(fr[(int)(ch)-97]==0)
            c++;
            fr[(int)(ch)-97]++;
        }
        if(l%c==1)
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}


//code by nikita