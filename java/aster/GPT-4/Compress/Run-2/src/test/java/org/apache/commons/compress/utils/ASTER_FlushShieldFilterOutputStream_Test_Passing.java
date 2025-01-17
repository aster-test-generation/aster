/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
public class Aster_FlushShieldFilterOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlushDoesNotThrowException_QiQf0() {
    OutputStream mockOutputStream = mock(OutputStream.class);
    FlushShieldFilterOutputStream flushShieldFilterOutputStream = new FlushShieldFilterOutputStream(mockOutputStream);
    assertDoesNotThrow(() -> flushShieldFilterOutputStream.flush());
}
}