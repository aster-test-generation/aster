/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IOUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadEmptyFile_xoCh1() throws IOException {
    File file = new File("test.txt");
    byte[] array = new byte[110];
    assertEquals(10, IOUtils.read(file, array));
}
@Test
public void testCopyRange_BufferSizeLessThanOne_ThrowsIllegalArgumentException_RLiD0() throws IOException {
    java.io.InputStream input = new java.io.ByteArrayInputStream(new byte[] {1, 2, 3, 4, 5});
    java.io.OutputStream output = new java.io.ByteArrayOutputStream();
    try {
        IOUtils.copyRange(input, 5, output, 0);
        fail("IllegalArgumentException was expected");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_dtpT0_Cipn0() throws IOException {
    File file = new File("test.txt");
    byte[] array = new byte[10];
    java.io.FileOutputStream fos = new java.io.FileOutputStream(file);
    fos.write(new byte[10]);
    fos.close();
    assertEquals(10, IOUtils.copyRange(new java.io.FileInputStream(file), 10, null, 1024));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCopyRangeWithNullOutput_Gntf4_UQmM0() throws IOException {
    java.io.ByteArrayInputStream input = new java.io.ByteArrayInputStream("Hello World!".getBytes());
    long length = 5;
    int bufferSize = 2;
    long result = IOUtils.copyRange(input, length, null, bufferSize);
    assertEquals(5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadNullFile_aLMy2_jNUx0() {
    byte[] array = new byte[10];
    try {
        IOUtils.copyRange(null, 10, null, 10);
        fail();
    } catch (NullPointerException e) {
    } catch (IOException e) {
    }
}
}