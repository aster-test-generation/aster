/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Util_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_NullString_azYO0() {
        String result = Util.stripLeadingHyphens(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_EmptyString_IbiD1() {
        String result = Util.stripLeadingHyphens("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_StringWithDoubleHyphen_uwpE2() {
        String result = Util.stripLeadingHyphens("--example");
        assertEquals("example", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_StringWithSingleHyphen_uBXT3() {
        String result = Util.stripLeadingHyphens("-example");
        assertEquals("example", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_NullString_Ddbc0() {
        String input = null;
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_EmptyString_XOXa1() {
        String input = "";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_StringWithQuotes_iWjH2() {
        String input = "\"hello\"";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals("hello", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_StringWithoutQuotes_TvEA3() {
        String input = "hello";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals("hello", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_StringWithQuotesInside_eOjC4() {
        String input = "\"he\"llo\"";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals("\"he\"llo\"", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_StringWithSingleQuote_ydYv5() {
        String input = "\"hello";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals("\"hello", result);
    }
}