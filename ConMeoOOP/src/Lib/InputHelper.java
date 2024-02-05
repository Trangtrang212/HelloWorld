package Lib;

import java.util.Scanner;

public class InputHelper {
    private static Scanner input = new Scanner(System.in);

    public static int inputNumber(String mes, String err) {
        System.out.print(mes);
        int value = 0;
        try {
            value = Integer.parseInt(input.nextLine());
            return value;
        } catch (Exception ex) {
            System.out.println(err);
            return inputNumber(mes, err);
        }
    }

    public static String inputString(String mes, String err, int min, int max) {
        System.out.print(mes);
        String value = input.nextLine();
        if (value.trim().length() <= min){
            System.out.println(err);
            return inputString(mes, err, min, max);
        } else if (value.trim().length() >= max){
            System.out.println(err);
            return inputString(mes, err, min, max);
        }
        return value;
    }

    public static Boolean inputBoolean(String mes, String err){
        System.out.print(mes);
        String value = input.nextLine();
        if (value.trim().equals("1")){
            return true;
        } else if (value.trim().equals("0")){
            return false;
        } else {
            System.out.print(err);
            return inputBoolean(mes, err);
        }
    }
}
