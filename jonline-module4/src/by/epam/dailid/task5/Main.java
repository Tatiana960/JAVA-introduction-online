package by.epam.dailid.task5;

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        System.out.println(count.getCounter());
        int newCount = count.decrementCounter();
        System.out.println(newCount);
        int result = count.incrementCounter();
        System.out.println(result);
        Counter count2 = new Counter(1,100,-100);
        System.out.println(count2.getCounter());
    }
}
