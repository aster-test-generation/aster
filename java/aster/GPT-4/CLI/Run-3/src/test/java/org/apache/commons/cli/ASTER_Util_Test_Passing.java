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
    public void testStripLeadingHyphens_NullString_NrJo0() throws Exception {
        String input = null;
        String result = Util.stripLeadingHyphens(input);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_EmptyString_nvRp1() throws Exception {
        String input = "";
        String result = Util.stripLeadingHyphens(input);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_StringWithDoubleHyphen_kjji2() throws Exception {
        String input = "--example";
        String result = Util.stripLeadingHyphens(input);
        assertEquals("example", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_StringWithSingleHyphen_siYj3() throws Exception {
        String input = "-example";
        String result = Util.stripLeadingHyphens(input);
        assertEquals("example", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_BothQuotes_eJow0() throws Exception {
        String input = "\"Hello\"";
        String expected = "Hello";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_NoQuotes_seuK1() throws Exception {
        String input = "Hello";
        String expected = "Hello";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_OnlyLeadingQuote_YmGt2() throws Exception {
        String input = "\"Hello";
        String expected = "\"Hello";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_OnlyTrailingQuote_GSiw3() throws Exception {
        String input = "Hello\"";
        String expected = "Hello\"";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_EmptyString_OOSN4() throws Exception {
        String input = "";
        String expected = "";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_QuotesInside_DqSP5() throws Exception {
        String input = "\"He\"llo\"";
        String expected = "\"He\"llo\"";
        String result = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, result);
    }
}