/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MultiReadOnlySeekableByteChannel_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTruncate_Cthh0() {
        List<SeekableByteChannel> channels = new ArrayList<>();
        channels.add(null);
        MultiReadOnlySeekableByteChannel channel = new MultiReadOnlySeekableByteChannel(channels);
        try {
            channel.truncate(0);
            fail("Should have thrown NonWritableChannelException");
        } catch (NonWritableChannelException e) {
            assertNotNull(e);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPosition_eRMi0() {
        List<SeekableByteChannel> channels = new ArrayList<>();
        MultiReadOnlySeekableByteChannel channel = new MultiReadOnlySeekableByteChannel(channels);
        assertEquals(0, channel.position());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSizeWhenChannelsSizeIsZero_kxCo0() throws IOException {
    List<SeekableByteChannel> channels = new ArrayList<>();
    MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel = new MultiReadOnlySeekableByteChannel(channels);
    assertEquals(0, multiReadOnlySeekableByteChannel.size());
}
}