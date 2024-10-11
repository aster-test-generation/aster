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
public class Aster_LineNumberTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_aNWX0() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    assertTrue(attr1.equals(attr1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_RWgk1() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    LineNumberTableAttribute attr2 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    assertFalse(attr1.equals(attr2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullObject_fkVA2() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    assertFalse(attr1.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentLength_pJuT3() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    LineNumberTableAttribute attr2 = new LineNumberTableAttribute(11, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    assertFalse(attr1.equals(attr2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentStartPcs_EUJq4() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    LineNumberTableAttribute attr2 = new LineNumberTableAttribute(10, new int[] {1, 3, 4}, new int[] {10, 20, 30});
    assertFalse(attr1.equals(attr2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentLineNumbers_JWwd5() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    LineNumberTableAttribute attr2 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 21, 30});
    assertFalse(attr1.equals(attr2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_ZPAu0() {
    LineNumberTableAttribute lineNumberTable = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    String expected = "LineNumberTable: 10 lines";
    String actual = lineNumberTable.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_qAmA0_1() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(10, new int[] { 0, 10, 20, 30 }, new int[] { 1, 2, 3, 4 });
    ClassFileEntry[] nestedClassFileEntries = lineNumberTableAttribute.getNestedClassFileEntries();
    assertEquals(1, nestedClassFileEntries.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_qAmA0_2() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(10, new int[] { 0, 10, 20, 30 }, new int[] { 1, 2, 3, 4 });
    ClassFileEntry[] nestedClassFileEntries = lineNumberTableAttribute.getNestedClassFileEntries();
    assertEquals(lineNumberTableAttribute.getAttributeName(), nestedClassFileEntries[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_GQIL0_1() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(10, new int[] { 0, 10, 20, 30 }, new int[] { 1, 2, 3, 4 });
    int[] startPCs = attr.getStartPCs();
    assertEquals(4, startPCs.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_GQIL0_2() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(10, new int[] { 0, 10, 20, 30 }, new int[] { 1, 2, 3, 4 });
    int[] startPCs = attr.getStartPCs();
    assertEquals(0, startPCs[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_GQIL0_3() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(10, new int[] { 0, 10, 20, 30 }, new int[] { 1, 2, 3, 4 });
    int[] startPCs = attr.getStartPCs();
    assertEquals(10, startPCs[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_GQIL0_4() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(10, new int[] { 0, 10, 20, 30 }, new int[] { 1, 2, 3, 4 });
    int[] startPCs = attr.getStartPCs();
    assertEquals(20, startPCs[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_GQIL0_5() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(10, new int[] { 0, 10, 20, 30 }, new int[] { 1, 2, 3, 4 });
    int[] startPCs = attr.getStartPCs();
    assertEquals(30, startPCs[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCsWithEmptyLineNumberTable_ESlU1() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(0, new int[0], new int[0]);
    int[] startPCs = attr.getStartPCs();
    assertEquals(0, startPCs.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCsWithNullLineNumberTable_NgMA2() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(0, null, null);
    int[] startPCs = attr.getStartPCs();
    assertEquals(0, startPCs.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength1_lzuS0() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(1, new int[] { 1 }, new int[] { 1 });
    assertEquals(2, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength2_YHYO1() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(2, new int[] { 1, 2 }, new int[] { 1, 2 });
    assertEquals(6, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength3_CEoN2() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(3, new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
    assertEquals(10, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength4_wteS3() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(4, new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 });
    assertEquals(14, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength5_pwYU4() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(5, new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 5 });
    assertEquals(18, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength6_LjvS5() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(6, new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 1, 2, 3, 4, 5, 6 });
    assertEquals(22, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength7_DmeE6() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(7, new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 1, 2, 3, 4, 5, 6, 7 });
    assertEquals(26, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength8_EgBH7() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(8, new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
    assertEquals(30, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength9_tOhh8() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(9, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
    assertEquals(34, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength10_NPTn9() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(10, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
    assertEquals(38, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithInvalidPool_IrWX2() {
        ClassConstantPool pool = null;
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, new int[] { 0, 10, 20 }, new int[] { 1, 2, 3 });
        try {
            attribute.resolve(pool);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithInvalidLineNumberTableLength_TnFK3() {
        ClassConstantPool pool = new ClassConstantPool();
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(-1, new int[] { 0, 10, 20 }, new int[] { 1, 2, 3 });
        try {
            attribute.resolve(pool);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithInvalidStartPcs_SNxA4() {
        ClassConstantPool pool = new ClassConstantPool();
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, null, new int[] { 1, 2, 3 });
        try {
            attribute.resolve(pool);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithInvalidLineNumbers_MlOh5() {
        ClassConstantPool pool = new ClassConstantPool();
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, new int[] { 0, 10, 20 }, null);
        try {
            attribute.resolve(pool);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithInvalidStartPcsAndLineNumbers_BUPW6() {
        ClassConstantPool pool = new ClassConstantPool();
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, null, null);
        try {
            attribute.resolve(pool);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_qAmA0() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(10, new int[] { 0, 10, 20, 30 }, new int[] { 1, 2, 3, 4 });
    ClassFileEntry[] nestedClassFileEntries = lineNumberTableAttribute.getNestedClassFileEntries();
    assertEquals(1, nestedClassFileEntries.length);
    assertEquals(lineNumberTableAttribute.getAttributeName(), nestedClassFileEntries[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_GQIL0() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(10, new int[] { 0, 10, 20, 30 }, new int[] { 1, 2, 3, 4 });
    int[] startPCs = attr.getStartPCs();
    assertEquals(4, startPCs.length);
    assertEquals(0, startPCs[0]);
    assertEquals(10, startPCs[1]);
    assertEquals(20, startPCs[2]);
    assertEquals(30, startPCs[3]);
}
}