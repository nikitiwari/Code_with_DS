//to print a square matrix in spiral form 

import java.io.*;
import java.util.*;

public class diagonal_matrix
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
        int a, b;
        System.out.println("New Display Pattern is");
        for(i=0;i<m;i++)
        {
            b=0;
            for(a=i;a>=0;a--,b++)
            {
                System.out.print(mat[a][b]+" ");
                if(b==(n-1))
                break;
            }
            System.out.println();
        }
        a=1;j=a;i=m-1;
        while((j!=(n)))
        {
            System.out.print(mat[i][j]+" ");
            j++;i--;
            if(j==(n))
            {
                System.out.println();
                i=m-1;
                j=++a;
            }
        }
    }
}


//code by Nikita