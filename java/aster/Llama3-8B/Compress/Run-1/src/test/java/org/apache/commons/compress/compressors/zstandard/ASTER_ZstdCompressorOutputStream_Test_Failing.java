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
public class Aster_ZstdCompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithLevel_uemW1_OWKs0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1);
    zstdCompressorOutputStream.write(new byte[] {1}, 0, 1);
    assertThrows(IOException.class, () -> zstdCompressorOutputStream.write(new byte[] {2}, 0, 1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_rOWH0_zNtc0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos);
    assertThrows(IOException.class, () -> zstdCompressorOutputStream.close());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseWithLevelAndCloseFrameOnFlush_HvYp2_AifX0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true, false);
    assertThrows(IOException.class, () -> zstdCompressorOutputStream.close());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_LopR0_bkGq0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    zstdCompressorOutputStream.write(buf, 0, buf.length);
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithLevel_fAdz1_MqnD0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    zstdCompressorOutputStream.write(buf, 0, buf.length);
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithCloseFrameOnFlush_lqRi2_SGqN0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true, false);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    zstdCompressorOutputStream.write(buf, 0, buf.length);
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithChecksum_Hymr3_MJhp0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true, true);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    zstdCompressorOutputStream.write(buf, 0, buf.length);
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithLevelAndCloseFrameOnFlush_VrZU4_bOxt0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    zstdCompressorOutputStream.write(buf, 0, buf.length);
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithLevelAndChecksum_mHVD6_HXlq0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, false, true);
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    zstdCompressorOutputStream.write(buf, 0, buf.length);
    assert Arrays.equals(bos.toByteArray(), buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_liOp0_FdET0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos);
    String result = zstdCompressorOutputStream.toString();
    assertEquals(bos.toString(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithLevel_yTvw1_crwz0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1);
    String result = zstdCompressorOutputStream.toString();
    assertEquals(bos.toString(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithLevelAndCloseFrameOnFlush_hMDQ2_aBdf0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true);
    String result = zstdCompressorOutputStream.toString();
    assertEquals(bos.toString(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithLevelAndCloseFrameOnFlushAndChecksum_aijX3_mByY0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1, true, true);
    String result = zstdCompressorOutputStream.toString();
    assertEquals(bos.toString(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseWithLevel_zuTU1_zgsh0_fid2() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    ZstdCompressorOutputStream zstdCompressorOutputStream = new ZstdCompressorOutputStream(bos, 1);
    assertThrows(IOException.class, () -> zstdCompressorOutputStream.close());
}
}