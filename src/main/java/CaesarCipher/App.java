/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CaesarCipher;

import java.util.Scanner;

import static CaesarCipher.Encrypt.encryptClass;
import static CaesarCipher.Decrypt.dencryptClass;sud

public class App {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Message");
        String message = myScanner.nextLine();

        System.out.println("Enter Key");
        int shift = myScanner.nextInt();

        System.out.println(encryptClass(message, shift));

        System.out.println("Enter Encrypted");
        String decMessage = myScanner.nextLine();

//        System.out.println("Enter Key");
//        int decShift = myScanner.nextInt();
//
//        System.out.println(dencryptClass(decMessage, decShift));
    }

}
