package by.epam.student.dailid.module2.decomposition.sort.task1;

public class Main {
    //Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один
    // массив, включив второй массив между k-м и k+1-м элементом первого, при этом не используя дополнительный массив.
    public static void main(String[] args) {
        int a[] = new int[]{3, 6, 8, 90, 5};
        int b[] = new int[]{66, 666, 6};
        int k = 2;
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            if (i <= k) {
                c[i] = a[i];
            }
        }
                for (int j = 0; j < b.length; j++) {

                    c[j + a.length-k] = b[j];

                }
                for(int i=0; i < a.length; i++){
                if(i >= k+1){
                    c[i+b.length]=a[i];
                }
            }

        for (int i = 0; i < c.length; i++) System.out.print(c[i] + "\t");
        System.out.println();
    }
}
