/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SeekableChannelRandomAccessOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_nullChannel_exception_psPq5_BeZi0() throws IOException {
    SeekableChannelRandomAccessOutputStream stream = new SeekableChannelRandomAccessOutputStream(null);
    try {
        stream.close();
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertFalse(e.getMessage().contains("Channel is null"));
    }
}
}