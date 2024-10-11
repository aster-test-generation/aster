/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CodecEncoding_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_sgeZ0_1() {
        CodecEncoding codecEncoding = new CodecEncoding();
        BHSDCodec expected = codecEncoding.getCanonicalCodec(0);
        assertEquals(expected.getB(), 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_sgeZ0_2() {
        CodecEncoding codecEncoding = new CodecEncoding();
        BHSDCodec expected = codecEncoding.getCanonicalCodec(0);
        assertEquals(expected.hashCode(), 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_sgeZ0_3() {
        CodecEncoding codecEncoding = new CodecEncoding();
        BHSDCodec expected = codecEncoding.getCanonicalCodec(0);
        assertEquals(expected.getS(), 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_sgeZ0_4() {
        CodecEncoding codecEncoding = new CodecEncoding();
        BHSDCodec expected = codecEncoding.getCanonicalCodec(0);
        assertEquals(expected.getH(), 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_sgeZ0_5() {
        CodecEncoding codecEncoding = new CodecEncoding();
        BHSDCodec expected = codecEncoding.getCanonicalCodec(0);
        assertEquals(expected.getL(), 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCanonicalCodecValueLessThanZero_qwFX1_rcQs0() {
    try {
        Codec defaultCodec = Codec.BYTE1;
        CodecEncoding.getSpecifier(null, defaultCodec);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCanonicalCodec_sgeZ0() {
        CodecEncoding codecEncoding = new CodecEncoding();
        BHSDCodec expected = codecEncoding.getCanonicalCodec(0);
        assertEquals(expected.getB(), 0);
        assertEquals(expected.hashCode(), 0);
        assertEquals(expected.getS(), 0);
        assertEquals(expected.getH(), 0);
        assertEquals(expected.getL(), 0);
    }
}