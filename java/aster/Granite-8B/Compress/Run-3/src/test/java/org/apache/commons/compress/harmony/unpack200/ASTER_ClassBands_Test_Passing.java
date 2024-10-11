/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpack_yBeH0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        classBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_rICj0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
        assertNotNull(methodAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIcLocal_WFwo0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        IcTuple[][] icLocal = classBands.getIcLocal();
        assertNotNull(icLocal);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_Ftho0() {
        Segment segment = new Segment();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxNALocals_mzdT1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] codeMaxNALocals = classBands.getCodeMaxNALocals();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_EOAI0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] codeHandlerCount = classBands.getCodeHandlerCount();
        assertEquals(0, codeHandlerCount.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassFieldCount_kvkX0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] classFieldCount = classBands.getClassFieldCount();
        assertNotNull(classFieldCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_TXvP0_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] methodDescrInts = classBands.getMethodDescrInts();
        for (int[] ints : methodDescrInts) {
        }
        assertNotNull(methodDescrInts);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_TXvP0_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] methodDescrInts = classBands.getMethodDescrInts();
        for (int[] ints : methodDescrInts) {
        }
        assertTrue(methodDescrInts.length > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMajor_YGph0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassVersionMajor();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_PTOv0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] result = classBands.getCodeHandlerEndPO();
        assertEquals(0, result.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_RDYi0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        boolean[] codeHasAttributes = classBands.getCodeHasAttributes();
        assertNotNull(codeHasAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFieldBands_dIgf2() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_ezzB0() {
        Segment segment = new Segment();
        assertNotNull(segment);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldDescrInts_BmIv1_1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] fieldDescrInts = classBands.getFieldDescrInts();
        for (int[] array : fieldDescrInts) {
        }
        assertNotNull(fieldDescrInts);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldDescrInts_BmIv1_2() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] fieldDescrInts = classBands.getFieldDescrInts();
        for (int[] array : fieldDescrInts) {
        }
        assertTrue(fieldDescrInts.length > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_zTVI0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] result = classBands.getClassInterfacesInts();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCatchPO_dKnq1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] codeHandlerCatchPO = classBands.getCodeHandlerCatchPO();
        assertNotNull(codeHandlerCatchPO);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerClassRCN_cdyG1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] codeHandlerClassRCN = classBands.getCodeHandlerClassRCN();
        assertNotNull(codeHandlerClassRCN);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxStack_wMmU0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] actual = classBands.getCodeMaxStack();
        int[] expected = null;
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderedCodeAttributes_rNlF0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<List<Attribute>> expected = new ArrayList<>();
        assertEquals(expected, classBands.getOrderedCodeAttributes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_sAQA0_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertNotNull(methodDescr);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_sAQA0_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertEquals(0, methodDescr.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_RpuE0_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] classAttributes = classBands.getClassAttributes();
        assertNotNull(classAttributes);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_RpuE0_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] classAttributes = classBands.getClassAttributes();
        assertEquals(2, classAttributes.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_RpuE0_3() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] classAttributes = classBands.getClassAttributes();
        assertNotNull(classAttributes[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_RpuE0_4() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] classAttributes = classBands.getClassAttributes();
        assertTrue(classAttributes[0].isEmpty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_RpuE0_5() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] classAttributes = classBands.getClassAttributes();
        assertNotNull(classAttributes[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_RpuE0_6() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] classAttributes = classBands.getClassAttributes();
        assertTrue(classAttributes[1].isEmpty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMinor_bzQP0_1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] result = classBands.getClassVersionMinor();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMinor_bzQP0_2() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] result = classBands.getClassVersionMinor();
        assertEquals(1, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMinor_bzQP0_3() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] result = classBands.getClassVersionMinor();
        assertEquals(0, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_TXvP0() {
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
    public void testGetFieldDescrInts_BmIv1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] fieldDescrInts = classBands.getFieldDescrInts();
        assertNotNull(fieldDescrInts);
        assertTrue(fieldDescrInts.length > 0);
        for (int[] array : fieldDescrInts) {
            assertTrue(array.length > 0);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_sAQA0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertNotNull(methodDescr);
        assertEquals(0, methodDescr.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_RpuE0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] classAttributes = classBands.getClassAttributes();
        assertNotNull(classAttributes);
        assertEquals(2, classAttributes.length);
        assertNotNull(classAttributes[0]);
        assertTrue(classAttributes[0].isEmpty());
        assertNotNull(classAttributes[1]);
        assertTrue(classAttributes[1].isEmpty());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMinor_bzQP0() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] result = classBands.getClassVersionMinor();
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }
}