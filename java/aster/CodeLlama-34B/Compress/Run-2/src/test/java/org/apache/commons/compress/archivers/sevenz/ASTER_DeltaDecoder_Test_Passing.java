/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.tukaani.xz.DeltaOptions;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import static org.apache.commons.compress.archivers.sevenz.AbstractCoder.toInt;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeltaDecoder_Test_Passing {

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsProperties_null_UYux0() {
    DeltaDecoder decoder = new DeltaDecoder();
    byte[] options = decoder.getOptionsAsProperties(null);
    assertEquals(0, options.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsProperties_empty_cVxh1() {
    DeltaDecoder decoder = new DeltaDecoder();
    byte[] options = decoder.getOptionsAsProperties(new Object());
    assertEquals(0, options.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsProperties_nonEmpty_owsH2() {
    DeltaDecoder decoder = new DeltaDecoder();
    Object options = new Object();
    byte[] expected = new byte[] { (byte) (toInt(options, 1) - 1) };
    byte[] actual = decoder.getOptionsAsProperties(options);
    assertArrayEquals(expected, actual);
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_OutputStream_Null_PoUk0() throws IOException {
    DeltaDecoder decoder = new DeltaDecoder();
    OutputStream out = null;
    Object options = new DeltaOptions(1);
    try {
        decoder.encode(out, options);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}

}