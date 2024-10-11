/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalVariableTypeTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_TmDQ0() {
    int[] startPcs = new int[] {1, 2, 3, 4, 5};
    int[] lengths = new int[] {1, 2, 3, 4, 5};
    CPUTF8[] names = new CPUTF8[] {new CPUTF8("name1"), new CPUTF8("name2"), new CPUTF8("name3"), new CPUTF8("name4"), new CPUTF8("name5")};
    CPUTF8[] signatures = new CPUTF8[] {new CPUTF8("signature1"), new CPUTF8("signature2"), new CPUTF8("signature3"), new CPUTF8("signature4"), new CPUTF8("signature5")};
    int[] indexes = new int[] {1, 2, 3, 4, 5};
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(5, startPcs, lengths, names, signatures, indexes);
    int[] actualStartPCs = attribute.getStartPCs();
    assertArrayEquals(startPcs, actualStartPCs);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_jrfg1_1() {
    int[] startPcs = new int[] {1, 2, 3, 4, 5};
    int[] lengths = new int[] {1, 2, 3, 4, 5};
    CPUTF8[] names = new CPUTF8[] {new CPUTF8("name1"), new CPUTF8("name2"), new CPUTF8("name3"), new CPUTF8("name4"), new CPUTF8("name5")};
    CPUTF8[] signatures = new CPUTF8[] {new CPUTF8("signature1"), new CPUTF8("signature2"), new CPUTF8("signature3"), new CPUTF8("signature4"), new CPUTF8("signature5")};
    int[] indexes = new int[] {1, 2, 3, 4, 5};
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(5, startPcs, lengths, names, signatures, indexes);
    int[] actualStartPCs = attribute.getStartPCs();
    for (int i = 0; i < actualStartPCs.length; i++) {
    }
    assertArrayEquals(startPcs, actualStartPCs);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_jrfg1_2() {
    int[] startPcs = new int[] {1, 2, 3, 4, 5};
    int[] lengths = new int[] {1, 2, 3, 4, 5};
    CPUTF8[] names = new CPUTF8[] {new CPUTF8("name1"), new CPUTF8("name2"), new CPUTF8("name3"), new CPUTF8("name4"), new CPUTF8("name5")};
    CPUTF8[] signatures = new CPUTF8[] {new CPUTF8("signature1"), new CPUTF8("signature2"), new CPUTF8("signature3"), new CPUTF8("signature4"), new CPUTF8("signature5")};
    int[] indexes = new int[] {1, 2, 3, 4, 5};
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(5, startPcs, lengths, names, signatures, indexes);
    int[] actualStartPCs = attribute.getStartPCs();
    for (int i = 0; i < actualStartPCs.length; i++) {
    }
    assertEquals(5, actualStartPCs.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_WIOu0() {
    LocalVariableTypeTableAttribute attr = new LocalVariableTypeTableAttribute(10, new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 }, new CPUTF8[] { new CPUTF8("name1"), new CPUTF8("name2"), new CPUTF8("name3"), new CPUTF8("name4"), new CPUTF8("name5"), new CPUTF8("name6"), new CPUTF8("name7"), new CPUTF8("name8"), new CPUTF8("name9"), new CPUTF8("name10") }, new CPUTF8[] { new CPUTF8("signature1"), new CPUTF8("signature2"), new CPUTF8("signature3"), new CPUTF8("signature4"), new CPUTF8("signature5"), new CPUTF8("signature6"), new CPUTF8("signature7"), new CPUTF8("signature8"), new CPUTF8("signature9"), new CPUTF8("signature10") }, new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
    assertEquals(20, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithZeroLength_kzcs1() {
    LocalVariableTypeTableAttribute attr = new LocalVariableTypeTableAttribute(0, new int[] {}, new int[] {}, new CPUTF8[] {}, new CPUTF8[] {}, new int[] {});
    assertEquals(2, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithOneElement_VuiV2() {
    LocalVariableTypeTableAttribute attr = new LocalVariableTypeTableAttribute(1, new int[] { 0 }, new int[] { 1 }, new CPUTF8[] { new CPUTF8("name1") }, new CPUTF8[] { new CPUTF8("signature1") }, new int[] { 0 });
    assertEquals(12, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithMultipleElements_SdXK3() {
    LocalVariableTypeTableAttribute attr = new LocalVariableTypeTableAttribute(5, new int[] { 0, 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4, 5 }, new CPUTF8[] { new CPUTF8("name1"), new CPUTF8("name2"), new CPUTF8("name3"), new CPUTF8("name4"), new CPUTF8("name5") }, new CPUTF8[] { new CPUTF8("signature1"), new CPUTF8("signature2"), new CPUTF8("signature3"), new CPUTF8("signature4"), new CPUTF8("signature5") }, new int[] { 0, 1, 2, 3, 4 });
    assertEquals(30, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCodeLength_NegativeLength_gKNH1() {
    LocalVariableTypeTableAttribute attr = new LocalVariableTypeTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
    try {
        attr.setCodeLength(-1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Code length must be non-negative", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCodeLength_InvalidLength_WgCj4() {
    LocalVariableTypeTableAttribute attr = new LocalVariableTypeTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
    try {
        attr.setCodeLength(Integer.MAX_VALUE + 1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Code length must be non-negative", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_jrfg1() {
    int[] startPcs = new int[] {1, 2, 3, 4, 5};
    int[] lengths = new int[] {1, 2, 3, 4, 5};
    CPUTF8[] names = new CPUTF8[] {new CPUTF8("name1"), new CPUTF8("name2"), new CPUTF8("name3"), new CPUTF8("name4"), new CPUTF8("name5")};
    CPUTF8[] signatures = new CPUTF8[] {new CPUTF8("signature1"), new CPUTF8("signature2"), new CPUTF8("signature3"), new CPUTF8("signature4"), new CPUTF8("signature5")};
    int[] indexes = new int[] {1, 2, 3, 4, 5};
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(5, startPcs, lengths, names, signatures, indexes);
    int[] actualStartPCs = attribute.getStartPCs();
    assertArrayEquals(startPcs, actualStartPCs);
    assertEquals(5, actualStartPCs.length);
    for (int i = 0; i < actualStartPCs.length; i++) {
        assertEquals(startPcs[i], actualStartPCs[i]);
    }
}
}