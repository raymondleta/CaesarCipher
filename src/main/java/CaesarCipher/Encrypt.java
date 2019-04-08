package CaesarCipher;

public class Encrypt {
    public static StringBuilder encryptClass(String message, int shift) {
        StringBuilder encryptedResult = new StringBuilder();

        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        for (int i = 0; i < message.length(); i++) {
            if (Character.isUpperCase(message.charAt(i))) {
                char character = (char) (((int) message.charAt(i) +
                        shift - 65) % 26 + 65);
                encryptedResult.append(character);
            } else {
                char character = (char) (((int) message.charAt(i) +
                        shift - 97) % 26 + 97);
                encryptedResult.append(character);
            }

        }
        return encryptedResult;
    }

}
