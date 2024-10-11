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
    public void testParseIntValue_eApt0_1() throws Exception {
        assertEquals(0, ParsingUtils.parseIntValue("0"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseIntValue_eApt0_2() throws Exception {
        assertEquals(1, ParsingUtils.parseIntValue("1"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseIntValue_eApt0_3() throws Exception {
        assertEquals(-1, ParsingUtils.parseIntValue("-1"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseIntValue_eApt0_4() throws Exception {
        assertEquals(Integer.MAX_VALUE, ParsingUtils.parseIntValue(String.valueOf(Integer.MAX_VALUE)));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseIntValue_eApt0_5() throws Exception {
        assertEquals(Integer.MIN_VALUE, ParsingUtils.parseIntValue(String.valueOf(Integer.MIN_VALUE)));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseIntValue_IrdM0() throws Exception {
        String value = "123";
        int radix = 10;
        int expected = 123;
        int actual = ParsingUtils.parseIntValue(value, radix);
        assertEquals(expected, actual);
        value = "0x123";
        radix = 16;
        expected = 0x123;
        actual = ParsingUtils.parseIntValue(value, radix);
        assertEquals(expected, actual);
        value = "0123";
        radix = 8;
        try {
            ParsingUtils.parseIntValue(value, radix);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
        value = "101010";
        radix = 2;
        try {
            ParsingUtils.parseIntValue(value, radix);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValue_YvDB0() throws IOException {
		assertEquals(123, ParsingUtils.parseLongValue("123"));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValueWithDecimalPoint_deBX3() throws IOException {
		assertEquals(123, ParsingUtils.parseLongValue("123.45"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValueWithNonNumericCharacters_AQtf4() throws IOException {
		assertEquals(123, ParsingUtils.parseLongValue("abc123def"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseLongValue_iqTz0() throws Exception {
        long result = ParsingUtils.parseLongValue("123", 10);
        assertEquals(123, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseLongValueWithRadix_gYrs1() throws Exception {
        long result = ParsingUtils.parseLongValue("11", 2);
        assertEquals(3, result);
    }
}