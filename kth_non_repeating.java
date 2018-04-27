//find kth non repeating Character
import java.io.*;
import java.util.*;

public class kth_non_repeating
{
        public static void main(String args[])throws InstantiationException{
        Scanner sc=new Scanner(System.in);
        //reading input
        String st;
        System.out.println("Enter a string to find the second most frequent character");
        st=sc.nextLine();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        non_repeating_char(st,k);
        
        }
        
        //function to find the second most frequent character
        static void non_repeating_char(String st,int k)
        {
            //to store the frequency of each character
            int fr[]=new int[26];
            Arrays.fill(fr,0);
            st=st.toLowerCase();
            int i,c=0;char ch;
            
            //find the frequency of the character and update the corresponding position
            for(i=0;i<st.length();i++)
            {
                ch=st.charAt(i);
                fr[(int)(ch)-97]++;
            }
            
            //to count the kth non repeating character
            for(i=0;i<26;i++)
            {
                if(fr[i]==1)
                c++;
                if(c==k)
                break;
            }
            System.out.print("Kth non repeating character: ");
            System.out.println((char)(i+97));
        }
}

//-code by Nikita Tiwari.