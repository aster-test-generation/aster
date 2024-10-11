/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Metaphone_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone_krKE0_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Hello";
        String expected = "HLL";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_Lxll1_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "World";
        String expected = "WRLD";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_MiwA2_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Programming";
        String expected = "PRGMNG";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone4_CjIg3_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Java";
        String expected = "JVA";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone5_QnVu4_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Python";
        String expected = "PTN";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxCodeLen_rAFX0_fid2() {
        Metaphone metaphone = new Metaphone();
        int actualMaxCodeLen = metaphone.getMaxCodeLen();
        int expectedMaxCodeLen = 0; // Replace with the expected value
        assertEquals(expectedMaxCodeLen, actualMaxCodeLen);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpecialCharacter_WLBi1_fid2() {
        Metaphone metaphone = new Metaphone();
        String input = "Hello!";
        String expectedOutput = "HL!";
        String actualOutput = metaphone.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }
}