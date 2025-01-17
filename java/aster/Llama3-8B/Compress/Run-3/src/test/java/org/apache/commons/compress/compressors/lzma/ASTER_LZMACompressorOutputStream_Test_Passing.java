/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lzma;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMACompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlush_Ecch0_VGxd0() throws IOException {
    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
    LZMACompressorOutputStream lzmaCompressorOutputStream = new LZMACompressorOutputStream(byteArrayOutputStream);
    lzmaCompressorOutputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWritePartial_QNAj1_ucQg0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    LZMACompressorOutputStream compressorOutputStream = new LZMACompressorOutputStream(bos);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    compressorOutputStream.write(buf, 1, 3);
    bos.flush();
    assert Arrays.equals(bos.toByteArray(), new byte[] {0, 1, 2, 3, 4});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_PjQI0_BAsl0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    LZMACompressorOutputStream lzmaCompressorOutputStream = new LZMACompressorOutputStream(bos);
    lzmaCompressorOutputStream.write(10);
    assert bos.toByteArray()[0] == (byte)10;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteMultipleTimes_Gmzs1_Swnf0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    LZMACompressorOutputStream lzmaCompressorOutputStream = new LZMACompressorOutputStream(bos);
    lzmaCompressorOutputStream.write(10);
    lzmaCompressorOutputStream.write(20);
    assert bos.toByteArray()[0] == (byte)10;
    assert bos.toByteArray()[1] == (byte)20;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_CpFM0_CuQg1() throws IOException {
    java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
    LZMACompressorOutputStream lzmaCompressorOutputStream = new LZMACompressorOutputStream(outputStream);
    assertThrows(IOException.class, () -> lzmaCompressorOutputStream.close());
}
}