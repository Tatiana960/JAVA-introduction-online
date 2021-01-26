package miscellanneous;
import java.util.Scanner;

public class Prime {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int [][]mas;
        int k,i,j,s;
        boolean fl;
        mas=new int [10][10];
        System.out.println("Введите размерность матрицы");
        int n=in.nextInt();
        for (i=0; i<n; i++){
            for ( j=0; j<n; j++)
                mas[i][j]=in.nextInt();
        }
        System.out.println("Введенная матрица");
        for (i=0; i<n; i++){
            for (j=0; j<n; j++)
                System.out.print(mas[i][j] + "\t");
            System.out.println('\n');
        }

        for (int l = 0; l < n; l++)
            if ( mas[i][l] > 0)
            {
                s = 0;
                fl=true;
                for(k = 0; k < n; k++)
                {
                    s += mas[k][l];
                    if(mas[k][l]<0) fl=false;
                }
                if(fl)
                    System.out.print("summa elementov stolbza " + s);

            }}}