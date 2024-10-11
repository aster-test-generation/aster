/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SeekableChannelRandomAccessOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_exception_dfif3_QmbP0() throws IOException {
    SeekableChannelRandomAccessOutputStream stream = new SeekableChannelRandomAccessOutputStream(null);
    try {
        stream.close();
        fail("Expected IOException");
    } catch (IOException e) {
        assertTrue(e.getMessage().contains("Channel is closed"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_NullInput_fOFN3_NArv0() throws IOException {
    SeekableChannelRandomAccessOutputStream stream = new SeekableChannelRandomAccessOutputStream(null);
    byte[] b = null;
    int off = 0;
    int len = 0;
    stream.write(b, off, len);
    assertEquals(0, stream.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_nullChannel_exception_psPq5_BeZi0_fid2() throws IOException {
    SeekableChannelRandomAccessOutputStream stream = new SeekableChannelRandomAccessOutputStream(null);
    try {
        stream.close();
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertTrue(e.getMessage().contains("Channel is null"));
    }
}
}