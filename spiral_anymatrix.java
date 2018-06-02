//to print a square matrix in spiral form 

import java.io.*;
import java.util.*;

public class spiral_anymatrix
{
    public static void main(String args[])throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of matrix");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the matrix");
        int mat[][]=new int[n][n];
        int i,j;int x;
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        //displaying the original matrix
        System.out.println("Matrix is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("spiral print is");
          
        j=0;i=0;int a=0;n=n-1;
        
        for(x=0;x<=(n/2);x++)
        {
            //printing the first row of remaining rows
            while(j<=(n-a))
            {
                System.out.print(mat[i][j]+" ");
                j++;
            }
            j--;i++;
            //printing the last column of remaining columns
            while(i<=(n-a))
            {
                System.out.print(mat[i][j]+" ");
                i++;
            }
            i--;j--;
            //printing the last row of remaining rows
            while(j>=a)
            {
                System.out.print(mat[i][j]+" ");
                j--;
            }
            j++;i--;
            //printing the first column of remaining columns
            while(i>a)
            {
                System.out.print(mat[i][j]+" ");
                i--;
            }
            a++;
            i=a;
            j=a;
        }
    }
}

//code by Nikita