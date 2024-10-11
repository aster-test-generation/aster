/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;
public class Aster_SeekableChannelRandomAccessOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteFullyRestoresPosition_zkMI0_UrPQ0_fid3() throws IOException {
    SeekableByteChannel mockChannel = mock(SeekableByteChannel.class);
    SeekableChannelRandomAccessOutputStream stream = new SeekableChannelRandomAccessOutputStream(mockChannel);
    when(mockChannel.position()).thenReturn(10L); // initial position
    byte[] data = new byte[] {1, 2, 3, 4};
    int offset = 0;
    int length = 4;
    long newPosition = 20L;
    stream.writeFully(data, offset, length, newPosition);
    verify(mockChannel).position(newPosition);
    verify(mockChannel).position(10L); // check if the original position is restored
    verify(mockChannel).write(ByteBuffer.wrap(data, offset, length));
}
}