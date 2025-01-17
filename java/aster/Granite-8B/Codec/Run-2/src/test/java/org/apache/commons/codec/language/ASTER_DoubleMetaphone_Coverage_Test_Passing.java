/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DoubleMetaphone_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCharAt_azYu0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        char actual = doubleMetaphone.charAt("Hello", 0);
        char expected = 'H';
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_Ffzw0() throws org.apache.commons.codec.EncoderException {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        Object obj = new Object();
        try {
            doubleMetaphone.encode(obj);
            fail("EncoderException expected");
        } catch (EncoderException e) {
            assertEquals("DoubleMetaphone encode parameter is not of type String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone0_JjcR5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "A";
        String expected = "A";
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone1_HBbi6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "A";
        String expected = "A";
        String actual = doubleMetaphone.doubleMetaphone(value, true);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH13_UcpZ13() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleT_CsMF11() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContains_bIxa0() {
        String[] criteria = {"abc", "def", "ghi"};
        String value = "abcdefghi";
        int start = 0;
        int length = 3;
        boolean expected = true;
        boolean actual = DoubleMetaphone.contains(value, start, length, criteria);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContains2_JCXQ1() {
        String[] criteria = {"abc", "def", "ghi"};
        String value = "abcdefghi";
        int start = 3;
        int length = 3;
        boolean expected = true;
        boolean actual = DoubleMetaphone.contains(value, start, length, criteria);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContains3_BIvh2() {
        String[] criteria = {"abc", "def", "ghi"};
        String value = "abcdefghi";
        int start = -1;
        int length = 3;
        boolean expected = false;
        boolean actual = DoubleMetaphone.contains(value, start, length, criteria);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContains4_csEk3() {
        String[] criteria = {"abc", "def", "ghi"};
        String value = "abcdefghi";
        int start = 0;
        int length = 10;
        boolean expected = false;
        boolean actual = DoubleMetaphone.contains(value, start, length, criteria);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConditionM0_9_RTxK14_scgS0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "M";
        int index = 8;
    }
}