/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ParseException_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_Backslash_b_MBNu0() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("\b");
        assertEquals("\\b", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_Tab_LDOv1() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("\t");
        assertEquals("\\t", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_NewLine_Eseh2() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("\n");
        assertEquals("\\n", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_FormFeed_dmLo3() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("\f");
        assertEquals("\\f", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_CarriageReturn_InBq4() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("\r");
        assertEquals("\\r", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_DoubleQuote_TPcm5() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("\"");
        assertEquals("\\\"", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_SingleQuote_lYWw6() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("\'");
        assertEquals("\\\'", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_Backslash_fwtu7() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("\\");
        assertEquals("\\\\", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_ControlCharacter_IuAK8() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes(String.valueOf((char) 0x1F));
        assertEquals("\\u001f", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_HighCharacter_Rbxw9() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes(String.valueOf((char) 0x80));
        assertEquals("\\u0080", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_PrintableCharacter_eEjV10() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("a");
        assertEquals("a", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_NullCharacter_bNJS11() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes(String.valueOf((char) 0));
        assertEquals("", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_MultipleCharacters_xKiA12() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("abc\tdef\nghi");
        assertEquals("abc\\tdef\\nghi", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_EmptyString_rDVw13() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("");
        assertEquals("", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_NullString_MhuT14() {
        ParseException parseException = new ParseException();
        try {
            parseException.add_escapes(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_SpecialConstructorFalse_WYax0() {
        ParseException parseException = new ParseException("message");
        parseException.specialConstructor = false;
        String message = parseException.getMessage();
    }
}