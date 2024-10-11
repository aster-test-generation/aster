/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DoubleMetaphone_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithConditionAL0_YALUr0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "IALALO";
        boolean alternate = false;
        String expected = "AL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithConditionL0_YLUr0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "ILLO";
        boolean alternate = false;
        String expected = "L";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithAppendPrimaryL_Wmji1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "ALLE";
        boolean alternate = true;
        String expected = "L";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH0_GAfS0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CHORE";
        boolean alternate = false;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH2_xeCJ2_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CHAE";
        boolean alternate = false;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH3_AlyO3_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CHOR";
        boolean alternate = false;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH4_QguR4_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CHYM";
        boolean alternate = false;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_2_sABn4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "M";
        boolean alternate = true;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_3_lkXR5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "UMB";
        boolean alternate = false;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("M", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_4_AMgo6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "UMB";
        boolean alternate = true;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("M", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_5_fyKR7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "UMBER";
        boolean alternate = false;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("M", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_6_QbSa8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "UMBER";
        boolean alternate = true;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("M", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("P", dm.doubleMetaphone("B", false));
        assertEquals("S", dm.doubleMetaphone("\u00C7", false));
        assertEquals("K", dm.doubleMetaphone("G", false));
        assertEquals("K", dm.doubleMetaphone("K", false));
        assertEquals("N", dm.doubleMetaphone("N", false));
        assertEquals("N", dm.doubleMetaphone("\u00D1", false));
        assertEquals("F", dm.doubleMetaphone("P", false));
        assertEquals("K", dm.doubleMetaphone("Q", false));
        assertEquals("S", dm.doubleMetaphone("S", false));
        assertEquals("F", dm.doubleMetaphone("V", false));
        assertEquals("F", dm.doubleMetaphone("W", false));
        assertEquals("K", dm.doubleMetaphone("X", false));
        assertEquals("S", dm.doubleMetaphone("Z", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_AqiG4_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "example";
        boolean alternate = true;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("KS", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_SenK7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "ACH";
        boolean alternate = false;
        String expected = "K";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_hhgn8_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "BACHER";
        boolean alternate = false;
        String expected = "K";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone4_Pylq9_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "MACHER";
        boolean alternate = false;
        String expected = "K";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone1_RLcy0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "VAN HORN";
        boolean alternate = true;
        String expected = "VNHR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_ESwr1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "SCHOENBERG";
        boolean alternate = true;
        String expected = "XNKRK";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_xAHQ2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "ORCHESTRATE";
        boolean alternate = true;
        String expected = "ARKTRT";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone4_MZms3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "TORRES";
        boolean alternate = true;
        String expected = "TRRS";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone8_yLiA7_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "WESTERLUND";
        boolean alternate = true;
        String expected = "WSTRLNT";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone9_ylRz8_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "WACHTER";
        boolean alternate = true;
        String expected = "AKTR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone10_PlFS9_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "HOLT";
        boolean alternate = true;
        String expected = "HL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone11_cVEF10_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "MERCEDES";
        boolean alternate = true;
        String expected = "MRXDS";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_Michael_UWih0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Michael";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_KX_ljXQ1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Chae";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("KX", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_K_MC_kbGg5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Mc";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_XK_MC_LIXl6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Mc";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("XK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_XK_notMC_dBUW8() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Ch";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("XK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_K_empty_yaix9_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_XK_empty_HbhM10_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("XK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone1_Aghp0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Michael";
        boolean alternate = true;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("KL", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_QgwN1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Chae";
        boolean alternate = true;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_bnHg2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Chae";
        boolean alternate = false;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_GaMh1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McMichael";
        boolean alternate = true;
        String expected = "MXL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_WLfv2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "MacMichael";
        boolean alternate = true;
        String expected = "MXL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone4_aRvw3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClelland";
        boolean alternate = true;
        String expected = "MXL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone5_xFpC4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClellan";
        boolean alternate = true;
        String expected = "MXL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone6_Bgdk5_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClellen";
        boolean alternate = true;
        String expected = "MXL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone7_Wafb6_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClelland";
        boolean alternate = false;
        String expected = "MXL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone8_ESlx7_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClellan";
        boolean alternate = false;
        String expected = "MXL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone9_jIHF8_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClellen";
        boolean alternate = false;
        String expected = "MXL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_URhq0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schlesinger";
        boolean alternate = false;
        String expected = "XL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC2_MQSX1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schneider";
        boolean alternate = false;
        String expected = "SN";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC4_mOIa3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schnauzer";
        boolean alternate = false;
        String expected = "SNRS";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC5_jvcc4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schnapp";
        boolean alternate = false;
        String expected = "SNP";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC6_qugN5_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schmidt";
        boolean alternate = false;
        String expected = "SMT";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC7_aSvM6_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schneider";
        boolean alternate = true;
        String expected = "SN";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC9_cuaY8_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schnauzer";
        boolean alternate = true;
        String expected = "SNRS";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_7_fid3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("F", dm.doubleMetaphone("P", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_11_fid3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("F", dm.doubleMetaphone("W", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_12_fid3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("K", dm.doubleMetaphone("X", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConditionM0_3_GcdV2_lDcw0_fid3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "UMB";
        int index = 1;
        String result = dm.encode(value);
        assertTrue(result.equals("UMB"));
    }
}