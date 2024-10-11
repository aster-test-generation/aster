/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IOUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_tZAI0() throws IOException {
    File file = new File("test.txt");
    byte[] array = new byte[10];
    assertEquals(10, IOUtils.read(file, array));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadEmptyArray_Nequ1() throws IOException {
    File file = new File("test.txt");
    byte[] array = new byte[0];
    assertEquals(0, IOUtils.read(file, array));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseQuietly_UXyC0_LqYU0() {
    java.io.Reader c = new java.io.StringReader("");
    IOUtils.closeQuietly(c);
    assertTrue(true); // no exception thrown
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadNullFile_rgrE2_svsp0() throws IOException {
    byte[] array = new byte[10];
    try {
        IOUtils.toByteArray(null);
        fail();
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCopyRange_withNullInput_Japi2_OYCh0() throws IOException {
    OutputStream output = new ByteArrayOutputStream();
    long length = 3;
    int bufferSize = 2;
    try {
        IOUtils.copyRange(null, length, output, bufferSize);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    } catch (IOException e) {
    }
}
}