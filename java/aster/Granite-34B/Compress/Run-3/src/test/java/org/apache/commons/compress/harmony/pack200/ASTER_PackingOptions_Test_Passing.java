/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import org.objectweb.asm.Attribute;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackingOptions_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetGzip_dDkH0() throws Exception {
		PackingOptions packingOptions = new PackingOptions();
		packingOptions.setGzip(true);
		assertEquals(true, packingOptions.isGzip());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetGzip_NUbs1() throws Exception {
		PackingOptions packingOptions = new PackingOptions();
		packingOptions.setGzip(false);
		assertEquals(false, packingOptions.isGzip());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getModificationTime_cidp0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String expected = "expected_value";
        String actual = packingOptions.getModificationTime();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getModificationTime_null_PmoA1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String expected = null;
        String actual = packingOptions.getModificationTime();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getModificationTime_empty_EkLG2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String expected = "";
        String actual = packingOptions.getModificationTime();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getUnknownAttributePrototypes_noUnknownAttributes_hZTs0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        Attribute[] attributes = packingOptions.getUnknownAttributePrototypes();
        assertEquals(0, attributes.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsVerbose_WhenTrue_ReturnsTrue_qKqq0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setVerbose(true);
        boolean actual = packingOptions.isVerbose();
        boolean expected = true;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsVerbose_WhenFalse_ReturnsFalse_QeGK1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setVerbose(false);
        boolean actual = packingOptions.isVerbose();
        boolean expected = false;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogFile_TCzU0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setLogFile("logFile");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogFileWithNullParameter_jMDm1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setLogFile(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogFileWithEmptyParameter_obZS2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setLogFile("");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddMethodAttributeAction_OiyX0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.addMethodAttributeAction("attributeName", "action");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddMethodAttributeActionWithNullOrEmptyStrings_OGrk1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.addMethodAttributeAction(null, null);
        packingOptions.addMethodAttributeAction("", "");
        packingOptions.addMethodAttributeAction(null, "");
        packingOptions.addMethodAttributeAction("", null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddMethodAttributeActionWithInvalidStrings_oAkT2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.addMethodAttributeAction("invalid attributeName", "invalid action");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuietTrue_iuVq0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setQuiet(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuietFalse_ILLD1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setQuiet(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsPassFileWithPassingFileName_zkQQ0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String passFileName = "com/example/MyClass.class";
        boolean result = packingOptions.isPassFile(passFileName);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsPassFileWithNonPassingFileName_xNHX1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String passFileName = "com/example/MyClass.java";
        boolean result = packingOptions.isPassFile(passFileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getUnknownClassAttributeActionTest_ziZf0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String type = "someType";
        String expected = "someValue";
        String actual = packingOptions.getUnknownClassAttributeAction(type);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getUnknownClassAttributeActionNullTest_oVpk1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String type = null;
        String expected = "someValue";
        String actual = packingOptions.getUnknownClassAttributeAction(type);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getUnknownClassAttributeActionEmptyTest_UxSV2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String type = "";
        String expected = "someValue";
        String actual = packingOptions.getUnknownClassAttributeAction(type);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getSegmentLimitTest_yNLg0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        long segmentLimit = packingOptions.getSegmentLimit();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getSegmentLimitTest_whenSegmentLimitIsZero_thenReturnsZero_KCKk1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setSegmentLimit(0);
        long segmentLimit = packingOptions.getSegmentLimit();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getSegmentLimitTest_whenSegmentLimitIsNegative_thenReturnsZero_kqtV2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setSegmentLimit(-100);
        long segmentLimit = packingOptions.getSegmentLimit();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getSegmentLimitTest_whenSegmentLimitIsPositive_thenReturnsSegmentLimit_EFcn3() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setSegmentLimit(1000);
        long segmentLimit = packingOptions.getSegmentLimit();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetKeepFileOrder_BYIO0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setKeepFileOrder(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetKeepFileOrderFalse_gaAR1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setKeepFileOrder(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUnknownAttributeAction_ZvIQ0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String result = packingOptions.getUnknownAttributeAction();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVerboseTrue_BMRC0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setVerbose(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVerboseFalse_ydFR1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setVerbose(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEffort_wzPx0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setEffort(100);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEffortWithZeroValue_PSun1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setEffort(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEffortWithNegativeValue_WSLS2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setEffort(-10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEffortWithMaximumValue_HllZ3() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setEffort(Integer.MAX_VALUE);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEffortWithMinimumValue_Tknh4() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setEffort(Integer.MIN_VALUE);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsKeepFileOrder_gpHv0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setKeepFileOrder(true);
        assertTrue(packingOptions.isKeepFileOrder());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsKeepFileOrder2_AKwy1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setKeepFileOrder(false);
        assertTrue(!packingOptions.isKeepFileOrder());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getUnknownMethodAttributeAction_with_known_type_sDKH0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String type = "knownType";
        String expected = "expectedValue";
        String actual = packingOptions.getUnknownMethodAttributeAction(type);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getUnknownMethodAttributeAction_with_unknown_type_Badj1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String type = "unknownType";
        String expected = "defaultAction";
        String actual = packingOptions.getUnknownMethodAttributeAction(type);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetStripDebug_ewpx0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setStripDebug(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetStripDebugFalse_pnKF1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setStripDebug(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeflateHintKeep_Scpc0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setDeflateHint("keep");
        assertEquals("keep", packingOptions.getDeflateHint());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeflateHintTrue_valu1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setDeflateHint("true");
        assertEquals("true", packingOptions.getDeflateHint());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeflateHintFalse_ZHPL2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setDeflateHint("false");
        assertEquals("false", packingOptions.getDeflateHint());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsKeepDeflateHint_ecYa0() throws Exception {
	PackingOptions packingOptions = new PackingOptions();
	packingOptions.setDeflateHint("KEEP");
	assertTrue(packingOptions.isKeepDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsKeepDeflateHint2_FusA1() throws Exception {
	PackingOptions packingOptions = new PackingOptions();
	packingOptions.setDeflateHint("NOTKEEP");
	assertFalse(packingOptions.isKeepDeflateHint());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSegmentLimit_kkEU0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setSegmentLimit(0L);
        assertEquals(0L, packingOptions.getSegmentLimit());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSegmentLimitWithNegativeValue_CRqs1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setSegmentLimit(-1L);
        assertEquals(-1L, packingOptions.getSegmentLimit());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSegmentLimitWithPositiveValue_DDNn2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setSegmentLimit(100L);
        assertEquals(100L, packingOptions.getSegmentLimit());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModificationTimeKeep_LAaI0() throws Exception {
        PackingOptions options = new PackingOptions();
        options.setModificationTime("keep");
        assertEquals("keep", options.getModificationTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModificationTimeLatest_AisY1() throws Exception {
        PackingOptions options = new PackingOptions();
        options.setModificationTime("latest");
        assertEquals("latest", options.getModificationTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUnknownAttributeActionWithPass_yfBd0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setUnknownAttributeAction("PASS");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUnknownAttributeActionWithError_WtKL1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setUnknownAttributeAction("ERROR");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUnknownAttributeActionWithStrip_YnHw2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setUnknownAttributeAction("STRIP");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUnknownAttributeActionWithIncorrectOption_TveF3() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        try {
            packingOptions.setUnknownAttributeAction(" incorrectOption");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUnknownAttributeActionWithNullOption_ZnRC4() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        try {
            packingOptions.setUnknownAttributeAction(null);
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getUnknownCodeAttributeActionTest_aImW0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String type = "type";
        String expected = "expected";
        String actual = packingOptions.getUnknownCodeAttributeAction(type);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getUnknownCodeAttributeActionTest_NullType_MirD1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String type = null;
        String expected = "expected";
        String actual = packingOptions.getUnknownCodeAttributeAction(type);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getUnknownCodeAttributeActionTest_EmptyType_JsvD2() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String type = "";
        String expected = "expected";
        String actual = packingOptions.getUnknownCodeAttributeAction(type);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsGzip_zxfb0() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setGzip(true);
        assertTrue(packingOptions.isGzip());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsGzip_ZTts1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        packingOptions.setGzip(false);
        assertFalse(packingOptions.isGzip());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getDeflateHint_without_deflateHint_returns_null_XbCt1() throws Exception {
        PackingOptions packingOptions = new PackingOptions();
        String result = packingOptions.getDeflateHint();
        assert result == null;
    }
}