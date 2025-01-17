/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ParsingUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseIntValue_iYYU0() throws Exception {
    assertEquals(10, ParsingUtils.parseIntValue("10"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseIntValue_GZIc0() throws Exception {
    assertEquals(10, ParsingUtils.parseIntValue("A", 16));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseLongValue_AjeF0() throws Exception {
    String value = "123";
    long expectedResult = 123;
    try {
        long result = ParsingUtils.parseLongValue(value);
        assertEquals(expectedResult, result);
    } catch (IOException e) {
        fail("IOException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseLongValue_jAYZ0() throws Exception {
    long result = ParsingUtils.parseLongValue("10", 10);
    assertEquals(10, result);
}
}