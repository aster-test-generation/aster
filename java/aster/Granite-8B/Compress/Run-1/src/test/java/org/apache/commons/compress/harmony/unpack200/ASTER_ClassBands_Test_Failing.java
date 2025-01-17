/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassBands_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_cDMG0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
        assertNotNull(methodAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIcLocal_aqUs0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        IcTuple[][] icLocal = classBands.getIcLocal();
        assertNotNull(icLocal);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxNALocals_lrls1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] codeMaxNALocals = classBands.getCodeMaxNALocals();
        assertNotNull(codeMaxNALocals);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCount_nTnd1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] codeHandlerCount = classBands.getCodeHandlerCount();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCountWithNullSegment_BIzc2() {
        ClassBands classBands = new ClassBands(null);
        int[] codeHandlerCount = classBands.getCodeHandlerCount();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassFieldCount_CjbL0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] classFieldCount = classBands.getClassFieldCount();
        assertNotNull(classFieldCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_UjRn0_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] methodDescrInts = classBands.getMethodDescrInts();
        for (int[] ints : methodDescrInts) {
        }
        assertNotNull(methodDescrInts);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_UjRn0_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] methodDescrInts = classBands.getMethodDescrInts();
        for (int[] ints : methodDescrInts) {
        }
        assertTrue(methodDescrInts.length > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMajor_VFaZ0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassVersionMajor();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerEndPO_DlbU1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] result = classBands.getCodeHandlerEndPO();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSegment_IARB0_1() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    boolean[] codeHasAttributes = classBands.getCodeHasAttributes();
    assertNotNull(codeHasAttributes);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSegment_IARB0_2() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    boolean[] codeHasAttributes = classBands.getCodeHasAttributes();
    assertEquals(1, codeHasAttributes.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSegment_IARB0_3() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    boolean[] codeHasAttributes = classBands.getCodeHasAttributes();
    assertTrue(codeHasAttributes[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ePYG0() throws IOException, Pack200Exception {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        classBands.read(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldDescrInts_XClt0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] fieldDescrInts = classBands.getFieldDescrInts();
        assertNotNull(fieldDescrInts);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_CDYb0_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] result = classBands.getClassInterfacesInts();
        for (int[] row : result) {
        }
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_CDYb0_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] result = classBands.getClassInterfacesInts();
        for (int[] row : result) {
        }
        assertNotEquals(0, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClassBands_OOHK1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        assertNotNull(classBands);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCatchPO_Izdf2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] codeHandlerCatchPO = classBands.getCodeHandlerCatchPO();
        assertNotNull(codeHandlerCatchPO);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSegment_hJTi0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] codeHandlerClassRCN = classBands.getCodeHandlerClassRCN();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSegment_Jhts1() {
    Segment segment1 = new Segment();
    ClassBands classBands1 = new ClassBands(segment1);
    int[][] codeHandlerClassRCN1 = classBands1.getCodeHandlerClassRCN();
    Segment segment2 = new Segment();
    ClassBands classBands2 = new ClassBands(segment2);
    int[][] codeHandlerClassRCN2 = classBands2.getCodeHandlerClassRCN();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeMaxStack_Vpfh1() {
	ClassBands classBands = new ClassBands(new Segment());
	int[] codeMaxStack = classBands.getCodeMaxStack();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderedCodeAttributes_xess0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<List<Attribute>> result = classBands.getOrderedCodeAttributes();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_WUeY0_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        for (String[] method : methodDescr) {
            for (String desc : method) {
            }
        }
        assertNotNull(methodDescr);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_WUeY0_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        for (String[] method : methodDescr) {
            for (String desc : method) {
            }
        }
        assertNotEquals(0, methodDescr.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_wQlB0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] classAttributes = classBands.getClassAttributes();
        assertNotNull(classAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMinor_mKQG0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] actual = classBands.getClassVersionMinor();
        int[] expected = null;
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_UjRn0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] methodDescrInts = classBands.getMethodDescrInts();
        assertNotNull(methodDescrInts);
        assertTrue(methodDescrInts.length > 0);
        for (int[] ints : methodDescrInts) {
            assertTrue(ints.length > 0);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSegment_IARB0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    boolean[] codeHasAttributes = classBands.getCodeHasAttributes();
    assertNotNull(codeHasAttributes);
    assertEquals(1, codeHasAttributes.length);
    assertTrue(codeHasAttributes[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_CDYb0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] result = classBands.getClassInterfacesInts();
        assertNotNull(result);
        assertNotEquals(0, result.length);
        for (int[] row : result) {
            assertNotEquals(0, row.length);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_WUeY0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertNotNull(methodDescr);
        assertNotEquals(0, methodDescr.length);
        for (String[] method : methodDescr) {
            assertNotNull(method);
            assertNotEquals(0, method.length);
            for (String desc : method) {
                assertNotNull(desc);
            }
        }
    }
}