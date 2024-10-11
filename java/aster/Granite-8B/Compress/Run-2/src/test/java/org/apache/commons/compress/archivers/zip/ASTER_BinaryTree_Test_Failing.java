/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;
public class Aster_BinaryTree_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDecodeInputStreamInt3_FMYp2() throws IOException {
		final InputStream inputStream = mock(InputStream.class);
		final int totalNumberOfValues = 1;
		when(inputStream.read()).thenReturn(1);
		when(inputStream.read(any(byte[].class), anyInt(), anyInt())).thenThrow(new EOFException());
		try {
			BinaryTree.decode(inputStream, totalNumberOfValues);
			fail("IOException expected but not thrown");
		} catch (final IOException e) {
		}
		verify(inputStream, times(2)).read();
		verify(inputStream, times(1)).read(any(byte[].class), anyInt(), anyInt());
		verifyNoMoreInteractions(inputStream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDecodeInputStreamInt5_sVaP4() throws IOException {
		final InputStream inputStream = mock(InputStream.class);
		final int totalNumberOfValues = 1;
		when(inputStream.read()).thenReturn(1);
		when(inputStream.read(any(byte[].class), anyInt(), anyInt())).thenReturn(1);
		final byte[] encodedTree = new byte[1];
		when(inputStream.read(encodedTree, 0, 1)).thenReturn(0);
		try {
			BinaryTree.decode(inputStream, totalNumberOfValues);
			fail("IOException expected but not thrown");
		} catch (final IOException e) {
		}
		verify(inputStream, times(3)).read();
		verify(inputStream, times(1)).read(encodedTree, 0, 1);
		verifyNoMoreInteractions(inputStream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDecodeInputStreamInt6_AKTq5() throws IOException {
		final InputStream inputStream = mock(InputStream.class);
		final int totalNumberOfValues = 1;
		when(inputStream.read()).thenReturn(1);
		when(inputStream.read(any(byte[].class), anyInt(), anyInt())).thenReturn(1);
		final byte[] encodedTree = new byte[1];
		when(inputStream.read(encodedTree, 0, 1)).thenReturn(1);
		final int size = 0;
		when(inputStream.read()).thenReturn(size);
		try {
			BinaryTree.decode(inputStream, totalNumberOfValues);
		} catch (final IOException e) {
			fail("IOException expected but not thrown");
		}
		verify(inputStream, times(4)).read();
		verify(inputStream, times(1)).read(encodedTree, 0, 1);
		verifyNoMoreInteractions(inputStream);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDecodeInputStreamInt6_AKTq5_fid2() throws IOException {
		final InputStream inputStream = mock(InputStream.class);
		final int totalNumberOfValues = 1;
		when(inputStream.read()).thenReturn(1);
		when(inputStream.read(any(byte[].class), anyInt(), anyInt())).thenReturn(1);
		final byte[] encodedTree = new byte[1];
		when(inputStream.read(encodedTree, 0, 1)).thenReturn(1);
		final int size = 0;
		when(inputStream.read()).thenReturn(size);
		try {
			BinaryTree.decode(inputStream, totalNumberOfValues);
			fail("IOException expected but not thrown");
		} catch (final IOException e) {
		}
		verify(inputStream, times(4)).read();
		verify(inputStream, times(1)).read(encodedTree, 0, 1);
		verifyNoMoreInteractions(inputStream);
	}
}