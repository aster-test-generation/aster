/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Soundex_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_cQCM0() {
        Soundex soundex = new Soundex();
        Object result = soundex.encode("Smith");
        assertEquals("S530", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLength_sLbM0() {
        Soundex soundex = new Soundex();
        int maxLength = soundex.getMaxLength();
        assert maxLength == 4;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithMapping_XVkV1() {
        Soundex soundex = new Soundex("mapping");
        int maxLength = soundex.getMaxLength();
        assert maxLength == 4;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithSpecialCaseHW_yVwy2() {
        Soundex soundex = new Soundex("mapping", true);
        int maxLength = soundex.getMaxLength();
        assert maxLength == 4;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithCharArrayMapping_MRLN3() {
        Soundex soundex = new Soundex(new char[] {'m', 'a', 'p', 'p', 'i', 'n', 'g'});
        int maxLength = soundex.getMaxLength();
        assert maxLength == 4;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLength_kiZk0() {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLengthWithMapping_lHMT1() {
        Soundex soundex = new Soundex("mapping");
        soundex.setMaxLength(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLengthWithSpecialCaseHW_ESiM2() {
        Soundex soundex = new Soundex("mapping", true);
        soundex.setMaxLength(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLengthWithCharArray_AGJg3() {
        char[] mapping = {'a', 'b', 'c'};
        Soundex soundex = new Soundex(mapping);
        soundex.setMaxLength(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSoundexNullInput_ZfZD0() {
    Soundex soundex = new Soundex();
    String result = soundex.soundex(null);
    assertEquals(null, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSoundexEmptyInput_lXsG1() {
    Soundex soundex = new Soundex();
    String result = soundex.soundex("");
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSoundexSingleCharacterInput_YACs2() {
    Soundex soundex = new Soundex();
    String result = soundex.soundex("A");
    assertEquals("A000", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSoundexMultiCharacterInput_usfQ3_fid1() {
    Soundex soundex = new Soundex();
    String result = soundex.soundex("Smith");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSoundexMapIndexOutOfRange_iNMQ7_JzfQ0_fid1() {
    Soundex soundex = new Soundex("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    String result = soundex.soundex("test");
    assertEquals("TEST", result);
}
}