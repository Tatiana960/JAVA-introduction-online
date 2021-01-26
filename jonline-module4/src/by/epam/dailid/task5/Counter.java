package by.epam.dailid.task5;

class Counter {
    //Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в
    // заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
    // Счетчик имеет методы увеличения и уменьшения состояния, и метод, позволяющий получить его текущее состояние.
    //Написать код, демонстрирующий все возможнотси класса.

    private int counter;
    private int maxLimit;
    private int minLimit;

    public Counter() {
        this.counter = 0;
        this.maxLimit = 1000;
        this.maxLimit = -1000;
    }
    public Counter(int counter, int maxLimit, int minLimit){
        this.counter = counter;
        this.maxLimit = maxLimit;
        this.minLimit = minLimit;
    }


    public void setCounter() {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setminLimit() {
        this.minLimit = minLimit;
    }

    public int getMinLimit() {
        return minLimit;
    }

    public void setMaxLimit() {
        this.maxLimit = maxLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public int incrementCounter() {
        counter++;
        if (counter == maxLimit) {
            counter = 0;
        }
        return counter;
    }
    public int decrementCounter(){
        counter--;
        if(counter==minLimit){
            counter = 0;
        }
        return counter;
    }

    public String toString(int counter, int maxLimit, int minLimit){
        return String.format("Counter" + counter + "maxlimit" + maxLimit + "minlimit" +  minLimit);
    }
}
