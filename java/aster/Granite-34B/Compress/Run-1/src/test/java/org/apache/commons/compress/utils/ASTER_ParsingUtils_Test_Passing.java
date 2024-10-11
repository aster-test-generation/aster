/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ParsingUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void parseIntValue_WithInvalidInput_ThrowsIOException_taPz1() {
	    String value = "abc";
	    try {
	       ParsingUtils.parseIntValue(value);
	    } catch (IOException e) {
	    }
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void parseIntValue_validInput_returnsCorrectInt_uRZt0() throws IOException {
    String value = "10";
    int radix = 10;
    int expected = 10;
    int actual = ParsingUtils.parseIntValue(value, radix);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void parseIntValue_invalidInput_throwsIOException_BzPa1() {
    String value = "abc";
    int radix = 10;
    IOException expected = new IOException("Unable to parse int from string value: abc");
    IOException actual = null;
    try {
        ParsingUtils.parseIntValue(value, radix);
    } catch (IOException e) {
        actual = e;
    }
    assertEquals(expected.getMessage(), actual.getMessage());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void parseIntValue_validInputDifferentRadix_returnsCorrectInt_XqqX2() throws IOException {
    String value = "11";
    int radix = 2;
    int expected = 3;
    int actual = ParsingUtils.parseIntValue(value, radix);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void parseIntValue_emptyInput_throwsIOException_rNSo4() {
    String value = "";
    int radix = 10;
    IOException expected = new IOException("Unable to parse int from string value: ");
    IOException actual = null;
    try {
        ParsingUtils.parseIntValue(value, radix);
    } catch (IOException e) {
        actual = e;
    }
    assertEquals(expected.getMessage(), actual.getMessage());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void parseIntValue_nullInput_throwsIOException_itsr5() {
    String value = null;
    int radix = 10;
    IOException expected = new IOException("Unable to parse int from string value: null");
    IOException actual = null;
    try {
        ParsingUtils.parseIntValue(value, radix);
    } catch (IOException e) {
        actual = e;
    }
    assertEquals(expected.getMessage(), actual.getMessage());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValue_OHkz0() throws IOException {
	    String value = "123";
	    int radix = 10;
	    long expected = 123;
	    long actual =ParsingUtils.parseLongValue(value, radix);
	    Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValueWithRadix_vxFv1() throws IOException {
	    String value = "101";
	    int radix = 2;
	    long expected = 5;
	    long actual =ParsingUtils.parseLongValue(value, radix);
	    Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValue_HctJ0_JToY0_1() throws IOException {
		assertEquals(123, ParsingUtils.parseLongValue("123"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValue_HctJ0_JToY0_3() throws IOException {
		assertEquals(0,ParsingUtils.parseLongValue("0"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValue_HctJ0_JToY0_4() throws IOException {
		assertEquals(Long.MAX_VALUE,ParsingUtils.parseLongValue(String.valueOf(Long.MAX_VALUE)));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValueWithRadix_WkuL1_yCPw0_1() throws IOException {
		assertEquals(10, ParsingUtils.parseLongValue("A", 16));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValueWithRadix_WkuL1_yCPw0_2() throws IOException {
		assertEquals(11,ParsingUtils.parseLongValue("B", 16));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValueWithRadix_WkuL1_yCPw0_3() throws IOException {
		assertEquals(12,ParsingUtils.parseLongValue("C", 16));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValueWithRadix_WkuL1_yCPw0_4() throws IOException {
		assertEquals(13,ParsingUtils.parseLongValue("D", 16));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValueWithRadix_WkuL1_yCPw0_5() throws IOException {
		assertEquals(14,ParsingUtils.parseLongValue("E", 16));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseLongValueWithRadix_WkuL1_yCPw0_6() throws IOException {
		assertEquals(15,ParsingUtils.parseLongValue("F", 16));}
}