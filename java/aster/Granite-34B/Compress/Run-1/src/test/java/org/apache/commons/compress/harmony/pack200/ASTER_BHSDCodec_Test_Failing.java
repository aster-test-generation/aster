/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
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
    void testLargest_gQKC0() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
        long actualLargest = bHSDCodec.largest();
        long expectedLargest = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expectedLargest, actualLargest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLargest2_vrVa1() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3, 4);
        long actualLargest = bHSDCodec.largest();
        long expectedLargest = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expectedLargest, actualLargest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLargest3_IOIf2() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3);
        long actualLargest = bHSDCodec.largest();
        long expectedLargest = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expectedLargest, actualLargest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB_bVHE0_1() {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2);
        bhsdCodec = new BHSDCodec(3, 4, 5, 6);
        bhsdCodec = new BHSDCodec(7, 8, 9);
        assertEquals(1, bhsdCodec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB_bVHE0_2() {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2);
        bhsdCodec = new BHSDCodec(3, 4, 5, 6);
        bhsdCodec = new BHSDCodec(7, 8, 9);
        assertEquals(3, bhsdCodec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB_bVHE0_3() {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2);
        bhsdCodec = new BHSDCodec(3, 4, 5, 6);
        bhsdCodec = new BHSDCodec(7, 8, 9);
        assertEquals(7, bhsdCodec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_1_TlOG0() {
        final BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
        assertEquals("(1,2)", bHSDCodec.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_2_pwPu1() {
        final BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3, 4);
        assertEquals("(1,2,3,4)", bHSDCodec.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_3_fgGH2() {
        final BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3);
        assertEquals("(1,2,3)", bHSDCodec.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSignedWhenSIsNonZero_fQAH0() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        boolean result = codec.isSigned();
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSignedWhenSIsZero_gNWn1() {
        BHSDCodec codec = new BHSDCodec(1, 2, 0, 4);
        boolean result = codec.isSigned();
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameObject_bkrD0() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(true, codec.equals(codec));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNullObject_oWEu1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(true, codec.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentObjectType_GDJA2() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(false, codec.equals(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentBValue_qOTL3() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(5, 2, 3, 4);
    assertNotEquals(true, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentHValue_wyxK4() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 5, 3, 4);
    assertNotEquals(true, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentSValue_xMEW5() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 5, 4);
    assertNotEquals(true, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentDValue_Xpmt6() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3, 5);
    assertNotEquals(true, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithAllSameValues_XmyU7() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3, 4);
    assertEquals(true, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithAllDifferentValues_KcGF8() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(5, 6, 7, 8);
    assertNotEquals(true, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithPartiallySameValues_ySyN9() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3, 6);
    assertEquals(false, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeltaWithBDZero_fODC0() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 0);
        boolean actual = codec.isDelta();
        boolean expected = false;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeltaWithBDNotZero_QNcu1() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        boolean actual = codec.isDelta();
        boolean expected = true;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode1_tMJi0() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
        assertEquals(92, bHSDCodec.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode2_vzyg1() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3, 4);
        assertEquals(1502, bHSDCodec.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode3_tbKa2() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3);
        assertEquals(92, bHSDCodec.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCardinality_XAxO0_1() {
        BHSDCodec bhsdCodec1 = new BHSDCodec(1, 2);
        BHSDCodec bhsdCodec2 = new BHSDCodec(1, 2, 3, 4);
        BHSDCodec bhsdCodec3 = new BHSDCodec(1, 2, 3);
        assertEquals(0, bhsdCodec1.cardinality());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCardinality_XAxO0_2() {
        BHSDCodec bhsdCodec1 = new BHSDCodec(1, 2);
        BHSDCodec bhsdCodec2 = new BHSDCodec(1, 2, 3, 4);
        BHSDCodec bhsdCodec3 = new BHSDCodec(1, 2, 3);
        assertEquals(0, bhsdCodec2.cardinality());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCardinality_XAxO0_3() {
        BHSDCodec bhsdCodec1 = new BHSDCodec(1, 2);
        BHSDCodec bhsdCodec2 = new BHSDCodec(1, 2, 3, 4);
        BHSDCodec bhsdCodec3 = new BHSDCodec(1, 2, 3);
        assertEquals(0, bhsdCodec3.cardinality());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodesWhenValueIsLargest_VxMr0() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        boolean result = codec.encodes(4L);
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodesWhenValueIsSmallest_ViFf1() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        boolean result = codec.encodes(1L);
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodesWhenValueIsBetweenSmallestAndLargest_xjwm2() {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        boolean result = codec.encodes(2L);
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetS_peoJ0() {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2, 3, 4);
        assertEquals(3, bhsdCodec.getS());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSWithNoSParameter_YoJe1() {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2, 3);
        assertEquals(3, bhsdCodec.getS());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSWithNoParameters_EDtb2() {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2);
        assertEquals(0, bhsdCodec.getS());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetH_ZLnh0_1() {
        BHSDCodec bhsdCodec1 = new BHSDCodec(1, 2);
        BHSDCodec bhsdCodec2 = new BHSDCodec(3, 4, 5, 6);
        BHSDCodec bhsdCodec3 = new BHSDCodec(7, 8, 9);
        assertEquals(2, bhsdCodec1.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetH_ZLnh0_2() {
        BHSDCodec bhsdCodec1 = new BHSDCodec(1, 2);
        BHSDCodec bhsdCodec2 = new BHSDCodec(3, 4, 5, 6);
        BHSDCodec bhsdCodec3 = new BHSDCodec(7, 8, 9);
        assertEquals(4, bhsdCodec2.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetH_ZLnh0_3() {
        BHSDCodec bhsdCodec1 = new BHSDCodec(1, 2);
        BHSDCodec bhsdCodec2 = new BHSDCodec(3, 4, 5, 6);
        BHSDCodec bhsdCodec3 = new BHSDCodec(7, 8, 9);
        assertEquals(8, bhsdCodec3.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SUTE0() throws Pack200Exception {
        BHSDCodec codec = new BHSDCodec(1, 2);
        byte[] encoded = codec.encode(3);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAllParameters_skqa1() throws Pack200Exception {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        byte[] encoded = codec.encode(5);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithThreeParameters_Qefn2() throws Pack200Exception {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        byte[] encoded = codec.encode(4);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDelta_DtfJ9() {
        BHSDCodec codec = new BHSDCodec(1, 1);
        assertFalse(codec.isDelta());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSigned_qUUx10() {
        BHSDCodec codec = new BHSDCodec(1, 1);
        assertFalse(codec.isSigned());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSmallest_lOHV0_KTmt0() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3, 4);
        long actual = bHSDCodec.smallest();
        long expected = 0;
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSmallest_Nnjh1_KZBt0() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3);
        long actual = bHSDCodec.smallest();
        long expected = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSmallest_tKMs2_sJBV1() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
        long actual = bHSDCodec.smallest();
        long expected = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNullObject_oWEu1_fid1() {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(false, codec.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentBValue_qOTL3_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(5, 2, 3, 4);
    assertEquals(false, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentHValue_wyxK4_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 5, 3, 4);
    assertEquals(false, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentSValue_xMEW5_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 5, 4);
    assertEquals(false, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentDValue_Xpmt6_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3, 5);
    assertEquals(false, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithAllDifferentValues_KcGF8_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(5, 6, 7, 8);
    assertEquals(false, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithPartiallySameValues_ySyN9_fid1() {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 5, 6);
    assertEquals(false, codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB_bVHE0() {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2);
        assertEquals(1, bhsdCodec.getB());
        bhsdCodec = new BHSDCodec(3, 4, 5, 6);
        assertEquals(3, bhsdCodec.getB());
        bhsdCodec = new BHSDCodec(7, 8, 9);
        assertEquals(7, bhsdCodec.getB());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCardinality_XAxO0() {
        BHSDCodec bhsdCodec1 = new BHSDCodec(1, 2);
        assertEquals(0, bhsdCodec1.cardinality());
        BHSDCodec bhsdCodec2 = new BHSDCodec(1, 2, 3, 4);
        assertEquals(0, bhsdCodec2.cardinality());
        BHSDCodec bhsdCodec3 = new BHSDCodec(1, 2, 3);
        assertEquals(0, bhsdCodec3.cardinality());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetH_ZLnh0() {
        BHSDCodec bhsdCodec1 = new BHSDCodec(1, 2);
        assertEquals(2, bhsdCodec1.getH());
        BHSDCodec bhsdCodec2 = new BHSDCodec(3, 4, 5, 6);
        assertEquals(4, bhsdCodec2.getH());
        BHSDCodec bhsdCodec3 = new BHSDCodec(7, 8, 9);
        assertEquals(8, bhsdCodec3.getH());
    }
}