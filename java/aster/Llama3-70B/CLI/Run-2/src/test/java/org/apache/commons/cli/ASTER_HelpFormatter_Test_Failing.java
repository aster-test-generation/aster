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

public class Aster_HelpFormatter_Test_Failing {
    private void printWrapped(final PrintWriter pw, final int width, final int start, final String text) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText1_AWUr0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a     test     strin     g";
        int width = 10;
        int nextLineTabStop = 5;
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("This is a\n test\n string", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText2_Tskg1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a     very     long     test     strin     g     that     needs     to be     wrapp     ed";
        int width = 10;
        int nextLineTabStop = 5;
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("This is a\n very\n long\n test\n string\n that\n needs\n to\n be\n wrapped", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText5_Rcpt4() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a test string with multiple lines\nand multiple words";
        int width = 10;
        int nextLineTabStop = 5;
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("This is a     test     strin     g     with     multi     ple     lines     and     words", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos9_wJGb8() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello World";
        int width = 5;
        int startPos = 5;
        int result = helpFormatter.findWrapPos(text, width, startPos);
        assert result == 5;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp1_DeUL0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "header", options, 2, 5, "footer", true);
        assertEquals("java.io.PrintWriter@2b850f11", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp2_mUNV1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "", options, 2, 5, "footer", true);
        assertEquals("java.io.PrintWriter@4340d4c2", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp3_oooe2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "header", options, 2, 5, "", true);
        assertEquals("java.io.PrintWriter@1c2673b4", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWrapped_pnJr0_YYGG0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printWrapped(pw, 10, "java.io.PrintWriter@1cc96393");
        pw.flush();
        assertEquals("java.io.PrintWriter@1cc96393" + System.lineSeparator(), pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescPadding_dJOo0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.getDescPadding();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptPrefix_lEvF0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        assertEquals("?", helpFormatter.getOptPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptSeparator_SYzP0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        assertEquals("=", helpFormatter.getLongOptSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText3_DblF2_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a single word";
        int width = 10;
        int nextLineTabStop = 5;
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("This is a", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText5_Rcpt4_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a test string with multiple lines\nand multiple words";
        int width = 10;
        int nextLineTabStop = 5;
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("This is a\n test\n string\nwith\n multiple\n lines\nand\n multiple\n words", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText6_kbzp5() {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        String text = "This is a test string with very long words that need to be wrapped properly";
        int width = 10;
        int nextLineTabStop = 5;
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("This is a\n test\n string\nwith\n very\n long\n words\n that\n need\n to\n be\n wrapped\n properly", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos1_LXQm0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello World";
        int width = 5;
        int startPos = 0;
        int result = helpFormatter.findWrapPos(text, width, startPos);
        assert result == 6;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos5_IvOV4_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello World";
        int width = 11;
        int startPos = 0;
        int result = helpFormatter.findWrapPos(text, width, startPos);
        assert result == 11;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos9_wJGb8_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String text = "Hello World";
        int width = 5;
        int startPos = 5;
        int result = helpFormatter.findWrapPos(text, width, startPos);
        assert result == 6;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp1_DeUL0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "header", options, 2, 5, "footer", true);
        assertEquals("expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp2_mUNV1_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "", options, 2, 5, "footer", true);
        assertEquals("expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp3_oooe2_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "header", options, 2, 5, "", true);
        assertEquals("expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp4_roGT3_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "", options, 2, 5, "", true);
        assertEquals("expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp5_YLlr4_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "header", options, 2, 5, "footer", false);
        assertEquals("expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp6_vVIr5_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "", options, 2, 5, "footer", false);
        assertEquals("expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp7_eCOf6_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printHelp(pw, 80, "cmdLineSyntax", "header", options, 2, 5, "", false);
        assertEquals("expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSyntaxPrefix_ZFqq0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        assertEquals("SYNOPSIS", helpFormatter.getSyntaxPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_RequiredOption_ZYdd0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        option.setRequired(true);
        options.addOption(option);
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printUsage(pw, 80, "app", options);
        assertEquals("Expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_NonRequiredOption_ajHs1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printUsage(pw, 80, "app", options);
        assertEquals("Expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_OptionWithArgument_kyLL2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        option.setArgName("argName");
        options.addOption(option);
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printUsage(pw, 80, "app", options);
        assertEquals("Expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_OptionWithoutArgument_dmTE3() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("o", "option", false, "description");
        options.addOption(option);
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printUsage(pw, 80, "app", options);
        assertEquals("Expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_MultipleOptions_mDih4() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        Option option1 = new Option("o1", "option1", true, "description1");
        Option option2 = new Option("o2", "option2", false, "description2");
        options.addOption(option1);
        options.addOption(option2);
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printUsage(pw, 80, "app", options);
        assertEquals("Expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNewLine_NbGa0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        assertEquals("System.lineSeparator()", helpFormatter.getNewLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintOptions_exDO0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        options.addOption("opt2", "longOpt2", false, "description2");
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printOptions(pw, 80, options, 2, 5);
        pw.flush();
        assertEquals("Expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgName_sczW0_fid1() {
        HelpFormatter helpFormatter = new HelpFormatter();
        assertEquals("defaultArgName", helpFormatter.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLeftPadding_LnZX0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.getLeftPadding();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWrapped_ullE0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printWrapped(pw, 10, "Hello World");
        pw.flush();
        assertEquals("Expected output", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWrapped_QqmT0_pMEQ0() {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printWrapped(pw, 10, "test");
        pw.flush();
        assertEquals("test\r\n", pw.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWrapped_pnJr0_YYGG0_fid2() {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        helpFormatter.printWrapped(pw, 10, "text");
        pw.flush();
        assertEquals("text" + System.lineSeparator(), pw.toString());
    }
}