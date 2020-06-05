package org.Masha;

import org.junit.Test;

import static org.junit.Assert.*;

public class DESTest {

    DES des = new DES();


    @Test
    public void encryptDecrypt() {
        String s = "1234567890";
        String encrypt = des.encrypt(s, "passwrd", "randomTx");
        assertNotEquals(s, encrypt);
        String d = des.decrypt(encrypt, "passwrd", "randomTx");
        assertEquals(s, d);
    }

}
