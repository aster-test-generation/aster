/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.xz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XZCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_YWXx0() throws Exception {
        XZCompressorInputStream xzCompressorInputStream = new XZCompressorInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0, xzCompressorInputStream.skip(0L));
    }
}