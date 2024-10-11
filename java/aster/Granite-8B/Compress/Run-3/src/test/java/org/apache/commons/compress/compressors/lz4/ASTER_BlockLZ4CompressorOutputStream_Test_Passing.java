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
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BlockLZ4CompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithNoParams_CeWD2() throws IOException {
        OutputStream mockOs = mock(OutputStream.class);
        BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream = new BlockLZ4CompressorOutputStream(mockOs);
        blockLZ4CompressorOutputStream.write(1);
        verify(mockOs, times(1)).write(any(byte[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrefillWithEmptyData_nDUM0() throws Exception {
        BlockLZ4CompressorOutputStream compressor = new BlockLZ4CompressorOutputStream(System.out);
        byte[] data = new byte[0];
        compressor.prefill(data, 0, 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrefillWithNonEmptyData_NMsL1() throws Exception {
        BlockLZ4CompressorOutputStream compressor = new BlockLZ4CompressorOutputStream(System.out);
        byte[] data = new byte[]{1, 2, 3};
        compressor.prefill(data, 0, data.length);
    }
}