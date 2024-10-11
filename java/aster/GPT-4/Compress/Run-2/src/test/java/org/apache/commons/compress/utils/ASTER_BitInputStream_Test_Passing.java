/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
public class Aster_BitInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_yOgI0() throws IOException {
    InputStream mockInputStream = mock(InputStream.class);
    BitInputStream bitInputStream = new BitInputStream(mockInputStream, ByteOrder.BIG_ENDIAN);
    bitInputStream.close();
    verify(mockInputStream).close();
}
}