/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.nio.channels.SeekableByteChannel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SeekableChannelRandomAccessOutputStream_Test_Passing {
private SeekableByteChannel channel;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void init(SeekableByteChannel channel) {
        this.channel = channel;
    }
}