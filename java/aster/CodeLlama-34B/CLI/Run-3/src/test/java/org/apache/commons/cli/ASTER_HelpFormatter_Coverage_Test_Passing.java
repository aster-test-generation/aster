/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HelpFormatter_Coverage_Test_Passing {
    private BufferedReader in;
    private Options options;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos1_aRCQ0() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 9;
        int startPos = 0;
        int expected = 9;
        int actual = formatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos2_bXwF1() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 9;
        int startPos = 5;
        int expected = 9;
        int actual = formatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos3_XZnR2() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 10;
        int startPos = 10;
        int expected = 16;
        int actual = formatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos4_eJzF3() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 10;
        int startPos = 15;
        int expected = -1;
        int actual = formatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos5_xJsf4() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 10;
        int startPos = 20;
        int expected = -1;
        int actual = formatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos6_hhUV5() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 10;
        int startPos = 25;
        int expected = -1;
        int actual = formatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelpWithFooter_GwxU0() {
        HelpFormatter formatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String cmdLineSyntax = "cmdLineSyntax";
        String header = "header";
        Options options = new Options();
        int leftPad = 2;
        int descPad = 4;
        String footer = "footer";
        boolean autoUsage = true;
        formatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testprintUsage_ZHBr2() throws Exception {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos7_EWjE6() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 10;
        int startPos = 30;
        int expected = -1;
        int actual = formatter.findWrapPos(text, width, startPos);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrim_FInE0() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "   Hello World   ";
        String expected = "   Hello World";
        String actual = formatter.rtrim(input);
        assertEquals(expected, actual);
    }
}