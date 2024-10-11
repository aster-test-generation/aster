/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SoundexUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncodedNullInput_zYOL0() throws Exception {
        int result = SoundexUtils.differenceEncoded(null, "hello");
        Assertions.assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncodedEmptyInput_ZGXQ1() throws Exception {
        int result = SoundexUtils.differenceEncoded("", "hello");
        Assertions.assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncodedEqualStrings_rXAK2() throws Exception {
        int result = SoundexUtils.differenceEncoded("hello", "hello");
        Assertions.assertEquals(4, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncodedDifferentStrings_JoTw3() throws Exception {
        int result = SoundexUtils.differenceEncoded("hello", "world");
        Assertions.assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncodedShorterString_zPPN4() throws Exception {
        int result = SoundexUtils.differenceEncoded("hello", "hell");
        Assertions.assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyNull_DEOe0() throws Exception {
        assertTrue(SoundexUtils.isEmpty(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyEmptyString_sbPd1() throws Exception {
        assertTrue(SoundexUtils.isEmpty(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyNonEmptyString_WaFo2() throws Exception {
        assertFalse(SoundexUtils.isEmpty("Hello"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanEmptyString_krik0() throws Exception {
        assertEquals("", SoundexUtils.clean(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanOnlyNonLetters_jGyZ1() throws Exception {
        assertEquals("", SoundexUtils.clean("1234567890"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanOnlyLetters_Vghv2() throws Exception {
        assertEquals("HELLO".toUpperCase(), SoundexUtils.clean("hello"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanLettersAndNonLetters_DuuM3() throws Exception {
        assertEquals("HELLO".toUpperCase(), SoundexUtils.clean("hello123"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanLongString_LCUv4() throws Exception {
        assertEquals("JAMES".toUpperCase(), SoundexUtils.clean("jamesbond"));
    }
}