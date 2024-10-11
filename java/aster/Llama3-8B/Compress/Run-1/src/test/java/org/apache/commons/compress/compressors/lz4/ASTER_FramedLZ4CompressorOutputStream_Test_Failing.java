/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lz4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedLZ4CompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseWithoutParams_gnzk1() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        FramedLZ4CompressorOutputStream compressorOutputStream = new FramedLZ4CompressorOutputStream(out);
        assertThrows(IOException.class, () -> compressorOutputStream.close());
    }
}