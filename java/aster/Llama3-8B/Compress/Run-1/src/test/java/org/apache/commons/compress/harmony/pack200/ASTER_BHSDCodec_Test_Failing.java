/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BHSDCodec_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_LXEz0() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    boolean result = codec1.equals(codec1);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObject_oRxl1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(5, 6, 7, 8);
    boolean result = codec1.equals(codec2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectDifferentConstructor_wliL2() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3, 4);
    boolean result = codec1.equals(codec2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_VtUu3() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    boolean result = codec.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_sLVc4() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    Object obj = new Object();
    boolean result = codec.equals(obj);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectDifferentState_uoLl5() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3, 5);
    boolean result = codec1.equals(codec2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLargest_Nxdj0() {
        BHSDCodec codec = new BHSDCodec(1, 2);
        assertEquals(0, codec.largest());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLargest2_xjFB1() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        assertEquals(0, codec.largest());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLargest3_msTI2() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        assertEquals(0, codec.largest());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSmallest_flPM0() {
        BHSDCodec codec = new BHSDCodec(1, 2);
        long result = codec.smallest();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB_BXbQ0() {
        BHSDCodec codec = new BHSDCodec(1, 2);
        assertEquals(1, codec.getB());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB2_FcJr1() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        assertEquals(1, codec.getB());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB3_JBUf2() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        assertEquals(1, codec.getB());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithAllParams_FbyD0() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    String result = codec.toString();
    Assertions.assertEquals("(1,2,3,4)", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithTwoParams_wezx1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    String result = codec.toString();
    Assertions.assertEquals("(1,2)", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithThreeParams_MEvY2() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    String result = codec.toString();
    Assertions.assertEquals("(1,2,3)", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSignedTrue_vNfZ0() {
    BHSDCodec codec = new BHSDCodec(1, 2, 1, 3);
    boolean result = codec.isSigned();
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSignedFalse_VcXI1() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    boolean result = codec.isSigned();
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDeltaTrue_UDXv0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    boolean result = codec.isDelta();
    assert(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDeltaFalse_BOTf1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 0);
    boolean result = codec.isDelta();
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_aaqd0() {
        BHSDCodec codec = new BHSDCodec(1, 2);
        int result = codec.hashCode();
        assert result == ((1 * 37 + 2) * 37 + 0) * 37 + 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithS_WbUB1() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        int result = codec.hashCode();
        assert result == ((1 * 37 + 2) * 37 + 3) * 37 + 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithD_kYTw2() {
        BHSDCodec codec = new BHSDCodec(1, 2, 0, 4);
        int result = codec.hashCode();
        assert result == ((1 * 37 + 2) * 37 + 0) * 37 + 4;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithAll_UjiA3() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        int result = codec.hashCode();
        assert result == ((1 * 37 + 2) * 37 + 3) * 37 + 4;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCardinalityWithThreeParams_oOIa0() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        long result = codec.cardinality();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCardinalityWithTwoParams_woOw1() {
        BHSDCodec codec = new BHSDCodec(1, 2);
        long result = codec.cardinality();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodesWithThreeParameters_bcsU0() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        long value = 2;
        boolean result = codec.encodes(value);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodesWithTwoParameters_elub1() {
        BHSDCodec codec = new BHSDCodec(1, 2);
        long value = 1;
        boolean result = codec.encodes(value);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetS_Dtdy0() {
        BHSDCodec codec = new BHSDCodec(1, 2);
        int result = codec.getS();
        assert result == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetS1_ZGVI1() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        int result = codec.getS();
        assert result == 3;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetS2_VeYT2() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        int result = codec.getS();
        assert result == 3;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetH_LSeH0() {
        BHSDCodec codec = new BHSDCodec(1, 2);
        assertEquals(2, codec.getH());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetH2_Akqj1() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        assertEquals(2, codec.getH());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetH3_jmBh2() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        assertEquals(2, codec.getH());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLWithThreeParams_avME0() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        assertEquals(0, codec.getL());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLWithTwoParams_TAtu1() {
        BHSDCodec codec = new BHSDCodec(1, 2);
        assertEquals(0, codec.getL());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeInts3_vfkh2_WdpN0() throws IOException, Pack200Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    int result = codec.getL();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCardinalityWithOneParam_kJmS2_UZHu1() {
    BHSDCodec codec = new BHSDCodec(1, 0, 0, 0);
    long result = codec.cardinality();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodesWithOneParameter_frSK2_JDcJ0() {
    BHSDCodec codec = new BHSDCodec(1, 0, 0);
    long value = 0;
    boolean result = codec.encodes(value);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLWithOneParam_gWVm2_CPsW1() {
    BHSDCodec codec = new BHSDCodec(1, 0, 0, 0);
    assertEquals(0, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode1_GCTj0_LyNn0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(0, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode2_Wjvq1_NeID0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(1, 0);
        assert result.length == 1;
    } catch (Exception e) {
        fail("encode method should not throw Pack200Exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode3_JiwV2_aTHA0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(2, 0);
        assert result.length == 1;
    } catch (Exception e) {
        fail("encode method should not throw Exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode4_Ftsf3_sEGb0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(3, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode5_MYEi4_COuL0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(4, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        fail("encode method should not throw Pack200Exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode6_KUGZ5_BbXI0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(5, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        fail("Pack200Exception was thrown, but it should not be");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode7_Bslf6_ETwt0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(6, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode8_VnxT7_BUyw0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(7, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode9_DDyT8_ApXD0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(8, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode10_lbZx9_zYOa0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(9, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode11_ADyd10_LQto0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(10, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        fail("Unexpected exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode12_eMYn11_LDMR0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(11, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode13_WYRK12_fqGM0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(12, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode14_CkeY13_DJsD0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(13, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode15_CwSl14_wpbW0() {
    BHSDCodec codec = new BHSDCodec(1, 2);
    try {
        byte[] result = codec.encode(14, 0);
        assert result.length == 1;
    } catch (org.apache.commons.compress.harmony.pack200.Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
}