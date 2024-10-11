/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_withSmallData_nsnZ0_kMgX0() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    FramedSnappyCompressorOutputStream compressorOutputStream = new FramedSnappyCompressorOutputStream(out);
    byte[] data = new byte[10];
    compressorOutputStream.write(data, 0,23);
    compressorOutputStream.close();
    assertEquals(5, out.toByteArray().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_NmLo0_dwzO0() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    FramedSnappyCompressorOutputStream fos = new FramedSnappyCompressorOutputStream(out);
    byte[] data = new byte[1024];
    fos.write(data, 0,10);
    assertEquals(1024, out.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWritePartialBlock_vGix1_rkfC0() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    FramedSnappyCompressorOutputStream fos = new FramedSnappyCompressorOutputStream(out);
    byte[] data = new byte[512];
    fos.write(data, 0,10);
    assertEquals(512, out.size());
    fos.close();
}
@Test
@Timeout(value =10, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_olyV0_EQbo0() throws IOException {
    OutputStream out = new ByteArrayOutputStream();
    FramedSnappyCompressorOutputStream fsco = new FramedSnappyCompressorOutputStream(out);
    fsco.write(0x12);
    assertEquals(1, ((ByteArrayOutputStream)out).size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMask_Sgez0_fid1() {
    long x = 123456789L;
    long result = FramedSnappyCompressorOutputStream.mask(x);
    assertEquals(2139062144L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_withSmallData_nsnZ0_kMgX0_fid1() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    FramedSnappyCompressorOutputStream compressorOutputStream = new FramedSnappyCompressorOutputStream(out);
    byte[] data = new byte[10];
    compressorOutputStream.write(data, 0, 5);
    compressorOutputStream.close();
    assertEquals(5, out.toByteArray().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_NmLo0_dwzO0_fid1() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    FramedSnappyCompressorOutputStream fos = new FramedSnappyCompressorOutputStream(out);
    byte[] data = new byte[1024];
    fos.write(data, 0, 1024);
    assertEquals(1024, out.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWritePartialBlock_vGix1_rkfC0_fid1() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    FramedSnappyCompressorOutputStream fos = new FramedSnappyCompressorOutputStream(out);
    byte[] data = new byte[512];
    fos.write(data, 0, 512);
    assertEquals(512, out.size());
    fos.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteMultipleBlocks_Orhk2_sGqP0_fid1() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    FramedSnappyCompressorOutputStream fos = new FramedSnappyCompressorOutputStream(out);
    byte[] data = new byte[2048];
    fos.write(data, 0, 2048);
    assertTrue(out.size() > 1024);
    fos.close();
}
}