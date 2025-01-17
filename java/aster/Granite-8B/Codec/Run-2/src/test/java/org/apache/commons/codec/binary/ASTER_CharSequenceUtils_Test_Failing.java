/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CharSequenceUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches2_POlF1() {
        CharSequence cs = "Hello World";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "World";
        int start = 6;
        int length = 5;
        boolean expected = true;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches5_iuXU4() {
        CharSequence cs = "Hello World";
        boolean ignoreCase = false;
        int thisStart = 0;
        CharSequence substring = "World";
        int start = 6;
        int length = 5;
        boolean expected = true;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches8_TviD7() {
        CharSequence cs = "Hello World";
        boolean ignoreCase = true;
        int thisStart = 6;
        CharSequence substring = "World";
        int start = 0;
        int length = 5;
        boolean expected = false;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }
}