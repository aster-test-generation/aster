/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Attribute;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackingOptions_Test_Passing {
private List<String> passFiles = new ArrayList<>();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGzipTrue_hbvP0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setGzip(true);
    assertTrue(packingOptions.isGzip());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGzipFalse_wpXw1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setGzip(false);
    assertFalse(packingOptions.isGzip());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModificationTime_XDpR0() {
    PackingOptions packingOptions = new PackingOptions();
    String modificationTime = packingOptions.getModificationTime();
    assertNotNull(modificationTime);
    assertEquals("2023-02-28T12:34:56.789Z", modificationTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownAttributePrototypes_Empty_oOSe0() {
    PackingOptions packingOptions = new PackingOptions();
    Attribute[] unknownAttributeTypes = packingOptions.getUnknownAttributePrototypes();
    assertEquals(0, unknownAttributeTypes.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsVerbose_True_usHH0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setVerbose(true);
    assertTrue(packingOptions.isVerbose());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLogFile_Null_NuVR0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setLogFile(null);
    assertNull(packingOptions.getLogFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLogFile_EmptyString_wUBl1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setLogFile("");
    assertEquals("", packingOptions.getLogFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLogFile_ValidString_Vkpa2() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setLogFile("log.txt");
    assertEquals("log.txt", packingOptions.getLogFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLogFile_InvalidString_sffy3() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setLogFile("invalid_log_file.txt");
    assertNull(packingOptions.getLogFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuietTrue_mPIS0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setQuiet(true);
    assertFalse(packingOptions.isVerbose());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPassFile_EmptyString_nuUz0() {
    PackingOptions packingOptions = new PackingOptions();
    assertFalse(packingOptions.isPassFile(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPassFile_NullString_vZqn1() {
    PackingOptions packingOptions = new PackingOptions();
    assertFalse(packingOptions.isPassFile(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPassFile_ValidPassFile_pjPR2() {
    PackingOptions packingOptions = new PackingOptions();
    assertTrue(packingOptions.isPassFile("pass.class"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPassFile_InvalidPassFile_zDil3() {
    PackingOptions packingOptions = new PackingOptions();
    assertFalse(packingOptions.isPassFile("invalid.class"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPassFile_ValidPassFileWithSlash_ezeV4() {
    PackingOptions packingOptions = new PackingOptions();
    assertTrue(packingOptions.isPassFile("pass/"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPassFile_InvalidPassFileWithSlash_cJeC5() {
    PackingOptions packingOptions = new PackingOptions();
    assertFalse(packingOptions.isPassFile("invalid/"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPassFile_ValidPassFileWithoutSlash_bGnZ6() {
    PackingOptions packingOptions = new PackingOptions();
    assertTrue(packingOptions.isPassFile("pass"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPassFile_InvalidPassFileWithoutSlash_YwDN7() {
    PackingOptions packingOptions = new PackingOptions();
    assertFalse(packingOptions.isPassFile("invalid"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLogFile_wpcs0() {
    PackingOptions packingOptions = new PackingOptions();
    String logFile = packingOptions.getLogFile();
    assertEquals("log.txt", logFile);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLogFileWithCustomLogFile_RKaj1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setLogFile("custom_log.txt");
    String logFile = packingOptions.getLogFile();
    assertEquals("custom_log.txt", logFile);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLogFileWithNullLogFile_VrMy2() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setLogFile(null);
    String logFile = packingOptions.getLogFile();
    assertNull(logFile);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLogFileWithEmptyLogFile_XGxc3() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setLogFile("");
    String logFile = packingOptions.getLogFile();
    assertEquals("", logFile);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLogFileWithInvalidLogFile_RwRJ4() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setLogFile("invalid_log.txt");
    String logFile = packingOptions.getLogFile();
    assertNull(logFile);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLogFileWithNullPackingOptions_Qbny5() {
    PackingOptions packingOptions = null;
    String logFile = packingOptions.getLogFile();
    assertNull(logFile);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStripDebug_True_jqzG0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setStripDebug(true);
    assertTrue(packingOptions.isStripDebug());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStripDebug_False_elXx1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setStripDebug(false);
    assertFalse(packingOptions.isStripDebug());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownClassAttributeAction_Default_OPeT0() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownClassAttributeAction(null);
    assertEquals("default", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownClassAttributeAction_Unknown_Yyse1() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownClassAttributeAction("unknown");
    assertEquals("unknown", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownClassAttributeAction_Known_vJMf2() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownClassAttributeAction("known");
    assertEquals("known", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownClassAttributeAction_Null_DiYt3() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownClassAttributeAction(null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownClassAttributeAction_Empty_TxEH4() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownClassAttributeAction("");
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownClassAttributeAction_Invalid_Guwq6() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownClassAttributeAction("invalid");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownClassAttributeAction_NullUnknownAttributeAction_YzBp8() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction(null);
    String result = packingOptions.getUnknownClassAttributeAction("known");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownFieldAttributeAction_nullType_ICOn0() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownFieldAttributeAction(null);
    assertEquals(packingOptions.getUnknownAttributeAction(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownFieldAttributeAction_emptyType_ukbS1() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownFieldAttributeAction("");
    assertEquals(packingOptions.getUnknownAttributeAction(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownFieldAttributeAction_validType_RPEc2() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownFieldAttributeAction("type");
    assertEquals("type", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownFieldAttributeAction_invalidType_ZBXk3() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownFieldAttributeAction("invalidType");
    assertEquals(packingOptions.getUnknownAttributeAction(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownFieldAttributeAction_nullUnknownAttributeAction_Ikdc6() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction(null);
    String result = packingOptions.getUnknownFieldAttributeAction("type");
    assertEquals(null, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownFieldAttributeAction_emptyUnknownAttributeAction_VnEr7() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("");
    String result = packingOptions.getUnknownFieldAttributeAction("type");
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownFieldAttributeAction_validUnknownAttributeAction_LTMb8() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("unknown");
    String result = packingOptions.getUnknownFieldAttributeAction("type");
    assertEquals("unknown", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSegmentLimit_PKWO0() {
    PackingOptions packingOptions = new PackingOptions();
    long segmentLimit = packingOptions.getSegmentLimit();
    assertEquals(0, segmentLimit);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownAttributeAction1_fifp0() {
    PackingOptions packingOptions = new PackingOptions();
    String unknownAttributeAction = packingOptions.getUnknownAttributeAction();
    assertEquals("fail", unknownAttributeAction);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownAttributeAction2_kHKF1() {
    PackingOptions packingOptions = new PackingOptions();
    String unknownAttributeAction = packingOptions.getUnknownAttributeAction();
    assertEquals("ignore", unknownAttributeAction);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownAttributeAction3_bBRN2() {
    PackingOptions packingOptions = new PackingOptions();
    String unknownAttributeAction = packingOptions.getUnknownAttributeAction();
    assertEquals("warn", unknownAttributeAction);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownAttributeAction4_HYjp3() {
    PackingOptions packingOptions = new PackingOptions();
    String unknownAttributeAction = packingOptions.getUnknownAttributeAction();
    assertEquals("error", unknownAttributeAction);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownAttributeAction5_Ufkg4() {
    PackingOptions packingOptions = new PackingOptions();
    String unknownAttributeAction = packingOptions.getUnknownAttributeAction();
    assertEquals("", unknownAttributeAction);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownAttributeAction6_pgEm5() {
    PackingOptions packingOptions = new PackingOptions();
    String unknownAttributeAction = packingOptions.getUnknownAttributeAction();
    assertEquals(null, unknownAttributeAction);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetVerbose_False_XHYW1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setVerbose(false);
    assertFalse(packingOptions.isVerbose());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetEffort_ValidEffort_CGoM0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setEffort(5);
    assertEquals(5, packingOptions.getEffort());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetEffort_InvalidEffort_jQJj1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setEffort(-1);
    assertEquals(0, packingOptions.getEffort());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsKeepFileOrder_True_ptZZ0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setKeepFileOrder(true);
    assertTrue(packingOptions.isKeepFileOrder());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsKeepFileOrder_False_RxiP1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setKeepFileOrder(false);
    assertFalse(packingOptions.isKeepFileOrder());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsNull_lEku0() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownMethodAttributeAction(null);
    assertEquals(packingOptions.getUnknownAttributeAction(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsEmptyString_AGTG1() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownMethodAttributeAction("");
    assertEquals(packingOptions.getUnknownAttributeAction(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsValid_AQBg2() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownMethodAttributeAction("type");
    assertEquals("type", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsInvalid_efAb3() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownMethodAttributeAction("invalid");
    assertEquals(packingOptions.getUnknownAttributeAction(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsNullAndUnknownAttributeActionIsNull_XAQS4() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction(null);
    String result = packingOptions.getUnknownMethodAttributeAction(null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsEmptyStringAndUnknownAttributeActionIsNull_kpCF5() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction(null);
    String result = packingOptions.getUnknownMethodAttributeAction("");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsValidAndUnknownAttributeActionIsNull_xvxk6() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction(null);
    String result = packingOptions.getUnknownMethodAttributeAction("type");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsInvalidAndUnknownAttributeActionIsNull_qTpf7() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction(null);
    String result = packingOptions.getUnknownMethodAttributeAction("invalid");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsNullAndUnknownAttributeActionIsEmptyString_iBCQ8() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("");
    String result = packingOptions.getUnknownMethodAttributeAction(null);
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsEmptyStringAndUnknownAttributeActionIsEmptyString_EBcZ9() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("");
    String result = packingOptions.getUnknownMethodAttributeAction("");
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsValidAndUnknownAttributeActionIsEmptyString_IbTg10() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("");
    String result = packingOptions.getUnknownMethodAttributeAction("type");
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsInvalidAndUnknownAttributeActionIsEmptyString_RVvm11() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("");
    String result = packingOptions.getUnknownMethodAttributeAction("invalid");
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownMethodAttributeAction_TypeIsNullAndUnknownAttributeActionIsValid_RIaD12() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("type");
    String result = packingOptions.getUnknownMethodAttributeAction(null);
    assertEquals("type", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEffort_YOYk0() {
    PackingOptions packingOptions = new PackingOptions();
    int effort = packingOptions.getEffort();
    assertEquals(0, effort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEffortWithEffort_aiBV1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setEffort(10);
    int effort = packingOptions.getEffort();
    assertEquals(10, effort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEffortWithNegativeEffort_HTsE2() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setEffort(-10);
    int effort = packingOptions.getEffort();
    assertEquals(-10, effort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEffortWithMaxEffort_MrOf3() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setEffort(Integer.MAX_VALUE);
    int effort = packingOptions.getEffort();
    assertEquals(Integer.MAX_VALUE, effort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEffortWithMinEffort_gwhB4() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setEffort(Integer.MIN_VALUE);
    int effort = packingOptions.getEffort();
    assertEquals(Integer.MIN_VALUE, effort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDeflateHint_keep_uuqN0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setDeflateHint("keep");
    assertEquals("keep", packingOptions.getDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDeflateHint_true_OnjH1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setDeflateHint("true");
    assertEquals("true", packingOptions.getDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDeflateHint_false_QVGj2() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setDeflateHint("false");
    assertEquals("false", packingOptions.getDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDeflateHint_invalid_wUMz3() {
    PackingOptions packingOptions = new PackingOptions();
    try {
        packingOptions.setDeflateHint("invalid");
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Bad argument: -H invalid ? deflate hint should be either true, false or keep (default)", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsKeepDeflateHint_False_GnUA1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setDeflateHint(null);
    assertFalse(packingOptions.isKeepDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsKeepDeflateHint_Null_RZjf6() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setDeflateHint(null);
    assertNull(packingOptions.isKeepDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSegmentLimit_izly0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setSegmentLimit(100);
    assertEquals(100, packingOptions.getSegmentLimit());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSegmentLimitNegative_pRmV1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setSegmentLimit(-100);
    assertEquals(0, packingOptions.getSegmentLimit());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSegmentLimitMax_GOvO2() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setSegmentLimit(1000);
    assertEquals(1000, packingOptions.getSegmentLimit());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModificationTime_keep_QsJm0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setModificationTime("keep");
    assertEquals("keep", packingOptions.getModificationTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModificationTime_latest_EnbQ1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setModificationTime("latest");
    assertEquals("latest", packingOptions.getModificationTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModificationTime_invalid_baHe2() {
    PackingOptions packingOptions = new PackingOptions();
    try {
        packingOptions.setModificationTime("invalid");
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Bad argument: -m invalid ? transmit modtimes should be either latest or keep (default)", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUnknownAttributeAction_PASS_PSOf0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("PASS");
    assertEquals("PASS", packingOptions.getUnknownAttributeAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUnknownAttributeAction_ERROR_vpKL1() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("ERROR");
    assertEquals("ERROR", packingOptions.getUnknownAttributeAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUnknownAttributeAction_STRIP_oRpY2() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setUnknownAttributeAction("STRIP");
    assertEquals("STRIP", packingOptions.getUnknownAttributeAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownCodeAttributeAction_default_lupL0() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownCodeAttributeAction("default");
    assertEquals("default", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownCodeAttributeAction_unknown_NhGY1() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownCodeAttributeAction("unknown");
    assertEquals("unknown", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownCodeAttributeAction_null_ciKu2() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownCodeAttributeAction(null);
    assertEquals("default", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownCodeAttributeAction_empty_ijQR3() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownCodeAttributeAction("");
    assertEquals("default", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownCodeAttributeAction_invalid_rAxe5() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownCodeAttributeAction("invalid");
    assertEquals("default", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnknownCodeAttributeAction_valid_lWff6() {
    PackingOptions packingOptions = new PackingOptions();
    String result = packingOptions.getUnknownCodeAttributeAction("valid");
    assertEquals("valid", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflateHint_default_gDLD0() {
    PackingOptions options = new PackingOptions();
    String expected = "default";
    String actual = options.getDeflateHint();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflateHint_none_rfwu1() {
    PackingOptions options = new PackingOptions();
    options.setDeflateHint("none");
    String expected = "none";
    String actual = options.getDeflateHint();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflateHint_fast_qvGD2() {
    PackingOptions options = new PackingOptions();
    options.setDeflateHint("fast");
    String expected = "fast";
    String actual = options.getDeflateHint();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflateHint_best_HmXo3() {
    PackingOptions options = new PackingOptions();
    options.setDeflateHint("best");
    String expected = "best";
    String actual = options.getDeflateHint();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflateHint_invalid_FXEs4() {
    PackingOptions options = new PackingOptions();
    options.setDeflateHint("invalid");
    String expected = "default";
    String actual = options.getDeflateHint();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModificationTime_XDpR0_1() {
    PackingOptions packingOptions = new PackingOptions();
    String modificationTime = packingOptions.getModificationTime();
    assertNotNull(modificationTime);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModificationTime_XDpR0_2() {
    PackingOptions packingOptions = new PackingOptions();
    String modificationTime = packingOptions.getModificationTime();
    assertEquals("2023-02-28T12:34:56.789Z", modificationTime);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddCodeAttributeAction_cnSF0_ruhz0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.addCodeAttributeAction("attributeName", "action");
    assertEquals("action", packingOptions.getDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddCodeAttributeActionWithEmptyAction_YxjU4_alxF0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.addCodeAttributeAction("attributeName", "");
    assertEquals("", packingOptions.getDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddMethodAttributeAction_ValidAttributeNameAndAction_tUsn0_oviV0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.addMethodAttributeAction("attributeName", "action");
    assertEquals("action", packingOptions.getDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddMethodAttributeAction_ValidAttributeNameAndEmptyAction_wCdn6_QeiD0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.addMethodAttributeAction("attributeName", "");
    assertEquals("", packingOptions.getDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuietNonBoolean_Koru3_oDNO0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setQuiet(false);
    assertFalse(packingOptions.isVerbose());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStripDebug_NullPointerException_zUsb7_VEjw0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setStripDebug(false);
    try {
        packingOptions.isStripDebug();
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStripDebug_IllegalArgumentException_KnYb8_NywS0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setStripDebug(true);
    try {
        packingOptions.isStripDebug();
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSegmentLimitWithPositiveValue_zWLp1_qarp0() {
    PackingOptions packingOptions = new PackingOptions();
    long segmentLimit = packingOptions.getSegmentLimit();
    assertEquals(10, segmentLimit);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetEffort_NullEffort_lmdG2_Ccbh0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setEffort(0);
    assertEquals(0, packingOptions.getEffort());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEffortWithInvalidEffort_PsiI5_lpaA0() {
    PackingOptions packingOptions = new PackingOptions();
    packingOptions.setEffort(0);
    int effort = packingOptions.getEffort();
    assertEquals(0, effort);
}
}