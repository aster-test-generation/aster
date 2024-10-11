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

public class Aster_Util_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_singleQuote_wBbx2() {
        String input = "\"";
        String expected = "";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotes_NSve4() {
        String input = "\"\"\"";
        String expected = "";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_leadingQuote_ZnsV6() {
        String input = "\"hello";
        String expected = "hello";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_trailingQuote_KGgY7() {
        String input = "hello\"";
        String expected = "hello";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInMiddle_GDYg9() {
        String input = "\"hello\"\"world\"";
        String expected = "helloworld";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInMiddleAndEnd_fbkW10() {
        String input = "\"hello\"\"world\"\"";
        String expected = "helloworld";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInMiddleAndStart_mova11() {
        String input = "\"\"hello\"world\"";
        String expected = "helloworld";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInMiddleAndStartAndEnd_zBzd12() {
        String input = "\"\"hello\"world\"\"";
        String expected = "helloworld";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInStartAndEnd_SDKt13() {
        String input = "\"\"hello\"\"";
        String expected = "hello";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStripLeadingAndTrailingQuotes_multipleQuotesInStartAndEndAndMiddle_SaaT14() {
        String input = "\"\"hello\"\"world\"\"";
        String expected = "helloworld";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }
}