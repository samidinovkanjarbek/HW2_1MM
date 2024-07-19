public class Main {
    public static void main(String[] args) {
        System.out.println(geekOfMethod(34, 5));
        System.out.println(geekOfMethod(1, 0));
        System.out.println(geekOfMethod(32, 34));
        System.out.println(geekOfMethod(12, 13));
        System.out.println(geekOfMethod(9, 5));
    }
    public static String geekOfMethod(int temp, int age) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "можете идти гулять";
        } else if (age > 0 && age <= 20 && temp >= 0 && temp <= 20) {
            return "можете идти гулять ";
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            return "можете идти гулять ";
        } else {
            return "дома сидите ";
        }
    }
}