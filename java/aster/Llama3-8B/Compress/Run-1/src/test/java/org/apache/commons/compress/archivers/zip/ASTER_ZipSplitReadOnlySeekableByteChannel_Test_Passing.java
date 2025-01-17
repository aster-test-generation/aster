/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipSplitReadOnlySeekableByteChannel_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPathsNullPaths_cfWV2() {
    List<Path> paths = null;
    OpenOption[] openOptions = new OpenOption[]{};
    assertThrows(NullPointerException.class, () -> ZipSplitReadOnlySeekableByteChannel.forPaths(paths, openOptions));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testForOrderedSeekableByteChannelsSingleChannel_STbl0() throws IOException {
        SeekableByteChannel channel = new java.io.RandomAccessFile("test.txt", "rw").getChannel();
        SeekableByteChannel result = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(channel);
        assertSame(channel, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPathsSingleChannel_vPlQ0_ZYwq0() throws IOException {
}
}