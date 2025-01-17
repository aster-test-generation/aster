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
public class Aster_IntList_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_ValidLocation_sQfI0() {
    IntList list = new IntList(10);
    int result = list.get(5);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIncrement_ValidLocation_ZnWj0() {
    IntList list = new IntList(10);
    list.add(5);
    assertEquals(6, list.get(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_ValidInput_Qoxx0_3() {
    IntList list = new IntList(10);
    assertEquals(1, list.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_EmptyList_Jbwm2_3() {
    IntList list = new IntList(0);
    assertEquals(1, list.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_LocationEqualsSize_IQtg3_1() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(2);
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArrayOneElement_ptwb2_1() {
    IntList list = new IntList(1);
    int[] result = list.toArray();
    assertEquals(1, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArrayOneElement_ptwb2_2() {
    IntList list = new IntList(1);
    int[] result = list.toArray();
    assertEquals(0, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEmpty_NullList_hRed2_fid1() {
    IntList list = null;
    assertTrue(list.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_ValidLocation_sQfI0_fid1() {
    IntList list = new IntList(10);
    int result = list.get(5);
    assertEquals(5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIncrement_ValidLocation_ZnWj0_fid1() {
    IntList list = new IntList(10);
    list.increment(5);
    assertEquals(6, list.get(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_FullList_wvEq3() {
    IntList list = new IntList(10);
    for (int i = 0; i < 10; i++) {
        list.add(i);
    }
    assertFalse(list.add(10));
    assertEquals(10, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_DuplicateElement_fjGE4() {
    IntList list = new IntList(10);
    list.add(1);
    assertFalse(list.add(1));
    assertEquals(1, list.size());
    assertEquals(1, list.get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_LocationEqualsSize_IQtg3() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(3);
    assertEquals(3, result);
    assertEquals(2, list.size());
    assertEquals(1, list.get(0));
    assertEquals(2, list.get(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArray_XXiw0() {
    IntList list = new IntList(10);
    int[] result = list.toArray();
    assertEquals(10, result.length);
    for (int i = 0; i < result.length; i++) {
        assertEquals(i, result[i]);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArrayOneElement_ptwb2() {
    IntList list = new IntList(1);
    int[] result = list.toArray();
    assertEquals(1, result.length);
    assertEquals(0, result[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location1_SxcB1() {
    IntList list = new IntList(10);
    list.add(1, 10);
    assertEquals(10, list.get(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location2_ZGsh2() {
    IntList list = new IntList(10);
    list.add(2, 10);
    assertEquals(10, list.get(2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location3_VdaM3() {
    IntList list = new IntList(10);
    list.add(3, 10);
    assertEquals(10, list.get(3));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location4_IDPU4() {
    IntList list = new IntList(10);
    list.add(4, 10);
    assertEquals(10, list.get(4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location5_GYSl5() {
    IntList list = new IntList(10);
    list.add(5, 10);
    assertEquals(10, list.get(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location6_mgCs6() {
    IntList list = new IntList(10);
    list.add(6, 10);
    assertEquals(10, list.get(6));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location7_MlOK7() {
    IntList list = new IntList(10);
    list.add(7, 10);
    assertEquals(10, list.get(7));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location8_CAkQ8() {
    IntList list = new IntList(10);
    list.add(8, 10);
    assertEquals(10, list.get(8));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location9_iGBP9() {
    IntList list = new IntList(10);
    list.add(9, 10);
    assertEquals(10, list.get(9));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location10_euAw10() {
    IntList list = new IntList(10);
    list.add(10, 10);
    assertEquals(10, list.get(10));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location11_vANz11() {
    IntList list = new IntList(10);
    list.add(11, 10);
    assertEquals(10, list.get(11));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location12_uXyZ12() {
    IntList list = new IntList(10);
    list.add(12, 10);
    assertEquals(10, list.get(12));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location13_BDQP13() {
    IntList list = new IntList(10);
    list.add(13, 10);
    assertEquals(10, list.get(13));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location14_Jfrw14() {
    IntList list = new IntList(10);
    list.add(14, 10);
    assertEquals(10, list.get(14));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location15_oxOL15() {
    IntList list = new IntList(10);
    list.add(15, 10);
    assertEquals(10, list.get(15));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location16_Txuc16() {
    IntList list = new IntList(10);
    list.add(16, 10);
    assertEquals(10, list.get(16));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location17_BZbj17() {
    IntList list = new IntList(10);
    list.add(17, 10);
    assertEquals(10, list.get(17));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_FullList_wvEq3_1_fid3() {
    IntList list = new IntList(10);
    for (int i = 0; i < 10; i++) {
        list.add(i);
    }
    assertFalse(list.add(10));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_DuplicateElement_fjGE4_1_fid3() {
    IntList list = new IntList(10);
    list.add(1);
    assertFalse(list.add(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_LocationEqualsSize_IQtg3_1_fid3() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(3);
    assertEquals(3, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_LocationEqualsSize_IQtg3_2_fid3() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(3);
    assertEquals(2, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_LocationEqualsSize_IQtg3_3_fid3() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(3);
    assertEquals(1, list.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_LocationEqualsSize_IQtg3_4_fid3() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(3);
    assertEquals(2, list.get(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArray_XXiw0_1_fid3() {
    IntList list = new IntList(10);
    int[] result = list.toArray();
    for (int i = 0; i < result.length; i++) {
    }
    assertEquals(10, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_NullElement_VtOm5_KpVY0_1() {
    IntList list = new IntList(10);
    assertFalse(list.add(0));}
}