/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Util_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens1_LZgX0() {
        String str = "--hello";
        String expected = "hello";
        String actual = Util.stripLeadingHyphens(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens2_RgBV1() {
        String str = "-hello";
        String expected = "hello";
        String actual = Util.stripLeadingHyphens(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens3_Txgr2() {
        String str = "hello";
        String expected = "hello";
        String actual = Util.stripLeadingHyphens(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens4_HqCF3() {
        String str = "";
        String expected = "";
        String actual = Util.stripLeadingHyphens(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_ibQj0_1() {
        assertEquals("abc", Util.stripLeadingAndTrailingQuotes("\"abc\""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_ibQj0_2() {
        assertEquals("abc", Util.stripLeadingAndTrailingQuotes("abc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_ibQj0_3() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_ibQj0_4() {
        assertEquals("a\"bc", Util.stripLeadingAndTrailingQuotes("a\"bc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_ibQj0_5() {
        assertEquals("a\"bc\"", Util.stripLeadingAndTrailingQuotes("a\"bc\""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_ibQj0_6() {
        assertEquals("a\"bc\"d", Util.stripLeadingAndTrailingQuotes("a\"bc\"d"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_ibQj0() {
        assertEquals("abc", Util.stripLeadingAndTrailingQuotes("\"abc\""));
        assertEquals("abc", Util.stripLeadingAndTrailingQuotes("abc"));
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
        assertEquals("a\"bc", Util.stripLeadingAndTrailingQuotes("a\"bc"));
        assertEquals("a\"bc\"", Util.stripLeadingAndTrailingQuotes("a\"bc\""));
        assertEquals("a\"bc\"d", Util.stripLeadingAndTrailingQuotes("a\"bc\"d"));
    }
}