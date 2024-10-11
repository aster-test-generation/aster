/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.zstandard;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZstdCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_pobn0_ssmB0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos);
    String result = zstdCompressorOutputStream.toString();
    assertEquals("ZstdCompressorOutputStream@" + Integer.toHexString(zstdCompressorOutputStream.hashCode()), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithLevel_pRsS1_YrJS0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1);
    String result = zstdCompressorOutputStream.toString();
    assertEquals("ZstdCompressorOutputStream@<hash>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithLevelAndCloseFrameOnFlush_mgqm2_yphg0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true);
    String result = zstdCompressorOutputStream.toString();
    assertEquals("ZstdCompressorOutputStream@<hash>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithLevelAndCloseFrameOnFlushAndChecksum_vQmT3_KIvR0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true, true);
    String result = zstdCompressorOutputStream.toString();
    assertEquals("ZstdCompressorOutputStream@<hash>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlush_GWeB0_WdpL1() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos);
    zstdCompressorOutputStream.flush();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlushWithLevelAndCloseFrameOnFlush_pNmT2_sRty0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true);
    zstdCompressorOutputStream.flush();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlushWithLevelAndCloseFrameOnFlushAndChecksum_CfLM3_IybQ0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true, true);
    zstdCompressorOutputStream.flush();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_BvoU0_IRWs0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream compressor = new ZstdCompressorOutputStream(bos);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    compressor.write(buf, 0, buf.length);
    compressor.close();
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithLevel_XFNp1_zhkg0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream compressor = new ZstdCompressorOutputStream(bos, 1);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    compressor.write(buf, 0, buf.length);
    compressor.close();
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithCloseFrameOnFlush_SZId2_WjqL0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream compressor = new ZstdCompressorOutputStream(bos, 1, true, false);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    compressor.write(buf, 0, buf.length);
    compressor.close();
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithChecksum_LzSA3_KpdB0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream compressor = new ZstdCompressorOutputStream(bos, 1, true, true);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    compressor.write(buf, 0, buf.length);
    compressor.close();
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithCloseFrameOnFlushAndLevel_UImA4_QcFD0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream compressor = new ZstdCompressorOutputStream(bos, 1, true);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    compressor.write(buf, 0, buf.length);
    compressor.close();
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithLevelAndChecksum_UlOp5_TXLE0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream compressor = new ZstdCompressorOutputStream(bos, 1, false, true);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    compressor.write(buf, 0, buf.length);
    compressor.close();
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_QfEk0_ZUod0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos);
    zstdCompressorOutputStream.write(1);
    assertThrows(IOException.class, () -> zstdCompressorOutputStream.close());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithLevel_aPdN1_nbWX0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1);
    zstdCompressorOutputStream.write(1);
    assertThrows(IOException.class, () -> zstdCompressorOutputStream.close());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithLevelAndCloseFrameOnFlush_DXUZ2_zBYb0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true, false);
    zstdCompressorOutputStream.write(1);
    assertThrows(IOException.class, () -> zstdCompressorOutputStream.close());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithLevelAndCloseFrameOnFlushAndChecksum_Ueao3_svaF0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true, true);
    zstdCompressorOutputStream.write(1);
    assertThrows(IOException.class, () -> zstdCompressorOutputStream.close());
}
}