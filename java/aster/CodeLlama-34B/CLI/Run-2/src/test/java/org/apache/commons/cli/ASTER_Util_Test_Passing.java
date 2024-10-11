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
    public void testStripLeadingHyphens_emptyString_swcZ0() {
        String input = "";
        String expected = "";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_nullString_uigw1() {
        String input = null;
        String expected = null;
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_stringWithoutHyphens_EjaB2() {
        String input = "hello";
        String expected = "hello";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_stringWithHyphens_UxYh3() {
        String input = "--hello";
        String expected = "hello";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_stringWithHyphenInTheMiddle_sHoK7() {
        String input = "he-llo";
        String expected = "he-llo";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_stringWithMultipleHyphensInTheMiddle_yBvs8() {
        String input = "he---llo";
        String expected = "he---llo";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_EmptyString_rShC0() {
        String input = "";
        String expected = "";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_NullString_TGss1() {
        String input = null;
        String expected = null;
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_DoubleQuote_CeOp3() {
        String input = "\"\"";
        String expected = "";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_NoQuotes_qTKE5() {
        String input = "hello";
        String expected = "hello";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }
}