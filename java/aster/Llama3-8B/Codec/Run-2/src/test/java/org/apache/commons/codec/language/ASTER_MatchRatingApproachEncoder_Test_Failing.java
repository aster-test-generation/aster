/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MatchRatingApproachEncoder_Test_Failing {
@Test
@Timeout(value =5, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing3_rxUD2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "abcd";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(1, result);
    }
@Test
@Timeout(value =5, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing4_MSCw3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abcd";
        String name2 = "abc";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(1, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFirst3Last3ForNameWithMoreThan6Characters_aQNV0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.getFirst3Last3("abcdefg");
        assert result.equals("abcdef");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNameWithOnlyConsonants_Yplo8() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String result = encoder.encode("BB");
    assertEquals("BB", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowels_sfRl0_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeVowels("Hello World");
        assertEquals("Hll Wrld", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemoveDoubleConsonants1_gwlf0_fid1() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String result = encoder.removeDoubleConsonants("Hello World");
    Assertions.assertEquals("Helo Wrld", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemoveDoubleConsonants2_ZnoE1_fid1() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String result = encoder.removeDoubleConsonants("Aa");
    Assertions.assertEquals("A", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemoveDoubleConsonants3_Zqjk2_fid1() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String result = encoder.removeDoubleConsonants("Bbb");
    Assertions.assertEquals("B", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanNameWithSpecialChars_YShu1_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.cleanName("Jhn-Smi&th");
        Assertions.assertEquals("JOHNSMITH", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsSimpleAccent_SOZJ2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents("");
        Assertions.assertEquals("e", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsMultipleAccents_jGPq3_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents("");
        Assertions.assertEquals("eai", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing1_yCDd0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "abc";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing2_JTjl1_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "def";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(6, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing6_VCAK5_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abcd";
        String name2 = "abcd";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsEmptyNames_bBkB1_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("", "");
        Assertions.assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeValidName_LEJi4_fid1() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String result = encoder.encode("John");
    assertEquals("Jhn", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNameWithVowels_Apfe5() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String result = encoder.encode("Eve");
    assertEquals("V", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNameWithDoubleConsonants_CRrD6_fid1() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String result = encoder.encode("Hello");
    assertEquals("Hll", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNameWithVowelsAndDoubleConsonants_iOJI7() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String result = encoder.encode("Ava");
    assertEquals("V", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNameWithOnlyConsonants_Yplo8_fid1() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String result = encoder.encode("Bbb");
    assertEquals("Bbb", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeValidString_FAhu0_hHIt0() {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    String validString = "test";
    try {
        String result = (String) encoder.encode(validString);
        assertEquals("test", result);
    } catch (Exception e) {
        fail("Unexpected exception was thrown");
    }
}
}