/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithoutParams_FsgJ1() throws IOException {
        FramedSnappyCompressorOutputStream compressorOutputStream = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
        compressorOutputStream.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteSmallData_iIzF0_eIEQ0() throws IOException {
    FramedSnappyCompressorOutputStream compressor = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
    byte[] data = new byte[10];
    compressor.write(data, 0, 5);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteLargeData_UkaG1_nnfV0() throws IOException {
    FramedSnappyCompressorOutputStream compressor = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
    byte[] data = new byte[100];
    compressor.write(data, 0, 50);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteSmallData_EntY0_amzC0() throws IOException {
    FramedSnappyCompressorOutputStream compressorOutputStream = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
    byte[] data = new byte[] {1, 2, 3};
    compressorOutputStream.write(data, 0, 3);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteLargeData_SUga1_iyUM0() throws IOException {
    FramedSnappyCompressorOutputStream compressorOutputStream = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
    byte[] data = new byte[100];
    compressorOutputStream.write(data, 0, 100);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteLargeData_VHei1_voBI0() throws IOException {
    FramedSnappyCompressorOutputStream compressor = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
    byte[] data = new byte[100];
    compressor.write(data, 0, 50);
    compressor.write(data, 50, 50);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteDataAtBoundary_pqVV2_yngx0() throws IOException {
    FramedSnappyCompressorOutputStream compressor = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
    byte[] data = new byte[100];
    compressor.write(data, 0, 100);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMask_PKVU0_GZhK0() {
    long x = 0;
    assertEquals(0, x);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_NXuB0_sqdq1() throws IOException {
    FramedSnappyCompressorOutputStream compressorOutputStream = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
    compressorOutputStream.close();
}
}