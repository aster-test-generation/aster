/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.brotli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
public class Aster_BrotliCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_eWyK0() throws IOException {
    InputStream mockInputStream = mock(InputStream.class);
    BrotliCompressorInputStream brotliCompressorInputStream = new BrotliCompressorInputStream(mockInputStream);
    brotliCompressorInputStream.close();
    verify(mockInputStream).close();
}
}