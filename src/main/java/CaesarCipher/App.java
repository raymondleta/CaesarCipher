/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CaesarCipher;

import java.util.Scanner;

import static CaesarCipher.Encrypt.encryptClass;

public class App {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Message");
        String message = myScanner.nextLine();

        System.out.println("Enter Key");
        int shift = myScanner.nextInt();

        System.out.println(encryptClass(message, shift));
    }

}
