/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lzma;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMACompressorOutputStream_Test_Passing {
    private LZMACompressorOutputStream compressorOutputStream;
    private OutputStream outputStream;
	private OutputStream out;
	private LZMACompressorOutputStream lzmaCOS;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithNegativeOffset_qzvW5() throws IOException {
        byte[] buf = new byte[10];
        int off = -2;
        int len = 8;
        try {
            compressorOutputStream.write(buf, off, len);
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
            return;
        }
        assertTrue(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithNegativeLength_XLOS6() throws IOException {
        byte[] buf = new byte[10];
        int off = 0;
        int len = -8;
        try {
            compressorOutputStream.write(buf, off, len);
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
            return;
        }
        assertTrue(false);
    }
}