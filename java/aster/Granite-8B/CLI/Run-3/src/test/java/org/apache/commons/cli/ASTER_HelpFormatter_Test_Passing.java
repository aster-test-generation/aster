/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.PrintWriter;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HelpFormatter_Test_Passing {
    HelpFormatter helpFormatter;
    Options options;
    PrintWriter printWriter;
    PrintWriter pw;
    int width;
    String app;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDescPadding_kehf0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.getDescPadding();
        assertEquals(79, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptPrefix_yckK0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String optPrefix = helpFormatter.getOptPrefix();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetWidth_sqQE0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setWidth(10);
        assertEquals(10, helpFormatter.defaultWidth);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptSeparator_WNAO0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String expectedSeparator = " "; // Replace with the expected separator
        String actualSeparator = helpFormatter.getLongOptSeparator();
        assertEquals(expectedSeparator, actualSeparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_WGxp0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        formatter.printHelp("cmdLineSyntax", options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgName_pOGx0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setArgName("name");
        assertEquals("name", helpFormatter.defaultArgName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWrapped_HrAh0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        int nextLineTabStop = 4;
        String text = "This is a sample text that needs to be wrapped.";
        helpFormatter.printWrapped(pw, width, nextLineTabStop, text);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptionComparator_Sbkb0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        Comparator<Option> comparator = (o1, o2) -> o1.toString().compareTo(o2.toString());
        helpFormatter.setOptionComparator(comparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuilder_jHBK0() throws Exception {
        HelpFormatter helpFormatter = HelpFormatter.builder().get();
        assertNotNull(helpFormatter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePadding_ShAO0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String padding = helpFormatter.createPadding(5);
        assertEquals("     ", padding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_ndWV0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        formatter.printHelp("cmdLineSyntax", options, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOptSeparator_ehbr0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setLongOptSeparator(" ");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_DpAO0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        formatter.printHelp(120, "cmdLineSyntax", "header", options, "footer", false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNewLine_Bpru0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String newline = "\n";
        helpFormatter.setNewLine(newline);
        assertEquals("\n", helpFormatter.defaultNewLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSyntaxPrefix_qRry0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String expected = "defaultSyntaxPrefix";
        String actual = helpFormatter.getSyntaxPrefix();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_tZBs0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        helpFormatter.printHelp("cmdLineSyntax", "header", options, "footer", true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintOptions_pdfQ0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        int leftPad = 10;
        int descPad = 5;
        helpFormatter.printOptions(pw, width, options, leftPad, descPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionComparator_CRBY0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        Comparator<Option> comparator = helpFormatter.getOptionComparator();
        assertNotNull(comparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetArgName_pspF0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String argName = helpFormatter.getArgName();
        assertEquals("defaultArgName", argName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOptPrefix_OkvA0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String prefix = "prefix";
        helpFormatter.setLongOptPrefix(prefix);
        assertEquals(prefix, helpFormatter.defaultLongOptPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLeftPadding_SzoD0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.getLeftPadding();
        assertEquals(79, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_nlvM0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        Options options = new Options();
        helpFormatter.printHelp(80, "cmdLineSyntax", "header", options, "footer", true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDescPadding_mDVf0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setDescPadding(10);
        assertEquals(10, helpFormatter.defaultDescPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNewLine_TzVR0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String actual = helpFormatter.getNewLine();
        String expected = System.getProperty("line.separator");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLongOptPrefix_GWmc0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String longOptPrefix = helpFormatter.getLongOptPrefix();
        assertEquals("defaultLongOptPrefix", longOptPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_pTGm0() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        formatter.printHelp("cmdLineSyntax", "header", options, "footer");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSyntaxPrefix_rVND0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setSyntaxPrefix("prefix");
        assertEquals("prefix", helpFormatter.defaultSyntaxPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWrapped_cVgt0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String text = "This is a sample text that needs to be wrapped.";
        helpFormatter.printWrapped(pw, width, text);
        assertEquals("This is a sample text that needs to be wrapped.", text);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptPrefix_EcuV0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String prefix = "prefix";
        helpFormatter.setOptPrefix(prefix);
        assertEquals("prefix", helpFormatter.defaultOptPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_dXSj0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        Options options = new Options();
        String cmdLineSyntax = "cmdLineSyntax";
        String header = "header";
        String footer = "footer";
        int width = 80;
        int leftPad = 1;
        int descPad = 2;
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrim1_eyrV0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String s = "   Hello, World!   ";
        String expected = "   Hello, World!";
        String actual = helpFormatter.rtrim(s);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrim2_DmEH1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String s = "   ";
        String expected = "";
        String actual = helpFormatter.rtrim(s);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRtrim3_qyew2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        String s = null;
        String expected = null;
        String actual = helpFormatter.rtrim(s);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_Cjlv0_1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String cmdLineSyntax = "test";
        String header = "This is a test header";
        Options options = new Options();
        int leftPad = 1;
        int descPad = 2;
        String footer = "This is a test footer";
        boolean autoUsage = true;
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
        assertEquals("test", cmdLineSyntax);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_Cjlv0_2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String cmdLineSyntax = "test";
        String header = "This is a test header";
        Options options = new Options();
        int leftPad = 1;
        int descPad = 2;
        String footer = "This is a test footer";
        boolean autoUsage = true;
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
        assertEquals("This is a test header", header);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_Cjlv0_3() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String cmdLineSyntax = "test";
        String header = "This is a test header";
        Options options = new Options();
        int leftPad = 1;
        int descPad = 2;
        String footer = "This is a test footer";
        boolean autoUsage = true;
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
        assertEquals(1, leftPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_Cjlv0_4() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String cmdLineSyntax = "test";
        String header = "This is a test header";
        Options options = new Options();
        int leftPad = 1;
        int descPad = 2;
        String footer = "This is a test footer";
        boolean autoUsage = true;
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
        assertEquals(2, descPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_Cjlv0_5() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String cmdLineSyntax = "test";
        String header = "This is a test header";
        Options options = new Options();
        int leftPad = 1;
        int descPad = 2;
        String footer = "This is a test footer";
        boolean autoUsage = true;
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
        assertEquals("This is a test footer", footer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintHelp_Cjlv0_6() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String cmdLineSyntax = "test";
        String header = "This is a test header";
        Options options = new Options();
        int leftPad = 1;
        int descPad = 2;
        String footer = "This is a test footer";
        boolean autoUsage = true;
        helpFormatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
        assertTrue(autoUsage);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintUsage_cSQn1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String cmdLineSyntax = "test";
        Options options = new Options();
        helpFormatter.printUsage(pw, width, cmdLineSyntax, options);
        assertEquals("test", cmdLineSyntax);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintOptions_qNQF2_1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        Options options = new Options();
        int leftPad = 1;
        int descPad = 2;
        helpFormatter.printOptions(pw, width, options, leftPad, descPad);
        assertEquals(1, leftPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintOptions_qNQF2_2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        Options options = new Options();
        int leftPad = 1;
        int descPad = 2;
        helpFormatter.printOptions(pw, width, options, leftPad, descPad);
        assertEquals(2, descPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWrapped_eMNS3() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        int width = 80;
        String text = "This is a test text";
        helpFormatter.printWrapped(pw, width, text);
        assertEquals("This is a test text", text);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_hjqj0() throws Exception {
        Options options = new Options();
        options.hasLongOption("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_aFYB1() throws Exception {
        Options options = new Options();
        options.getMatchingOptions("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_EaVC2() throws Exception {
        Options options = new Options();
        options.getOption("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_SHPf3() throws Exception {
        Options options = new Options();
        options.getOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_kAZK4() throws Exception {
        Options options = new Options();
        options.toString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_pqKs5() throws Exception {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_eQLC6() throws Exception {
        Options options = new Options();
        options.addOption(new Option("opt", "longOpt", true, "description"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_NcTr7() throws Exception {
        Options options = new Options();
        options.getOptionGroup(new Option("opt", "longOpt", true, "description"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption1_KEhG8() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_KVJv9() throws Exception {
        Options options = new Options();
        Options options1 = new Options();
        options.addOptions(options1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_gDAn10() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        options.addOptionGroup(group);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_jYlP11() throws Exception {
        Options options = new Options();
        options.hasShortOption("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption2_Lfjn12() throws Exception {
        Options options = new Options();
        options.addOption("opt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_qyZu13() throws Exception {
        Options options = new Options();
        options.getRequiredOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_RlDh14() throws Exception {
        Options options = new Options();
        options.hasOption("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption3_xAsv15() throws Exception {
        Options options = new Options();
        options.addOption("opt", "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderOptions_mqCf16() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        helpFormatter.renderOptions(sb, 10, new Options(), 5, 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos1_waqt0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string", 10, 0);
        assertEquals(11, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos2_HQzx1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 0);
        assertEquals(11, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos3_OENP2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 20);
        assertEquals(31, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos4_dXrs3() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 30);
        assertEquals(31, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos5_baJU4() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 40);
        assertEquals(41, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos6_HRxI5() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 50);
        assertEquals(41, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos7_bvtC6() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 60);
        assertEquals(51, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos8_pkdC7() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 70);
        assertEquals(51, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos9_kuKP8() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 80);
        assertEquals(61, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos10_UBfB9() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 90);
        assertEquals(61, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos11_QPKp10() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 100);
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindWrapPos12_piyg11() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        int result = helpFormatter.findWrapPos("This is a test string with a tab\tand a line break\n", 10, 110);
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText1_BoDP0() throws Exception {
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
    public void testRenderWrappedText2_MPUa1() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        int width = 20;
        int nextLineTabStop = 4;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("Lorem ipsum dolor sit amet,\n" +
                "consectetur adipiscing elit.\n" +
                "Sed do eiusmod tempor\n" +
                "incididunt ut labore et\n" +
                "dolore magna aliqua.", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText3_YJDr2() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        int width = 20;
        int nextLineTabStop = 8;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("Lorem ipsum dolor\n" +
                "    sit amet,\n" +
                "    consectetur adipiscing elit.\n" +
                "Sed do eiusmod tempor\n" +
                "    incididunt ut labore et\n" +
                "    dolore magna aliqua.", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText4_aiCV3() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        int width = 20;
        int nextLineTabStop = 12;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("Lorem ipsum dolor\n" +
                "            sit amet,\n" +
                "            consectetur adipiscing elit.\n" +
                "Sed do eiusmod tempor\n" +
                "            incididunt ut labore et\n" +
                "            dolore magna aliqua.", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText5_sTdE4() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        int width = 20;
        int nextLineTabStop = 16;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("Lorem ipsum dolor\n" +
                "                        sit amet,\n" +
                "                        consectetur adipiscing elit.\n" +
                "Sed do eiusmod tempor\n" +
                "                        incididunt ut labore et\n" +
                "                        dolore magna aliqua.", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenderWrappedText6_QyNl5() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        StringBuffer sb = new StringBuffer();
        int width = 20;
        int nextLineTabStop = 20;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        helpFormatter.renderWrappedText(sb, width, nextLineTabStop, text);
        assertEquals("Lorem ipsum dolor\n" +
                "                                sit amet,\n" +
                "                                consectetur adipiscing elit.\n" +
                "Sed do eiusmod tempor\n" +
                "                                incididunt ut labore et\n" +
                "                                dolore magna aliqua.", sb.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLeftPadding_KCHd0() throws Exception {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setLeftPadding(10);
        assertEquals(10, helpFormatter.defaultLeftPad);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_rujP0() throws Exception {
        Options options = new Options();
        boolean result = options.hasLongOption("opt");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_EHoF1() throws Exception {
        Options options = new Options();
        List<String> result = options.getMatchingOptions("opt");
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_Ouvk2() throws Exception {
        Options options = new Options();
        Option result = options.getOption("opt");
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_uOOW3() throws Exception {
        Options options = new Options();
        Collection<Option> result = options.getOptions();
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_fkzx4() throws Exception {
        Options options = new Options();
        String result = options.toString();
        Assertions.assertEquals("Options: []", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_GjZb6() throws Exception {
        Options options = new Options();
        Option opt = new Option("opt", "longOpt", false, "description");
        options.addOption(opt);
        Assertions.assertTrue(options.hasOption("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_YTTt7() throws Exception {
        Options options = new Options();
        Options options2 = new Options();
        options.addOptions(options2);
        Assertions.assertTrue(options.getOptions().isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_NQfI8() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        options.addOptionGroup(group);
        Assertions.assertTrue(options.getOptionGroups().isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_OYSi9() throws Exception {
        Options options = new Options();
        boolean result = options.hasShortOption("opt");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithString_avsW11() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", false, "description");
        Assertions.assertTrue(options.hasOption("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithStringAndStringAndBoolean_iVce14() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        Assertions.assertTrue(options.hasOption("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_oCXd20() throws Exception {
        Options options = new Options();
    }
}