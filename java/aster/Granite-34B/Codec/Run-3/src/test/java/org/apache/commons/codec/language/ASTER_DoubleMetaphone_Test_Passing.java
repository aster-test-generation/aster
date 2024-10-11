/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DoubleMetaphone_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxCodeLen_SsTg0() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        int expected = 0; // Replace with the expected value
        int actual = doubleMetaphone.getMaxCodeLen();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_uJYt1_1() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("primary", doubleMetaphone.doubleMetaphone("value", true));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_uJYt1_2() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("alternate", doubleMetaphone.doubleMetaphone("value", false));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setMaxCodeLen_whenInputIs0_thenSetMaxCodeLenTo0_lHyi0() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setMaxCodeLen_whenInputIs10_thenSetMaxCodeLenTo10_GUuW1() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_uKUC0() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "test";
        Object expected = doubleMetaphone.doubleMetaphone(input);
        Object actual = doubleMetaphone.encode(input);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonString_exbw1() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        Object input = 123;
        try {
            doubleMetaphone.encode(input);
        } catch (EncoderException e) {
            assertTrue(e.getMessage().contains("DoubleMetaphone encode parameter is not of type String"));
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_PgNo0_1() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	assertEquals("K541", doubleMetaphone.encode("Kimberly"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_PgNo0_2() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	assertEquals("K541", doubleMetaphone.encode("Kimbrel"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_PgNo0_4() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	assertEquals("K541", doubleMetaphone.encode("Kimber"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcharAtWithValidIndex_YdDr0() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "example";
        int index = 3;
        char expected = 'a';
        char actual = doubleMetaphone.charAt(value, index);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcharAtWithInvalidIndex_Tsuo1() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "example";
        int index = 10;
        char expected = Character.MIN_VALUE;
        char actual = doubleMetaphone.charAt(value, index);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcharAtWithNegativeIndex_DtTw2() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "example";
        int index = -1;
        char expected = Character.MIN_VALUE;
        char actual = doubleMetaphone.charAt(value, index);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_qyNV0() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("KNT", doubleMetaphone.doubleMetaphone("Knight", false));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithNullInput_eHLq2() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals(null, doubleMetaphone.doubleMetaphone(null, false));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithEmptyInput_fioY3() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals(null, doubleMetaphone.doubleMetaphone("", false));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithInvalidInput_tUMr4() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals(null, doubleMetaphone.doubleMetaphone("Invalid", false));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testContains_XcZT0() throws Exception {
		final String value = "value";
		final int start = 0;
		final int length = 5;
		final String[] criteria = {"value", "other"};
		boolean result = DoubleMetaphone.contains(value, start, length, criteria);
		Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testContains2_jpQs1() throws Exception {
		final String value = "value";
		final int start = 0;
		final int length = 5;
		final String[] criteria = {"other", "value"};
		boolean result = DoubleMetaphone.contains(value, start, length, criteria);
		Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testContains3_zoTs2() throws Exception {
		final String value = "value";
		final int start = 0;
		final int length = 5;
		final String[] criteria = {"other"};
		boolean result = DoubleMetaphone.contains(value, start, length, criteria);
		Assertions.assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testContains4_mpZr3() throws Exception {
		final String value = "value";
		final int start = 0;
		final int length = 5;
		final String[] criteria = {};
		boolean result = DoubleMetaphone.contains(value, start, length, criteria);
		Assertions.assertFalse(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDoubleMetaphoneEqual_0_tUoi0() throws Exception {
    final DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
    final String value1 = "value1";
    final String value2 = "value2";
    final boolean alternate = false;
    final boolean expected = false;
    final boolean actual = doubleMetaphone0.isDoubleMetaphoneEqual(value1, value2, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDoubleMetaphoneEqual_1_AlPh1() throws Exception {
    final DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
    final String value1 = "value1";
    final String value2 = "value2";
    final boolean alternate = true;
    final boolean expected = false;
    final boolean actual = doubleMetaphone0.isDoubleMetaphoneEqual(value1, value2, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDoubleMetaphoneEqual_2_LTmE2() throws Exception {
    final DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
    final String value1 = "value1";
    final String value2 = "value2";
    final boolean alternate = false;
    final boolean expected = true;
    final boolean actual = doubleMetaphone0.isDoubleMetaphoneEqual(value1, value2, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_Putt0() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "example";
        boolean alternate = true;
        String expected = "primary";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithNullInput_yZxW2() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = null;
        boolean alternate = true;
        String expected = null;
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithEmptyInput_HTuz3() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "";
        boolean alternate = true;
        String expected = "";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithInvalidInput_tZJV4() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "123";
        boolean alternate = true;
        String expected = "invalid";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithAlternation_duJh0_1() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "test";
        String expectedPrimary = "TST";
        String expectedAlternate = "TST";
        String actualPrimary = doubleMetaphone.doubleMetaphone(input, false);
        String actualAlternate = doubleMetaphone.doubleMetaphone(input, true);
        assertEquals(expectedPrimary, actualPrimary);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithAlternation_duJh0_2() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "test";
        String expectedPrimary = "TST";
        String expectedAlternate = "TST";
        String actualPrimary = doubleMetaphone.doubleMetaphone(input, false);
        String actualAlternate = doubleMetaphone.doubleMetaphone(input, true);
        assertEquals(expectedAlternate, actualAlternate);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithoutAlternation_amys1() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "test";
        String expected = "TST";
        String actual = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithAccents_nZbR2() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "tst";
        String expected = "TST";
        String actual = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithSpecialCharacters_CeHu3() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "t3st";
        String expected = "TST";
        String actual = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithEmptyInput_TZHf4() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = "";
        String expected = null;
        String actual = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithNullInput_ZBbM5() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String input = null;
        String expected = null;
        String actual = doubleMetaphone.doubleMetaphone(input, false);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_pEns2_1() throws Exception {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "test";
        boolean alternate = true;
        String expected = "primary";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        doubleMetaphone = new DoubleMetaphone();
        value = "test";
        alternate = false;
        expected = "alternate";
        actual = doubleMetaphone.doubleMetaphone(value, alternate);
        Assertions.assertEquals(expected, actual);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_1_ZXOm0_1() throws Exception {
	DoubleMetaphone d = new DoubleMetaphone();
	assertEquals("K500", d.doubleMetaphone("Kim", false));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_1_ZXOm0_2() throws Exception {
	DoubleMetaphone d = new DoubleMetaphone();
	assertEquals("K500", d.doubleMetaphone("Kim", true));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsDoubleMetaphoneEqual9_FApt9() throws Exception {
		final String value1 = "test";
		final String value2 = "test";
		DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
		boolean actual = doubleMetaphone.isDoubleMetaphoneEqual(value1, value2);
		boolean expected = true;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_1_DiVH0() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = "test";
	boolean alternate = true;
	String expected = "t3st";
	String actual = doubleMetaphone.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_2_gMYF1() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = "test";
	boolean alternate = false;
	String expected = "t3st";
	String actual = doubleMetaphone.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_12_dROy11() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = "test";
	boolean alternate = false;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_0_tGTO0() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "";
    boolean alternate = false;
    String expected = "";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_2_JyYv2() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "A";
    boolean alternate = false;
    String expected = "A";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_3_stzM3() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "A";
    boolean alternate = true;
    String expected = "A";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_4_OsQp4() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "AA";
    boolean alternate = false;
    String expected = "A";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_5_BPls5() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "AA";
    boolean alternate = true;
    String expected = "A";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_6_BzQa6() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "AX";
    boolean alternate = false;
    String expected = "AX";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_7_USRK7() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "AX";
    boolean alternate = true;
    String expected = "AX";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_8_WWqN8() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "AXA";
    boolean alternate = false;
    String expected = "AX";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_9_TrmJ9() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "AXA";
    boolean alternate = true;
    String expected = "AX";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_10_AXJW10() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "AXAX";
    boolean alternate = false;
    String expected = "AX";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_11_bbSR11() throws Exception {
    DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    String value = "AXAX";
    boolean alternate = true;
    String expected = "AX";
    String actual = doubleMetaphone.doubleMetaphone(value, alternate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoubleMetaphone_JXoh0() throws Exception {
	DoubleMetaphone dm = new DoubleMetaphone();
	String value = "test";
	boolean alternate = true;
	String expected = "KST";
	String actual = dm.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoubleMetaphone2_pKRU1() throws Exception {
	DoubleMetaphone dm = new DoubleMetaphone();
	String value = "test";
	boolean alternate = false;
	String expected = "KST";
	String actual = dm.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDoubleMetaphone_Asje0() throws Exception {
		DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
		String value = "test";
		String result = doubleMetaphone.doubleMetaphone(value, true);
		assertEquals("test", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_doubleMetaphone_1_Axck0() throws Exception {
		DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
		String value = "DoubleMetaphone";
		boolean alternate = true;
		String expected = "DTLMNTFNS";
		String actual = doubleMetaphone.doubleMetaphone(value, alternate);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_doubleMetaphone_2_ETnw1() throws Exception {
		DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
		String value = "DoubleMetaphone";
		boolean alternate = false;
		String expected = "DTLMNTFNS";
		String actual = doubleMetaphone.doubleMetaphone(value, alternate);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_1_udgq0() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = null;
	boolean alternate = false;
	String expected = null;
	String actual = doubleMetaphone.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_7_Zotl6() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = "AA";
	boolean alternate = false;
	String expected = "AA";
	String actual = doubleMetaphone.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_8_NsKu7() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = "AA";
	boolean alternate = true;
	String expected = "AA";
	String actual = doubleMetaphone.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_9_RVOJ8() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = "AE";
	boolean alternate = false;
	String expected = "E";
	String actual = doubleMetaphone.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_10_ijwu9() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = "AE";
	boolean alternate = true;
	String expected = "E";
	String actual = doubleMetaphone.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_11_rxXp10() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = "AX";
	boolean alternate = false;
	String expected = "AKS";
	String actual = doubleMetaphone.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doubleMetaphone_12_bCeC11() throws Exception {
	DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
	String value = "AX";
	boolean alternate = true;
	String expected = "AKS";
	String actual = doubleMetaphone.doubleMetaphone(value, alternate);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_doubleMetaphone_1_RQDn0() throws Exception {
		DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
		String value = "value";
		boolean alternate = true;
		String expected = "expected";
		String actual = doubleMetaphone.doubleMetaphone(value, alternate);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_doubleMetaphone_2_jNdm1() throws Exception {
		DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
		String value = "value";
		boolean alternate = false;
		String expected = "expected";
		String actual = doubleMetaphone.doubleMetaphone(value, alternate);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test1_FEzb0_1() throws Exception {
	final String value = "Ashcraft";
	final String primary = "AX150";
	final String alternate = "AS100";
	assertEquals(primary, new DoubleMetaphone().doubleMetaphone(value, false));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test1_FEzb0_2() throws Exception {
	final String value = "Ashcraft";
	final String primary = "AX150";
	final String alternate = "AS100";
	assertEquals(alternate, new DoubleMetaphone().doubleMetaphone(value, true));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test2_vpra1_1() throws Exception {
	final String value = "Atkinson";
	final String primary = "AT150";
	final String alternate = "AT150";
	assertEquals(primary, new DoubleMetaphone().doubleMetaphone(value, false));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test2_vpra1_2() throws Exception {
	final String value = "Atkinson";
	final String primary = "AT150";
	final String alternate = "AT150";
	assertEquals(alternate, new DoubleMetaphone().doubleMetaphone(value, true));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test3_BawA2_1() throws Exception {
	final String value = "Ashcroft";
	final String primary = "AX150";
	final String alternate = "AS100";
	assertEquals(primary, new DoubleMetaphone().doubleMetaphone(value, false));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test3_BawA2_2() throws Exception {
	final String value = "Ashcroft";
	final String primary = "AX150";
	final String alternate = "AS100";
	assertEquals(alternate, new DoubleMetaphone().doubleMetaphone(value, true));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test4_fuaw3_1() throws Exception {
	final String value = "Atkins";
	final String primary = "AT150";
	final String alternate = "AT150";
	assertEquals(primary, new DoubleMetaphone().doubleMetaphone(value, false));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test4_fuaw3_2() throws Exception {
	final String value = "Atkins";
	final String primary = "AT150";
	final String alternate = "AT150";
	assertEquals(alternate, new DoubleMetaphone().doubleMetaphone(value, true));}
}