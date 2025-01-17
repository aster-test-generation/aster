/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLine_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_vxDY0() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Supplier<String> defaultValue = () -> "default";
        String opt = "a";
        String expected = "a";
        try {
            String result = commandLine.getParsedOptionValue(opt.charAt(0), defaultValue);
            assertEquals(expected, result);
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_NullDefaultValue_IjMn1() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        String opt = "test";
        assertThrows(NullPointerException.class, () -> commandLine.getParsedOptionValue(opt, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_EmptyValue_TduS2() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        assertNull(commandLine.getParsedOptionValue(option, () -> "default value"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ThrowsParseException_PtwZ4() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        try {
            commandLine.getParsedOptionValue(option, () -> "default value");
            fail("Expected ParseException");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ThrowsParseException_cpsG1_1() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(ParseException.class, () -> commandLine.getParsedOptionValue(option, defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ReturnsParsedOptionValue_WithConverter_ThrowsParseException_mCGs5_1() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(ParseException.class, () -> commandLine.getParsedOptionValue(option, () -> defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ReturnsParsedOptionValue_WithConverter_ThrowsIndexOutOfBoundsException_mPQi6_1() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> commandLine.getParsedOptionValue(option, () -> defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ReturnsParsedOptionValue_WithConverter_ThrowsException_svyS7_1() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(Exception.class, () -> commandLine.getParsedOptionValue(option, () -> defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ConverterApplied_YBNl3_dCcs0() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        option.setConverter(String::toUpperCase);
        assertEquals("DEFAULT", commandLine.getOptionValue(option, "default value"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesNullOption_ejNJ1_pYdA1() {
        CommandLine commandLine = new CommandLine();
        String[] result = commandLine.getOptionValues((String) null);
        assertArrayEquals(new String[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ThrowsParseException_cpsG1() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(ParseException.class, () -> commandLine.getParsedOptionValue(option, defaultValue));
        assertNotNull(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ReturnsParsedOptionValue_WithConverter_ThrowsParseException_mCGs5() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(ParseException.class, () -> commandLine.getParsedOptionValue(option, () -> defaultValue));
        assertNotNull(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ReturnsParsedOptionValue_WithConverter_ThrowsIndexOutOfBoundsException_mPQi6() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> commandLine.getParsedOptionValue(option, () -> defaultValue));
        assertNotNull(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ReturnsParsedOptionValue_WithConverter_ThrowsException_svyS7() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(Exception.class, () -> commandLine.getParsedOptionValue(option, () -> defaultValue));
        assertNotNull(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ReturnsParsedOptionValue_WithConverter_ThrowsException_WithMessage_WwdI8() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(Exception.class, () -> commandLine.getParsedOptionValue(option, () -> defaultValue));
        assertNotNull(exception);
        assertEquals("Exception message", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ReturnsParsedOptionValue_WithConverter_ThrowsException_WithCause_iYPy9() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(Exception.class, () -> commandLine.getParsedOptionValue(option, () -> defaultValue));
        assertNotNull(exception);
        assertNotNull(exception.getCause());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ReturnsParsedOptionValue_WithConverter_ThrowsException_WithCause_Message_nDFp10() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object defaultValue = "default";
        Exception exception = assertThrows(Exception.class, () -> commandLine.getParsedOptionValue(option, () -> defaultValue));
        assertNotNull(exception);
        assertNotNull(exception.getCause());
        assertEquals("Cause message", exception.getCause().getMessage());
    }
}