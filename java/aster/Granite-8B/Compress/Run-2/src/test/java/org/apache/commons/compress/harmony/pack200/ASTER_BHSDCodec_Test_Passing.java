/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BHSDCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInts1_XhXR0() throws IOException, Pack200Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(0, 0);
        int n = 0;
        InputStream in = null;
        int firstValue = 0;
        int[] result = bHSDCodec.decodeInts(n, in, firstValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInts2_puhP1() throws IOException, Pack200Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(0, 0, 0, 0);
        int n = 0;
        InputStream in = null;
        int firstValue = 0;
        int[] result = bHSDCodec.decodeInts(n, in, firstValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInts3_jbIO2() throws IOException, Pack200Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(0, 0, 0);
        int n = 0;
        InputStream in = null;
        int firstValue = 0;
        int[] result = bHSDCodec.decodeInts(n, in, firstValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameObject_DtrP0() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertTrue(codec.equals(codec));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameValues_cuOe1() throws Exception {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(1, 2, 3, 4);
    assertTrue(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentValues_inzN2() throws Exception {
    BHSDCodec codec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec codec2 = new BHSDCodec(5, 6, 7, 8);
    assertFalse(codec1.equals(codec2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNull_ffri3() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertFalse(codec.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentObjectTypes_yGPw4() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertFalse(codec.equals(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLargest_SakJ0() throws Exception {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 1);
        long result = bhsdCodec.largest();
        assertEquals(0L, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLargest2_dVrV1() throws Exception {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 1, 1, 1);
        long result = bhsdCodec.largest();
        assertEquals(0L, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLargest3_TPvh2() throws Exception {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 1, 1);
        long result = bhsdCodec.largest();
        assertEquals(0L, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSmallest_NFDd0() throws Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 1);
        long smallest = bHSDCodec.smallest();
        assertEquals(0L, smallest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSmallest2_WPhq1() throws Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 1, 1, 1);
        long smallest = bHSDCodec.smallest();
        assertEquals(0L, smallest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSmallest3_OdEf2() throws Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 1, 1);
        long smallest = bHSDCodec.smallest();
        assertEquals(0L, smallest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB_XAXY0() throws Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
        int b = bHSDCodec.getB();
        assertEquals(1, b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB2_igLc1() throws Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3, 4);
        int b = bHSDCodec.getB();
        assertEquals(1, b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetB3_JTYM2() throws Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3);
        int b = bHSDCodec.getB();
        assertEquals(1, b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString1_HEbt0() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2);
    assertEquals("(1,2)", codec.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString2_ocTM1() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
    assertEquals("(1,2,3,4)", codec.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString3_YrmY2() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 3);
    assertEquals("(1,2,3)", codec.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString4_PfgA3() throws Exception {
    BHSDCodec codec = new BHSDCodec(1, 2, 0, 0);
    assertEquals("(1,2)", codec.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSignedWithPositiveSign_MoEa0() throws Exception {
        BHSDCodec codec = new BHSDCodec(8, 8, 1, 0);
        boolean result = codec.isSigned();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSignedWithNegativeSign_ABpR1() throws Exception {
        BHSDCodec codec = new BHSDCodec(8, 8, -1, 0);
        boolean result = codec.isSigned();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDecodeInts1_jqYU0() throws IOException, Pack200Exception {
		BHSDCodec bHSDCodec = new BHSDCodec(1, 1, 1, 1);
		int[] ints = bHSDCodec.decodeInts(1, null);
		assertEquals(1, ints.length);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeltaWithDelta_PrOJ0() throws Exception {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        boolean result = codec.isDelta();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeltaWithoutDelta_ZSdS1() throws Exception {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        boolean result = codec.isDelta();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_dbKt0() throws Exception {
    BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
    assertEquals(1060720, bHSDCodec.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode2_ZqjZ1() throws Exception {
    BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3, 4);
    assertEquals(1060720, bHSDCodec.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode3_tdGK2() throws Exception {
    BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3);
    assertEquals(1060720, bHSDCodec.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDecode1_csJa0() throws IOException, Pack200Exception {
		BHSDCodec bHSDCodec = new BHSDCodec(1, 1, 1, 1);
		int result = bHSDCodec.decode(null, 1L);
		assertEquals(0, result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCardinality_MOWm0() throws Exception {
        BHSDCodec codec = new BHSDCodec(1, 2);
        long cardinality = codec.cardinality();
        assertEquals(0, cardinality);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCardinality2_AAcq1() throws Exception {
        BHSDCodec codec = new BHSDCodec(1, 2, 3, 4);
        long cardinality = codec.cardinality();
        assertEquals(0, cardinality);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCardinality3_UcTQ2() throws Exception {
        BHSDCodec codec = new BHSDCodec(1, 2, 3);
        long cardinality = codec.cardinality();
        assertEquals(0, cardinality);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodes_fQgO0() throws Exception {
        BHSDCodec codec = new BHSDCodec(1, 2);
        boolean result = codec.encodes(10L);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodes2_UkSz1() throws Exception {
        BHSDCodec codec = new BHSDCodec(1, 2);
        boolean result = codec.encodes(0L);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodes3_zYeo2() throws Exception {
        BHSDCodec codec = new BHSDCodec(1, 2);
        boolean result = codec.encodes(5L);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetS_gUFv0() throws Exception {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2);
        assertEquals(0, bhsdCodec.getS());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetS2_Mctz1() throws Exception {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2, 3, 4);
        assertEquals(3, bhsdCodec.getS());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetS3_ERUx2() throws Exception {
        BHSDCodec bhsdCodec = new BHSDCodec(1, 2, 3);
        assertEquals(3, bhsdCodec.getS());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode1_dCHN0() throws Pack200Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 1, 1, 1);
        int value = 1;
        int last = 1;
        byte[] expected = {0};
        byte[] actual = bHSDCodec.encode(value, last);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetH_XDyQ0() throws Exception {
		BHSDCodec bhsdCodec = new BHSDCodec(1, 2);
		int h = bhsdCodec.getH();
		assertEquals(2, h);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetH_lPVM1() throws Exception {
		BHSDCodec bhsdCodec = new BHSDCodec(1, 2, 3, 4);
		int h = bhsdCodec.getH();
		assertEquals(2, h);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetH_vIkG2() throws Exception {
		BHSDCodec bhsdCodec = new BHSDCodec(1, 2, 3);
		int h = bhsdCodec.getH();
		assertEquals(2, h);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_meLK0() throws Exception {
        BHSDCodec codec = new BHSDCodec(1, 2);
        byte[] result = codec.encode(3);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetL_bjfe0() throws Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
        int result = bHSDCodec.getL();
        assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetL2_fofp1() throws Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3, 4);
        int result = bHSDCodec.getL();
        assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetL3_mpJm2() throws Exception {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 2, 3);
        int result = bHSDCodec.getL();
        assertEquals(0, result);
}
}