/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TokenMgrError_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalErrorWithEOF_meCk0() {
        boolean EOFSeen = true;
        int lexState = 0;
        int errorLine = 1;
        int errorColumn = 5;
        String errorAfter = "some text";
        char curChar = 'a';
        String result = TokenMgrError.LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar);
        assertEquals("Lexical error at line 1, column 5.  Encountered: <EOF> after : \"some text\"", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalErrorWithCharacter_RhRx1() {
        boolean EOFSeen = false;
        int lexState = 0;
        int errorLine = 2;
        int errorColumn = 10;
        String errorAfter = "example";
        char curChar = 'b';
        String result = TokenMgrError.LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar);
        assertEquals("Lexical error at line 2, column 10.  Encountered: \"b\" (98), after : \"example\"", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalErrorWithSpecialCharacter_ufIT2() {
        boolean EOFSeen = false;
        int lexState = 0;
        int errorLine = 3;
        int errorColumn = 15;
        String errorAfter = "text with newline\n";
        char curChar = '\n';
        String result = TokenMgrError.LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar);
        assertEquals("Lexical error at line 3, column 15.  Encountered: \"\\n\" (10), after : \"text with newline\\n\"", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesNullCharacter_BgYh0() {
        assertEquals("", TokenMgrError.addEscapes("\u0000"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesBackspace_Ecbx1() {
        assertEquals("\\b", TokenMgrError.addEscapes("\b"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesTab_Ykps2() {
        assertEquals("\\t", TokenMgrError.addEscapes("\t"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesNewline_LDko3() {
        assertEquals("\\n", TokenMgrError.addEscapes("\n"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesFormFeed_CEfU4() {
        assertEquals("\\f", TokenMgrError.addEscapes("\f"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesCarriageReturn_Pziw5() {
        assertEquals("\\r", TokenMgrError.addEscapes("\r"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesDoubleQuote_GeLA6() {
        assertEquals("\\\"", TokenMgrError.addEscapes("\""));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesSingleQuote_tnjv7() {
        assertEquals("\\\'", TokenMgrError.addEscapes("\'"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesBackslash_klaD8() {
        assertEquals("\\\\", TokenMgrError.addEscapes("\\"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesNonPrintableCharacter_Cvro9() {
        assertEquals("\\u0001", TokenMgrError.addEscapes("\u0001"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesAsciiCharacter_AFEo10() {
        assertEquals("a", TokenMgrError.addEscapes("a"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesEmptyString_GIWV11() {
        assertEquals("", TokenMgrError.addEscapes(""));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesStringWithMultipleCharacters_YCVw12() {
        assertEquals("Hello\\nWorld\\t!", TokenMgrError.addEscapes("Hello\nWorld\t!"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesStringWithSpecialCharacters_nLbN13() {
        assertEquals("\\t\\n\\r\\f\\b\\\"\\\'\\\\", TokenMgrError.addEscapes("\t\n\r\f\b\"\'\\"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesStringWithMixedCharacters_yvWG14() {
        assertEquals("Test\\u001fString\\u007fEnd", TokenMgrError.addEscapes("Test\u001fString\u007fEnd"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesHighUnicodeCharacter_WaDu15() {
        assertEquals("\\u20ac", TokenMgrError.addEscapes("\u20ac")); // Euro sign
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesMultipleNonPrintableCharacters_Xcpw16() {
        assertEquals("\\u0001\\u0002\\u0003", TokenMgrError.addEscapes("\u0001\u0002\u0003"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesCombinationOfAllHandledTypes_HbQK17() {
        assertEquals("\\b\\t\\n\\f\\r\\\"\\\'\\\\a\\u007f", TokenMgrError.addEscapes("\b\t\n\f\r\"\'\\a\u007f"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithSurrogatePair_XVfR18() {
        assertEquals("", TokenMgrError.addEscapes("")); // U+10437 DESERET CAPITAL LETTER OI
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithAllEscapeSequences_oyYa19() {
        assertEquals("\\b\\t\\n\\f\\r\\\"\\\'\\\\", TokenMgrError.addEscapes("\b\t\n\f\r\"\'\\"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithExtendedAscii_cbce20() {
        assertEquals("\\u0080\\u00ff", TokenMgrError.addEscapes("\u0080\u00ff"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithAsciiAndExtended_rdJV21() {
        assertEquals("A\\u0080B\\u00ffC", TokenMgrError.addEscapes("A\u0080B\u00ffC"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithAllControlCharacters_jBcT23() {
        StringBuilder input = new StringBuilder();
        StringBuilder expected = new StringBuilder();
        for (char c = 0; c < 0x20; c++) {
            input.append(c);
            expected.append(String.format("\\u%04x", (int) c));
        }
        assertEquals(expected.toString(), TokenMgrError.addEscapes(input.toString()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithAllPrintableAscii_mVFv24() {
        StringBuilder input = new StringBuilder();
        for (char c = 0x20; c < 0x7f; c++) {
            input.append(c);
        }
        assertEquals(input.toString(), TokenMgrError.addEscapes(input.toString()));
    }
}