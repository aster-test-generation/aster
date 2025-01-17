/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lz4;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedLZ4CompressorInputStream_Test_Passing {
    private final byte[] oneByte = new byte[1];
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchesWithValidSignatureAndLength_LYCG0() {
		byte[] signature = new byte[] { 0, 0, 0, 0 };
		int length = 4;
		assertTrue(FramedLZ4CompressorInputStream.matches(signature, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchesWithInvalidSignatureAndLength_ZFoY1() {
		byte[] signature = new byte[] { 1, 2, 3, 4 };
		int length = 3;
		assertFalse(FramedLZ4CompressorInputStream.matches(signature, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchesWithInsufficientLength_eROg2() {
		byte[] signature = new byte[] { 0, 0, 0 };
		int length = 2;
		assertFalse(FramedLZ4CompressorInputStream.matches(signature, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void close_closeInputStream_closesInputStream_gbMc1() throws IOException {
    InputStream inputStream = mock(InputStream.class);
    FramedLZ4CompressorInputStream target = new FramedLZ4CompressorInputStream(inputStream);
    target.close();
    verify(inputStream, times(1)).close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_JZMn0_rRKm0() throws IOException {
        InputStream inputStream = mock(InputStream.class);
        FramedLZ4CompressorInputStream framedLZ4CompressorInputStream = new FramedLZ4CompressorInputStream(inputStream);
        byte[] b = new byte[10];
        int off = 0;
        int len = 5;
        int result = framedLZ4CompressorInputStream.read(b, off, len);
        assertEquals(533, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCompressedCount_when_inputstream_is_null_rtvM2_kIIO0() throws IOException {
        FramedLZ4CompressorInputStream framedLZ4CompressorInputStream = new FramedLZ4CompressorInputStream(null);
        assertEquals(0, framedLZ4CompressorInputStream.getCompressedCount());
    }
}