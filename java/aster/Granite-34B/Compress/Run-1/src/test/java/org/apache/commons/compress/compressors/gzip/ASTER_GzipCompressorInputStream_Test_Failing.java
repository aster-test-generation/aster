/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipCompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_0_vijw0() throws IOException {
    final byte[] b = new byte[100];
    final int len = 0;
    final GzipCompressorInputStream gzipCompressorInputStream0 = new GzipCompressorInputStream((InputStream) null);
    final int int0 = gzipCompressorInputStream0.read(b, 0, len);
    assertEquals(0, int0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_1_rgix1() throws IOException {
    final byte[] b = new byte[100];
    final int len = 100;
    final GzipCompressorInputStream gzipCompressorInputStream0 = new GzipCompressorInputStream((InputStream) null);
    final int int0 = gzipCompressorInputStream0.read(b, 0, len);
    assertEquals(0, int0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_2_gRSY2() throws IOException {
    final byte[] b = new byte[100];
    final int len = 100;
    final GzipCompressorInputStream gzipCompressorInputStream0 = new GzipCompressorInputStream((InputStream) null, false);
    final int int0 = gzipCompressorInputStream0.read(b, 0, len);
    assertEquals(0, int0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_3_dnyH3() throws IOException {
    final byte[] b = new byte[100];
    final int len = 100;
    final GzipCompressorInputStream gzipCompressorInputStream0 = new GzipCompressorInputStream((InputStream) null, true);
    final int int0 = gzipCompressorInputStream0.read(b, 0, len);
    assertEquals(0, int0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_1_rgix1_fid1() throws IOException {
    final byte[] b = new byte[100];
    final int len = 100;
    final GzipCompressorInputStream gzipCompressorInputStream0 = new GzipCompressorInputStream((InputStream) null);
    final int int0 = gzipCompressorInputStream0.read(b, 0, len);
    assertEquals(-1, int0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_3_dnyH3_fid1() throws IOException {
    final byte[] b = new byte[100];
    final int len = 100;
    final GzipCompressorInputStream gzipCompressorInputStream0 = new GzipCompressorInputStream((InputStream) null, true);
    final int int0 = gzipCompressorInputStream0.read(b, 0, len);
    assertEquals(-1, int0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_5_yaeY5_fid1() throws IOException {
    final byte[] b = new byte[100];
    final int len = 100;
    final GzipCompressorInputStream gzipCompressorInputStream0 = new GzipCompressorInputStream((InputStream) null, false);
    final int int0 = gzipCompressorInputStream0.read(b, 0, len);
    assertEquals(-1, int0);
}
}