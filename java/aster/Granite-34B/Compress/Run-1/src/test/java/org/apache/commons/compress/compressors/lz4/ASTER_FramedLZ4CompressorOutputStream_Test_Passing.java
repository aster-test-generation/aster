/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lz4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedLZ4CompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_SGou0() throws IOException {
    FramedLZ4CompressorOutputStream f = new FramedLZ4CompressorOutputStream(new ByteArrayOutputStream());
    f.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish2_neZu1() throws IOException {
    FramedLZ4CompressorOutputStream f = new FramedLZ4CompressorOutputStream(new ByteArrayOutputStream());
    f.finish();
    f.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_rFzj0() throws Exception {
        byte[] data = new byte[10];
        int off = 0;
        int len = 10;
        FramedLZ4CompressorOutputStream stream = new FramedLZ4CompressorOutputStream(new ByteArrayOutputStream());
        stream.write(data, off, len);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_JRfz0() throws IOException {
    FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream = new FramedLZ4CompressorOutputStream(new ByteArrayOutputStream());
    framedLZ4CompressorOutputStream.finish();
}
}