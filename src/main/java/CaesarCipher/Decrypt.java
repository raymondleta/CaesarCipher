package CaesarCipher;

public class Decrypt {
    public static StringBuilder dencryptClass(String message, int shift){
        StringBuilder dencryptedResult = new StringBuilder();

        for (int i=0; i<message.length(); i++){
            if (Character.isUpperCase(message.charAt(i)))
            {
                char character = (char)(((int)message.charAt(i) +
                        shift - 65) % 26 + 65);
                dencryptedResult.append(character);
            }
            else
            {
                char character = (char)(((int)message.charAt(i) +
                        shift - 97) % 26 + 97);
                dencryptedResult.append(character);
            }

        }
        return dencryptedResult;
    }

}
