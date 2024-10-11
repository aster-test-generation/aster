/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipCompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_utLB0_PEvC0_fid2() throws IOException {
    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
    GzipParameters gzipParameters = new GzipParameters();
    GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(out, gzipParameters);
    byte[] buffer = new byte[] {1, 2, 3};
    gzipCompressorOutputStream.write(buffer);
    gzipCompressorOutputStream.close();
    assertArrayEquals(buffer, out.toByteArray());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_ANup0_MSuc0_fid2() throws IOException {
    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
    GzipParameters gzipParameters = new GzipParameters();
    GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(out, gzipParameters);
    gzipCompressorOutputStream.close();
    try {
        gzipCompressorOutputStream.write(0x01);
    } catch (IOException e) {
    }
    assertArrayEquals(new byte[] {}, out.toByteArray());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_deflate_wEIu2_XcWb0_fid2() throws IOException {
    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
    GzipParameters gzipParameters = new GzipParameters();
    GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(out, gzipParameters);
    byte[] buffer = new byte[10];
    gzipCompressorOutputStream.write(buffer, 0, 10);
    gzipCompressorOutputStream.close();
    assertArrayEquals(buffer, out.toByteArray());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_deflaterFinished_SeYJ1_JPPM0_fid2() throws IOException {
    GzipParameters parameters = new GzipParameters();
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(out, parameters);
    gzipCompressorOutputStream.finish();
    assertEquals(((java.io.ByteArrayOutputStream) out).size(), 0); // no trailer written
}
}