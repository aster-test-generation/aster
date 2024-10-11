/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lz4;
import java.io.IOException;
import java.io.OutputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BlockLZ4CompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_fDJG0_tsqh0() throws IOException {
    java.io.OutputStream os = new java.io.ByteArrayOutputStream();
    BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream = new BlockLZ4CompressorOutputStream(os);
    blockLZ4CompressorOutputStream.prefill(new byte[0], 0, 0);
    blockLZ4CompressorOutputStream.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithoutParams_qieg1_jDBL0_fid2() throws IOException {
    java.io.OutputStream os = new java.io.ByteArrayOutputStream();
    BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream = new BlockLZ4CompressorOutputStream(os);
    blockLZ4CompressorOutputStream.write(new byte[0]);
    blockLZ4CompressorOutputStream.finish();
}
}