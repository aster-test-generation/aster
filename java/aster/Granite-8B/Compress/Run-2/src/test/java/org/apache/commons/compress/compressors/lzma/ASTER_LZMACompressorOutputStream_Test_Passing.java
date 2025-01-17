/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lzma;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;
public class Aster_LZMACompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_rnQh0() throws IOException {
        OutputStream mockOutputStream = mock(OutputStream.class);
        LZMACompressorOutputStream lzmaCompressorOutputStream = new LZMACompressorOutputStream(mockOutputStream);
        int b = 1;
        lzmaCompressorOutputStream.write(b);
        verify(mockOutputStream, times(1)).write(b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFinish_GhVl1() throws Exception {
        OutputStream mockOutputStream = mock(OutputStream.class);
        LZMACompressorOutputStream lzmaCompressorOutputStream = new LZMACompressorOutputStream(mockOutputStream);
        assertDoesNotThrow(() -> lzmaCompressorOutputStream.finish());
    }
}