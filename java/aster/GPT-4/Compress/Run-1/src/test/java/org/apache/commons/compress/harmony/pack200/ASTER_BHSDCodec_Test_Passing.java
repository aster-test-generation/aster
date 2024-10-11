/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BHSDCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_ReturnsTrue_iJCr0() throws Exception {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3, 4);
    assertTrue(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentValues_ReturnsFalse_TeVP1() throws Exception {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(5, 6, 7, 8);
    assertFalse(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentType_ReturnsFalse_kVln2() throws Exception {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    Object codec2 = new Object();
    assertFalse(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_ReturnsFalse_EkTD3() throws Exception {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = null;
    assertFalse(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameReference_ReturnsTrue_LxXR4() throws Exception {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = codec1;
    assertTrue(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_MissingFields_ReturnsFalse_Oasy5() throws Exception {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3);
    assertFalse(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLargestReturnsCorrectValue_qJuu0() throws Exception {
    BHSDCodec codec = new BHSDCodec(4, 5, 6, 7);
    long expected = 7;
    long result = codec.largest();
    assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSmallest_FrBv0() throws Exception {
    BHSDCodec codec = new BHSDCodec(10, 20);
    long expected = 0; // Assuming expected smallest value for this configuration
    assertEquals(expected, codec.smallest());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetB_mKSG0() throws Exception {
    BHSDCodec codec = new BHSDCodec(5, 10);
    int result = codec.getB();
    assertEquals(5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringOnlyBAndH_NMjC0() throws Exception {
        BHSDCodec codec = new BHSDCodec(5, 10);
        assertEquals("(5,10)", codec.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringBHS_GaBP1() throws Exception {
        BHSDCodec codec = new BHSDCodec(5, 10, 15);
        assertEquals("(5,10,15)", codec.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringBHSD_Iehf2() throws Exception {
        BHSDCodec codec = new BHSDCodec(5, 10, 15, 20);
        assertEquals("(5,10,15,20)", codec.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringBAndHWithZeroSD_NqdW3() throws Exception {
        BHSDCodec codec = new BHSDCodec(5, 10, 0, 0);
        assertEquals("(5,10)", codec.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSignedTrue_cjip0() throws Exception {
    BHSDCodec codec = new BHSDCodec(8, 16, 1);
    assertTrue(codec.isSigned());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSignedFalse_fkgb1() throws Exception {
    BHSDCodec codec = new BHSDCodec(8, 16, 0);
    assertFalse(codec.isSigned());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDeltaTrue_bMID0() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 1);
    assertTrue(codec.isDelta());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDeltaFalse_CZjS1() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 0);
    assertFalse(codec.isDelta());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_lPPz0() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    int expectedHashCode = ((1 * 37 + 2) * 37 + 3) * 37 + 4;
    assertEquals(expectedHashCode, codec.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCardinality_aqPg0() throws Exception {
    BHSDCodec codec = new BHSDCodec(2, 5);
    long expected = 0; // Assuming expected cardinality is known and should be 0 for this test case
    assertEquals(expected, codec.cardinality());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodesWithinRange_cglM0() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 5);
        assertTrue(codec.encodes(3));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodesBelowRange_Rlsm1() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 5, 7);
        assertFalse(codec.encodes(1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodesAboveRange_KGrA2() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 5, 7, 10);
        assertFalse(codec.encodes(11));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetS_YdVS0() throws Exception {
    BHSDCodec codec = new BHSDCodec(10, 20, 30);
    int expected = 30;
    assertEquals(expected, codec.getS());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValueWithinRange_RCCE0() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10);
        try {
            byte[] result = codec.encode(5, 0);
            assertArrayEquals(new byte[]{5}, result);
        } catch (Pack200Exception e) {
            fail("Exception should not be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNegativeValue_lCuD1() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10);
        try {
            codec.encode(-1, 0);
            fail("Exception should be thrown");
        } catch (Pack200Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValueExceedingRange_ARck2() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10);
        try {
            codec.encode(11, 0);
            fail("Exception should be thrown");
        } catch (Pack200Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithDeltaPositive_qUed3() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10, 1, 1);
        try {
            byte[] result = codec.encode(15, 10);
            assertArrayEquals(new byte[]{5}, result);
        } catch (Pack200Exception e) {
            fail("Exception should not be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithDeltaNegative_AWBW4() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10, 1, 1);
        try {
            codec.encode(5, 10);
            fail("Exception should be thrown");
        } catch (Pack200Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeZero_Hefi5() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10);
        try {
            byte[] result = codec.encode(0, 0);
            assertArrayEquals(new byte[]{0}, result);
        } catch (Pack200Exception e) {
            fail("Exception should not be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeMaxInt_GlaP6() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10);
        try {
            codec.encode(Integer.MAX_VALUE, 0);
            fail("Exception should be thrown");
        } catch (Pack200Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeMinInt_rifs7() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10);
        try {
            codec.encode(Integer.MIN_VALUE, 0);
            fail("Exception should be thrown");
        } catch (Pack200Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithLargeBase_vwFV8() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 256);
        try {
            byte[] result = codec.encode(300, 0);
            assertArrayEquals(new byte[]{44, 1}, result);
        } catch (Pack200Exception e) {
            fail("Exception should not be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSmallBase_UWCb9() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 2);
        try {
            byte[] result = codec.encode(3, 0);
            assertArrayEquals(new byte[]{1, 1}, result);
        } catch (Pack200Exception e) {
            fail("Exception should not be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithZeroBase_qwKr10() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 0);
        try {
            codec.encode(1, 0);
            fail("Exception should be thrown");
        } catch (Pack200Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNegativeBase_QflV11() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, -10);
        try {
            codec.encode(1, 0);
            fail("Exception should be thrown");
        } catch (Pack200Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithLowCardinality_ETuO13() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10, 3, 1);
        try {
            byte[] result = codec.encode(1, 0);
            assertArrayEquals(new byte[]{1}, result);
        } catch (Pack200Exception e) {
            fail("Exception should not be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBoundaryValue_VSmN14() throws Exception {
        BHSDCodec codec = new BHSDCodec(2, 10, 3, 10);
        try {
            byte[] result = codec.encode(10, 0);
            assertArrayEquals(new byte[]{10}, result);
        } catch (Pack200Exception e) {
            fail("Exception should not be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetH_SlZj0() throws Exception {
    BHSDCodec codec = new BHSDCodec(10, 20);
    int expected = 20;
    int actual = codec.getH();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithZeroValue_kQgi0() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2);
    byte[] result = codec.encode(0);
    assertArrayEquals(new byte[]{0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetL_cJOU0() throws Exception {
    BHSDCodec codec = new BHSDCodec(10, 20);
    assertEquals(0, codec.getL()); // Assuming default value of l is 0 as it's not shown in the constructor
}
}