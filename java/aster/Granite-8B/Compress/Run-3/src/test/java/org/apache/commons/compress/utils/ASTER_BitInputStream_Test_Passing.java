/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BitInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAlignWithByteBoundary_1_UcGj0() {
        BitInputStream bitInputStream = new BitInputStream(null, null);
        bitInputStream.alignWithByteBoundary();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose_SvVc0() throws IOException {
        InputStream in = mock(InputStream.class);
        BitInputStream bitInputStream = new BitInputStream(in, ByteOrder.BIG_ENDIAN);
        bitInputStream.close();
        verify(in, times(1)).close();
    }
}