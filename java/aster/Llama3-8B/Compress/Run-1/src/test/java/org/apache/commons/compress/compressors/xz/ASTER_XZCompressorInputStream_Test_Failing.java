/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.xz;
import java.io.IOException;
import org.apache.commons.compress.MemoryLimitException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XZCompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadMemoryLimitException_bjyn1_sYYD0() throws IOException {
    java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(new byte[] {1, 2, 3, 4, 5});
    XZCompressorInputStream xzCompressorInputStream = new XZCompressorInputStream(inputStream, true);
    try {
        byte[] buf = new byte[1024];
        xzCompressorInputStream.read(buf, 0, buf.length);
        assert false;
    } catch (MemoryLimitException e) {
        assert true;
    }
}
}