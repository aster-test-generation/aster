/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_StreamingNotSupportedException_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFormat_IwkJ0() {
    StreamingNotSupportedException exception = new StreamingNotSupportedException("MP4");
    assertEquals("MP4", exception.getFormat());
}
}