package CaesarCipher;

import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptTest {
    @Test public void testEncryptClass() {
        Encrypt classUnderTest = new Encrypt();
        assertNotNull("app shoule convert a to c when shift is 2", classUnderTest.encryptClass("A", 2));
        assertNotNull("app shoule convert hello to jgnnq when shift is 2", classUnderTest.encryptClass("A", 2));
    }
}
