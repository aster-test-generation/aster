/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DoubleMetaphone_Coverage_Test_Passing {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_mXuE0() throws org.apache.commons.codec.EncoderException {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        Object obj = new Object();
        try {
            doubleMetaphone.encode(obj);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullObject_LAne1() throws org.apache.commons.codec.EncoderException {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        Object obj = null;
        try {
            doubleMetaphone.encode(obj);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_YoTn2() throws org.apache.commons.codec.EncoderException {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        Object obj = "test";
        Object result = doubleMetaphone.encode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS1_PtXt0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "island";
        boolean alternate = true;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS2_dLfo1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "isle";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case1_DsGf0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "school";
        boolean alternate = true;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case2_lfcx1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "schooner";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case3_QrOo2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "schermerhorn";
        boolean alternate = true;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case4_PSPR3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "schenker";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case5_JXbk4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "smith";
        boolean alternate = true;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case6_cRTf5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "schmidt";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case7_IaGB6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "snider";
        boolean alternate = true;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case8_PQwZ7() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "schneider";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case9_iBYg8() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "resnais";
        boolean alternate = true;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_Case10_gDlz9() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "artois";
        boolean alternate = false;
        String result = doubleMetaphone.doubleMetaphone(value, alternate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_1_UbRD0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_2_jdoq1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("X", doubleMetaphone.doubleMetaphone("CHAE", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_5_fJkT4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("X", doubleMetaphone.doubleMetaphone("CHAE", true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJ2_mGfv1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("SN", doubleMetaphone.doubleMetaphone("SN", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJ4_TXdC3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("J", doubleMetaphone.doubleMetaphone("J", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleZ1_xzag0() {
        String value = "ZHAO";
        boolean alternate = false;
        assertEquals("J", doubleMetaphone.doubleMetaphone(value, alternate));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC2_uSaL1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CH";
        boolean alternate = true;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC3_RsIr2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CIA";
        boolean alternate = true;
        String expected = "X";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC4_AcAh3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CC";
        boolean alternate = true;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC5_QtJD4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CI";
        boolean alternate = true;
        String expected = "S";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC6_alBI5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CE";
        boolean alternate = true;
        String expected = "S";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC7_DqAA6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CY";
        boolean alternate = true;
        String expected = "S";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC11_IVix10() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "C";
        boolean alternate = true;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC12_hlmw11() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "Q";
        boolean alternate = true;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleC13_QeJU12() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "G";
        boolean alternate = true;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleX_sAqQ15() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithI_Krut0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "I";
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "A";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithC_cqvR2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "C";
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "K";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCH_HPUp3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CH";
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "K";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCC_iotO4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CC";
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "K";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCIA_nuHS5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CIA";
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "S";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCIO_csDS6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CIO";
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "S";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCE_kWmc7() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CE";
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "S";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCY_xcyH8() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CY";
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "S";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS11_dkRm10() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "artois";
        boolean alternate = true;
        String expected = "ARTS";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS12_kGsA11() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "school";
        boolean alternate = true;
        String expected = "SKL";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleL_oOvY0_2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("L", doubleMetaphone.doubleMetaphone("LL", true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleL_oOvY0_3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("L", doubleMetaphone.doubleMetaphone("L", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleL_oOvY0_4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("L", doubleMetaphone.doubleMetaphone("L", true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleL_oOvY0_5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("LL", doubleMetaphone.doubleMetaphone("LLL", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleL_oOvY0_6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("LL", doubleMetaphone.doubleMetaphone("LLL", true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleAEIOUY_TEVC4_1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("A", doubleMetaphone.doubleMetaphone("A", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleAEIOUY_TEVC4_2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("A", doubleMetaphone.doubleMetaphone("A", true));
    }
}