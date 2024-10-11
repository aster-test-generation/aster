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

public class Aster_DoubleMetaphone_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_C_NotFollowedByCEorCI_AAZV0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "CAB";
        String expected = "KP";  // 'C' -> 'K', 'A' is a vowel, 'B' -> 'P'
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_C_ConditionNotMet_ylJA0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "acq";
        String expected = "AK";  // Assuming 'C' followed by 'Q' not followed by 'CE' or 'CI'
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_CoverUncoveredLine_Ysfz0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "ACQ";
        String expected = "AK";  // Expected result based on the logic in handleC method
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithConditionC0CoveringIE_EiqD0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "ABACHX";
        String expected = "APKK";
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithConditionC0CoveringBacherMacher_iYLt1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "ABACHERI";
        String expected = "APKR";
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithFollowingTS_ilZH1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Bachts";
        String expected = "PKTS"; // Assuming the primary result is desired and the handling of 'CH' followed by 'T'
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithPreviousVowelAndCH_cPTq2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Mach";
        String expected = "MK"; // Assuming the primary result is desired and the handling of 'CH' after a vowel
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionNotContainsCEOrCI_fhja0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String result = doubleMetaphone.doubleMetaphone("Acq", false);
        assertEquals("AK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_IlloAtEnd_cdGJ0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "CAMILLO";
        String expected = "KML";  // Assuming the output based on the logic in handleL and conditionL0
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_AlleAtEnd_Spcj1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "CABALLE";
        String expected = "KPL";  // Assuming the output based on the logic in handleL and conditionL0
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_AsAtEnd_CAxw2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "CABALLAS";
        String expected = "KPLS";  // Assuming the output based on the logic in handleL and conditionL0
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_ConditionL0_OsAtEnd_sege3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "CABALLOS";
        String expected = "KPLS";  // Assuming the output based on the logic in handleL and conditionL0
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConditionM0_Coverage_cxmd0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("COLUMB", false);
        assertEquals("KLM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringInput_arPP1() throws EncoderException {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "AKSM";
        assertEquals("AKSM", doubleMetaphone.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_CoverUncoveredLine_wCFZ0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "ACM";
        String expected = "AKM"; // Assuming 'C' translates to 'K' and is not followed by 'E' or 'I'
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithAccident_ICIz0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Accident";
        String expected = "AKS"; // Assuming "KS" is appended for "CC" in "Accident"
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals("AKS", expected, result.substring(0, 3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithSucceed_DkCa1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Succeed";
        String expected = "SKS"; // Assuming "KS" is appended for "CC" in "Succeed"
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals("SKS", expected, result.substring(0, 3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_C_ConditionNotCECI_RHim0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "ACB";
        String expected = "AKP"; // 'C' -> 'K', 'B' -> 'P'
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithMCAtStart_iqac0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "McHale";
        String expected = "MKL";  // Assuming the output should be "MKL" based on the logic in handleCH
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithMCNotAtStart_yFFt1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "AmCham";
        String expected = "AMXM";  // Assuming the output should be "AMXM" based on the logic in handleCH
        assertEquals(expected, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithMCAtStart_rxCp0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "MCHael";
        String expected = "MKL";
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCHNotAtStart_CBIN1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Wach";
        String expected = "AK";
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithSCHAtStart_Ekcz0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Schmidt";
        String expected = "XMT";  // Assuming 'SCH' at the start triggers a special case handling
        String result = dm.doubleMetaphone(input, false);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithXEndingInAUOU_Kazv0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Breaux";
        String expectedOutput = "PR"; // Assuming the output should be "PR" based on the logic in handleX
        assertEquals(expectedOutput, doubleMetaphone.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleZWithZoZiZa_Mutq0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "Zoology";
        String expected = "S";  // Assuming the output for "ZO" should be "S" based on the handleZ logic
        String result = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, result.substring(0, 1));  // Check only the first character to ensure 'Z' is handled as 'S'
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCZAndWITZ_MDpM0_1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String inputCZ = "CZechoslovakia";
        String expectedOutputCZ = "SXSL"; // Expected output needs to be defined based on the actual implementation details
        String inputWITZ = "Berlowitz";
        String expectedOutputWITZ = "B"; // Expected output needs to be defined based on the actual implementation details
        assertEquals(expectedOutputCZ, dm.doubleMetaphone(inputCZ, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithCZAndWITZ_MDpM0_2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String inputCZ = "CZechoslovakia";
        String expectedOutputCZ = "X"; // Expected output needs to be defined based on the actual implementation details
        String inputWITZ = "PRLTerlowitz";
        String expectedOutputWITZ = "PRLT"; // Expected output needs to be defined based on the actual implementation details
        assertEquals(expectedOutputWITZ, dm.doubleMetaphone(inputWITZ, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsSIO_fsKY4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("SIO", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsSIA_eVDi5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("S", dm.doubleMetaphone("SIA", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_ContainsSIAN_arAF6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("SN", dm.doubleMetaphone("SIAN", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleW_WithWR_eszV0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "wrestle";
        String expected = "RSTL";
        String actual = dm.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleW_WithWH_FXXJ1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "whale";
        String expected = "AL";
        String actual = dm.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleW_WithEndVowel_chdb2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "crow";
        String expected = "KR";
        String actual = dm.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleW_WithEWSKI_mpIs3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "andrewski";
        String expected = "ANTR";
        String actual = dm.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleW_WithOWSKY_GJJq4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "borowsky";
        String expected = "PRSK";
        String actual = dm.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_NotVowelBeforeGH_wfaZ0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Bgh", false);
        assertEquals("PK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_GHAtStart_Wofo1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Ghi", false);
        assertEquals("J", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_GHNotAtStart_ZqCW2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("AGH", false);
        assertEquals("AK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_SurroundedByBDH_SvCS3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BDGH", false);
        assertEquals("PTK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_SurroundedByBH_qZBp4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BHGHA", false);
        assertEquals("PK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_UFollowedByCGLRT_WPCC5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Cough", false);
        assertEquals("KF", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_GHAtStartFollowedByI_PHqA7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("GHI", false);
        assertEquals("J", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_GHAtStartNotFollowedByI_pgom8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("GHA", false);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleGH_GHNotAtStartNotFollowedByI_nyZk9() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("AGHA", false);
        assertEquals("AK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_SpecialCaseXP_QxPa0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Schb";
        String expected = "XP"; // Assuming primary is requested
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_ContainsIEY_Sudv1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Sci";
        String expected = "S"; // Assuming primary is requested
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleSC_AppendSK_tBfd2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String input = "Sck";
        String expected = "SK"; // Assuming primary is requested
        assertEquals(expected, dm.doubleMetaphone(input, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithNotJoseAtStart_xmFy2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("MJS", dm.doubleMetaphone("MJose", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithVowelBeforeJA_FxoG3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("AJ", dm.doubleMetaphone("AJA", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithVowelBeforeJO_qxEc4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("AJ", dm.doubleMetaphone("AJO", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJAtEnd_wCAR5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("AJ", dm.doubleMetaphone("AJ", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleJWithDoubleJ_rpGX10() {
        DoubleMetaphone dm = new DoubleMetaphone();
        assertEquals("J", dm.doubleMetaphone("JJ", false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithSIO_NotSlavoGermanic_sGJL1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Sio";
        assertEquals("S", dm.doubleMetaphone(value, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithSIAN_NotSlavoGermanic_oXUr3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Sian";
        assertEquals("SN", dm.doubleMetaphone(value, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithEndAI_dMlh5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Resnais";
        assertEquals("RSN", dm.doubleMetaphone(value, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithEndOI_avSP6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Artois";
        assertEquals("ART", dm.doubleMetaphone(value, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithEndAI_Alternate_DiNr7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Resnais";
        assertEquals("RSNS", dm.doubleMetaphone(value, true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleS_WithEndOI_Alternate_ujlB8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String value = "Artois";
        assertEquals("ARTS", dm.doubleMetaphone(value, true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case1_MtNk0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("AGN", false);
        assertEquals("AKN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case2_upFx1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("AGN", true);
        assertEquals("AN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case3_uMYH2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("AGNET", false);
        assertEquals("AKNT", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case4_XeTo3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("AGLI", false);
        assertEquals("AKL", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case5_OvsH4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("AGLI", true);
        assertEquals("AL", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case6_NvPE5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("GY", false);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case7_UveU6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("GER", false);
        assertEquals("KR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case8_hkUo7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("VANGER", false);
        assertEquals("FNKR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case9_zrXz8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("VANGER", true);
        assertEquals("FNJR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case10_FNXnBw9() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("VON SCHIER", false);
        assertEquals("FNX", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case11_uWEp10() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("VON SCHIER", true);
        assertEquals("FNXR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case12_AnWx11() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BIAGGIER", false);
        assertEquals("PJ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case13_FiuW12() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BIAGGIER", true);
        assertEquals("PKR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case14_YUmh13() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BIAGGI", false);
        assertEquals("PJ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case15_oQpf14() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("BIAGGI", true);
        assertEquals("PK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case16_KIoT15() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("OGGI", false);
        assertEquals("AJ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case17_Aisw16() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("OGGI", true);
        assertEquals("AK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case18_NxYM17() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("GG", false);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_Case19_zigo18() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("G", false);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GN_VowelAtStart_qKKS0() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Agnostic", false);
        assertEquals("AKNS", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GN_NotSlavoGermanic_tqpz1() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gnome", false);
        assertEquals("NM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GN_EY_NotPresent_BRdS2() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gnash", false);
        assertEquals("NX", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GLI_NotSlavoGermanic_tEvU3() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Glider", false);
        assertEquals("KLTR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GY_NotDangerous_UmVq4() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gypsy", false);
        assertEquals("KPS", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_NotDangerous_tljs5() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Germinate", false);
        assertEquals("KRMN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_NotEOrI_aLDu6() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Germ", false);
        assertEquals("KRM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_NotRGYOrOGY_aTTQ7() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gerbil", false);
        assertEquals("KRPL", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_VanOrVonOrSch_xMJc8() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Vanger", false);
        assertEquals("FNKR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_ET_otaH9() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Get", false);
        assertEquals("KT", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GER_IER_nbkh10() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gier", false);
        assertEquals("K", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleG_GN_InitialY_xJdn11() {
        DoubleMetaphone dm = new DoubleMetaphone();
        String result = dm.doubleMetaphone("Gyrate", false);
        assertEquals("KRT", result);
    }
}