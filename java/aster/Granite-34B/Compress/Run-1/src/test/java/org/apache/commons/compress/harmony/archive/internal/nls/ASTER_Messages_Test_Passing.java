/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.archive.internal.nls;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Messages_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getStringTest1_sreT0() {
        String msg = "test";
        Object arg1 = new Object();
        Object arg2 = new Object();
        String result = Messages.getString(msg, arg1, arg2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithValidMessageAndArguments_TdBk0() {
        String message = "Hello {0}";
        Object[] arguments = {"World"};
        String expected = "Hello World";
        assertEquals(expected, Messages.getString(message, arguments));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithValidMessageAndNoArguments_TmdO1() {
        String message = "Hello";
        Object[] arguments = {};
        String expected = "Hello";
        assertEquals(expected, Messages.getString(message, arguments));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithInvalidMessageAndArguments_vxSA2() {
        String message = "InvalidMessage";
        Object[] arguments = {"World"};
        String expected = "InvalidMessage";
        assertEquals(expected, Messages.getString(message, arguments));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat_clCo0() {
        String format = "This is a test";
        Object[] args = {};
        String expected = "This is a test";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithOneArgument_aZVM1() {
        String format = "This is a {0}";
        Object[] args = {"test"};
        String expected = "This is a test";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithTwoArguments_YWnN2() {
        String format = "This is a {0} and {1}";
        Object[] args = {"test", "example"};
        String expected = "This is a test and example";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithMissingArgument_cwXX3() {
        String format = "This is a {0} and {1}";
        Object[] args = {"test"};
        String expected = "This is a test and <missing argument>";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithNullArgument_FSrp4() {
        String format = "This is a {0} and {1}";
        Object[] args = {"test", null};
        String expected = "This is a test and <null>";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithEmptyArgument_whnL5() {
        String format = "This is a {0} and {1}";
        Object[] args = {"test", ""};
        String expected = "This is a test and ";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithMultipleArguments_RGfF6() {
        String format = "This is a {0} and {1}, {2} and {3}";
        Object[] args = {"test", "example", "test2", "example2"};
        String expected = "This is a test and example, test2 and example2";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithMultipleMissingArguments_vuGO7() {
        String format = "This is a {0} and {1}, {2} and {3}";
        Object[] args = {"test"};
        String expected = "This is a test and <missing argument>, <missing argument> and <missing argument>";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithMultipleNullArguments_SFzx8() {
        String format = "This is a {0} and {1}, {2} and {3}";
        Object[] args = {"test", null, null, null};
        String expected = "This is a test and <null>, <null> and <null>";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithMultipleEmptyArguments_ZjAJ9() {
        String format = "This is a {0} and {1}, {2} and {3}";
        Object[] args = {"test", "", "", ""};
        String expected = "This is a test and ,  and ";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithMultipleMixedArguments_mBxo10() {
        String format = "This is a {0} and {1}, {2} and {3}";
        Object[] args = {"test", null, "", "example"};
        String expected = "This is a test and <null>,  and example";
        String actual = Messages.format(format, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithExistingMessage_Sonq0_fid1() {
        String msg = "test.message";
        String expected = "test.message";
        assertEquals(expected, Messages.getString(msg));
    }
}