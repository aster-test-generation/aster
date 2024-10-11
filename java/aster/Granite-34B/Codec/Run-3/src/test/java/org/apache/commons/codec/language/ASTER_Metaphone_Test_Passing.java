/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Metaphone_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_tiEc0() throws EncoderException {
        Metaphone metaphone = new Metaphone();
        String input = "hello";
        Object expected = metaphone.metaphone(input);
        Object actual = metaphone.encode(input);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxCodeLen_XRWW0() throws Exception {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(1);
        assertEquals(1, metaphone.getMaxCodeLen());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxCodeLenWithZero_vUyJ1() throws Exception {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(0);
        assertEquals(0, metaphone.getMaxCodeLen());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxCodeLenWithNegativeNumber_FIZH2() throws Exception {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(-10);
        assertEquals(-10, metaphone.getMaxCodeLen());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_1() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "test"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_2() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "tset"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_3() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "tast"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_4() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "taet"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_5() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "tet"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_6() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "es"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_7() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "st"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_8() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "ts"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_9() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "t"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsMetaphoneEqual_Qhte0_10() throws Exception {
		Metaphone metaphone = new Metaphone();
		assertTrue(metaphone.isMetaphoneEqual("test", "s"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_1() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("ALFKG", metaphone.encode("AlFKG"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_2() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("AW12", metaphone.encode("AW12"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_3() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("AX12", metaphone.encode("Ax12"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_4() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("TLFX0", metaphone.encode("TLFX0"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_5() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("T1L80", metaphone.encode("T1L80"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_6() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("T7L80", metaphone.encode("T7L80"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_7() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("T5L80", metaphone.encode("T5L80"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_8() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("T3L80", metaphone.encode("T3L80"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_9() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("T6L80", metaphone.encode("T6L80"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_updt0_10() throws Exception {
        Metaphone metaphone = new Metaphone();
        assertEquals("T4L80", metaphone.encode("T4L80"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen_ehRL0() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen1_Xiao1() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen2_rNDv2() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen3_QwDt3() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(3, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen4_HHrd4() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(4, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen5_YYWd5() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen6_tVSr6() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(6, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen7_yclo7() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(7, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen8_uMvo8() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(8, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen9_vOdj9() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(9, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen10_sCvP10() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(10, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen11_lfwK11() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(11, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen12_Lbtx12() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(12, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen13_ejYd13() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(13, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen14_emDl14() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(14, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen15_IQym15() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(15, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen16_LpIb16() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(16, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen17_clpU17() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(17, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen18_qHdM18() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(18, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxCodeLen19_BabV19() throws Exception {
    Metaphone metaphone = new Metaphone();
    int result = metaphone.getMaxCodeLen();
    assertEquals(19, result);
}
}