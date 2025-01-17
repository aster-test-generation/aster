/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HelpFormatter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos5_KXoQ4() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello";
        int width = 6;
        int startPos = 5;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos6_UnGs5() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello";
        int width = 6;
        int startPos = 6;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCmdLineSyntaxNull_FYmB0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String cmdLineSyntax = null;
        String header = "Test Header";
        Options options = new Options();
        int leftPad = 0;
        int descPad = 0;
        String footer = "Test Footer";
        boolean autoUsage = false;
        try {
            helpFormatter.printHelp(null, 80, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCmdLineSyntaxEmpty_jXKL1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String cmdLineSyntax = "";
        String header = "Test Header";
        Options options = new Options();
        int leftPad = 0;
        int descPad = 0;
        String footer = "Test Footer";
        boolean autoUsage = false;
        try {
            helpFormatter.printHelp(null, 80, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionComparatorNotNull_IcxV0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        StringBuffer sb = new StringBuffer();
        int width = 10;
        int leftPad = 2;
        int descPad = 4;
        helpFormatter.renderOptions(sb, width, options, leftPad, descPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionOptNotNull_XHAY3_vkdb0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("o", "longOpt", true, "description");
        options.addOption(option);
        StringBuffer sb = new StringBuffer();
        int width = 10;
        int leftPad = 2;
        int descPad = 4;
        helpFormatter.renderOptions(sb, width, options, leftPad, descPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos1_wmgK0_fid2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello";
        int width = -1;
        int startPos = 0;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos3_sFNN2_fid2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello";
        int width = 6;
        int startPos = 0;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos4_QxoX3_fid2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello";
        int width = 6;
        int startPos = 1;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }
}