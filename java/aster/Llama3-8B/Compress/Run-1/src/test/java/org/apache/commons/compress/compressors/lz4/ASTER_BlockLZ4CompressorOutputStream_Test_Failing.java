/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lz4;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BlockLZ4CompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteNullParameters_qgwF3_wJFF0() {
    java.io.ByteArrayOutputStream os = new java.io.ByteArrayOutputStream();
    org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream compressorOutputStream = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream(os, null);
    assertThrows(NullPointerException.class, () -> compressorOutputStream.write(0x12));
}
}