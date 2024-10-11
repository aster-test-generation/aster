/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMA2Decoder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsProperties_CgVB0_1() {
    LZMA2Decoder decoder = new LZMA2Decoder();
    byte[] options = decoder.getOptionsAsProperties(new Object());
    assertEquals(1, options.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsProperties_CgVB0_2() {
    LZMA2Decoder decoder = new LZMA2Decoder();
    byte[] options = decoder.getOptionsAsProperties(new Object());
    assertEquals(19, options[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsProperties_CgVB0() {
    LZMA2Decoder decoder = new LZMA2Decoder();
    byte[] options = decoder.getOptionsAsProperties(new Object());
    assertEquals(1, options.length);
    assertEquals(19, options[0]);
}
}