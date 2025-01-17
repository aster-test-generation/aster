/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MatchRatingApproachEncoder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanName_rmyh0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "John-Doe";
        String expected = "JOHNDOE";
        assertEquals(expected, encoder.cleanName(name));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanNameWithAccents_RgsS1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "Jos";
        String expected = "JOS";
        assertEquals(expected, encoder.cleanName(name));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants_tlLl0_1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("AARON", encoder.removeDoubleConsonants("AARON"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants_tlLl0_2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("ABRAHAM", encoder.removeDoubleConsonants("ABRAHAM"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants_tlLl0_3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("ABRAM", encoder.removeDoubleConsonants("ABRAM"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonantsWithEmptyName_WrBy2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.removeDoubleConsonants(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidInput_GUTg0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedString = encoder.encode("validInput");
        assertNotNull(encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidInput_Rkkd1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        try {
            encoder.encode(123);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowels_CDFt0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "John";
        String expected = "John";
        assertEquals(expected, encoder.removeVowels(name));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowelsWithVowels_ildx1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "Johnny";
        String expected = "Johnny";
        assertEquals(expected, encoder.removeVowels(name));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowelsWithFirstLetterAsVowel_srhv3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "Anna";
        String expected = "Anna";
        assertEquals(expected, encoder.removeVowels(name));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFirst3Last3_returnsFirst3AndLast3CharactersOfName_whenNameLengthIsGreaterThan6_Remq0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "JohnDoe";
        String expected = "JohDoe";
        String actual = encoder.getFirst3Last3(name);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelTrue_TaKB0_1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertTrue(encoder.isVowel("E"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelTrue_TaKB0_2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertTrue(encoder.isVowel("A"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelTrue_TaKB0_3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertTrue(encoder.isVowel("O"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelTrue_TaKB0_4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertTrue(encoder.isVowel("I"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelTrue_TaKB0_5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertTrue(encoder.isVowel("U"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelFalse_CRDg1_1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isVowel("B"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelFalse_CRDg1_2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isVowel("C"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelFalse_CRDg1_3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isVowel("D"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelFalse_CRDg1_4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isVowel("F"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelFalse_CRDg1_5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isVowel("G"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsVowelEmpty_gfqf3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isVowel(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing1_DozZ6() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int result = encoder.leftToRightThenRightToLeftProcessing("test", "test");
        Assertions.assertEquals(6, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing3_zAPC4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int result = encoder.leftToRightThenRightToLeftProcessing("test", "test14");
        Assertions.assertEquals(4, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing4_qHCW3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int result = encoder.leftToRightThenRightToLeftProcessing("test", "test123");
        Assertions.assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing5_CdPr2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int result = encoder.leftToRightThenRightToLeftProcessing("test", "test1232");
        Assertions.assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing6_dzQj1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int result = encoder.leftToRightThenRightToLeftProcessing("test", "test12341");
        Assertions.assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIs4_return5_dayL0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(4);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIs7_return4_iVtj1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(7);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIs11_return3_CHrH2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(11);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIs12_return2_UJZY3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(12);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIsMoreThan12_return1_tPsS4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(13);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIsZero_return5_VtLD5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(0);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIsNegative_return5_TYVr6() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(-1);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullName_wYQY0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode(null);
        assertEquals("", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyName_MvJw1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("");
        assertEquals("", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSingleLetterName_Xotj2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("A");
        assertEquals("", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCleanedName_zqDL3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("John");
        assertEquals("JHN", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccents_1_FjTC0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String input = "";
        String expected = "";
        assertEquals(expected, encoder.removeAccents(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_001_LVDd0() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals("a", "a");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_002_sNFP1() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals("a", "b");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_003_FATp2() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals("a", "A");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_004_SaZV3() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals("a", " ");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_005_jmwY4() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals("a", null);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_006_kgAY5() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals(" ", "a");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_007_SZuB6() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals(" ", " ");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_008_HWxU7() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals(" ", null);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_009_ZfAl8() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals(null, "a");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isEncodeEquals_010_pfSB9() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        boolean actual = m.isEncodeEquals(null, null);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}