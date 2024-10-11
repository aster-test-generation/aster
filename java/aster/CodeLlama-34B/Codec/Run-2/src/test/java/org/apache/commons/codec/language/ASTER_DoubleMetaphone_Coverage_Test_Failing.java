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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DoubleMetaphone_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_YGVj1_fid2() throws org.apache.commons.codec.EncoderException {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "hello";
        String expectedOutput = "hll";
        String actualOutput = (String) doubleMetaphone.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH2_buBr2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "CHAE";
        boolean alternate = false;
        String expected = "K";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH3_rhNn3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "CHOR";
        boolean alternate = false;
        String expected = "K";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH4_VtBe4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "CHYM";
        boolean alternate = false;
        String expected = "K";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_CKlt4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "UMB";
        boolean alternate = true;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("M", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_MoqA5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "UMBER";
        boolean alternate = true;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("M", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCZ_ZFxF0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("CZ", true);
        assertEquals("S", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithWITZ_DdFw1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("WITZ", true);
        assertEquals("TS", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH1_1_noCm0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "VAN ";
        boolean alternate = false;
        String expected = "F";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH1_3_BlVG2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "ORCHES";
        boolean alternate = false;
        String expected = "K";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH1_5_lGCY4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "A";
        boolean alternate = false;
        String expected = "F";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH1_6_MJUk5_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "O";
        boolean alternate = false;
        String expected = "F";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH1_7_bflt6_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "U";
        boolean alternate = false;
        String expected = "F";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH1_8_xXsG7_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "E";
        boolean alternate = false;
        String expected = "F";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_GYLT2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String result = doubleMetaphone.doubleMetaphone("hello", true);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithAlternate_aGVB3_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String result = doubleMetaphone.doubleMetaphone("hello", false);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testT1_DFli0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "TION";
        boolean alternate = false;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("X", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVAN_lciG3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "VAN";
        boolean alternate = false;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("F", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVON_xozl4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "VON";
        boolean alternate = false;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("F", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSCH_wcAB5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "SCH";
        boolean alternate = false;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("S", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_conditionC0_NZOu0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CAESAR";
        boolean alternate = false;
        String expected = "S";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_appendSX_fdWt3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CZ";
        boolean alternate = false;
        String expected = "SX";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_appendX_xuGQ4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CIA";
        boolean alternate = false;
        String expected = "X";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_appendKS_UFHc7() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CK";
        boolean alternate = false;
        String expected = "KS";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_deau5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "value";
        boolean alternate = true;
        String expected = "R";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_Michael_jZfI0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Michael";
        boolean alternate = false;
        String expected = "MXL";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_X_SNez2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "X";
        boolean alternate = false;
        String expected = "X";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_CH_ypXx4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CH";
        boolean alternate = false;
        String expected = "X";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_CHAE_GKdA5_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CHAE";
        boolean alternate = false;
        String expected = "KX";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone1_SCPf0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Michael";
        String expected = "MXL";
        String actual = dm.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_wUlU1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "McMichael";
        String expected = "MXL";
        String actual = dm.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_BzTB2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "McMichael";
        String expected = "MKL";
        String actual = dm.doubleMetaphone(input, true);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone5_YVLN4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Chae";
        String expected = "KX";
        String actual = dm.doubleMetaphone(input, true);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone7_dByw6_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Ch";
        String expected = "X";
        String actual = dm.doubleMetaphone(input, true);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_ndiI7_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "DT";
        boolean alternate = true;
        String expected = "TK";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_avIq8_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "DD";
        boolean alternate = true;
        String expected = "TK";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC1_jGxk0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schlesinger";
        boolean alternate = false;
        String expected = "XL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC2_NbXE1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schneider";
        boolean alternate = false;
        String expected = "SN";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC6_JwqF5_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schwarz";
        boolean alternate = false;
        String expected = "SRTS";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC7_xLFz6_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Sch";
        boolean alternate = false;
        String expected = "SK";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC11_cHdB10_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Sch";
        boolean alternate = true;
        String expected = "SK";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }
}