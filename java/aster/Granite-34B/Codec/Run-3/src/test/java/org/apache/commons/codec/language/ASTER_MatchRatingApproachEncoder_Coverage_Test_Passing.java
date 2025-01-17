/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MatchRatingApproachEncoder_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testRemoveVowels_FirstLetterIsVowel_ZfiA0() {
		MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
		String name = "Abby";
		String expected = "Aby";
		String actual = encoder.removeVowels(name);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testRemoveVowels_FirstLetterIsConsonant_uODD1() {
		MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
		String name = "John";
		String expected = "Jn";
		String actual = encoder.removeVowels(name);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWhenParamIsNotOfTypeString_yYcj0() throws EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        Object pObject = new Object();
        encoder.encode(pObject);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWhenParamIsOfTypeString_nqfb1() throws EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String pObject = "test";
        encoder.encode(pObject);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccents_accentedWordWithAccents_returnsPlainASCII_bIvo0() {
        MatchRatingApproachEncoder matchRatingApproachEncoder = new MatchRatingApproachEncoder();
        String accentedWord = "dj vu";
        String expected = "deja vu";
        String actual = matchRatingApproachEncoder.removeAccents(accentedWord);
        assert actual.equals(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccents_accentedWordWithNoAccents_returnsSameString_Qpoz1() {
        MatchRatingApproachEncoder matchRatingApproachEncoder = new MatchRatingApproachEncoder();
        String accentedWord = "dja vu";
        String expected = "dja vu";
        String actual = matchRatingApproachEncoder.removeAccents(accentedWord);
        assert actual.equals(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_null_lRMo0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_empty_rsxZ1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode(""));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_oneLetter_msfN3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("A"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_invalidInput_VPCl4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("Invalid Input"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_null_null_JLoF0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean actual = encoder.isEncodeEquals(null, null);
        assertFalse(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_empty_empty_QJnW1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean actual = encoder.isEncodeEquals("", "");
        assertFalse(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_null_empty_lDyv3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean actual = encoder.isEncodeEquals(null, "");
        assertFalse(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_space_null_mMIs5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean actual = encoder.isEncodeEquals(" ", null);
        assertFalse(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_null_name_hJMN6() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean actual = encoder.isEncodeEquals(null, "name");
        assertFalse(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_name_null_pDtr7() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean actual = encoder.isEncodeEquals("name", null);
        assertFalse(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_name_name_obqm8() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean actual = encoder.isEncodeEquals("name", "name");
        assertTrue(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_cleanName_cySj9_1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "name1";
        String name2 = "name2";
        String actual1 = encoder.cleanName(name1);
        String actual2 = encoder.cleanName(name2);
        assertEquals(name1, actual1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_cleanName_cySj9_2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "name1";
        String name2 = "name2";
        String actual1 = encoder.cleanName(name1);
        String actual2 = encoder.cleanName(name2);
        assertEquals(name2, actual2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_removeVowels_yrbJ10_1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "name1";
        String name2 = "name2";
        String actual1 = encoder.removeVowels(name1);
        String actual2 = encoder.removeVowels(name2);
        assertEquals(name1, actual1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_removeVowels_yrbJ10_2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "name1";
        String name2 = "name2";
        String actual1 = encoder.removeVowels(name1);
        String actual2 = encoder.removeVowels(name2);
        assertEquals(name2, actual2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_removeDoubleConsonants_Ktkg11_1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "name1";
        String name2 = "name2";
        String actual1 = encoder.removeDoubleConsonants(name1);
        String actual2 = encoder.removeDoubleConsonants(name2);
        assertEquals(name1, actual1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_removeDoubleConsonants_Ktkg11_2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "name1";
        String name2 = "name2";
        String actual1 = encoder.removeDoubleConsonants(name1);
        String actual2 = encoder.removeDoubleConsonants(name2);
        assertEquals(name2, actual2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_getFirst3Last3_DBXI12_1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "name1";
        String name2 = "name2";
        String actual1 = encoder.getFirst3Last3(name1);
        String actual2 = encoder.getFirst3Last3(name2);
        assertEquals(name1, actual1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_getFirst3Last3_DBXI12_2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "name1";
        String name2 = "name2";
        String actual1 = encoder.getFirst3Last3(name1);
        String actual2 = encoder.getFirst3Last3(name2);
        assertEquals(name2, actual2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_lengthCheck_UgLi13() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "name1";
        String name2 = "name2";
        boolean actual = encoder.isEncodeEquals(name1, name2);
        assertFalse(actual);
    }
}