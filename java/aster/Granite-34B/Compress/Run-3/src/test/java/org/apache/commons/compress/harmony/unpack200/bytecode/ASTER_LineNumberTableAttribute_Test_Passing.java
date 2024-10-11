/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LineNumberTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_Bmoq0() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, new int[]{1, 2, 3}, new int[]{4, 5, 6});
        assertTrue(attribute.equals(attribute));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_EMPl1() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, new int[]{1, 2, 3}, new int[]{4, 5, 6});
        assertTrue(!attribute.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Wsic0() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, new int[]{1, 2, 3}, new int[]{10, 20, 30});
        assertEquals("LineNumberTable: 10 lines", attribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoLines_xEfM1() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(0, new int[]{}, new int[]{});
        assertEquals("LineNumberTable: 0 lines", attribute.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOneLine_kiVH2() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{10});
        assertEquals("LineNumberTable: 1 lines", attribute.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithMultipleLines_vyWi3() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(5, new int[]{1, 2, 3, 4, 5}, new int[]{10, 11, 12, 13, 14});
        assertEquals("LineNumberTable: 5 lines", attribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getNestedClassFileEntriesTest_rRvI0() {
        LineNumberTableAttribute lineNumTable = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
        ClassFileEntry[] result = lineNumTable.getNestedClassFileEntries();
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getNestedClassFileEntriesTest_lineCoverage_wMpT1() {
        LineNumberTableAttribute lineNumTable = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
        lineNumTable.getNestedClassFileEntries();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getNestedClassFileEntriesTest_branchCoverage_FXEK2() {
        LineNumberTableAttribute lineNumTable = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
        lineNumTable.getNestedClassFileEntries();
        lineNumTable.getNestedClassFileEntries();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStartPCs_tMFq0() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, new int[]{1, 2, 3}, new int[]{10, 20, 30});
        int[] expected = {1, 2, 3};
        int[] actual = attribute.getStartPCs();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStartPCsForEmptyTable_ouwK1() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(0, new int[]{}, new int[]{});
        int[] expected = {};
        int[] actual = attribute.getStartPCs();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStartPCsForNullTable_fjiV2() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(5, null, null);
        int[] expected = null;
        int[] actual = attribute.getStartPCs();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_AkUc0() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, new int[]{1, 2, 3}, new int[]{4, 5, 6});
        int actual = attribute.getLength();
        int expected = 2 + 4 * 10;
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithZeroLength_NmhF1() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(0, new int[]{}, new int[]{});
        int actual = attribute.getLength();
        int expected = 2 + 4 * 0;
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithNegativeLength_daQI2() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(-1, new int[]{-1, -2, -3}, new int[]{-4, -5, -6});
        int actual = attribute.getLength();
        int expected = 2 + 4 * (-1);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithRandomLength_sYsD3() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(12345, new int[]{123, 456, 789}, new int[]{987, 654, 321});
        int actual = attribute.getLength();
        int expected = 2 + 4 * 12345;
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_niXN0() {
        ClassConstantPool pool = new ClassConstantPool();
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(0, new int[0], new int[0]);
        attribute.resolve(pool);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testWriteBody_yWwX0() throws IOException {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
        DataOutputStream dos = new DataOutputStream(System.out);
        attribute.writeBody(dos);
    }
}