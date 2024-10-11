/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_StreamingNotSupportedException_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFormat_SJCl0() {
    StreamingNotSupportedException exception = new StreamingNotSupportedException("format");
    assertEquals("format", exception.getFormat());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFormatWithNullFormat_nSkK1() {
    StreamingNotSupportedException exception = new StreamingNotSupportedException(null);
    assertNull(exception.getFormat());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFormatWithEmptyFormat_ZDKQ2() {
    StreamingNotSupportedException exception = new StreamingNotSupportedException("");
    assertEquals("", exception.getFormat());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFormatWithInvalidFormat_sXnI3() {
    StreamingNotSupportedException exception = new StreamingNotSupportedException("invalid format");
    assertEquals("invalid format", exception.getFormat());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFormatWithValidFormat_wKlo4() {
    StreamingNotSupportedException exception = new StreamingNotSupportedException("valid format");
    assertEquals("valid format", exception.getFormat());
}
}