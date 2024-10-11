/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Nysiis_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_uJHh0() throws EncoderException {
        Nysiis nysiis = new Nysiis();
        Object obj = "example";
        Object result = nysiis.encode(obj);
        assertEquals("example", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrict_DVMN1() throws EncoderException {
        Nysiis nysiis = new Nysiis(true);
        Object obj = "example";
        Object result = nysiis.encode(obj);
        assertEquals("example", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDefaultConstructor_WYZm0() throws Exception {
        Nysiis nysiis = new Nysiis();
        assertFalse(nysiis.isStrict());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictTrueConstructor_TSwP1() throws Exception {
        Nysiis nysiis = new Nysiis(true);
        assertTrue(nysiis.isStrict());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictFalseConstructor_PRBF2() throws Exception {
        Nysiis nysiis = new Nysiis(false);
        assertFalse(nysiis.isStrict());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_eBjn0_1() throws Exception {
        Nysiis nysiis = new Nysiis();
        String str1 = "testing";
        String expected1 = "testin";
        String str2 = "testing";
        String expected2 = "testin";
        String str100 = "zymurgy";
        String expected100 = "zymr";
        assertEquals(expected1, nysiis.encode(str1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_eBjn0_2() throws Exception {
        Nysiis nysiis = new Nysiis();
        String str1 = "testing";
        String expected1 = "testin";
        String str2 = "testing";
        String expected2 = "testin";
        String str100 = "zymurgy";
        String expected100 = "zymr";
        assertEquals(expected2, nysiis.encode(str2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_eBjn0_3() throws Exception {
        Nysiis nysiis = new Nysiis();
        String str1 = "testing";
        String expected1 = "testin";
        String str2 = "testing";
        String expected2 = "testin";
        String str100 = "zymurgy";
        String expected100 = "zymr";
        assertEquals(expected100, nysiis.encode(str100));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void nysiis_0_iakB0() throws Exception {
	Nysiis nysiis = new Nysiis();
	String result = nysiis.nysiis("Ashcraft");
	assertEquals("ASCRFT", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void nysiis_1_ItwU1() throws Exception {
	Nysiis nysiis = new Nysiis();
	String result = nysiis.nysiis("Ashcroft");
	assertEquals("ASCRFT", result);
}
}