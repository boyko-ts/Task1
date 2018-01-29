import java.util.Scanner;

/**
 * @author  Tatyana Boyko
 */
//* Сложение 2-х дробных чисел и округление результата до 4-х знаков после запятой

public class Simple_calculator {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое дробное число: ");
        double number1 = scan.nextDouble();
        System.out.println("Введите второе дробное число: ");
        double number2 = scan.nextDouble();
        System.out.printf("Результат сложения: %.4f.\n", number1 + number2);
    }
}