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
public class Aster_DeltaDecoder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsPropertiesWithString_hYqS1_1() {
    DeltaDecoder decoder = new DeltaDecoder();
    byte[] options = decoder.getOptionsAsProperties("test");
    assertEquals(1, options.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsPropertiesWithString_hYqS1_2() {
    DeltaDecoder decoder = new DeltaDecoder();
    byte[] options = decoder.getOptionsAsProperties("test");
    assertEquals(0, options[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsPropertiesWithNull_qNXB2() {
    DeltaDecoder decoder = new DeltaDecoder();
    byte[] options = decoder.getOptionsAsProperties(null);
    assertEquals(1, options.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsPropertiesWithString_hYqS1() {
    DeltaDecoder decoder = new DeltaDecoder();
    byte[] options = decoder.getOptionsAsProperties("test");
    assertEquals(1, options.length);
    assertEquals(0, options[0]);
}
}