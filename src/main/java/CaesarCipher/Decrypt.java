package CaesarCipher;

public class Decrypt {
    public static StringBuilder dencryptClass(String decMessage, int decShift){
        StringBuilder dencryptedResult = new StringBuilder();

        if(decShift>26){
            decShift = decShift%26;
        }else if (decShift <0 ){
            decShift = (decShift%26)+26;
        }

        for (int i=0; i<decMessage.length(); i++){
            if (Character.isUpperCase(decMessage.charAt(i)))
            {
                char character = (char)(((int)decMessage.charAt(i) -
                        decShift - 65) % 32 + 65);
                dencryptedResult.append(character);
            }
            else
            {
                char character = (char)(((int)decMessage.charAt(i) -
                        decShift - 97) % 32 + 97);
                dencryptedResult.append(character);
            }

        }
        return dencryptedResult;
    }

}
