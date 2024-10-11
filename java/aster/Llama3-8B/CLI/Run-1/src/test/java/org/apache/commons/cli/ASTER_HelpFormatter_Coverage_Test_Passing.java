/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HelpFormatter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_DOIE0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter printWriter = new PrintWriter(System.out);
        String cmdLineSyntax = "cmdLineSyntax";
        String header = "header";
        Options options = new Options();
        int leftPad = 0;
        int descPad = 0;
        String footer = "footer";
        boolean autoUsage = false;
        helpFormatter.printHelp(printWriter, 80, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos3_lbua2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello";
        int width = 5;
        int startPos = 5;
        int expected = -1;
        int result = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionComparatorNotNull_ijOc0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.renderOptions(new StringBuffer(), 10, new Options(), 0, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos1_uKWk0_fid2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello";
        int width = -1;
        int startPos = 0;
        int expected = -1;
        int result = helpFormatter.findWrapPos(text, width, startPos);
        assertEquals(expected, result);
    }
}