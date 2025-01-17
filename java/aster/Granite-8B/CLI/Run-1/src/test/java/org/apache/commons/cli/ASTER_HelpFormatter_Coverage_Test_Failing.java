/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HelpFormatter_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp1_JXmH0() {
        PrintWriter pw = null;
        int width = 0;
        String cmdLineSyntax = "";
        String header = "";
        Options options = null;
        int leftPad = 0;
        int descPad = 0;
        String footer = "";
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp2_TPlp1() {
        PrintWriter pw = null;
        int width = 0;
        String cmdLineSyntax = "";
        String header = "";
        Options options = null;
        int leftPad = 0;
        int descPad = 0;
        String footer = "";
        boolean autoUsage = false;
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos1_aJrg0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 10;
        int startPos = 0;
        int expected = 11;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos2_CEqo1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 20;
        int startPos = 0;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos3_lLfB2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 15;
        int startPos = 10;
        int expected = 26;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos4_CaNr3() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "This is a sample text";
        int width = 25;
        int startPos = 10;
        int expected = 36;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assert actual == expected;
    }
}