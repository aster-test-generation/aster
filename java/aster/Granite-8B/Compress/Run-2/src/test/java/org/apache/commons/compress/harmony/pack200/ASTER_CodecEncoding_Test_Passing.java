/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CodecEncoding_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec_KDnT0() {
        BHSDCodec defaultCodec = new BHSDCodec(1, 2);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(1, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec2_kvYy1() {
        BHSDCodec defaultCodec = new BHSDCodec(3, 4, 5, 6);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(3, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec3_DpNY2() {
        BHSDCodec defaultCodec = new BHSDCodec(7, 8, 9);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(7, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec4_bWVG3() {
        BHSDCodec defaultCodec = new BHSDCodec(10, 11);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(10, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec5_bJMC4() {
        BHSDCodec defaultCodec = new BHSDCodec(12, 13, 14, 15);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(12, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec6_rObE5() {
        BHSDCodec defaultCodec = new BHSDCodec(16, 17, 18);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(16, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec7_nEqn6() {
        BHSDCodec defaultCodec = new BHSDCodec(19, 20);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(19, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec8_JJnB7() {
        BHSDCodec defaultCodec = new BHSDCodec(21, 22, 23);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(21, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec9_PCSP8() {
        BHSDCodec defaultCodec = new BHSDCodec(24, 25, 26, 27);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(24, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSpecifierForDefaultCodec10_Idxa9() {
        BHSDCodec defaultCodec = new BHSDCodec(28, 29, 30);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(28, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCodec_0_vNCF0() throws IOException, Pack200Exception {
        final int value = 0;
        final InputStream in = null;
        final Codec defaultCodec = null;
        final Codec result = CodecEncoding.getCodec(value, in, defaultCodec);
        assertEquals(defaultCodec, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCodec_1_yEID1() throws IOException, Pack200Exception {
        final int value = 1;
        final InputStream in = null;
        final Codec defaultCodec = null;
        final Codec result = CodecEncoding.getCodec(value, in, defaultCodec);
        assertEquals(defaultCodec, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_BTgx0_1() {
        BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(0);
        assertEquals(0, bhsdCodec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_BTgx0_2() {
        BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(0);
        assertEquals(0, bhsdCodec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_BTgx0_3() {
        BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(0);
        assertEquals(0, bhsdCodec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_BTgx0_4() {
        BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(0);
        assertEquals(0, bhsdCodec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_BTgx0_5() {
        BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(0);
        assertEquals(0, bhsdCodec.getL());}
}