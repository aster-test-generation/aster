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

public class Aster_HelpFormatter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testprintUsage_PXYY1() throws Exception {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos1_VbUM0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 10;
        int startPos = 0;
        int expected = 9;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos2_fBCw1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 20;
        int startPos = 0;
        int expected = 16;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos3_TpsJ2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 15;
        int startPos = 10;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos4_YGhP3() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 25;
        int startPos = 10;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos5_EWCt4() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 30;
        int startPos = 10;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos6_aCkT5() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 35;
        int startPos = 10;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos7_fKYl6() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 40;
        int startPos = 10;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos8_PVWN7() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 45;
        int startPos = 10;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos9_Ognr8() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 50;
        int startPos = 10;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos10_kyBN9() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 55;
        int startPos = 10;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderOptions1_mzpD0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        int width = 0;
        Options options = new Options();
        int leftPad = 0;
        int descPad = 0;
        helpFormatter.renderOptions(sb, width, options, leftPad, descPad);
        assertEquals("", sb.toString());
    }
}