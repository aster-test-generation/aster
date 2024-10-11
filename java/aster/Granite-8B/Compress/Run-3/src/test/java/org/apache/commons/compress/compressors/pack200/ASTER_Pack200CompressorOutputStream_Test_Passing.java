/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200CompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteByteArrayWithNullOutputStream_XVCS4_1() throws Exception {
        OutputStream nullOutputStream = null;
        Pack200CompressorOutputStream pack200CompressorOutputStream = new Pack200CompressorOutputStream(nullOutputStream);
        byte[] b = new byte[10];
        IOException exception = assertThrows(IOException.class, () -> pack200CompressorOutputStream.write(b));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_NpPH0() throws IOException {
        Pack200CompressorOutputStream pack200CompressorOutputStream = new Pack200CompressorOutputStream(System.out);
        byte[] b = new byte[10];
        int from = 0;
        int length = 10;
        pack200CompressorOutputStream.write(b, from, length);
    }
}