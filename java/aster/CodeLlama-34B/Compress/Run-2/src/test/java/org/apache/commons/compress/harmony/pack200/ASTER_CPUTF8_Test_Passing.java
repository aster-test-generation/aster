/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPUTF8_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_BNLr0() {
    CPUTF8 cputf8 = new CPUTF8("hello");
    String expected = "hello";
    String actual = cputf8.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithEmptyString_Oghh1() {
    CPUTF8 cputf8 = new CPUTF8("");
    String expected = "";
    String actual = cputf8.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithNullString_ocFo2() {
    CPUTF8 cputf8 = new CPUTF8(null);
    String expected = null;
    String actual = cputf8.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnderlyingStringWithEmptyString_hyqe1_jqQk0() {
    CPUTF8 cputf8 = new CPUTF8("");
    String result = cputf8.toString();
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnderlyingStringWithNullString_EPSs2_LqEJ0() {
    CPUTF8 cputf8 = new CPUTF8(null);
    String result = cputf8.toString();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnderlyingStringWithInvalidString_tpNu3_HrmM0() {
    CPUTF8 cputf8 = new CPUTF8("hello\u0000world");
    String result = cputf8.toString();
    assertEquals("hello\u0000world", result);
}
}