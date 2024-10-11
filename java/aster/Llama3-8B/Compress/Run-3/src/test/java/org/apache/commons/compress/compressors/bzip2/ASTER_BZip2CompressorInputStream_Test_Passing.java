/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.bzip2;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BZip2CompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesValidSignature_DWGS0() {
        byte[] signature = new byte[] { 'B', 'Z', 'h' };
        boolean result = BZip2CompressorInputStream.matches(signature, 3);
        assertEquals(true, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesInvalidSignatureLength_cehe1() {
        byte[] signature = new byte[] { 'B', 'Z', 'h' };
        boolean result = BZip2CompressorInputStream.matches(signature, 2);
        assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesInvalidSignature_KzYw2() {
        byte[] signature = new byte[] { 'A', 'Z', 'h' };
        boolean result = BZip2CompressorInputStream.matches(signature, 3);
        assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesValidSignatureWithExtraBytes_qAcG3() {
        byte[] signature = new byte[] { 'B', 'Z', 'h', 'a', 'b', 'c' };
        boolean result = BZip2CompressorInputStream.matches(signature, 3);
        assertEquals(true, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesNullSignature_PgSC4() {
        byte[] signature = null;
        try {
            BZip2CompressorInputStream.matches(signature, 3);
            assertEquals(false, true); // This line should never be reached
        } catch (NullPointerException e) {
            assertEquals(true, true);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadClosedStream_QCyY2() throws IOException {
        BZip2CompressorInputStream bis = new BZip2CompressorInputStream(null);
        try {
            bis.read();
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadClosedStream_VEVw2() throws IOException {
        BZip2CompressorInputStream bis = new BZip2CompressorInputStream(null);
        try {
            bis.read();
            assert false;
        } catch (IOException e) {
            assert true;
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadClosedStream_naVI2() throws IOException {
        BZip2CompressorInputStream bis = new BZip2CompressorInputStream(null);
        try {
            bis.read();
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadClosedStream_VJBT2() throws IOException {
        BZip2CompressorInputStream bzip2CompressorInputStream = new BZip2CompressorInputStream(null);
        try {
            int result = bzip2CompressorInputStream.read();
            assert false;
        } catch (IOException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadClosedStream_nSxf2() throws IOException {
    BZip2CompressorInputStream bis = new BZip2CompressorInputStream(null);
    try {
        bis.read();
        fail("IOException expected");
    } catch (IOException e) {
        assertEquals("Stream closed", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadClosedStream_bRBw2() throws IOException {
    BZip2CompressorInputStream bzip2CompressorInputStream = new BZip2CompressorInputStream(null);
    try {
        bzip2CompressorInputStream.read();
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadNonEmptyStream_bYjr1_IBLp0() throws IOException {
    BZip2CompressorInputStream bis = new BZip2CompressorInputStream(new java.io.ByteArrayInputStream(new byte[] {1, 2, 3}));
    assertEquals(1, bis.read(new byte[1], 0, 1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadInvalidLength_eudW2_teod0() throws IOException {
    BZip2CompressorInputStream compressorInputStream = new BZip2CompressorInputStream(new java.io.ByteArrayInputStream(new byte[10]));
    byte[] dest = new byte[5];
    int offs = 0;
    int len = -1;
    try {
        compressorInputStream.read(dest, offs, len);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
    }
}
}