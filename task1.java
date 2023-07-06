package Java.HW3;

import java.util.Scanner;


public class task1{
    
    
    public static int calculatePower(int a, int b) throws InvalidInputException {
        if (a == 0 && b < 0){
            throw new InvalidInputException("Введите корректные числа");

        }
        return (int) Math.pow(a, b);
    }
 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        try {
        int power = calculatePower(num1, num2);
        System.out.println("Число " + num1 + " в " + num2 + " степени равно " + power);
        } catch (InvalidInputException e){
        System.out.println("Ошибка ввода. Введите корректные числа"); 
        }
    }
    
}

class   InvalidInputException  extends Exception{
    public  InvalidInputException (String message){
        super(message);
    }
}
