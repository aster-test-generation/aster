/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Nysiis_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_String_dPog0() throws Exception {
    Nysiis nysiis = new Nysiis();
    String input = "hello";
    String expected = "HAL";
    String actual = nysiis.encode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStrict_strict_GrqJ0() throws Exception {
    Nysiis nysiis = new Nysiis(true);
    assertTrue(nysiis.isStrict());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStrict_notStrict_JKbx1() throws Exception {
    Nysiis nysiis = new Nysiis(false);
    assertFalse(nysiis.isStrict());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStrict_strictAndNotStrict_ORhb2_1() throws Exception {
    Nysiis nysiis = new Nysiis(true);
    nysiis = new Nysiis(false);
    assertTrue(nysiis.isStrict());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStrict_strictAndNotStrict_ORhb2_2() throws Exception {
    Nysiis nysiis = new Nysiis(true);
    nysiis = new Nysiis(false);
    assertFalse(nysiis.isStrict());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_EmptyString_vbtl0() throws Exception {
    Nysiis nysiis = new Nysiis();
    String result = nysiis.encode("");
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_NullString_MpfF1() throws Exception {
    Nysiis nysiis = new Nysiis();
    String result = nysiis.encode(null);
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_SingleCharacter_qtbB2() throws Exception {
    Nysiis nysiis = new Nysiis();
    String result = nysiis.encode("a");
    assertEquals("A", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_MultipleCharacters_YfHc3() throws Exception {
    Nysiis nysiis = new Nysiis();
    String result = nysiis.encode("abc");
    assertEquals("ABC", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_Uppercase_LmZp4() throws Exception {
    Nysiis nysiis = new Nysiis();
    String result = nysiis.encode("ABC");
    assertEquals("ABC", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_MixedCase_pVOH6() throws Exception {
    Nysiis nysiis = new Nysiis();
    String result = nysiis.encode("aBc");
    assertEquals("ABC", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_SpecialCharacters_IPQe7() throws Exception {
    Nysiis nysiis = new Nysiis();
    String result = nysiis.encode("a$b%c");
    assertEquals("ABC", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_StrictMode_TgHW9() throws Exception {
    Nysiis nysiis = new Nysiis(true);
    String result = nysiis.encode("a b c");
    assertEquals("ABC", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_null_LMBw0() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertNull(nysiis.nysiis(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_empty_djyO1() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("", nysiis.nysiis(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_strict_SebO2() throws Exception {
    Nysiis nysiis = new Nysiis(true);
    assertEquals("", nysiis.nysiis(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_nonStrict_WjnC3() throws Exception {
    Nysiis nysiis = new Nysiis(false);
    assertEquals("", nysiis.nysiis(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_singleChar_xHcp4() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("A", nysiis.nysiis("A"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_twoChars_RJrI5() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("AB", nysiis.nysiis("AB"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_threeChars_vjCf6() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABC", nysiis.nysiis("ABC"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_fourChars_XyUM7() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCD", nysiis.nysiis("ABCD"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_fiveChars_wROi8() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCDE", nysiis.nysiis("ABCDE"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_sixChars_Oxcj9() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCDEF", nysiis.nysiis("ABCDEF"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_sevenChars_YQKU10() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCDEFG", nysiis.nysiis("ABCDEFG"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_eightChars_AbCh11() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCDEFGH", nysiis.nysiis("ABCDEFGH"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_nineChars_PCkx12() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCDEFGHI", nysiis.nysiis("ABCDEFGHI"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_tenChars_qmOr13() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCDEFGHIJ", nysiis.nysiis("ABCDEFGHIJ"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_NonVowelInput_ABRP4() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("C", nysiis.nysiis("C"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_VowelInput_JKwH5() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("A", nysiis.nysiis("E"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_SpecialCharacterInput_KWRJ6() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("", nysiis.nysiis("$"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_MultipleWordsWithSpecialCharactersInput_cmch8() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCD", nysiis.nysiis("AB$CD"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_MultipleWordsWithNumbersInput_ztph9() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCD", nysiis.nysiis("AB12CD"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_MultipleWordsWithSpecialCharactersAndNumbersInput_nsgI10() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCD", nysiis.nysiis("AB$12CD"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNysiis_MultipleWordsWithSpecialCharactersAndNumbersAndVowelsInput_COJh11() throws Exception {
    Nysiis nysiis = new Nysiis();
    assertEquals("ABCD", nysiis.nysiis("AB$12ECD"));
}
}