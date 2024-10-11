/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CodecEncoding_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_LRzi0_1() {
    CodecEncoding codecEncoding = new CodecEncoding();
    BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(1);
    assertNotNull(bhsdCodec);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_LRzi1_2() {
    CodecEncoding codecEncoding = new CodecEncoding();
    BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(1);
    assertEquals(1, bhsdCodec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_LRzi0_3() {
    CodecEncoding codecEncoding = new CodecEncoding();
    BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_LRzi0_4() {
    CodecEncoding codecEncoding = new CodecEncoding();
    BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(1);
    assertEquals(0, bhsdCodec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_LRzi0_5() {
    CodecEncoding codecEncoding = new CodecEncoding();
    BHSDCodec bhsdCodec = CodecEncoding.getCanonicalCodec(1);
    assertEquals(0, bhsdCodec.getL());}
}