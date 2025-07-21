import java.util.*;

public class Matrices{
    public static boolean  search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell("+i+","+j+")");
                 return true;   
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static int findMax(int matrix[][]){
    int max = matrix[0][0];  // assume first element is maximum

    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] > max){
                max = matrix[i][j];  // update if larger value found
            }
        }
    }
    return max;
}

public static int findMin(int matrix[][]){
    int min = matrix[0][0];  // assume first element is minimum

    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] < min){
                min = matrix[i][j];  // update if smaller value found
            }
        }
    }
    return min;
}

    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 5);

        System.out.println("Maximum: " + findMax(matrix));
    System.out.println("Minimum: " + findMin(matrix));
    }
}