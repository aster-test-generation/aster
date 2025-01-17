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
    public void testStripLeadingHyphens_EmptyString_mlhm0() throws Exception {
        String input = "";
        String expected = "";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_NullString_ePuT1() throws Exception {
        String input = null;
        String expected = null;
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_SingleHyphen_etSx2() throws Exception {
        String input = "-";
        String expected = "";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_MultipleHyphens_PGNM3() throws Exception {
        String input = "---";
        String expected = "";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_NoHyphens_BmSr4() throws Exception {
        String input = "hello";
        String expected = "hello";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_MixedHyphens_aGgD5() throws Exception {
        String input = "--hello-world";
        String expected = "hello-world";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingHyphens_AllHyphens_GKvw6() throws Exception {
        String input = "-----";
        String expected = "";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_emptyString_ccHq0() throws Exception {
        String input = "";
        String expected = "";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_singleQuote_wwgV1() throws Exception {
        String input = "\"";
        String expected = "";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotes_TrNY2() throws Exception {
        String input = "\"\"\"";
        String expected = "";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_noQuotes_semi3() throws Exception {
        String input = "hello";
        String expected = "hello";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_leadingQuote_Perp4() throws Exception {
        String input = "\"hello";
        String expected = "hello";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_trailingQuote_gpMa5() throws Exception {
        String input = "hello\"";
        String expected = "hello";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_leadingAndTrailingQuotes_uFjL6() throws Exception {
        String input = "\"hello\"";
        String expected = "hello";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInMiddle_RVpl7() throws Exception {
        String input = "\"hello\" \"world\"";
        String expected = "hello world";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInMiddleAndEnd_JmJw8() throws Exception {
        String input = "\"hello\" \"world\"\"";
        String expected = "hello world";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInMiddleAndStart_chzf9() throws Exception {
        String input = "\"\"hello\" \"world\"";
        String expected = "hello world";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInMiddleAndStartAndEnd_dkvw10() throws Exception {
        String input = "\"\"hello\" \"world\"\"";
        String expected = "hello world";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInMiddleAndStartAndEndAndOtherQuotes_QXWU11() throws Exception {
        String input = "\"\"hello\" \"world\"\"\"";
        String expected = "hello world";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }
}