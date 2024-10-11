/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.bzip2;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BZip2CompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_zbzL0() throws IOException {
        BZip2CompressorOutputStream compressorOutputStream = new BZip2CompressorOutputStream(new java.io.ByteArrayOutputStream(), 100);
        compressorOutputStream.write(1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithNullOutputStream_ntpO2() throws IOException {
    BZip2CompressorOutputStream compressor = new BZip2CompressorOutputStream(null, 100);
    try {
        compressor.finish();
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithNullOutputStream_TaAt2() throws IOException {
        BZip2CompressorOutputStream compressorOutputStream = new BZip2CompressorOutputStream(null, 100);
        try {
            compressorOutputStream.finish();
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithNullOutputStream_mXfu1() throws IOException {
    BZip2CompressorOutputStream compressor = new BZip2CompressorOutputStream(null, 100);
    try {
        compressor.finish();
        assert false;
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithClosed_lGAw0() throws IOException {
        BZip2CompressorOutputStream compressor = new BZip2CompressorOutputStream(new java.io.ByteArrayOutputStream(), 100);
        compressor.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithNullOut_axZY2() throws IOException {
    try {
        BZip2CompressorOutputStream compressor = new BZip2CompressorOutputStream(null, 10);
        compressor.finish();
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
}