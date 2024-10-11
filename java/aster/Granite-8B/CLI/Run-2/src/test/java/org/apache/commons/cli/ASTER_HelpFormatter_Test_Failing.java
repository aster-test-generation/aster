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

public class Aster_HelpFormatter_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetWidthWithNegativeValue_yrlA2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setWidth(-1 - 100 - 100);
        assertEquals(-100, helpFormatter.defaultWidth);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos6_hdXT5() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", -1, 10);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos10_attV9() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", -1, -1);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrimWithNonWhitespaceInputAtBeginning_Zxtk5() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String s = "!Hello, World!!";
        String expected = "!Hello, World!";
        String actual = helpFormatter.rtrim(s);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getDescPadding_xRYC1_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.getDescPadding();
        assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getDescPadding_with_negative_defaultDescPad_iDvJ3_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.defaultDescPad = -1;
        int result = helpFormatter.getDescPadding();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetWidthWithNegativeValue_yrlA2_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setWidth(-100);
        assertEquals(0, helpFormatter.defaultWidth);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText1_svAV0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        int width = 10;
        int nextLineTabStop = 4;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText2_gbYT1_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        int width = 10;
        int nextLineTabStop = 4;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText3_Frih2_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        int width = 10;
        int nextLineTabStop = 4;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos1_YChV0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", 10, 0);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos2_GRdI1_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", 20, 0);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos3_dXjJ2_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", 1, 0);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos5_ENHt4_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", 10, 10);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos6_hdXT5_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", 20, 10);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos7_jHnv6_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", 1, 10);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos9_pnOw8_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", 10, 20);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos10_attV9_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int actual = helpFormatter.findWrapPos("This is a test string", 20, 20);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSyntaxPrefix_rTet0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String actual = helpFormatter.getSyntaxPrefix();
        String expected = "defaultSyntaxPrefix";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgName_GhYQ0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String actual = helpFormatter.getArgName();
        String expected = "defaultArgName";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLeftPadding_UevW0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.getLeftPadding();
        assertEquals(79, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLongOptPrefix_fYpG0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String longOptPrefix = helpFormatter.getLongOptPrefix();
        assertEquals("defaultLongOptPrefix", longOptPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrimWithNonWhitespaceInputAtBeginning_Zxtk5_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String s = "!Hello, World!";
        String expected = "!Hello, World";
        String actual = helpFormatter.rtrim(s);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWidth_hKXu0_huUE0_fid2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int width = helpFormatter.getWidth();
        assertEquals(78, width);
    }
}