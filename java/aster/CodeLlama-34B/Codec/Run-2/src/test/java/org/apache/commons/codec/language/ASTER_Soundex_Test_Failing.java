/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Soundex_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_singleCharacter_FDqK2() {
        Soundex soundex = new Soundex();
        assertEquals("0000", soundex.soundex("A"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_multipleCharacters_NzwX3() {
        Soundex soundex = new Soundex();
        assertEquals("0000", soundex.soundex("ABCD"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_silentMarker_ZdqN5() {
        Soundex soundex = new Soundex();
        assertEquals("0000", soundex.soundex("SILENT"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_differentCases_kEhu6() {
        Soundex soundex = new Soundex();
        assertEquals("0000", soundex.soundex("AbCd"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_SameStrings_RHPe1() throws EncoderException {
        Soundex soundex = new Soundex();
        assertEquals(0, soundex.difference("abc", "abc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_DifferentStrings_Yadj2() throws EncoderException {
        Soundex soundex = new Soundex();
        assertEquals(1, soundex.difference("abc", "def"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_SpecialCaseHW_qdmg3() throws EncoderException {
        Soundex soundex = new Soundex(new char[]{'h', 'w'});
        assertEquals(1, soundex.difference("hw", "hw"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLength_invalid_RbHN3() {
        Soundex soundex = new Soundex();
        try {
            soundex.setMaxLength(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Max length must be positive", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_1() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("H400", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_2() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("W600", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_3() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("T200", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_4() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_5() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("?", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_6() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("A120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_7() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("D120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_8() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("G120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_9() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("J120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_10() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("M120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_11() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("P120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_12() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("S120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_13() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("V120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1_14() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        result = soundex.encode("World");
        result = soundex.encode("Test");
        result = soundex.encode("!");
        result = soundex.encode("?");
        result = soundex.encode("abc");
        result = soundex.encode("def");
        result = soundex.encode("ghi");
        result = soundex.encode("jkl");
        result = soundex.encode("mno");
        result = soundex.encode("pqr");
        result = soundex.encode("stu");
        result = soundex.encode("vwx");
        result = soundex.encode("yz");
        result = soundex.encode("");
        result = soundex.encode(" ");
        result = soundex.encode("  ");
        result = soundex.encode("   ");
        result = soundex.encode("    ");
        result = soundex.encode("     ");
        result = soundex.encode("      ");
        result = soundex.encode("       ");
        result = soundex.encode("        ");
        result = soundex.encode("         ");
        result = soundex.encode("          ");
        result = soundex.encode("           ");
        result = soundex.encode("            ");
        result = soundex.encode("             ");
        result = soundex.encode("              ");
        result = soundex.encode("               ");
        result = soundex.encode("                ");
        result = soundex.encode("                 ");
        result = soundex.encode("                  ");
        result = soundex.encode("                   ");
        assertEquals("Y120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_specialCaseHW_GLZk4_VtaO0() {
        Soundex soundex = new Soundex("HW", true);
        assertEquals("0000", soundex.soundex("HW"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_specialCaseHW_GLZk4_AFXA1() {
        Soundex soundex = new Soundex(new String(new char[]{'H', 'W'}), true);
        assertEquals("0000", soundex.soundex("HW"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_SpecialCaseHW_qdmg3_fid1() throws EncoderException {
        Soundex soundex = new Soundex(new char[]{'h', 'w'});
        assertEquals(0, soundex.difference("hw", "hw"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bICt1() {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Hello");
        assertEquals("H400", result);
        result = soundex.encode("World");
        assertEquals("W600", result);
        result = soundex.encode("Test");
        assertEquals("T200", result);
        result = soundex.encode("!");
        assertEquals("!", result);
        result = soundex.encode("?");
        assertEquals("?", result);
        result = soundex.encode("abc");
        assertEquals("A120", result);
        result = soundex.encode("def");
        assertEquals("D120", result);
        result = soundex.encode("ghi");
        assertEquals("G120", result);
        result = soundex.encode("jkl");
        assertEquals("J120", result);
        result = soundex.encode("mno");
        assertEquals("M120", result);
        result = soundex.encode("pqr");
        assertEquals("P120", result);
        result = soundex.encode("stu");
        assertEquals("S120", result);
        result = soundex.encode("vwx");
        assertEquals("V120", result);
        result = soundex.encode("yz");
        assertEquals("Y120", result);
        result = soundex.encode("");
        assertEquals("", result);
        result = soundex.encode(" ");
        assertEquals("", result);
        result = soundex.encode("  ");
        assertEquals("", result);
        result = soundex.encode("   ");
        assertEquals("", result);
        result = soundex.encode("    ");
        assertEquals("", result);
        result = soundex.encode("     ");
        assertEquals("", result);
        result = soundex.encode("      ");
        assertEquals("", result);
        result = soundex.encode("       ");
        assertEquals("", result);
        result = soundex.encode("        ");
        assertEquals("", result);
        result = soundex.encode("         ");
        assertEquals("", result);
        result = soundex.encode("          ");
        assertEquals("", result);
        result = soundex.encode("           ");
        assertEquals("", result);
        result = soundex.encode("            ");
        assertEquals("", result);
        result = soundex.encode("             ");
        assertEquals("", result);
        result = soundex.encode("              ");
        assertEquals("", result);
        result = soundex.encode("               ");
        assertEquals("", result);
        result = soundex.encode("                ");
        assertEquals("", result);
        result = soundex.encode("                 ");
        assertEquals("", result);
        result = soundex.encode("                  ");
        assertEquals("", result);
        result = soundex.encode("                   ");
        assertEquals("", result);
    }
}