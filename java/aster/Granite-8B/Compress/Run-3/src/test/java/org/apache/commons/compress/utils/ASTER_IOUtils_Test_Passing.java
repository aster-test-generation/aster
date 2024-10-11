/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IOUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCopy_QrFv0() throws IOException {
        File sourceFile = new File("source.txt");
        OutputStream outputStream = new ByteArrayOutputStream();
        IOUtils.copy(sourceFile, outputStream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_qtMV0() throws IOException {
        File file = new File("path/to/file");
        byte[] array = new byte[1024];
        int expected = 1024; // Replace with expected value
        int actual = IOUtils.read(file, array);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCopy_nTae0() throws IOException {
        InputStream input = null;
        OutputStream output = null;
        long expected = 0L;
        long actual = IOUtils.copy(input, output, 0);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCopyWithBufferSize_VKmM2() throws IOException {
        InputStream input = null;
        OutputStream output = null;
        int bufferSize = 1024;
        long expected = 0L;
        long actual = IOUtils.copy(input, output, bufferSize);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCopyWithNegativeBufferSize_yAPG3() throws IOException {
        InputStream input = null;
        OutputStream output = null;
        int bufferSize = -1;
        long expected = 0L;
        long actual = IOUtils.copy(input, output, bufferSize);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadRange_EmptyInput_CvxR0() throws IOException {
    final ReadableByteChannel input = mock(ReadableByteChannel.class);
    when(input.read(any(ByteBuffer.class))).thenReturn(-1);
    final byte[] result = IOUtils.readRange(input, 10);
    assert result.length == 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadRange_SmallInput_ldqu1() throws IOException {
    final ReadableByteChannel input = mock(ReadableByteChannel.class);
    when(input.read(any(ByteBuffer.class))).thenReturn(5);
    final byte[] result = IOUtils.readRange(input, 10);
    assert result.length == 5;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadRange_LargeInput_OkoA2() throws IOException {
    final ReadableByteChannel input = mock(ReadableByteChannel.class);
    when(input.read(any(ByteBuffer.class))).thenReturn(10);
    final byte[] result = IOUtils.readRange(input, 10);
    assert result.length == 10;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadRange_SmallInput_ldqu1_JrCk0() throws IOException {
    final ReadableByteChannel input = mock(ReadableByteChannel.class);
    when(input.read(any(ByteBuffer.class))).thenReturn(5);
    final byte[] result = IOUtils.readRange(input, 10);
    assertEquals(5, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadRange_LargeInput_OkoA2_Funz0() throws IOException {
    final ReadableByteChannel input = mock(ReadableByteChannel.class);
    when(input.read(any(ByteBuffer.class))).thenReturn(10);
    final byte[] result = IOUtils.readRange(input, 10);
    assertEquals(result.length, 10);
}
}