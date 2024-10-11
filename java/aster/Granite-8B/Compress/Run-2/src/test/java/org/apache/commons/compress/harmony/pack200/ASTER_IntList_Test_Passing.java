/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IntList_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithEmptyList_BZgF0() throws Exception {
        IntList list = new IntList();
        assertTrue(list.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithNonEmptyList_YrFj1() throws Exception {
        IntList list = new IntList(10);
        list.add(5);
        assertFalse(list.isEmpty());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_get_with_valid_index_mfPf0() throws Exception {
        IntList intList = new IntList(10);
        int actual = intList.get(5);
        int expected = 0;
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_get_with_invalid_index_uYGI1() throws Exception {
        IntList intList = new IntList(10);
        int actual = intList.get(10);
        int expected = 0;
        assertNotEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_get_with_negative_index_GZRf2() throws Exception {
        IntList intList = new IntList(10);
        int actual = intList.get(-1);
        int expected = 0;
        assertNotEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToArray_ZWYp0() throws Exception {
        IntList intList = new IntList(10);
        int[] array = intList.toArray();
        assertEquals(10, array.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToArrayWithEmptyList_fFYJ2() throws Exception {
        IntList intList = new IntList();
        int[] array = intList.toArray();
        assertEquals(0, array.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_HWgP0() throws Exception {
        IntList intList = new IntList(10);
        intList.remove(0);
        assertEquals(0, intList.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromMiddle_tTTh1_1() throws Exception {
        IntList intList = new IntList(10);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.remove(1);
        assertEquals(2, intList.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromMiddle_tTTh1_2() throws Exception {
        IntList intList = new IntList(10);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.remove(1);
        assertEquals(1, intList.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromMiddle_tTTh1_3() throws Exception {
        IntList intList = new IntList(10);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.remove(1);
        assertEquals(3, intList.get(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveLastElement_YkLp2_1() throws Exception {
        IntList intList = new IntList(10);
        intList.add(1);
        intList.add(2);
        intList.remove(1);
        assertEquals(1, intList.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveLastElement_YkLp2_2() throws Exception {
        IntList intList = new IntList(10);
        intList.add(1);
        intList.add(2);
        intList.remove(1);
        assertEquals(1, intList.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFirstElement_SAZW3_1() throws Exception {
        IntList intList = new IntList(10);
        intList.add(1);
        intList.add(2);
        intList.remove(0);
        assertEquals(1, intList.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFirstElement_SAZW3_2() throws Exception {
        IntList intList = new IntList(10);
        intList.add(1);
        intList.add(2);
        intList.remove(0);
        assertEquals(2, intList.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromEmptyList_PFOh4() throws Exception {
        IntList intList = new IntList(10);
        try {
            intList.remove(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_hgZM0_1() throws Exception {
        IntList intList = new IntList(10);
        intList.add(5);
        assertEquals(1, intList.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd2_rxdm1_1() throws Exception {
        IntList intList = new IntList();
        intList.add(10);
        assertEquals(1, intList.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIncrementWithNegativeLocation_eYju1() throws Exception {
        IntList intList = new IntList(10);
        try {
            intList.increment(-1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIncrementWithLocationGreaterThanCapacity_HrAg2() throws Exception {
        IntList intList = new IntList(10);
        try {
            intList.increment(10);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation0_SnTz0() throws Exception {
    IntList intList = new IntList(10);
    intList.add(0, 1);
    assertEquals(1, intList.get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation1_wjlP1() throws Exception {
    IntList intList = new IntList(10);
    intList.add(1, 1);
    assertEquals(1, intList.get(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation2_vDkV2() throws Exception {
    IntList intList = new IntList(10);
    intList.add(2, 1);
    assertEquals(1, intList.get(2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation3_aoNS3() throws Exception {
    IntList intList = new IntList(10);
    intList.add(3, 1);
    assertEquals(1, intList.get(3));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation4_Xjpo4() throws Exception {
    IntList intList = new IntList(10);
    intList.add(4, 1);
    assertEquals(1, intList.get(4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation5_kxEV5() throws Exception {
    IntList intList = new IntList(10);
    intList.add(5, 1);
    assertEquals(1, intList.get(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation6_anwx6() throws Exception {
    IntList intList = new IntList(10);
    intList.add(6, 1);
    assertEquals(1, intList.get(6));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation7_xjZt7() throws Exception {
    IntList intList = new IntList(10);
    intList.add(7, 1);
    assertEquals(1, intList.get(7));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation8_rCXC8() throws Exception {
    IntList intList = new IntList(10);
    intList.add(8, 1);
    assertEquals(1, intList.get(8));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation9_CqPD9() throws Exception {
    IntList intList = new IntList(10);
    intList.add(9, 1);
    assertEquals(1, intList.get(9));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation10_ZJMG10() throws Exception {
    IntList intList = new IntList(10);
    intList.add(10, 1);
    assertEquals(1, intList.get(10));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtLocation11_rQKs11() throws Exception {
    IntList intList = new IntList(10);
    intList.add(11, 1);
    assertEquals(1, intList.get(11));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_Rrvg0() throws Exception {
        IntList intList = new IntList(10);
        intList.add(0, 1);
        assert intList.get(0) == 1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd2_SDAP1() throws Exception {
        IntList intList = new IntList(10);
        intList.add(1, 2);
        assert intList.get(1) == 2;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd3_NwEE2() throws Exception {
        IntList intList = new IntList(10);
        intList.add(2, 3);
        assert intList.get(2) == 3;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd4_hNQZ3() throws Exception {
        IntList intList = new IntList(10);
        intList.add(3, 4);
        assert intList.get(3) == 4;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd5_TOWG4() throws Exception {
        IntList intList = new IntList(10);
        intList.add(4, 5);
        assert intList.get(4) == 5;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd6_fTGv5() throws Exception {
        IntList intList = new IntList(10);
        intList.add(5, 6);
        assert intList.get(5) == 6;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd7_gdoV6() throws Exception {
        IntList intList = new IntList(10);
        intList.add(6, 7);
        assert intList.get(6) == 7;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd8_hCwM7() throws Exception {
        IntList intList = new IntList(10);
        intList.add(7, 8);
        assert intList.get(7) == 8;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd9_wXwZ8() throws Exception {
        IntList intList = new IntList(10);
        intList.add(8, 9);
        assert intList.get(8) == 9;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd10_fNLa9() throws Exception {
        IntList intList = new IntList(10);
        intList.add(9, 10);
        assert intList.get(9) == 10;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd11_OMrL10() throws Exception {
        IntList intList = new IntList(10);
        intList.add(10, 11);
        assert intList.get(10) == 11;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd12_QLBM11() throws Exception {
        IntList intList = new IntList(10);
        intList.add(11, 12);
        assert intList.get(11) == 12;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSize_rHiL0_1() throws Exception {
        IntList intList = new IntList(10);
        intList.add(5);
        intList.add(10);
        intList.remove(0);
        assertEquals(0, intList.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSize_rHiL0_2() throws Exception {
        IntList intList = new IntList(10);
        intList.add(5);
        intList.add(10);
        intList.remove(0);
        assertEquals(1, intList.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSize_rHiL0_3() throws Exception {
        IntList intList = new IntList(10);
        intList.add(5);
        intList.add(10);
        intList.remove(0);
        assertEquals(2, intList.size());}
}