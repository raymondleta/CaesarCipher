package CaesarCipher;

public class Decrypt {
    public static StringBuilder dencryptClass(String decMessage, int decShift){
        StringBuilder dencryptedResult = new StringBuilder();

        for (int i=0; i<decMessage.length(); i++){
            if (Character.isUpperCase(decMessage.charAt(i)))
            {
                char character = (char)(((int)decMessage.charAt(i) -
                        decShift - 65) % 26 + 65);
                dencryptedResult.append(character);
            }
            else
            {
                char character = (char)(((int)decMessage.charAt(i) -
                        decShift - 97) % 26 + 97);
                dencryptedResult.append(character);
            }

        }
        return dencryptedResult;
    }

}
