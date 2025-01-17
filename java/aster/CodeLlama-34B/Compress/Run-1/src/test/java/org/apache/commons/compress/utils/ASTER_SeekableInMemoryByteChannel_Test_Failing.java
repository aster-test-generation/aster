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
public class Aster_SeekableInMemoryByteChannel_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_smallBuffer_DyIe0() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(5);
    int written = channel.write(buffer);
    assertEquals(5, written);
    assertEquals(5, channel.size());
    assertEquals(5, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_largeBuffer_KRuM1() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(20);
    int written = channel.write(buffer);
    assertEquals(10, written);
    assertEquals(10, channel.size());
    assertEquals(10, channel.position());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate_sizeGreaterThanCurrentSize_EsIH2() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    channel.truncate(15);
    assertEquals(15, channel.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncate_sizeGreaterThanIntegerMaxValue_Lgbl6() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(Integer.MAX_VALUE + 1);
    try {
        channel.truncate(Integer.MAX_VALUE + 1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Size has to be in range 0.. " + Integer.MAX_VALUE, e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_smallBuffer_DyIe0_2_fid2() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(5);
    int written = channel.write(buffer);
    assertEquals(5, channel.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_largeBuffer_KRuM1_1() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(20);
    int written = channel.write(buffer);
    assertEquals(10, written);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_largeBuffer_KRuM1_2() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(20);
    int written = channel.write(buffer);
    assertEquals(10, channel.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_largeBuffer_KRuM1_3() throws IOException {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    ByteBuffer buffer = ByteBuffer.allocate(20);
    int written = channel.write(buffer);
    assertEquals(10, channel.position());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_Lfsy0_sVWB0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
    channel.close();
    assertTrue(channel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseWithSize_SqHg1_yAyk0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(10);
    channel.close();
    assertTrue(channel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseWithData_WwlW2_cbxo0() {
    byte[] data = new byte[10];
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(data);
    channel.close();
    assertTrue(channel.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_NonEmptyBuffer_FQuN1_pMef0() {
    SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel(new byte[] { 1, 2, 3, 4, 5 });
    ByteBuffer buf = ByteBuffer.allocate(10);
    int bytesRead = 0;
    try {
        bytesRead = channel.read(buf);
    } catch (IOException e) {
        e.printStackTrace();
    }
    assertEquals(5, bytesRead);
    assertArrayEquals(new byte[] { 1, 2, 3, 4, 5 }, buf.array());
}
}