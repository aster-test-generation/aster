/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithOffsetAndLengthExceedBuffer_maxP2() throws IOException {
        FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream = new FramedSnappyCompressorOutputStream(new ByteArrayOutputStream());
        byte[] data = new byte[10];
        framedSnappyCompressorOutputStream.write(data, 0, 12);
        framedSnappyCompressorOutputStream.flush();
    }
}