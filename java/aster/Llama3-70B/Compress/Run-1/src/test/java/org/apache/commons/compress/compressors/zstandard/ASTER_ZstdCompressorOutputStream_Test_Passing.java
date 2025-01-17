/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.zstandard;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZstdCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlush_withLevel_mVjw1_vkIe0() throws IOException {
    java.io.ByteArrayOutputStream outStream = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(outStream, 1);
    zstdCompressorOutputStream.flush();
    assertTrue(outStream.toString().isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_withLevelAndCloseFrameOnFlushAndUseChecksum_sgRZ3_IiGx0() throws IOException {
    java.io.OutputStream outStream = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(outStream, 1, true, true);
    zstdCompressorOutputStream.close();
    org.junit.Assert.assertTrue(outStream != null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlush_withLevelAndCloseFrameOnFlush_GUcH2_gVGo0_fid2() throws IOException {
    java.io.ByteArrayOutputStream outStream = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(outStream, 1, true);
    zstdCompressorOutputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlush_withLevelAndCloseFrameOnFlushAndUseChecksum_CvhZ3_zHGW0_fid2() throws IOException {
    java.io.ByteArrayOutputStream outStream = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(outStream, 1, true, true);
    zstdCompressorOutputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_uAOG0_gVvi0_fid2() throws IOException {
    java.io.OutputStream outStream = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(outStream);
    byte[] buf = new byte[10];
    zstdCompressorOutputStream.write(buf, 0, 5);
    zstdCompressorOutputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_uEgo0_gRcy0_fid2() throws IOException {
    java.io.ByteArrayOutputStream outStream = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(outStream);
    zstdCompressorOutputStream.write(1);
    zstdCompressorOutputStream.close();
}
}