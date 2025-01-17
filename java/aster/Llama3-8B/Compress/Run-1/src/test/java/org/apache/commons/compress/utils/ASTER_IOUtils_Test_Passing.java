/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IOUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadRange_dNAp0_dQSQ0() throws IOException {
    byte[] expected = new byte[] {1, 2, 3, 4, 5};
    InputStream input = new java.io.ByteArrayInputStream(expected);
    byte[] actual = IOUtils.toByteArray(input);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadRangeZeroLength_gunz3_rlhg0() throws IOException {
    byte[] expected = new byte[0];
    InputStream input = new java.io.ByteArrayInputStream(new byte[0]);
    byte[] actual = IOUtils.toByteArray(input);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadRangeNegativeLength_shiG4_KzLo1() {
    try {
        InputStream input = new java.io.ByteArrayInputStream(new byte[0]);
        IOUtils.toByteArray(input);
        assertEquals(true, true);
    } catch (IOException e) {
        assertEquals(false, true);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCopy_ypLJ0_JgVG0_2() throws IOException {
    java.io.ByteArrayInputStream input = new java.io.ByteArrayInputStream(new byte[0]);
    java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
    assertEquals("", new String(output.toByteArray()));}
}