import java.util.*;

 class MatrixSymmetry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r, c;
        System.out.println("Enter number of rows and columns:");
        r = s.nextInt();
        c = s.nextInt();

        if (r != c) {
            System.out.println("The matrix is not symmetric (must be square)");
            return;
        }

        int[][] a = new int[r][c];
        int[][] b= new int[r][c];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        
        for ( int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=a[j][i];
            }
        }
        
        System.out.println("The transpose matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        

        int flag = 1; 
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) { 
                if (a[i][j] != a[j][i]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) break; 
        }

        if (flag == 1)
            System.out.println("The matrix is symmetric");
        else
            System.out.println("The matrix is not symmetric");
    }
}

