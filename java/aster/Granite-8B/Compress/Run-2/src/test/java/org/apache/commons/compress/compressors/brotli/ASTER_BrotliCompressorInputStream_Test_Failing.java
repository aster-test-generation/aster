/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.brotli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;
public class Aster_BrotliCompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testReset_jlcO0() throws IOException {
        InputStream inputStream = mock(InputStream.class);
        BrotliCompressorInputStream brotliInputStream = new BrotliCompressorInputStream(inputStream);
        assertDoesNotThrow(() -> brotliInputStream.reset());
        verify(brotliInputStream).reset();
        when(inputStream.markSupported()).thenReturn(false);
        IOException exception =
            assertThrows(IOException.class, () -> brotliInputStream.reset());
        verify(brotliInputStream).reset();
    }
}