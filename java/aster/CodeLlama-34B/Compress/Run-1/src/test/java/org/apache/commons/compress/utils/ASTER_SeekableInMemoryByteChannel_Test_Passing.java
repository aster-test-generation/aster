/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import java.nio.ByteBuffer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SeekableInMemoryByteChannel_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testArray_size_jrYr0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    byte[] data = channel.array();
    assertEquals(10, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testArray_empty_LDwy1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    byte[] data = channel.array();
    assertEquals(0, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testArray_data_nFSi2() {
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(data);
    byte[] actualData = channel.array();
    assertArrayEquals(data, actualData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen_DefaultConstructor_ekdV0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    assertTrue(channel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen_SizeConstructor_pGMN1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    assertTrue(channel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen_DataConstructor_iLTj2() {
    byte[] data = new byte[10];
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(data);
    assertTrue(channel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_smallBuffer_DyIe0_1() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(5);
    int written = channel.write(buffer);
    assertEquals(5, written);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_smallBuffer_DyIe0_2() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(5);
    int written = channel.write(buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_resize_FXOq2() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(20);
    int written = channel.write(buffer);
    assertEquals(20, written);
    assertEquals(20, channel.size());
    assertEquals(20, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_emptyBuffer_CVId3() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(0);
    int written = channel.write(buffer);
    assertEquals(0, written);
    assertEquals(10, channel.size());
    assertEquals(0, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSize_DefaultConstructor_HjAU0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    assertEquals(0, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSize_SizeConstructor_hVVg1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    assertEquals(10, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_DefaultConstructor_OaHF0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    assertEquals(0, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_SizeConstructor_NqzL1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    assertEquals(0, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_DataConstructor_ukds2() {
    byte[] data = new byte[10];
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(data);
    assertEquals(0, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_AfterClose_ZlTb6() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    channel.close();
    assertEquals(0, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_ValidPosition_sUjT0() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    channel.position(5);
    assertEquals(5, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_EqualToSize_xvhw5() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    channel.position(10);
    assertEquals(10, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate_validSize_RluP0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    channel.truncate(5);
    assertEquals(5, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate_invalidSize_geYf1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    try {
        channel.truncate(-1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Size has to be in range 0.. " + Integer.MAX_VALUE, e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate_sizeZero_dvEg5() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(0);
    channel.truncate(0);
    assertEquals(0, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_smallBuffer_DyIe0_3() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(5);
    int written = channel.write(buffer);
    assertEquals(5, channel.position());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_resize_FXOq2_1() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(20);
    int written = channel.write(buffer);
    assertEquals(20, written);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_resize_FXOq2_2() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(20);
    int written = channel.write(buffer);
    assertEquals(20, channel.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_resize_FXOq2_3() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(20);
    int written = channel.write(buffer);
    assertEquals(20, channel.position());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_emptyBuffer_CVId3_1() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(0);
    int written = channel.write(buffer);
    assertEquals(0, written);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_emptyBuffer_CVId3_2() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(0);
    int written = channel.write(buffer);
    assertEquals(10, channel.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_emptyBuffer_CVId3_3() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(0);
    int written = channel.write(buffer);
    assertEquals(0, channel.position());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_EmptyBuffer_QLnl0_SuAY0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[0]);
    ByteBuffer buf = ByteBuffer.allocate(10);
    try {
        int bytesRead = channel.read(buf);
        assertEquals(-1, bytesRead);
    } catch (IOException e) {
        fail("IOException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate_positionLessThanNewSize_sjuF8_AhSf0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    try {
        channel.position(5);
    } catch (IOException e) {
        e.printStackTrace();
    }
    channel.truncate(10);
    assertEquals(5, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate_positionGreaterThanNewSize_QuZD3_QEpp1() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    try {
        channel.position(15);
    } catch (IOException e) {
        e.printStackTrace();
    }
    channel.truncate(10);
    assertEquals(10, channel.position());
}
}