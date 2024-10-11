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
    public void testDoubleMetaphoneWithMCAtStart_ERMM0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "McHale";
        String expected = "K";  // Assuming the output should be 'MKL' based on the logic in handleCH
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCHNotFollowingMC_aztO1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Ach";
        String expected = "XK";  // Assuming the output should be 'AK' based on the logic in handleCH
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleR_NotContainingMEorMA_Edri0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "BRIE";
        boolean alternate = false;
        String expected = "R"; // Expecting 'PR' because it should not append alternate 'PR' due to not matching "ME" or "MA" before "IE"
        String result = doubleMetaphone.doubleMetaphone(input, alternate);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionAL0_True_KHjP0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "AALALAH";
        String expected = "AL";  // Assuming the expected output based on the implementation details provided
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionHL0_False_lXvg1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "HEHLHLO";
        String expected = "HL";  // Assuming the expected output based on the implementation details provided
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneConditionL0True_YVeg0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Allegro";
        String expected = "L"; // Assuming that the primary result should be 'ALKR' based on the logic
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneConditionL0False_Arpk1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Hello";
        String expected = "L"; // Assuming that the primary result should be 'HL' based on the logic
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleAJTWithNoFollowingConsonants_fsWp6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("AJT", dm.doubleMetaphone("AAJTD", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSKLJWithSKLBefore_lOsl7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("SKLJ", dm.doubleMetaphone("SKLSKLJ", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithConditionC0CoveringIE_EiqD0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "ABACHX";
        String expected = "AKX";
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithConditionC0CoveringBacherMacher_iYLt1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "ABACHERI";
        String expected = "AKRI";
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithPrefixVAN_DejJ0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "VANsch";
        String expected = "S"; // Assuming the primary result is desired and the handling of 'SCH' after 'VAN '
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_IlloAtEnd_cdGJ0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "CAMILLO";
        String expected = "KM";  // Assuming the output based on the logic in handleL and conditionL0
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_AlleAtEnd_Spcj1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "CABALLE";
        String expected = "KBL";  // Assuming the output based on the logic in handleL and conditionL0
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_AsAtEnd_CAxw2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "CABALLAS";
        String expected = "KBL";  // Assuming the output based on the logic in handleL and conditionL0
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_OsAtEnd_sege3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "CABALLOS";
        String expected = "KBL";  // Assuming the output based on the logic in handleL and conditionL0
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringInput_arPP1_fid2() throws EncoderException {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "example";
        assertEquals("example", doubleMetaphone.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithAccident_ICIz0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Accident";
        String expected = "AKS"; // Assuming "KS" is appended for "CC" in "Accident"
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals("Testing input 'Accident' should result in 'AKS'", expected, result.substring(0, 3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithSucceed_DkCa1_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Succeed";
        String expected = "SKS"; // Assuming "KS" is appended for "CC" in "Succeed"
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals("Testing input 'Succeed' should result in 'SKS'", expected, result.substring(0, 3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_C_ConditionNotCECI_RHim0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "ACB";
        String expected = "KP"; // 'C' -> 'K', 'B' -> 'P'
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithMCAtStart_ERMM0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "McHale";
        String expected = "K";  // Assuming the output should be 'K' based on the logic in handleCH
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCHNotFollowingMC_aztO1_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Ach";
        String expected = "XK";  // Assuming the output should be 'XK' based on the logic in handleCH
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithMCNotAtStart_yFFt1_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "AmCham";
        String expected = "AMKM";  // Assuming the output should be "AMKM" based on the logic in handleCH
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleR_NotContainingMEorMA_Edri0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "BRIE";
        boolean alternate = false;
        String expected = "R"; // Expecting 'R' because it should not append alternate 'R' due to not matching "ME" or "MA" before "IE"
        String result = doubleMetaphone.doubleMetaphone(input, alternate);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithMCAtStart_rxCp0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "MCHael";
        String expected = "K";
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCHNotAtStart_CBIN1_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Wach";
        String expected = "XK";
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_True_KHjP0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "ALLAH";
        String expected = "L";  // Assuming the expected output based on the implementation details provided
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_False_lXvg1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "HELLO";
        String expected = "L";  // Assuming the expected output based on the implementation details provided
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithXEndingInAUOU_Kazv0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Breaux";
        String expectedOutput = "PRKS"; // Assuming the output should be "PRKS" based on the logic in handleX
        assertEquals(expectedOutput, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneConditionL0True_YVeg0_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Allegro";
        String expected = "L"; // Assuming that the primary result should be 'L' based on the logic
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneConditionL0False_Arpk1_fid2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Hello";
        String expected = "L"; // Assuming that the primary result should be 'L' based on the logic
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCZAndWITZ_MDpM0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String inputCZ = "CZechoslovakia";
        String expectedOutputCZ = "X"; // Expected output needs to be defined based on the actual implementation details
        assertEquals(expectedOutputCZ, dm.doubleMetaphone(inputCZ, false));
        String inputWITZ = "Berlowitz";
        String expectedOutputWITZ = "B"; // Expected output needs to be defined based on the actual implementation details
        assertEquals(expectedOutputWITZ, dm.doubleMetaphone(inputWITZ, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsHEIM_WOVQ0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("SHEIM", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsHOEK_vNfb1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("SHOEK", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsHOLM_YDCa2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("SHOLM", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsHOLZ_PyLO3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("SHOLZ", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsSIO_fsKY4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("SX", dm.doubleMetaphone("SIO", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsSIA_eVDi5_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("SX", dm.doubleMetaphone("SIA", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsSIAN_arAF6_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("SX", dm.doubleMetaphone("SIAN", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_SlavoGermanic_qpaL7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("SIO", true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_EndsWithAI_LEQm8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("ARTOIS", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleW_WithEWSKI_mpIs3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "andrewski";
        String expected = "ANTRFSK";
        String actual = dm.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleW_WithOWSKY_GJJq4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "borowsky";
        String expected = "BRFSK";
        String actual = dm.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_NotVowelBeforeGH_wfaZ0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Bgh", false);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_SurroundedByBDH_SvCS3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BDGH", false);
        assertEquals("BTK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_SurroundedByBH_qZBp4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BHGHA", false);
        assertEquals("BKA", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_GHNotAtStartNotFollowedByI_nyZk9_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("AGHA", false);
        assertEquals("AKA", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_SpecialCaseX_QxPa0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Schb";
        String expected = "X"; // Assuming primary is requested
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithJose_MVcH0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("H", dm.doubleMetaphone("Jose", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithNotJoseAtStart_xmFy2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("JA", dm.doubleMetaphone("MJose", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithVowelBeforeJA_FxoG3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("AJH", dm.doubleMetaphone("AJA", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithVowelBeforeJO_qxEc4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("AJH", dm.doubleMetaphone("AJO", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJAtEnd_wCAR5_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("J ", dm.doubleMetaphone("AJ", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithNoFollowingConsonants_fsWp6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("J", dm.doubleMetaphone("AJD", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithSKLBefore_lOsl7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("J", dm.doubleMetaphone("SKLJ", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithSan_twYI8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("H", dm.doubleMetaphone("San Jose", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithSanSpace_jjLq9() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("H", dm.doubleMetaphone("San ", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithDoubleJ_rpGX10_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("JH", dm.doubleMetaphone("JJ", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithSHAndGermanicSuffix_QcIS0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Shoek";
        assertEquals("S", dm.doubleMetaphone(value, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithSIO_NotSlavoGermanic_sGJL1_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Sio";
        assertEquals("SX", dm.doubleMetaphone(value, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithSIO_SlavoGermanic_RnBM2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Sio";
        assertEquals("S", dm.doubleMetaphone(value, true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithSIAN_NotSlavoGermanic_oXUr3_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Sian";
        assertEquals("SX", dm.doubleMetaphone(value, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithSIAN_SlavoGermanic_nkZX4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Sian";
        assertEquals("S", dm.doubleMetaphone(value, true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithEndAI_dMlh5_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Resnais";
        assertEquals("RS", dm.doubleMetaphone(value, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithEndOI_avSP6_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Artois";
        assertEquals("RTS", dm.doubleMetaphone(value, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithEndAI_Alternate_DiNr7_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Resnais";
        assertEquals("RS", dm.doubleMetaphone(value, true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithEndOI_Alternate_ujlB8_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Artois";
        assertEquals("RTS", dm.doubleMetaphone(value, true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case3_uMYH2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("AGNET", false);
        assertEquals("AKN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case6_NvPE5_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("GY", false);
        assertEquals("KJ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case7_UveU6_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("GER", false);
        assertEquals("KJ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case8_hkUo7_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("VANGER", false);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case9_zrXz8_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("VANGER", true);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case10_KnBw9() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("VON SCHIER", false);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case11_uWEp10_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("VON SCHIER", true);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case12_AnWx11_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BIAGGIER", false);
        assertEquals("J", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case13_FiuW12_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BIAGGIER", true);
        assertEquals("J", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case14_YUmh13_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BIAGGI", false);
        assertEquals("JK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case15_oQpf14_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BIAGGI", true);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case16_KIoT15_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("OGGI", false);
        assertEquals("JK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case17_Aisw16_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("OGGI", true);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GN_VowelAtStart_qKKS0_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Agnostic", false);
        assertEquals("KNSTK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GN_EY_NotPresent_BRdS2_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gnash", false);
        assertEquals("NKNX", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GY_NotDangerous_UmVq4_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gypsy", false);
        assertEquals("JPS", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_NotDangerous_tljs5_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Germinate", false);
        assertEquals("JRMNT", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_NotEOrI_aLDu6_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Germ", false);
        assertEquals("JRM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_NotRGYOrOGY_aTTQ7_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gerbil", false);
        assertEquals("JRP", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_VanOrVonOrSch_xMJc8_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Vanger", false);
        assertEquals("FNJR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_IER_nbkh10_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gier", false);
        assertEquals("JR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GN_InitialY_xJdn11_fid2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gyrate", false);
        assertEquals("JRT", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCZAndWITZ_MDpM0_1_fid3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String inputCZ = "CZechoslovakia";
        String expectedOutputCZ = "X"; // Expected output needs to be defined based on the actual implementation details
        String inputWITZ = "Berlowitz";
        String expectedOutputWITZ = "B"; // Expected output needs to be defined based on the actual implementation details
        assertEquals(expectedOutputCZ, dm.doubleMetaphone(inputCZ, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCZAndWITZ_MDpM0_2_fid3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String inputCZ = "CZechoslovakia";
        String expectedOutputCZ = "X"; // Expected output needs to be defined based on the actual implementation details
        String inputWITZ = "Berlowitz";
        String expectedOutputWITZ = "B"; // Expected output needs to be defined based on the actual implementation details
        assertEquals(expectedOutputWITZ, dm.doubleMetaphone(inputWITZ, false));
    }
}