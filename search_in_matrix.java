//Search in a row wise and column wise sorted matrix

import java.io.*;
import java.util.*;

public class search_in_matrix
{
    public static void main(String args[])throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the size of the matrix");
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        System.out.println("Enter n*n elements of matrix in row wise and column wise sorted order");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched");
        int s=sc.nextInt();
        j=0;int r=0,p=0;
        for(i=0;i<n;i++)
        {
            if(i<n-1)
            {
                if(mat[i+1][j]>s&&(mat[i][j]<s||mat[i][j]==s))
                {
                    r=i;
                }
                if(mat[j][i+1]>s&&(mat[j][i]<s||mat[j][i]==s))
                {
                    p=i;
                }
            }
        }
        
        System.out.println("row = "+ r +" column = "+p);
    }
}

//code by Nikita