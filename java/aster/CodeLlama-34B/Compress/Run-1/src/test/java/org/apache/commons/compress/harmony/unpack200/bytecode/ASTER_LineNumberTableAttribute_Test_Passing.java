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
public void testToString_UeDw0() {
    LineNumberTableAttribute lineNumberTable = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    String expected = "LineNumberTable: 10 lines";
    String actual = lineNumberTable.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_tZyG0() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    assertTrue(attr1.equals(attr1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_awgs1() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    LineNumberTableAttribute attr2 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    assertFalse(attr1.equals(attr2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullObject_DkWC2() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    assertFalse(attr1.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentLineNumberTableLength_UbqE3() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    LineNumberTableAttribute attr2 = new LineNumberTableAttribute(11, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    assertFalse(attr1.equals(attr2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentStartPCs_menN4() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    LineNumberTableAttribute attr2 = new LineNumberTableAttribute(10, new int[] {1, 3, 2}, new int[] {10, 20, 30});
    assertFalse(attr1.equals(attr2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentLineNumbers_jNex5() {
    LineNumberTableAttribute attr1 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 20, 30});
    LineNumberTableAttribute attr2 = new LineNumberTableAttribute(10, new int[] {1, 2, 3}, new int[] {10, 21, 30});
    assertFalse(attr1.equals(attr2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength0_FHnR0() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(0, new int[0], new int[0]);
    int[] startPcs = attribute.getStartPCs();
    assertEquals(0, startPcs.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength1_cTWH1_1() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(1, startPcs.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength1_cTWH1_2() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(1, startPcs[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength2_ThSj2_1() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{1, 2});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(2, startPcs.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength2_ThSj2_2() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{1, 2});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(1, startPcs[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength2_ThSj2_3() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{1, 2});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(2, startPcs[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength3_BRFm3_1() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(3, new int[]{1, 2, 3}, new int[]{1, 2, 3});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(3, startPcs.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength3_BRFm3_2() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(3, new int[]{1, 2, 3}, new int[]{1, 2, 3});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(1, startPcs[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength3_BRFm3_3() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(3, new int[]{1, 2, 3}, new int[]{1, 2, 3});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(2, startPcs[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength3_BRFm3_4() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(3, new int[]{1, 2, 3}, new int[]{1, 2, 3});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(3, startPcs[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength4_oqhe4_1() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(4, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(4, startPcs.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength4_oqhe4_2() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(4, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(1, startPcs[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength4_oqhe4_3() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(4, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(2, startPcs[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength4_oqhe4_4() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(4, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(3, startPcs[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength4_oqhe4_5() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(4, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(4, startPcs[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength5_fUbU5_1() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(5, new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(5, startPcs.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength5_fUbU5_2() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(5, new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(1, startPcs[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength5_fUbU5_3() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(5, new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(2, startPcs[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength5_fUbU5_4() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(5, new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(3, startPcs[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength5_fUbU5_5() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(5, new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(4, startPcs[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength5_fUbU5_6() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(5, new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(5, startPcs[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength6_Nyro6_1() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(6, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(6, startPcs.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength6_Nyro6_2() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(6, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(1, startPcs[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength6_Nyro6_3() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(6, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(2, startPcs[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength6_Nyro6_4() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(6, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(3, startPcs[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength6_Nyro6_5() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(6, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(4, startPcs[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength6_Nyro6_6() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(6, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(5, startPcs[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength6_Nyro6_7() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(6, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(6, startPcs[5]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength1_iOSB0() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(1, new int[] { 1 }, new int[] { 1 });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength2_RieZ1() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(2, new int[] { 1, 2 }, new int[] { 1, 2 });
    assertEquals(10, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength3_heJh2() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(3, new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength4_PQPQ3() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(4, new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength5_BbjY4() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(5, new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 5 });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength6_QlKe5() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(6, new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 1, 2, 3, 4, 5, 6 });
    assertEquals(26, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength7_OXfR6() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(7, new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 1, 2, 3, 4, 5, 6, 7 });
    assertEquals(30, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength8_Jfzb7() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(8, new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
    assertEquals(34, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength9_elHK8() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(9, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_lineNumberTableLength10_mOhy9() {
    LineNumberTableAttribute attr = new LineNumberTableAttribute(10, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
    assertEquals(42, attr.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength1_cTWH1() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(1, startPcs.length);
    assertEquals(1, startPcs[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength2_ThSj2() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{1, 2});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(2, startPcs.length);
    assertEquals(1, startPcs[0]);
    assertEquals(2, startPcs[1]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength3_BRFm3() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(3, new int[]{1, 2, 3}, new int[]{1, 2, 3});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(3, startPcs.length);
    assertEquals(1, startPcs[0]);
    assertEquals(2, startPcs[1]);
    assertEquals(3, startPcs[2]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength4_oqhe4() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(4, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(4, startPcs.length);
    assertEquals(1, startPcs[0]);
    assertEquals(2, startPcs[1]);
    assertEquals(3, startPcs[2]);
    assertEquals(4, startPcs[3]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength5_fUbU5() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(5, new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(5, startPcs.length);
    assertEquals(1, startPcs[0]);
    assertEquals(2, startPcs[1]);
    assertEquals(3, startPcs[2]);
    assertEquals(4, startPcs[3]);
    assertEquals(5, startPcs[4]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_lineNumberTableLength6_Nyro6() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(6, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
    int[] startPcs = attribute.getStartPCs();
    assertEquals(6, startPcs.length);
    assertEquals(1, startPcs[0]);
    assertEquals(2, startPcs[1]);
    assertEquals(3, startPcs[2]);
    assertEquals(4, startPcs[3]);
    assertEquals(5, startPcs[4]);
    assertEquals(6, startPcs[5]);
}
}