/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MultiReadOnlySeekableByteChannel_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen_AllChannelsOpen_GZLB0() {
    SeekableByteChannel channel1 = mock(SeekableByteChannel.class);
    SeekableByteChannel channel2 = mock(SeekableByteChannel.class);
    SeekableByteChannel channel3 = mock(SeekableByteChannel.class);
    List<SeekableByteChannel> channels = Arrays.asList(channel1, channel2, channel3);
    MultiReadOnlySeekableByteChannel multiChannel = new MultiReadOnlySeekableByteChannel(channels);
    when(channel1.isOpen()).thenReturn(true);
    when(channel2.isOpen()).thenReturn(true);
    when(channel3.isOpen()).thenReturn(true);
    assertTrue(multiChannel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen_OneChannelClosed_lNwg1() {
    SeekableByteChannel channel1 = mock(SeekableByteChannel.class);
    SeekableByteChannel channel2 = mock(SeekableByteChannel.class);
    SeekableByteChannel channel3 = mock(SeekableByteChannel.class);
    List<SeekableByteChannel> channels = Arrays.asList(channel1, channel2, channel3);
    MultiReadOnlySeekableByteChannel multiChannel = new MultiReadOnlySeekableByteChannel(channels);
    when(channel1.isOpen()).thenReturn(true);
    when(channel2.isOpen()).thenReturn(false);
    when(channel3.isOpen()).thenReturn(true);
    assertFalse(multiChannel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForFilesWithEmptyArray_Fnpj0() throws IOException {
    File[] files = new File[0];
    SeekableByteChannel channel = MultiReadOnlySeekableByteChannel.forFiles(files);
    assertEquals(0, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_EmptyBuffer_kJmv0() throws IOException {
    MultiReadOnlySeekableByteChannel channel = new MultiReadOnlySeekableByteChannel(Collections.emptyList());
    ByteBuffer dst = ByteBuffer.allocate(0);
    int bytesRead = channel.read(dst);
    assertEquals(0, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSize_EmptyChannels_Etyc0() throws IOException {
    MultiReadOnlySeekableByteChannel channel = new MultiReadOnlySeekableByteChannel(new ArrayList<SeekableByteChannel>());
    assertEquals(0, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForSeekableByteChannels_multipleChannels_eCjW1_GdJd0_1() {
    SeekableByteChannel channel1 = mock(SeekableByteChannel.class);
    SeekableByteChannel channel2 = mock(SeekableByteChannel.class);
    SeekableByteChannel result = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(channel1, channel2);
    assertNotSame(channel1, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForSeekableByteChannels_multipleChannels_eCjW1_GdJd0_2() {
    SeekableByteChannel channel1 = mock(SeekableByteChannel.class);
    SeekableByteChannel channel2 = mock(SeekableByteChannel.class);
    SeekableByteChannel result = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(channel1, channel2);
    assertNotSame(channel2, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForSeekableByteChannels_multipleChannels_eCjW1_GdJd0_3() {
    SeekableByteChannel channel1 = mock(SeekableByteChannel.class);
    SeekableByteChannel channel2 = mock(SeekableByteChannel.class);
    SeekableByteChannel result = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(channel1, channel2);
    assertTrue(result instanceof MultiReadOnlySeekableByteChannel);}
}