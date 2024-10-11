/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HelpFormatter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos_LF_gxbW0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello\nWorld";
        int width = 5;
        int startPos = 0;
        int expected = 6;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos_TAB_cbsH1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello\tWorld";
        int width = 5;
        int startPos = 0;
        int expected = 6;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos_Space_ZMtU2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello World";
        int width = 5;
        int startPos = 0;
        int expected = 5;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos_EndOfText_MoGd3() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello";
        int width = 5;
        int startPos = 0;
        int expected = -1;
        int actual = helpFormatter.findWrapPos(text, width, startPos);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_withLongOptSeparator_pQxy3_buSz0() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "alpha", true, "alpha option");
        java.io.StringWriter writer = new java.io.StringWriter();
        PrintWriter pw = new PrintWriter(writer);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = writer.toString();
        assert(result.contains("--alpha "));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_withDefaultArgName_syEt4_YFZH0() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        java.io.StringWriter writer = new java.io.StringWriter();
        PrintWriter pw = new PrintWriter(writer);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = writer.toString();
        assert(result.contains("<arg>"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderOptions_getOptionComparatorNotNull_zTnu0_PoPD0() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        java.io.StringWriter writer = new java.io.StringWriter();
        PrintWriter pw = new PrintWriter(writer);
        formatter.printWrapped(pw, 80, "options");
        pw.flush();
        assertNotNull(writer.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWrapped_MultiLine_fEyU0_egZE0_fid2() throws IOException {
        HelpFormatter helpFormatter = new HelpFormatter();
        java.io.StringWriter writer = new java.io.StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        String text = "This is a multi-line text.\nIt has two lines.";
        helpFormatter.printWrapped(printWriter, 10, text);
        String expected = "This is a\nmulti-line\ntext.\nIt has two\nlines.\n";
        assertEquals(expected, writer.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_withLongOption_yYPy1_uDGR0_fid2() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "alpha", true, "alpha option");
        java.io.StringWriter writer = new java.io.StringWriter();
        PrintWriter pw = new PrintWriter(writer);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = writer.toString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_withShortOption_bkcJ0_leGM0_fid2() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        java.io.StringWriter writer = new java.io.StringWriter();
        PrintWriter pw = new PrintWriter(writer);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = writer.toString();
    }
}