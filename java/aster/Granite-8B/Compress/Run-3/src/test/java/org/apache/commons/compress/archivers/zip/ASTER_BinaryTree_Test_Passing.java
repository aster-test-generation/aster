/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BinaryTree_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithInputStreamAndTotalNumberOfValues_WtUM0() throws IOException {
    final InputStream inputStream = mock(InputStream.class);
    final int totalNumberOfValues = 10;
    when(inputStream.read()).thenReturn(1);
    when(inputStream.read(any(byte[].class), anyInt(), anyInt())).thenReturn(1);
    final BinaryTree binaryTree = BinaryTree.decode(inputStream, totalNumberOfValues);
    assertNotNull(binaryTree);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithInputStreamAndTotalNumberOfValuesWhenInputStreamReturnsZero_KiSu2() throws IOException {
    final InputStream inputStream = mock(InputStream.class);
    final int totalNumberOfValues = 10;
    when(inputStream.read()).thenReturn(0);
    try {
        BinaryTree.decode(inputStream, totalNumberOfValues);
        fail("IOException expected");
    } catch (final IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithInputStreamAndTotalNumberOfValuesWhenInputStreamReturnsNegativeOne_sWdf3() throws IOException {
    final InputStream inputStream = mock(InputStream.class);
    final int totalNumberOfValues = 10;
    when(inputStream.read()).thenReturn(-1);
    try {
        BinaryTree.decode(inputStream, totalNumberOfValues);
        fail("IOException expected");
    } catch (final IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithInputStreamAndTotalNumberOfValuesWhenInputStreamReadThrowsIOException_NGRY4() throws IOException {
    final InputStream inputStream = mock(InputStream.class);
    final int totalNumberOfValues = 10;
    doThrow(new IOException()).when(inputStream).read();
    try {
        BinaryTree.decode(inputStream, totalNumberOfValues);
        fail("IOException expected");
    } catch (final IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithInputStreamAndTotalNumberOfValuesWhenInputStreamReadRangeThrowsIOException_aJQM5() throws IOException {
    final InputStream inputStream = mock(InputStream.class);
    final int totalNumberOfValues = 10;
    when(inputStream.read()).thenReturn(1);
    doThrow(new IOException()).when(inputStream).read(any(byte[].class), anyInt(), anyInt());
    try {
        BinaryTree.decode(inputStream, totalNumberOfValues);
        fail("IOException expected");
    } catch (final IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithInputStreamAndTotalNumberOfValuesWhenInputStreamReadRangeReturnsZero_uUDR6() throws IOException {
    final InputStream inputStream = mock(InputStream.class);
    final int totalNumberOfValues = 10;
    when(inputStream.read()).thenReturn(1);
    when(inputStream.read(any(byte[].class), anyInt(), anyInt())).thenReturn(0);
    try {
        BinaryTree.decode(inputStream, totalNumberOfValues);
        fail("IOException expected");
    } catch (final IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithInputStreamAndTotalNumberOfValuesWhenInputStreamReadRangeReturnsNegativeOne_ejuM7() throws IOException {
    final InputStream inputStream = mock(InputStream.class);
    final int totalNumberOfValues = 10;
    when(inputStream.read()).thenReturn(1);
    when(inputStream.read(any(byte[].class), anyInt(), anyInt())).thenReturn(-1);
    try {
        BinaryTree.decode(inputStream, totalNumberOfValues);
        fail("IOException expected");
    } catch (final IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithInputStreamAndTotalNumberOfValuesWhenInputStreamReadRangeThrowsEOFException_SLMb8() throws IOException {
    final InputStream inputStream = mock(InputStream.class);
    final int totalNumberOfValues = 10;
    when(inputStream.read()).thenReturn(1);
    doThrow(new EOFException()).when(inputStream).read(any(byte[].class), anyInt(), anyInt());
    try {
        BinaryTree.decode(inputStream, totalNumberOfValues);
        fail("IOException expected");
    } catch (final IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithInputStreamAndTotalNumberOfValuesWhenTotalNumberOfValuesIsZero_NheL1_MYGB0() throws IOException {
    final InputStream inputStream = mock(InputStream.class);
    final int totalNumberOfValues = 0;
    final BinaryTree binaryTree = BinaryTree.decode(inputStream, totalNumberOfValues);
    assertNotNull(binaryTree);
}
}