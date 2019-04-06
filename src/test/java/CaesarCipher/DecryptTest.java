package CaesarCipher;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DecryptTest {
    @Test
    public void testDencryptClass() {
        Decrypt classUnderTest = new Decrypt();
        assertNotNull("app shoule convert j to h when shift is 2", classUnderTest.dencryptClass("jsudo ", 2));
    }
}
