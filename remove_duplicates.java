//remove duplicates from a String
import java.util.*;
import java.util.*;

public class remove_duplicates
{
    public static void main(String args[])throws InstantiationException{
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter a string to remove duplicates");
        String st=sc.next();
        method1(st);
        method2(st);
        method3(st);
    }
    
    //this method preserves the sequence of characters in the string
    static void method1(String st)
    {
        String str="";int x=-1;int i;
        for(i=0;i<st.length();i++)
        {
            char ch =st.charAt(i);
            //search the character in the new string 
            //if already present then do not add
            x=search(ch,str);
            //if the character isn't a duplicate then add it in the string
            if(x==-1)
                str=str+ch;
            else
                continue;
        }
        System.out.println("Solution through method 1 : "+str);
    }
    
    //this method uses an array to store the frequency of characters
    static void method2(String st)
    {
      //this method does not preserves the cases of the characters
        String str="";int i;
        st=st.toLowerCase();
        int fr[]=new int[26];
        for(i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            fr[(char)(ch)-97]++;
        }
        for(i=0;i<26;i++)
        {
            if(fr[i]>0)
                str=str+(char)(i+97);
            else
            continue;
        }
        System.out.println("Solution through method 2 : "+str);
    }
    
    //this method uses sorting and then adding each character to a new String
    static void method3(String st)
    {
        String str=" ";int k=0,i;
        //converting the string to character array 
        //and then sorting
        char ch_st[]=st.toCharArray();
        Arrays.sort(ch_st);
        st=String.valueOf(ch_st);
        
        //concatenating each character once 
        for(i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(str.charAt(k)!=ch)
            {
                str=str+ch;
                k++;
            }
        }
        System.out.println("Solution through method3 : "+str);
    }

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    static int search(char x,String st)
    {
        int k;
        for(k=0;k<st.length();k++)
        {
            if(x==st.charAt(k))
            return k;
        }
        return -1;
    }    
    
}
  
//code by Nikita       