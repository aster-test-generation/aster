/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DoubleMetaphone_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_ZtdK0() throws org.apache.commons.codec.EncoderException {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertThrows(EncoderException.class, () -> dm.encode(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_LFtX1() throws org.apache.commons.codec.EncoderException {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "hello";
        String expectedOutput = "HL";
        assertEquals(expectedOutput, dm.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithAppendPrimaryA_Wmji1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "AAAE";
        boolean alternate = true;
        String expected = "A";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_xdmg5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "CHIA";
        boolean alternate = false;
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals("K", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH0_GAfS0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CHORE";
        boolean alternate = false;
        String expected = "XR";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH1_Gkde1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CH";
        boolean alternate = false;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH2_xeCJ2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CHAE";
        boolean alternate = false;
        String expected = "X";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH3_AlyO3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CHOR";
        boolean alternate = false;
        String expected = "KR";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH4_QguR4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CHYM";
        boolean alternate = false;
        String expected = "KM";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_1_qZtV3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "M";
        boolean alternate = false;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("M", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_D_EyWa2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "DGE";
        boolean alternate = false;
        String expected = "J";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_D_Other_MhIJ3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "DG";
        boolean alternate = false;
        String expected = "TK";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_D_Alternate_JXnX4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "DGE";
        boolean alternate = true;
        String expected = "J";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_D_Other_Alternate_IJdZ5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "DG";
        boolean alternate = true;
        String expected = "TK";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("P", dm.doubleMetaphone("B", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("\u00C7", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("K", dm.doubleMetaphone("G", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("K", dm.doubleMetaphone("K", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("N", dm.doubleMetaphone("N", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("N", dm.doubleMetaphone("\u00D1", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("P", dm.doubleMetaphone("P", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("K", dm.doubleMetaphone("Q", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_9() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("S", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_10() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("F", dm.doubleMetaphone("V", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_11() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("", dm.doubleMetaphone("W", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_12() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("X", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HxGR1_13() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("Z", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_AqiG4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "example";
        boolean alternate = true;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("AKSM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone1_TERm6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "CHIA";
        boolean alternate = false;
        String expected = "K";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_SenAK7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "ACH";
        boolean alternate = false;
        String expected = "AK";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_hhgn8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "BACHER";
        boolean alternate = false;
        String expected = "PKR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone4_Pylq9() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "MACHER";
        boolean alternate = false;
        String expected = "MKR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone1_RLcy0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "VAN HORN";
        boolean alternate = true;
        String expected = "FNRN";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_ESwr1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "SCHOENBERG";
        boolean alternate = true;
        String expected = "XNPR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_xAHQ2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "ORCHESTRATE";
        boolean alternate = true;
        String expected = "ARKS";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone4_MZms3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "TORRES";
        boolean alternate = true;
        String expected = "TRS";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone5_gKrz4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "EULER";
        boolean alternate = true;
        String expected = "ALR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone6_AxfW5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "GUTHRIE";
        boolean alternate = true;
        String expected = "KTR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone7_Elmt6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "PEDRO";
        boolean alternate = true;
        String expected = "PTR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone8_yLiA7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "WESTERLUND";
        boolean alternate = true;
        String expected = "FSTR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone9_ylRz8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "WACHTER";
        boolean alternate = true;
        String expected = "FKTR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone10_PlFS9() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "HOLT";
        boolean alternate = true;
        String expected = "HLT";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone11_cVEF10() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "MERCEDES";
        boolean alternate = true;
        String expected = "MRST";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_Michael_UWih0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Michael";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("MKL", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_X_ljXQ1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Chae";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("X", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_K_DCAq2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Ch";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_MK_MC_kbGg5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Mc";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("MK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH_K_empty_yaix9() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC10_ewHJ10() {
        DoubleMetaphone dm = new DoubleMetaphone();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_A_BXZW8() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "A";
        boolean alternate = false;
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone1_Aghp0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Michael";
        boolean alternate = true;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("MXL", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_QgwN1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Chae";
        boolean alternate = true;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("X", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_bnHg2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Chae";
        boolean alternate = false;
        String result = dm.doubleMetaphone(value, alternate);
        assertEquals("X", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone1_IEdI0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "R";
        boolean alternate = true;
        String expected = "R";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_Fhob1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "R";
        boolean alternate = false;
        String expected = "R";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone1_GkfZ0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Michael";
        boolean alternate = true;
        String expected = "MXL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_GaMh1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McMichael";
        boolean alternate = true;
        String expected = "MKMX";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone3_WLfv2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "MacMichael";
        boolean alternate = true;
        String expected = "MKMX";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone4_aRvw3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClelland";
        boolean alternate = true;
        String expected = "MKLL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone5_xFpC4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClellan";
        boolean alternate = true;
        String expected = "MKLL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone6_Bgdk5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClellen";
        boolean alternate = true;
        String expected = "MKLL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone7_Wafb6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClelland";
        boolean alternate = false;
        String expected = "MKLL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone8_ESlx7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClellan";
        boolean alternate = false;
        String expected = "MKLL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone9_jIHF8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "McClellen";
        boolean alternate = false;
        String expected = "MKLL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG10_ZxPw9() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_URhq0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schlesinger";
        boolean alternate = false;
        String expected = "XLSN";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC2_MQSX1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schneider";
        boolean alternate = false;
        String expected = "XNTR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC3_CmcR2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "School";
        boolean alternate = false;
        String expected = "SKL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC4_mOIa3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schnauzer";
        boolean alternate = false;
        String expected = "XNSR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC5_jvcc4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schnapp";
        boolean alternate = false;
        String expected = "XNP";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC6_qugN5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schmidt";
        boolean alternate = false;
        String expected = "XMT";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC7_aSvM6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schneider";
        boolean alternate = true;
        String expected = "SNTR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC8_CHEa7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "School";
        boolean alternate = true;
        String expected = "SKL";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC9_cuaY8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schnauzer";
        boolean alternate = true;
        String expected = "SNSR";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC10_kvCf9() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Schnapp";
        boolean alternate = true;
        String expected = "SNP";
        String actual = dm.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL_QOpc0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithLL_Winp1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "LL";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL0_BjND2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L0";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL1_IAkD3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L1";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL2_RUuC4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L2";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL3_oidt5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L3";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL4_wqwa6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L4";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL5_bjEq7() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L5";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL6_xLYc8() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L6";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL7_Kirv9() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L7";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL8_IDxf10() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L8";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithL9_JvAh11() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "L9";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals("L", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConditionM0_3_GcdV2_lDcw0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "UMB";
        int index = 1;
        String result = dm.encode(value);
        assertFalse(result.equals("UMB"));
    }
}