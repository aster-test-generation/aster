/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.*;

public class Aster_HelpFormatter_Test_Passing {
    HelpFormatter helpformatter;
    Options options;
    PrintWriter pw;
    String cmdLineSyntax;
    String header;
    String footer;
    int width;
    int leftPad;
    int descPad;
    boolean autoUsage;
    String app;
    PrintWriter printWriter;
    private HelpFormatter helpFormatter;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testprintHelp_6() throws Exception {
        helpformatter = new HelpFormatter();
        options = new Options();
        cmdLineSyntax = "cmdLineSyntax";
        header = "header";
        footer = "footer";
        helpformatter.printHelp(cmdLineSyntax, header, options, footer, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testprintHelp() throws Exception {
        helpformatter = new HelpFormatter();
        options = new Options();
        cmdLineSyntax = "test";
        header = "test";
        footer = "test";
        width = 100;
        leftPad = 1;
        descPad = 1;
        pw = new PrintWriter(System.out);
        helpformatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetWidth_xnLM0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setWidth(100);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetDescPadding_RWbZ0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        assertEquals(0, helpFormatter.getDescPadding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgName_DCbH0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("test");
        assertEquals("test", formatter.defaultArgName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSyntaxPrefix_jIDk0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String syntaxPrefix = formatter.getSyntaxPrefix();
        System.out.println(syntaxPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_UuVq0() throws Exception {
        Options options = new Options();
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "command line syntax";
        formatter.printHelp(cmdLineSyntax, options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOptPrefix_EYsr0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("testPrefix");
        assertEquals("testPrefix", formatter.defaultLongOptPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptSeparator_Czrp0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String longOptSeparator = helpFormatter.getLongOptSeparator();
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, longOptSeparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptSeparatorWithCustomSeparator_sHeZ1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String customSeparator = "-";
        helpFormatter.setLongOptSeparator(customSeparator);
        String longOptSeparator = helpFormatter.getLongOptSeparator();
        assertEquals(customSeparator, longOptSeparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePadding_Bmwg0_1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        assertEquals("     ", helpFormatter.createPadding(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePadding_Bmwg0_2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        assertEquals("          ", helpFormatter.createPadding(10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePadding_Bmwg0_3() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        assertEquals("               ", helpFormatter.createPadding(15));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptPrefix_AxIx0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setOptPrefix("test");
        assertEquals("test", helpFormatter.defaultOptPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_Tlgs0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "command";
        String header = "header";
        String footer = "footer";
        boolean autoUsage = true;
        formatter.printHelp(cmdLineSyntax, header, options, footer, autoUsage);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_AcCJ0() throws Exception {
        String cmdLineSyntax = "command";
        String header = "header";
        Options options = new Options();
        String footer = "footer";
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(cmdLineSyntax, header, options, footer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWidth_lDdf0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int width = helpFormatter.getWidth();
        assertEquals(79, width);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderOptions_HbgE0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringBuffer sb = new StringBuffer();
        int width = 100;
        int leftPad = 2;
        int descPad = 3;
        StringBuffer result = formatter.renderOptions(sb, width, options, leftPad, descPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setLeftPadding_WhenPaddingIsZero_ThenLeftPadIsZero_RJBY0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setLeftPadding(0);
        assert helpFormatter.defaultLeftPad == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setLeftPadding_WhenPaddingIsNegative_ThenLeftPadIsNegative_Pxsq1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setLeftPadding(-10);
        assert helpFormatter.defaultLeftPad == -10;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setLeftPadding_WhenPaddingIsPositive_ThenLeftPadIsPositive_wmES2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setLeftPadding(10);
        assert helpFormatter.defaultLeftPad == 10;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetDescPadding_EHuy0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setDescPadding(10);
        assertEquals(10, helpFormatter.defaultDescPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetDescPadding2_rYNP1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setDescPadding(20);
        assertEquals(20, helpFormatter.defaultDescPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetDescPadding3_LPml2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setDescPadding(30);
        assertEquals(30, helpFormatter.defaultDescPad);
    }

    @BeforeEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_UQYN0() throws Exception {
        helpFormatter = new HelpFormatter();
    }

    @AfterEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void tearDown_FzDq1() throws Exception {
        helpFormatter = null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_eeOg2() throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String cmdLineSyntax = "java Main";
        String header = "This is the header";
        Options options = new Options();
        int leftPad = 5;
        int descPad = 3;
        String footer = "This is the footer";
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrimWithNullString_oWzj0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String result = helpFormatter.rtrim(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrimWithEmptySting_acNZ1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String result = helpFormatter.rtrim("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrimWithNoSpaces_iybw3() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String result = helpFormatter.rtrim("test");
        assertEquals("test", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrimWithMultipleSpaces_iYlJ5() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String result = helpFormatter.rtrim("test   test   ");
        assertEquals("test   test", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSyntaxPrefix_oYwu0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setSyntaxPrefix("Usage: ");
        assert helpFormatter.defaultSyntaxPrefix.equals("Usage: ");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSyntaxPrefixWithNullPrefix_tMSU2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setSyntaxPrefix(null);
        assert helpFormatter.defaultSyntaxPrefix == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSyntaxPrefixWithEmptyPrefix_CTbz3() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setSyntaxPrefix("");
        assert helpFormatter.defaultSyntaxPrefix.equals("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText_NoWrap_lTZd0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a short text that does not need to be wrapped.";
        int width = 80;
        int nextLineTabStop = 4;
        StringBuffer expected = new StringBuffer(text);
        StringBuffer actual = formatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText_WithWrap_jZbf1() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a long text that needs to be wrapped. It should be split into multiple lines.";
        int width = 40;
        int nextLineTabStop = 4;
        StringBuffer expected = new StringBuffer("This is a long text that\n" +
                "needs to be wrapped. It\n" +
                "should be split into\n" +
                "multiple lines.");
        StringBuffer actual = formatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText_WithNextLineTabStop_mlHR2() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a long text that needs to be wrapped. It should be split into multiple lines.";
        int width = 40;
        int nextLineTabStop = 10;
        StringBuffer expected = new StringBuffer("This is a long text\n" +
                "that needs to be\n" +
                "wrapped. It should\n" +
                "be split into\n" +
                "multiple lines.");
        StringBuffer actual = formatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText_WithNextLineTabStopGreaterThanWidth_pbCq3() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a long text that needs to be wrapped. It should be split into multiple lines.";
        int width = 40;
        int nextLineTabStop = 50;
        StringBuffer expected = new StringBuffer("This is a long text\n" +
                "that needs to be\n" +
                "wrapped. It should\n" +
                "be split into\n" +
                "multiple lines.");
        StringBuffer actual = formatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptPrefix_KdnY0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String defaultOptPrefix = helpFormatter.getOptPrefix();
        assertEquals(defaultOptPrefix, HelpFormatter.DEFAULT_OPT_PREFIX);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_kvwG0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "cmd";
        Options options = new Options();
        String header = "header";
        String footer = "footer";
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        int leftPad = 5;
        int descPad = 3;
        boolean autoUsage = true;
        formatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp2_DTsg1() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "cmd";
        Options options = new Options();
        String header = "header";
        String footer = "footer";
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        int leftPad = 5;
        int descPad = 3;
        boolean autoUsage = false;
        formatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_WBDm0() throws Exception {
        Options options = new Options();
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cmdLineSyntax", options, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_full_UOFm1() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cmdLineSyntax", options, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_noAutoUsage_TKBL2() throws Exception {
        Options options = new Options();
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cmdLineSyntax", options, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_withHeader_iETy3() throws Exception {
        Options options = new Options();
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cmdLineSyntax", "header", options, "footer", true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_withLongOptions_IBLD4() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        options.addOption("opt2", "longOpt2", false, "description2");
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cmdLineSyntax", options, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_withLongOptionsAndGroups_KZWC5() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("opt", "longOpt", true, "description"));
        group.addOption(new Option("opt2", "longOpt2", false, "description2"));
        options.addOptionGroup(group);
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cmdLineSyntax", options, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_withLongOptionsAndRequiredOption_AFYy6() throws Exception {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cmdLineSyntax", options, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_withLongOptionsAndRequiredOptions_nhHc7() throws Exception {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        options.addRequiredOption("opt2", "longOpt2", false, "description2");
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cmdLineSyntax", options, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_withLongOptionsAndRequiredOptionsAndGroups_naOC8() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("opt", "longOpt", true, "description"));
        group.addOption(new Option("opt2", "longOpt2", false, "description2"));
        options.addOptionGroup(group);
        options.addRequiredOption("opt3", "longOpt3", true, "description3");
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cmdLineSyntax", options, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_RaGB0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_HpoS1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
        String newLine = helpFormatter.getNewLine();
        assert newLine.equals(newline);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_BADc2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
        String newLine = helpFormatter.getNewLine();
        assert !newLine.isEmpty();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_JWVZ4() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
        String newLine = helpFormatter.getNewLine();
        assert !newLine.equals("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_ccGR5() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
        String newLine = helpFormatter.getNewLine();
        assert !newLine.equals(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_ELCW6() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
        String newLine = helpFormatter.getNewLine();
        assert !newLine.equals(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_BBJp7() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
        String newLine = helpFormatter.getNewLine();
        assert !newLine.equals(false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_qRYw8() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
        String newLine = helpFormatter.getNewLine();
        assert !newLine.equals(new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_tVMK9() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
        String newLine = helpFormatter.getNewLine();
        assert !newLine.equals(new String());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setNewLineTest_Kfgf10() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "newLine";
        helpFormatter.setNewLine(newline);
        String newLine = helpFormatter.getNewLine();
        assert !newLine.equals(new StringBuilder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNewLine_dMRG0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newLine = helpFormatter.getNewLine();
        assertEquals(System.getProperty("line.separator"), newLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNewLine_erHb1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newLine = helpFormatter.getNewLine();
        assertEquals("\n", newLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNewLine_AThD2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newLine = helpFormatter.getNewLine();
        assertEquals("\r\n", newLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNewLine_gzUB3() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newLine = helpFormatter.getNewLine();
        assertEquals("\r", newLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNewLine_rNrK12() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getArgNameTest_bMUa0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String result = helpFormatter.getArgName();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptPrefix_bhjA0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String defaultLongOptPrefix = helpFormatter.getLongOptPrefix();
        assertEquals(defaultLongOptPrefix, HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptPrefixCoverage_ncAu1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String defaultLongOptPrefix = helpFormatter.getLongOptPrefix();
        assertEquals(defaultLongOptPrefix, "defaultLongOptPrefix");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLeftPadding_JadK0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(formatter.getLeftPadding(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLeftPadding_DmVu1() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("Usage: ");
        assertEquals(formatter.getLeftPadding(), 7);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLeftPadding_fjNA2() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setOptionComparator(null);
        assertEquals(formatter.getLeftPadding(), 7);
    }
}