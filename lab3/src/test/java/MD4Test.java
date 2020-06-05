import lab3.MD4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MD4Test {

    @Test
    public void getHash() {
        String s1 = MD4.getHash("");
        assertEquals("31d6cfe0d16ae931b73c59d7e0c089c0", s1);

        String s2 = MD4.getHash("a");
        assertEquals("bde52cb31de33e46245e05fbdbd6fb24", s2);

        String s3 = MD4.getHash("abc");
        assertEquals("a448017aaf21d8525fc10ae87aa6729d", s3);

        String s4 = MD4.getHash("message digest");
        assertEquals("d9130a8164549fe818874806e1c7014b", s4);
    }
}