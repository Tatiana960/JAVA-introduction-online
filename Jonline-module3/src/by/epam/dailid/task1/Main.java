package by.epam.dailid.task1;



public class Main {
    //Дан массив названий переменных в Camel case. Переименовать названия в snake case
    public static void main(String[] args) {
        String[] camelCase = new String[]{"firstIndex", "lastIndex", "camelCase", "upperCase", "snakeCase"};
        String[] snakeCase = snakeCase(camelCase);

        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }


    public static String[] snakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];

        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    sb.append(letter);
                } else {
                    sb.append("_");
                    sb.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = sb.toString();
        }
        return snakeCase;
    }
}
