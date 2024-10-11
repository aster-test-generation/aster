/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.nio.channels.FileChannel;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FileRandomAccessOutputStream_Test_Passing {
    private FileRandomAccessOutputStream fileRandomAccessOutputStream;
    private FileChannel channel;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChannelWithNullFileRandomAccessOutputStream_nVdI2() throws Exception {
        FileRandomAccessOutputStream fileRandomAccessOutputStream = null;
        FileChannel channel = fileRandomAccessOutputStream.channel();
        assertNull(channel);
}
}