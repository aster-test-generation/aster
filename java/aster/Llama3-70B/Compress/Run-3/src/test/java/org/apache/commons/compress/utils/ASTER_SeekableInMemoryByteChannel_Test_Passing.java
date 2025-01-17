/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SeekableByteChannel;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SeekableInMemoryByteChannel_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testArray_withDefaultConstructor_Jfzb0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    byte[] result = channel.array();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testArray_withSizeConstructor_yFIQ1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    byte[] result = channel.array();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testArray_withByteArrayConstructor_ZBIt2() {
    byte[] data = new byte[10];
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(data);
    byte[] result = channel.array();
    assertArrayEquals(data, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate1_HFRV0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    SeekableByteChannel result = channel.truncate(5);
    assertEquals(channel, result);
    assertEquals(5, channel.size());
    assertEquals(5, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate2_qxmR1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    SeekableByteChannel result = channel.truncate(10);
    assertEquals(channel, result);
    assertEquals(10, channel.size());
    assertEquals(0, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate3_SfWS2() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[10]);
    SeekableByteChannel result = channel.truncate(5);
    assertEquals(channel, result);
    assertEquals(5, channel.size());
    assertEquals(0, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen1_RWwp0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    assertTrue(channel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen2_gVWk1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    assertTrue(channel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_negativePosition_khNF1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    try {
        channel.position(-1);
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_tooLargePosition_SZRI2() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[10]);
    try {
        channel.position(Integer.MAX_VALUE + 1);
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition1_RpwC0() {
    SeekableInMemoryByteChannel seekableInMemoryByteChannel = new SeekableInMemoryByteChannel(10);
    assertEquals(0, seekableInMemoryByteChannel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition2_YNsb1() {
    SeekableInMemoryByteChannel seekableInMemoryByteChannel = new SeekableInMemoryByteChannel();
    assertEquals(0, seekableInMemoryByteChannel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition3_Trma2() {
    SeekableInMemoryByteChannel seekableInMemoryByteChannel = new SeekableInMemoryByteChannel(new byte[10]);
    assertEquals(0, seekableInMemoryByteChannel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSize_withDefaultConstructor_EcrW0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    assertEquals(0, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSize_withSizeConstructor_kUAY1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    assertEquals(10, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSize_withByteArrayConstructor_ZZrL2() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[5]);
    assertEquals(5, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate1_HFRV0_1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    SeekableByteChannel result = channel.truncate(5);
    assertEquals(channel, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate1_HFRV0_2() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    SeekableByteChannel result = channel.truncate(5);
    assertEquals(5, channel.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate1_HFRV0_3() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    SeekableByteChannel result = channel.truncate(5);
    assertEquals(5, channel.position());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate2_qxmR1_1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    SeekableByteChannel result = channel.truncate(10);
    assertEquals(channel, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate2_qxmR1_2() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    SeekableByteChannel result = channel.truncate(10);
    assertEquals(10, channel.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate2_qxmR1_3() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    SeekableByteChannel result = channel.truncate(10);
    assertEquals(0, channel.position());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate3_SfWS2_1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[10]);
    SeekableByteChannel result = channel.truncate(5);
    assertEquals(channel, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate3_SfWS2_2() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[10]);
    SeekableByteChannel result = channel.truncate(5);
    assertEquals(5, channel.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate3_SfWS2_3() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[10]);
    SeekableByteChannel result = channel.truncate(5);
    assertEquals(0, channel.position());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_withSmallBuffer_ueHA0_oAfr0() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(5);
    buffer.put(new byte[] {1, 2, 3, 4, 5});
    buffer.flip();
    try {
        assertEquals(5, channel.write(buffer));
    } catch (IOException e) {
        fail("IOException occurred");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_withClosedChannel_sTqj2_UlNF0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    channel.close();
    ByteBuffer buffer = ByteBuffer.allocate(5);
    buffer.put(new byte[] {1, 2, 3, 4, 5});
    buffer.flip();
    try {
        channel.write(buffer);
        fail("Expected ClosedChannelException");
    } catch (ClosedChannelException e) {
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_withInitialData_lXcp3_rbbA0() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[10]);
    ByteBuffer buffer = ByteBuffer.allocate(5);
    buffer.put(new byte[] {1, 2, 3, 4, 5});
    buffer.flip();
    long writtenBytes = channel.write(buffer);
    assertEquals(5, writtenBytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_1_Caxa0_ixSX0() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(5);
    buffer.put(new byte[] {1, 2, 3, 4, 5});
    buffer.flip();
    int result = channel.write(buffer);
    assertEquals(5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_2_mmxg1_LsKe0() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    ByteBuffer buffer = ByteBuffer.allocate(10);
    buffer.put(new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    buffer.flip();
    try {
        int result = channel.write(buffer);
        assertEquals(10, result);
    } catch (IOException e) {
        fail("IOException occurred");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_3_Hqxr2_DubN0() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[10]);
    ByteBuffer buffer = ByteBuffer.allocate(15);
    buffer.put(new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
    buffer.flip();
    try {
        int result = channel.write(buffer);
        assertEquals(15, result);
    } catch (IOException e) {
        fail("IOException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_4_JLnU3_sZeR0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(20);
    buffer.put(new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    buffer.flip();
    try {
        int result = channel.write(buffer);
        assertEquals(10, result);
    } catch (IOException e) {
        fail("IOException occurred");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_validPosition_OdDd0_HSNv0() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    channel.position(5);
    assertEquals(5, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_withAvailableData_MTec0_OLdR0() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buf = ByteBuffer.allocate(5);
    int bytesRead = 0;
    try {
        bytesRead = channel.read(buf);
    } catch (IOException e) {
        fail("IOException occurred");
    }
    assertEquals(5, bytesRead);
    assertEquals(5, buf.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_withNoAvailableData_eUII1_KrBF0_1() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[0]);
    ByteBuffer buf = ByteBuffer.allocate(5);
    int bytesRead = channel.read(buf);
    assertEquals(-1, bytesRead);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_withNoAvailableData_eUII1_KrBF0_2() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[0]);
    ByteBuffer buf = ByteBuffer.allocate(5);
    int bytesRead = channel.read(buf);
    assertEquals(0, buf.position());}
}