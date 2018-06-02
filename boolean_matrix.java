//to print a square matrix in spiral form 

import java.io.*;
import java.util.*;

public class boolean_matrix
{
    public static void main(String args[])throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter boolean elements of the matrix");
        int mat[][]=new int[m][n];
        //new matrix to store the updated boolean matrix
        int copy_mat[][]=new int[m][n];
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
                //initializing the copy matrix with a random number 8
                copy_mat[i][j]=8;
            }
        }
        //displaying the original matrix
        System.out.println("Matrix is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("New matrix is");
         int a; 
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(copy_mat[i][j]==8||mat[i][j]==1)
                copy_mat[i][j]=mat[i][j];
                else continue;
                
                //f at any position there is 1 in original matrix
                if(mat[i][j]==1)
                {
                    //change the complete row to 1 and store it in new matrix
                    for(a=0;a<n;a++)
                    copy_mat[i][a]=1;
                    //change te complete column to 1 and store it in copy_mat(new matrix)
                    for(a=0;a<m;a++)
                    copy_mat[a][j]=1;
                }
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(copy_mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}


//code by Nikita
