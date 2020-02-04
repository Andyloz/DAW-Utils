package daw.dawutils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author andyloz
 */
public class ReadScanner {
    public static int ReadInt() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Introduzca un número entero: ");
        
        boolean repeat;        
        do {
            repeat = false;
            try {
                number = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Introduzca un valor válido: ");
                repeat = true;
            } finally {
                sc.nextLine();
            }
        } while (repeat);
        
        return number;
    }
    
    public static int ReadInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        
        System.out.print(prompt);
        
        boolean repeat;        
        do {
            repeat = false;
            try {
                number = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Introduzca un valor válido: ");
                repeat = true;
            } finally {
                sc.nextLine();
            }
        } while (repeat);
        
        return number;
    }
    
    public static int ReadInt(int start, int end) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Introduzca un número entero: ");
        
        boolean repeat;        
        do {
            repeat = false;
            try {
                number = sc.nextInt();
                
                if (number < start || number > end) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.print("Introduzca un valor válido: ");
                repeat = true;
            } finally {
                sc.nextLine();
            }
        } while (repeat);
        
        return number;
    }
    
    public static int ReadInt(String prompt, int start, int end) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        
        System.out.println(prompt);
        
        boolean repeat;        
        do {
            repeat = false;
            try {
                number = sc.nextInt();
                
                if (number < start || number > end) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.print("Introduzca un valor válido: ");
                repeat = true;
            } finally {
                sc.nextLine();
            }
        } while (repeat);
        
        return number;
    }
    
    public static String readString() {
        Scanner sc = new Scanner(System.in);
        
        return sc.nextLine();
    }
    
    public static String readString(int min, int max) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        
        if (string.length() >= min && string.length() <= max) {
            return string;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
