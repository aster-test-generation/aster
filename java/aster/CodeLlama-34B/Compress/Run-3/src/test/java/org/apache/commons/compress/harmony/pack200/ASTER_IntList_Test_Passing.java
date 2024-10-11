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
public class Aster_IntList_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEmpty_EmptyList_elkc0() {
    IntList list = new IntList();
    assertTrue(list.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEmpty_EmptyListWithCapacity0_WsYd2() {
    IntList list = new IntList(0);
    assertTrue(list.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEmpty_EmptyListWithCapacityGreaterThan0_HQfu3() {
    IntList list = new IntList(10);
    assertTrue(list.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEmpty_NonEmptyListWithCapacityGreaterThan0_ztSD4() {
    IntList list = new IntList(10);
    list.add(1);
    assertFalse(list.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAll_emptyList_JgOs0() {
    IntList list = new IntList();
    list.addAll(new IntList());
    assertEquals(0, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAll_nonEmptyList_CcTV1() {
    IntList list = new IntList();
    list.addAll(new IntList(10));
    assertEquals(10, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAll_largerList_NvQZ4() {
    IntList list = new IntList(10);
    list.addAll(new IntList(20));
    assertEquals(20, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAll_smallerList_pxud5() {
    IntList list = new IntList(20);
    list.addAll(new IntList(10));
    assertEquals(20, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_ValidLocation_qOOv0() {
    IntList list = new IntList(10);
    int result = list.get(5);
    assertEquals(5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_InvalidLocation_PKAT1() {
    IntList list = new IntList(10);
    try {
        list.get(-1);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
        assertEquals("-1", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_LocationGreaterThanSize_wLXm3() {
    IntList list = new IntList(10);
    try {
        list.get(11);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
        assertEquals("11", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_LocationEqualToSize_CUTm4() {
    IntList list = new IntList(10);
    int result = list.get(10);
    assertEquals(10, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArray_ILjX0() {
    IntList list = new IntList(10);
    int[] expected = new int[10];
    for (int i = 0; i < 10; i++) {
        list.add(i);
        expected[i] = i;
    }
    int[] actual = list.toArray();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArrayEmpty_kHGp1() {
    IntList list = new IntList();
    int[] expected = new int[0];
    int[] actual = list.toArray();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArrayOneElement_rhag2() {
    IntList list = new IntList(1);
    list.add(1);
    int[] expected = new int[1];
    expected[0] = 1;
    int[] actual = list.toArray();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArrayMultipleElements_UEpU3() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int[] expected = new int[3];
    expected[0] = 1;
    expected[1] = 2;
    expected[2] = 3;
    int[] actual = list.toArray();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToArrayLargeNumberOfElements_XBUB4() {
    IntList list = new IntList(1000);
    for (int i = 0; i < 1000; i++) {
        list.add(i);
    }
    int[] expected = new int[1000];
    for (int i = 0; i < 1000; i++) {
        expected[i] = i;
    }
    int[] actual = list.toArray();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_ValidLocation_juQb0_1() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(1);
    assertEquals(2, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_ValidLocation_juQb0_2() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(1);
    assertEquals(2, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_InvalidLocation_pUac1() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    try {
        list.remove(4);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_FirstElement_usjb2_1() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(0);
    assertEquals(1, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_FirstElement_usjb2_2() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(0);
    assertEquals(2, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_LastElement_bzke3_1() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(2);
    assertEquals(3, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_LastElement_bzke3_2() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(2);
    assertEquals(2, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_EmptyList_dqhS5() {
    IntList list = new IntList(10);
    try {
        list.remove(0);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_NullList_nrqj6() {
    IntList list = null;
    try {
        list.remove(0);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_ValidInput_SMfg0_1() {
    IntList list = new IntList(10);
    assertTrue(list.add(5));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_ValidInput_SMfg0_2() {
    IntList list = new IntList(10);
    assertEquals(1, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_ValidInput_SMfg0_3() {
    IntList list = new IntList(10);
    assertEquals(5, list.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_MultipleValues_kozV2_2() {
    IntList list = new IntList(10);
    assertTrue(list.add(10));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_MultipleValues_kozV2_3() {
    IntList list = new IntList(10);
    assertTrue(list.add(15));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_MultipleValues_kozV2_4() {
    IntList list = new IntList(10);
    assertEquals(3, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_MultipleValues_kozV2_6() {
    IntList list = new IntList(10);
    assertEquals(10, list.get(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_MultipleValues_kozV2_7() {
    IntList list = new IntList(10);
    assertEquals(15, list.get(2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_FullList_PTOO3_2() {
    IntList list = new IntList(10);
    for (int i = 0; i < 10; i++) {
    }
    assertFalse(list.add(10));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_FullList_PTOO3_3() {
    IntList list = new IntList(10);
    for (int i = 0; i < 10; i++) {
    }
    assertEquals(10, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIncrement_ValidLocation_jmPm0() {
    IntList list = new IntList(10);
    list.increment(5);
    assertEquals(6, list.get(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIncrement_InvalidLocation_TdLG1() {
    IntList list = new IntList(10);
    try {
        list.increment(15);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
        assertEquals("15", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_EmptyList_MqOo0_1() {
    IntList list = new IntList();
    list.add(0, 10);
    assertEquals(1, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_EmptyList_MqOo0_2() {
    IntList list = new IntList();
    list.add(0, 10);
    assertEquals(10, list.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_NonEmptyList_DgQm1_1() {
    IntList list = new IntList();
    list.add(0, 10);
    list.add(1, 20);
    assertEquals(2, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_NonEmptyList_DgQm1_2() {
    IntList list = new IntList();
    list.add(0, 10);
    list.add(1, 20);
    assertEquals(10, list.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_NonEmptyList_DgQm1_3() {
    IntList list = new IntList();
    list.add(0, 10);
    list.add(1, 20);
    assertEquals(20, list.get(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_GrowForInsert_Nngt2_1() {
    IntList list = new IntList(10);
    list.add(0, 10);
    list.add(1, 20);
    list.add(2, 30);
    assertEquals(3, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_GrowForInsert_Nngt2_2() {
    IntList list = new IntList(10);
    list.add(0, 10);
    list.add(1, 20);
    list.add(2, 30);
    assertEquals(10, list.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_GrowForInsert_Nngt2_3() {
    IntList list = new IntList(10);
    list.add(0, 10);
    list.add(1, 20);
    list.add(2, 30);
    assertEquals(20, list.get(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_GrowForInsert_Nngt2_4() {
    IntList list = new IntList(10);
    list.add(0, 10);
    list.add(1, 20);
    list.add(2, 30);
    assertEquals(30, list.get(2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location0_object_EPSI0() {
    IntList intList = new IntList();
    intList.add(0, 10);
    assertEquals(10, intList.get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location1_object_eNOy1() {
    IntList intList = new IntList();
    intList.add(1, 10);
    assertEquals(10, intList.get(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location2_object_PtbI2() {
    IntList intList = new IntList();
    intList.add(2, 10);
    assertEquals(10, intList.get(2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location3_object_BHZW3() {
    IntList intList = new IntList();
    intList.add(3, 10);
    assertEquals(10, intList.get(3));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location4_object_tqtm4() {
    IntList intList = new IntList();
    intList.add(4, 10);
    assertEquals(10, intList.get(4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location5_object_ctUS5() {
    IntList intList = new IntList();
    intList.add(5, 10);
    assertEquals(10, intList.get(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location6_object_zEYE6() {
    IntList intList = new IntList();
    intList.add(6, 10);
    assertEquals(10, intList.get(6));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location7_object_NSCp7() {
    IntList intList = new IntList();
    intList.add(7, 10);
    assertEquals(10, intList.get(7));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location8_object_zMhE8() {
    IntList intList = new IntList();
    intList.add(8, 10);
    assertEquals(10, intList.get(8));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location9_object_jJkz9() {
    IntList intList = new IntList();
    intList.add(9, 10);
    assertEquals(10, intList.get(9));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location10_object_qmsI10() {
    IntList intList = new IntList();
    intList.add(10, 10);
    assertEquals(10, intList.get(10));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_location11_object_Qsbr11() {
    IntList intList = new IntList();
    intList.add(11, 10);
    assertEquals(10, intList.get(11));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClear_emptyList_jrjm0() {
    IntList list = new IntList();
    list.clear();
    assertEquals(0, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSize_EmptyList_iVhG0() {
    IntList list = new IntList();
    assertEquals(0, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSize_NonEmptyList_lPhu1() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    assertEquals(3, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_NullValues_jqOz4_jdxh0_1() {
    IntList list = new IntList(10);
    for (int i = 0; i < 10; i++) {
    }
        assertFalse(list.add(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_NullValues_jqOz4_jdxh0_2() {
    IntList list = new IntList(10);
    for (int i = 0; i < 10; i++) {
    }
    assertEquals(0, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_ValidLocation_juQb0() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(1);
    assertEquals(2, result);
    assertEquals(2, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_FirstElement_usjb2() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(0);
    assertEquals(1, result);
    assertEquals(2, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_LastElement_bzke3() {
    IntList list = new IntList(10);
    list.add(1);
    list.add(2);
    list.add(3);
    int result = list.remove(2);
    assertEquals(3, result);
    assertEquals(2, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_ValidInput_SMfg0() {
    IntList list = new IntList(10);
    assertTrue(list.add(5));
    assertEquals(1, list.size());
    assertEquals(5, list.get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_MultipleValues_kozV2() {
    IntList list = new IntList(10);
    assertTrue(list.add(5));
    assertTrue(list.add(10));
    assertTrue(list.add(15));
    assertEquals(3, list.size());
    assertEquals(5, list.get(0));
    assertEquals(10, list.get(1));
    assertEquals(15, list.get(2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_FullList_PTOO3() {
    IntList list = new IntList(10);
    for (int i = 0; i < 10; i++) {
        assertTrue(list.add(i));
    }
    assertFalse(list.add(10));
    assertEquals(10, list.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_EmptyList_MqOo0() {
    IntList list = new IntList();
    list.add(0, 10);
    assertEquals(1, list.size());
    assertEquals(10, list.get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_NonEmptyList_DgQm1() {
    IntList list = new IntList();
    list.add(0, 10);
    list.add(1, 20);
    assertEquals(2, list.size());
    assertEquals(10, list.get(0));
    assertEquals(20, list.get(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_GrowForInsert_Nngt2() {
    IntList list = new IntList(10);
    list.add(0, 10);
    list.add(1, 20);
    list.add(2, 30);
    assertEquals(3, list.size());
    assertEquals(10, list.get(0));
    assertEquals(20, list.get(1));
    assertEquals(30, list.get(2));
}
}