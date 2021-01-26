package miscellanneous;

public class ex1 {
    public static void main(String[] args) {
        String[] wordListOne = {"бесподобный", "восхитительный", "потрясающий", "замотивированный"};
        String[] wordListTwo = {"уполномоченный", "чистый продукт", "фронтэнд", "бэкэнд"};
        String[] wordListThree = { "процесс", "пункт разгрузки", "талант", "подход", "релиз"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все, что нам нужно, это  - " + phrase);
    }

}
