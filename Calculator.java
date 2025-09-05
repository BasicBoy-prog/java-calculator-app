import java.util.*;
public class Calculator {
    public static  void main(String[] args) {
        System.out.println("В данном калькуляторе Вы можете выпллнять простые арифметические операции.");
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Для завершения работы калькулятора вы можете в любой момент написать команду exit");
            System.out.println("Введите первое число: ");
            String str1 = input.nextLine();
            if (str1.equals("exit")){
                System.out.println ("До свидания!");
                break;
            }
            System.out.println("Введи команду (+;-;*;/)");
            String inputOp = input.nextLine(); // Считываем всю строку

            if (inputOp.equals("exit")) {
                System.out.println("До свидания!");
                break;
            }

// Проверяем, что введён ровно один символ оператора
            if (inputOp.length() != 1) {
                System.out.println("Ошибка: введите один символ оператора");
                continue; // Переходим к следующей итерации цикла
            }

            char op = inputOp.charAt(0); // Преобразуем строку в символ
            System.out.println("Введи второе число: ");
            String str2 = input.nextLine();
            if ( str2.equals("exit")){
                System.out.println ("До свидания!");
                break;
            }

            else {
                int a = Integer.parseInt(str1);
                int b = Integer.parseInt(str2);
                    try {
                        if (op == '+') {
                            System.out.println(a + b);
                        } else if (op == '-') {
                            System.out.println(a - b);
                        } else if (op == '*') {
                            System.out.println(a * b);
                        } else if (op == '/') {
                            System.out.println(a / b);
                        }else if (b == 0){
                                System.out.println("Ошибка! На ноль делить нельзя!");
                        } else {
                            System.out.println("Неизвестное выражение");
                        }
                    } catch (NumberFormatException e) {
                        // Ловим все остальные исключения (например, если ввели не число)
                        System.out.println("Ошибка ввода: " + e.getMessage());
                    }
                }
            }
        }
    }

