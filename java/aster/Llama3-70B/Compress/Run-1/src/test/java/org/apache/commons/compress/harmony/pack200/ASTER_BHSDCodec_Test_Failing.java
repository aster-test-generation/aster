/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BHSDCodec_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLargest1_vlmK0() {
    BHSDCodec codec = new BHSDCodec(2, 256);
    assertEquals(255, codec.largest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLargest2_UJdT1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertEquals(1, codec.largest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_bOBM1() {
    Object obj = new Object();
    BHSDCodec codec = new BHSDCodec(256, 2);
    assertFalse(codec.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentValues_eGMp3() {
    BHSDCodec codec1 = new BHSDCodec(256, 2);
    BHSDCodec codec2 = new BHSDCodec(3, 4);
    assertFalse(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_ThreeParams_QNhT4() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 1);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 1);
    assertTrue(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_FourParams_ldDg5() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 1, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 1, 4);
    assertTrue(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSmallest2_ypVD1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertEquals(0, codec.smallest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSmallest3_ekzu2() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1); // Fix: s should be 1 which is within the range 0<=s<=2
    assertEquals(0, codec.smallest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetB2_MvTx1() {
    BHSDCodec codec = new BHSDCodec(2, 20, 30, 40);
    assertEquals(2, codec.getB());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetB3_Aynt2() {
    BHSDCodec codec = new BHSDCodec(2, 20, 30);
    assertEquals(2, codec.getB());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString2_DEWI1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertEquals("(1,2,1)", codec.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSigned_true_smwb0() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertTrue(codec.isSigned());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDelta_true_FoUq0() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertTrue(codec.isDelta());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDelta_false_EkyW1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertFalse(codec.isDelta());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_LemE0() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    int result = codec.hashCode();
    int expected = ((1 * 37 + 2) * 37 + 1);
    assert result == expected;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_2_vtfc1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    int result = codec.hashCode();
    int expected = ((1 * 37 + 2) * 37 + 1) * 37 + 0; 
    assertEquals(result, expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_3_slFs2() {
    BHSDCodec codec = new BHSDCodec(5, 256);
    int result = codec.hashCode();
    int expected = ((5 * 37 + 256) * 37 + 0) * 37 + 0; 
    assertEquals(result, expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCardinality1_zQLi0() {
    BHSDCodec codec = new BHSDCodec(2, 256);
    assertEquals(256, codec.cardinality());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCardinality2_hHzR1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertEquals(0, codec.cardinality());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCardinality3_NkKW2() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1); // s should be 1
    assertEquals(0, codec.cardinality());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodes2_eNDC1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertTrue(codec.encodes(2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodes3_CexO2() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertFalse(codec.encodes(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetS_1_CBoE0() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1); // Fix: s should be between 0 and 2
    assertEquals(1, codec.getS());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetS_2_PfWo1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertEquals(1, codec.getS());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetS_3_apVV2() {
    BHSDCodec codec = new BHSDCodec(5, 256);
    assertEquals(0, codec.getS()); 
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetH2_mgKH1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertEquals(2, codec.getH());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetH3_UWTG2() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1); // s should be between 0 and 2
    assertEquals(2, codec.getH());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetL1_iekU0() {
    BHSDCodec codec = new BHSDCodec(2, 256);
    assertEquals(1, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetL2_gJPP1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertEquals(0, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetL3_nnAG2() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1);
    assertEquals(2, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode5_xOok4() {
    BHSDCodec codec = new BHSDCodec(2, 3, 1);
    try {
        codec.encode(40, 10);
        fail();
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode8_TVyn7() {
    BHSDCodec codec = new BHSDCodec(2, 3, 1);
    try {
        codec.encode(-20, 10);
        fail();
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeInts1_eoRp0_KhVC0() {
    BHSDCodec codec = new BHSDCodec(256, 2);
    byte[] bytes = new byte[] {1, 2, 3, 4, 5};
    try {
        byte[] result = codec.encode(5, 0);
        assertArrayEquals(bytes, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_QGfc4_Dfyf0() {
    BHSDCodec codec = new BHSDCodec(256, 2);
    try {
        byte[] bytes = codec.encode(5, 0);
        assertNotNull(bytes);
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeInts5_MroP4_Ttjd0() {
    BHSDCodec codec = new BHSDCodec(256, 2);
    try {
        codec.encode(0, 0);
        fail("Expected Pack200Exception");
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_UTpe0_dCRZ0() {
    BHSDCodec codec = new BHSDCodec(256, 2);
    try {
        byte[] result = codec.encode(10, 0);
        assertArrayEquals(new byte[]{10}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_withThreeParams_Wuqp1_DNZt0() {
    BHSDCodec codec = new BHSDCodec(0, 2, 3);
    try {
        byte[] result = codec.encode(10, 0);
        assertArrayEquals(new byte[]{10}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_withFourParams_sqdo2_QRlW0() {
    BHSDCodec codec = new BHSDCodec(0, 2, 3, 4);
    try {
        byte[] result = codec.encode(10, 0);
        assertArrayEquals(new byte[]{10}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode1_RCSv0_Wrxk0() {
    BHSDCodec codec = new BHSDCodec(256, 2);
    try {
        byte[] result = codec.encode(10, 5);
        assertArrayEquals(new byte[]{5}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode2_NxhL1_mYBK0() {
    BHSDCodec codec = new BHSDCodec(2, 3, 0, 4);
    try {
        byte[] result = codec.encode(20, 10);
        assertArrayEquals(new byte[]{10, 2}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode7_OpQp6_KQkv0() {
    BHSDCodec codec = new BHSDCodec(256, 2);
    try {
        byte[] result = codec.encode(15, 5);
        assertArrayEquals(new byte[]{10}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode10_PBsL9_jnhc0() {
    BHSDCodec codec = new BHSDCodec(256, 2);
    try {
        byte[] result = codec.encode(25, 5);
        assertArrayEquals(new byte[]{20}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode11_rbUb10_BNPJ0() {
    BHSDCodec codec = new BHSDCodec(0, 3, 1, 4);
    try {
        byte[] result = codec.encode(30, 10);
        assertArrayEquals(new byte[]{12, 2}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode13_KKvm12_Gzmt0() {
    BHSDCodec codec = new BHSDCodec(256, 2);
    try {
        byte[] result = codec.encode(20, 5);
        assertArrayEquals(new byte[]{15}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode14_Vrmz13_BrfT0() {
    BHSDCodec codec = new BHSDCodec(0, 3, 1, 4);
    try {
        byte[] result = codec.encode(25, 10);
        assertArrayEquals(new byte[]{11, 2}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLargest1_vlmK0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertEquals(0, codec.largest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLargest2_UJdT1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(0, codec.largest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLargest3_zaRa2_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertEquals(0, codec.largest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_DoYP0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertTrue(codec.equals(codec));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_bOBM1_fid1() {
    Object obj = new Object();
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertFalse(codec.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_qcmr2_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2);
    BHSDCodec codec2 = new BHSDCodec(1, 2);
    assertTrue(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentValues_eGMp3_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2);
    BHSDCodec codec2 = new BHSDCodec(3, 4);
    assertFalse(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_ThreeParams_QNhT4_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3);
    assertTrue(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_FourParams_ldDg5_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3, 4);
    assertTrue(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSmallest1_SjVr0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertEquals(0, codec.smallest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSmallest2_ypVD1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(0, codec.smallest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSmallest3_ekzu2_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertEquals(0, codec.smallest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetB1_yyda0_fid1() {
    BHSDCodec codec = new BHSDCodec(10, 20);
    assertEquals(10, codec.getB());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetB2_MvTx1_fid1() {
    BHSDCodec codec = new BHSDCodec(10, 20, 30, 40);
    assertEquals(10, codec.getB());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetB3_Aynt2_fid1() {
    BHSDCodec codec = new BHSDCodec(10, 20, 30);
    assertEquals(10, codec.getB());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString1_vZlt0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertEquals("(1,2)", codec.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString2_DEWI1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals("(1,2,3,4)", codec.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString3_ewGO2_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertEquals("(1,2,3)", codec.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString4_IxDv3_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 0, 0);
    assertEquals("(1,2)", codec.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSigned_true_smwb0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertTrue(codec.isSigned());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSigned_false_OYtJ1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 0);
    assertFalse(codec.isSigned());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDelta_true_FoUq0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertTrue(codec.isDelta());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDelta_false_EkyW1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertFalse(codec.isDelta());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_LemE0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    int result = codec.hashCode();
    int expected = ((1 * 37 + 2) * 37 + 3) * 37 + 4;
    assert result == expected;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_2_vtfc1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    int result = codec.hashCode();
    int expected = ((1 * 37 + 2) * 37 + 3) * 37 + 0; // default value for d
    assert result == expected;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_3_slFs2_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    int result = codec.hashCode();
    int expected = ((1 * 37 + 2) * 37 + 0) * 37 + 0; // default values for s and d
    assert result == expected;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCardinality1_zQLi0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertEquals(0, codec.cardinality());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCardinality2_hHzR1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(0, codec.cardinality());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCardinality3_NkKW2_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertEquals(0, codec.cardinality());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodes1_uFzP0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertTrue(codec.encodes(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodes2_eNDC1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertTrue(codec.encodes(2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodes3_CexO2_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertFalse(codec.encodes(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetS_1_CBoE0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertEquals(3, codec.getS());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetS_2_PfWo1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(3, codec.getS());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetS_3_apVV2_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertEquals(0, codec.getS()); // default value of s is 0
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetH1_gumg0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertEquals(2, codec.getH());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetH2_mgKH1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(2, codec.getH());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetH3_UWTG2_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertEquals(2, codec.getH());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetL1_iekU0_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertEquals(0, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetL2_gJPP1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(0, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetL3_nnAG2_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertEquals(0, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode4_MNRL3_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        codec.encode(-10, 5);
        fail();
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode5_xOok4_fid1() {
    BHSDCodec codec = new BHSDCodec(2, 3, 1, 4);
    try {
        codec.encode(40, 10);
        fail();
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode8_TVyn7_fid1() {
    BHSDCodec codec = new BHSDCodec(2, 3, 1, 4);
    try {
        codec.encode(-20, 10);
        fail();
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode12_Zmmd11_fid1() {
    BHSDCodec codec = new BHSDCodec(3, 4, 2);
    try {
        codec.encode(-30, 20);
        fail();
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeInts1_eoRp0_KhVC0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    byte[] bytes = new byte[] {1, 2, 3, 4, 5};
    try {
        byte[] result = codec.encode(5, 0);
        assertArrayEquals(bytes, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_QGfc4_Dfyf0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] bytes = codec.encode(5, 0);
        assertNotNull(bytes);
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeInts5_MroP4_Ttjd0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        codec.encode(0, 0);
        fail("Expected Pack200Exception");
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_UTpe0_dCRZ0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(10, 0);
        assertArrayEquals(new byte[]{10}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_withThreeParams_Wuqp1_DNZt0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    try {
        byte[] result = codec.encode(10, 0);
        assertArrayEquals(new byte[]{10}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_withFourParams_sqdo2_QRlW0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    try {
        byte[] result = codec.encode(10, 0);
        assertArrayEquals(new byte[]{10}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode1_RCSv0_Wrxk0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(10, 5);
        assertArrayEquals(new byte[]{5}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode2_NxhL1_mYBK0_fid2() {
    BHSDCodec codec = new BHSDCodec(2, 3, 1, 4);
    try {
        byte[] result = codec.encode(20, 10);
        assertArrayEquals(new byte[]{10, 2}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode3_eaNm2_McZm0_fid2() {
    BHSDCodec codec = new BHSDCodec(3, 4, 2);
    try {
        byte[] result = codec.encode(30, 20);
        assertArrayEquals(new byte[]{12, 3, 1}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode6_GsBK5_lURf0_fid2() {
    BHSDCodec codec = new BHSDCodec(3, 4, 2);
    try {
        byte[] result = codec.encode(35, 20);
        assertArrayEquals(new byte[]{13, 2, 1}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode7_OpQp6_KQkv0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(15, 5);
        assertArrayEquals(new byte[]{10}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode9_vOsv8_FRxZ0_fid2() {
    BHSDCodec codec = new BHSDCodec(3, 4, 2);
    try {
        byte[] result = codec.encode(40, 20);
        assertArrayEquals(new byte[]{14, 3, 1}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode10_PBsL9_jnhc0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(25, 5);
        assertArrayEquals(new byte[]{20}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode11_rbUb10_BNPJ0_fid2() {
    BHSDCodec codec = new BHSDCodec(2, 3, 1, 4);
    try {
        byte[] result = codec.encode(30, 10);
        assertArrayEquals(new byte[]{12, 2}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode13_KKvm12_Gzmt0_fid2() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(20, 5);
        assertArrayEquals(new byte[]{15}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode14_Vrmz13_BrfT0_fid2() {
    BHSDCodec codec = new BHSDCodec(2, 3, 1, 4);
    try {
        byte[] result = codec.encode(25, 10);
        assertArrayEquals(new byte[]{11, 2}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode15_bdHU14_XqvF0_fid2() {
    BHSDCodec codec = new BHSDCodec(3, 4, 2);
    try {
        byte[] result = codec.encode(45, 20);
        assertArrayEquals(new byte[]{15, 3, 1}, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
}