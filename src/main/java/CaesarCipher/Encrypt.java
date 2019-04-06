package CaesarCipher;

public class Encrypt {
    public static StringBuilder encryptClass(String message, int shift){
        StringBuilder encryptedResult = new StringBuilder();

        for (int i=0; i<message.length(); i++){
            if (Character.isUpperCase(message.charAt(i)))
            {
                char character = (char)(((int)message.charAt(i) +
                        shift - 65) % 26 + 65);
                encryptedResult.append(character);
            }
//            else
//            {
//                char character = (char)(((int)message.charAt(i) +
//                        shift - 97) % 26 + 97);
//                encryptedResult.append(character);
//            }
//
//        }
//        return encryptedResult;
    }

}
