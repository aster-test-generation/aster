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
public class Aster_SoundexUtils_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyNull_Effw0() {
        boolean result = SoundexUtils.isEmpty(null);
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyEmptyString_uWgA1() {
        boolean result = SoundexUtils.isEmpty("");
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyNonEmptyString_jFkg2() {
        boolean result = SoundexUtils.isEmpty("Hello");
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullInput_yyze0_1() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, "test"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullInput_yyze0_2() {
        assertEquals(0, SoundexUtils.differenceEncoded("test", null));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullInput_yyze0_3() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, null));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyStrings_bDAw1_1() {
        assertEquals(0, SoundexUtils.differenceEncoded("", "test"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyStrings_bDAw1_2() {
        assertEquals(0, SoundexUtils.differenceEncoded("test", ""));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyStrings_bDAw1_3() {
        assertEquals(0, SoundexUtils.differenceEncoded("", ""));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShorterString_nuPh2_1() {
        assertEquals(3, SoundexUtils.differenceEncoded("abc", "abcd"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualStrings_iPIc3() {
        assertEquals(4, SoundexUtils.differenceEncoded("abcd", "abcd"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentStrings_fKEf4_1() {
        assertEquals(2, SoundexUtils.differenceEncoded("abc", "abd"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentStrings_fKEf4_2() {
        assertEquals(2, SoundexUtils.differenceEncoded("abc", "abe"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentStrings_fKEf4_3() {
        assertEquals(3, SoundexUtils.differenceEncoded("abcd", "abce"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLongerString_SXwF5_1() {
        assertEquals(4, SoundexUtils.differenceEncoded("abcd", "abcde"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLongerString_SXwF4_2() {
        assertEquals(4, SoundexUtils.differenceEncoded("abcde", "abcd"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSingleCharacter_DKhT6_1() {
        assertEquals(1, SoundexUtils.differenceEncoded("a", "a"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSingleCharacter_DKhT6_2() {
        assertEquals(0, SoundexUtils.differenceEncoded("a", "b"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTwoCharacter_jgdi7_1() {
        assertEquals(2, SoundexUtils.differenceEncoded("ab", "ab"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTwoCharacter_jgdi7_2() {
        assertEquals(1, SoundexUtils.differenceEncoded("ab", "ac"));}
}