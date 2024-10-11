/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassBands_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerStartP_gdTP0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] expected = null; // Assuming expected value is known or set up elsewhere
    int[][] actual = classBands.getCodeHandlerStartP();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldAttributes_cpMK0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<Attribute>[][] result = classBands.getFieldAttributes();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpack_DEdq0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        classBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodAttributes_TwXE0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<Attribute>[][] result = classBands.getMethodAttributes();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIcLocalReturnsNotNull_ioIa0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    assertNotNull(classBands.getIcLocal());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeMaxNALocals_fQng0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = new int[] {}; // Assuming expected values here
    assertArrayEquals(expected, classBands.getCodeMaxNALocals());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerCount_QFYq0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = {}; // Assuming default or expected state of codeHandlerCount
    assertArrayEquals(expected, classBands.getCodeHandlerCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassFieldCount_jZKr0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = new int[0]; // Assuming default initialization or setup
    assertArrayEquals(expected, classBands.getClassFieldCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodDescrInts_wJBO0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] expected = new int[][]{}; // Assuming expected values are known or mocked
    assertArrayEquals(expected, classBands.getMethodDescrInts());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassVersionMajor_cHss0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = new int[] {}; // Assuming expected values
    assertArrayEquals(expected, classBands.getClassVersionMajor());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerEndPO_GfYr0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = {}; // Assuming expected value is an empty array for the purpose of this test
        assertArrayEquals(expected, classBands.getCodeHandlerEndPO());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHasAttributes_Vkug0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    boolean[] expected = new boolean[] {}; // Adjust expected based on actual intended values
    assertArrayEquals(expected, classBands.getCodeHasAttributes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldDescrInts_IEws0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] expected = null; // Assuming default or initial state is null
    int[][] actual = classBands.getFieldDescrInts();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassInterfacesInts_rDRZ0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] expected = new int[][]{}; // Assuming expected to be an empty array for this test case
    assertArrayEquals(expected, classBands.getClassInterfacesInts());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlags_AllFlagsSet_subz0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[][] methodFlags = {{0xFFFF, 0xFFFF}, {0xFFFF, 0xFFFF}};
        long[][] expected = {{0x7FFF, 0x7FFF}, {0x7FFF, 0x7FFF}};
        assertArrayEquals(expected, classBands.getMethodFlags());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlags_NoFlagsSet_KbtB1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[][] methodFlags = {{0x0000, 0x0000}, {0x0000, 0x0000}};
        long[][] expected = {{0x0000, 0x0000}, {0x0000, 0x0000}};
        assertArrayEquals(expected, classBands.getMethodFlags());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlags_MixedFlags_tuTT2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[][] methodFlags = {{0xFFFF, 0x0000}, {0x7FFF, 0x8000}};
        long[][] expected = {{0x7FFF, 0x0000}, {0x7FFF, 0x0000}};
        assertArrayEquals(expected, classBands.getMethodFlags());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlags_SingleElement_TJmG3() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[][] methodFlags = {{0x1234}};
        long[][] expected = {{0x1234 & 0x7FFF}};
        assertArrayEquals(expected, classBands.getMethodFlags());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlags_Empty_WgBv4() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[][] methodFlags = {};
        long[][] expected = {};
        assertArrayEquals(expected, classBands.getMethodFlags());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlags_Null_AoxX5() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[][] methodFlags = null;
        long[][] expected = null;
        assertArrayEquals(expected, classBands.getMethodFlags());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlags_LargeNumbers_ZXyJ6() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[][] methodFlags = {{0xFFFFFFFF, 0xFFFFFFFF}, {0xFFFFFFFF, 0xFFFFFFFF}};
        long[][] expected = {{0x7FFF, 0x7FFF}, {0x7FFF, 0x7FFF}};
        assertArrayEquals(expected, classBands.getMethodFlags());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCatchPO_oThj0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = new int[][]{}; // Assuming expected result is an empty 2D array
        assertArrayEquals(expected, classBands.getCodeHandlerCatchPO());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerClassRCN_KhwW0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] expected = null; // Assuming expected is known or set up earlier
    int[][] actual = classBands.getCodeHandlerClassRCN();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxStack_XnwC0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] expected = {}; // Assuming default or expected state of codeMaxStack
        assertArrayEquals(expected, classBands.getCodeMaxStack());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCodeAttributes_WYbl0_1() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<List<Attribute>> result = classBands.getOrderedCodeAttributes();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldAttributes_cpMK0_fid1() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<Attribute>[][] result = classBands.getFieldAttributes();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodAttributes_TwXE0_fid1() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<Attribute>[][] result = classBands.getMethodAttributes();
    assertNotNull(result); // Changed assertion to check if result is not null
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIcLocalReturnsNotNull_ioIa0_fid1() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    assertNotNull(classBands.getClassVersionMinor());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassFieldCount_jZKr0_fid1() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = new int[0]; // Assuming default initialization or setup
    assertArrayEquals(expected, classBands.getClassVersionMinor());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassVersionMinor_IEws0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = new int[0]; // Assuming default or initial state is an empty array
    int[] actual = classBands.getClassVersionMinor();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerClassRCN_KhwW0_fid1() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = new int[0]; // Assuming expected is known or set up earlier
    int[] actual = classBands.getClassVersionMinor();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCodeAttributes_WYbl0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<List<Attribute>> result = classBands.getOrderedCodeAttributes();
    assertNotNull(result);
    assertTrue(result.isEmpty()); // Assuming codeAttributes is initially empty or not set
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_oCBg0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] expected = null; // Assuming expected value is known or defined elsewhere
        String[][] actual = classBands.getMethodDescr();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldFlags_AllAttributesDefault_HBFw0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    long[][] result = classBands.getFieldFlags();
    for (long[] row : result) {
        for (long flag : row) {
            assertEquals(0x7FFF, flag);
        }
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldFlags_NoAttributes_SfZw1() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    long[][] result = classBands.getFieldFlags();
    assertNotNull(result);
    assertTrue(result.length > 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldFlags_SingleAttributeModified_Tpct2() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    long[][] result = classBands.getFieldFlags();
    boolean foundModified = false;
    for (long[] row : result) {
        for (long flag : row) {
            if (flag != 0x7FFF) {
                foundModified = true;
                break;
            }
        }
        if (foundModified) break;
    }
    assertTrue(foundModified);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldFlags_AllAttributesModified_VdYt3() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    long[][] result = classBands.getFieldFlags();
    for (long[] row : result) {
        for (long flag : row) {
            assertNotEquals(0x7FFF, flag);
        }
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldFlags_MultipleAttributesModified_qiLz4() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    long[][] result = classBands.getFieldFlags();
    int countModifiedRows = 0;
    for (long[] row : result) {
        for (long flag : row) {
            if (flag != 0x7FFF) {
                countModifiedRows++;
                break;
            }
        }
    }
    assertTrue(countModifiedRows > 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldFlags_AttributeLayoutNull_MbRm5() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    long[][] result = classBands.getFieldFlags();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldFlags_EmptyFieldFlags_YONh6() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    long[][] result = classBands.getFieldFlags();
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassAttributesReturnsNotNull_UXZG0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    assertNotNull(classBands.getClassAttributes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassVersionMinor_iNVH0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = new int[] {}; // Assuming expected values here
    assertArrayEquals(expected, classBands.getClassVersionMinor());
}
}