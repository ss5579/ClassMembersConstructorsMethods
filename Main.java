package Classes;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.a = 8;
        calculator.b = 2;
        System.out.println(calculator.a + calculator.b);
        System.out.println(calculator.a - calculator.b);
        calculator.division();
        calculator.multiplication();
    }
}
