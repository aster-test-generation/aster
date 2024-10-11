/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Nysiis_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_JKaz0() throws org.apache.commons.codec.EncoderException {
        Nysiis nysiis = new Nysiis();
        Object obj = new Object();
        try {
            nysiis.encode(obj);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_XZbD1() throws org.apache.commons.codec.EncoderException {
        Nysiis nysiis = new Nysiis();
        Object obj = "test";
        Object result = nysiis.encode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_wGWZ0() {
        Nysiis nysiis = new Nysiis();
        assertEquals("A", nysiis.nysiis("AE"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_xrXp1() {
        Nysiis nysiis = new Nysiis();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_RwHG4() {
        Nysiis nysiis = new Nysiis();
        assertEquals("C", nysiis.nysiis("K"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_vWvz5() {
        Nysiis nysiis = new Nysiis();
        assertEquals("S", nysiis.nysiis("SCH"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test7_GDRj6() {
        Nysiis nysiis = new Nysiis();
        assertEquals("F", nysiis.nysiis("PH"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test11_Thnl10() {
        Nysiis nysiis = new Nysiis();
        assertEquals("D", nysiis.nysiis("DT"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_FuNg0() {
        Nysiis nysiis = new Nysiis();
        String str = "EV";
        String expected = "EV";
        assertEquals(expected, nysiis.nysiis(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_MlqZ1() {
        Nysiis nysiis = new Nysiis();
        String str = "A";
        String expected = "A";
        assertEquals(expected, nysiis.nysiis(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_uShW2() {
        Nysiis nysiis = new Nysiis();
        String str = "Q";
        String expected = "Q";
        assertEquals(expected, nysiis.nysiis(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_hIdJ3() {
        Nysiis nysiis = new Nysiis();
        String str = "Z";
        String expected = "S";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_tIcf4() {
        Nysiis nysiis = new Nysiis();
        String str = "M";
        String expected = "N";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_jkQL5() {
        Nysiis nysiis = new Nysiis();
        String str = "KN";
        String expected = "N";
        assertEquals(expected, nysiis.nysiis(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test7_NLEC6() {
        Nysiis nysiis = new Nysiis();
        String str = "K";
        String expected = "C";
        assertEquals(expected, nysiis.nysiis(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test8_eodW7() {
        Nysiis nysiis = new Nysiis();
        String str = "SCH";
        String expected = "S";
        assertEquals(expected, nysiis.nysiis(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test9_LZpU8() {
        Nysiis nysiis = new Nysiis();
        String str = "PH";
        String expected = "F";
        assertEquals(expected, nysiis.nysiis(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test10_KuXM9() {
        Nysiis nysiis = new Nysiis();
        String str = "H";
        String expected = "H";
        assertEquals(expected, nysiis.nysiis(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test11_mWYc10() {
        Nysiis nysiis = new Nysiis();
        String str = "W";
        String expected = "W";
        assertEquals(expected, nysiis.nysiis(str));
    }
}