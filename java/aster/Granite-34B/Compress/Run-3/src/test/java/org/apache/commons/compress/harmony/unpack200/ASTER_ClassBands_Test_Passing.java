/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRawClassFlagsTest_aEGl7() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[] expected = classBands.getRawClassFlags();
        long[] actual = {0, 0, 0, 0, 0, 1, 0, 0};
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassSuperInts_fsmO0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassSuperInts();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassMethodCount_kcid0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] expected = new int[0]; // Replace with the expected return value
        assertArrayEquals(expected, classBands.getClassMethodCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassThisInts_hyId0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassThisInts();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassThisIntsWithNullSegment_AzrA1() {
        Segment segment = null;
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassThisInts();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassFlags_WhenClassAccessFlagsAreNull_ThenReturnExpectedResult_yeji0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[] result = classBands.getClassFlags();
        assertTrue(result != null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassFlags_WhenClassAccessFlagsAreNotNull_ThenReturnExpectedResult_ITBm1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        classBands.getClassFlags();
        long[] result = classBands.getClassFlags();
        assertTrue(result != null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerStartP_dnlY0() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] result = classBands.getCodeHandlerStartP();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerStartP_NullSegment_Xzcn1() {
        ClassBands classBands = new ClassBands(null);
        int[][] result = classBands.getCodeHandlerStartP();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldAttributes_sJvQ0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] fieldAttributes = classBands.getFieldAttributes();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldAttributes_NullSegment_QFXK1() {
        Segment segment = null;
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] fieldAttributes = classBands.getFieldAttributes();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testUnPack_wpXY0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        classBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testUnPackWithCoverage_dlYS1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        classBands.unpack();
        classBands.unpack();
        classBands.unpack();
        classBands.unpack();
        classBands.unpack();
        classBands.unpack();
        classBands.unpack();
        classBands.unpack();
        classBands.unpack();
        classBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_ZUeY0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_NullSegment_LdJa1() {
        Segment segment = null;
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_ReturnNull_TSHR5() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
        assertNull(methodAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_ReturnEmptyArray_DNus6() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
        assertEquals(0, methodAttributes.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_ReturnNonEmptyArray_jmIE7() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
        assertNotEquals(0, methodAttributes.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIcLocal_yaup0_1() {
        ClassBands classBands = new ClassBands(new Segment());
        IcTuple[][] result = classBands.getIcLocal();
        for (IcTuple[] subArray : result) {
        }
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIcLocal_yaup0_2() {
        ClassBands classBands = new ClassBands(new Segment());
        IcTuple[][] result = classBands.getIcLocal();
        for (IcTuple[] subArray : result) {
        }
        assertEquals(10, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCount_tJwx0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] codeHandlerCount = classBands.getCodeHandlerCount();
        assertNotNull(codeHandlerCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCountWithNullSegment_HkJv1() {
        ClassBands classBands = new ClassBands(null);
        int[] codeHandlerCount = classBands.getCodeHandlerCount();
        assertNull(codeHandlerCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCountWithEmptySegment_usfn2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] codeHandlerCount = classBands.getCodeHandlerCount();
        assertNotEquals(0, codeHandlerCount.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassFieldCount_JVth0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] actual = classBands.getClassFieldCount();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassFieldCount_NullSegment_DPqO1() {
        Segment segment = null;
        ClassBands classBands = new ClassBands(segment);
        int[] actual = classBands.getClassFieldCount();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMajor_VeOj0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassVersionMajor();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerEndPO_dGBi0() {
    ClassBands classBands = new ClassBands(new Segment());
    int[][] actual = classBands.getCodeHandlerEndPO();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerEndPOWithNullSegment_wZUo1() {
    ClassBands classBands = new ClassBands(null);
    int[][] actual = classBands.getCodeHandlerEndPO();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHasAttributes_dFkK0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        boolean[] expected = classBands.getCodeHasAttributes();
        boolean[] actual = {false, false, false, false, false, false, false, false, false, false};
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldDescrInts_mEED0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] fieldDescrInts = classBands.getFieldDescrInts();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldDescrInts_NullSegment_wBZW1() {
        Segment segment = null;
        ClassBands classBands = new ClassBands(segment);
        int[][] fieldDescrInts = classBands.getFieldDescrInts();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_GlKs0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = classBands.getClassInterfacesInts();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_NullSegment_ACMB1() {
        Segment segment = null;
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = null;
        assertArrayEquals(expected, classBands.getClassInterfacesInts());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_EmptySegment_HbTH2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = new int[0][0];
        assertArrayEquals(expected, classBands.getClassInterfacesInts());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlags_WhenMethodAccessFlagsAreNull_ThenCreateNewFlags_xbEZ0() {
        ClassBands classBands = new ClassBands(new Segment());
        long[][] expected = new long[10][10];
        long[][] actual = classBands.getMethodFlags();
        assertNotEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCatchPO_jQKA0() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] result = classBands.getCodeHandlerCatchPO();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerClassRCN_roQC0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] codeHandlerClassRCN = classBands.getCodeHandlerClassRCN();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerClassRCN_NullSegment_AJMe1() {
        Segment segment = null;
        ClassBands classBands = new ClassBands(segment);
        int[][] codeHandlerClassRCN = classBands.getCodeHandlerClassRCN();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxStack_aOfX0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] expected = new int[0]; // Replace with the expected value
        assertArrayEquals(expected, classBands.getCodeMaxStack());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_clQp0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_NullSegment_XlJx1() {
        Segment segment = null;
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_ReturnLength_IwRe3() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertEquals(10, methodDescr.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_ReturnValues_vloG4_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertEquals("value1", methodDescr[0][0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_ReturnValues_vloG4_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertEquals("value2", methodDescr[0][1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_ReturnTypes_dqYA5_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertEquals(String.class, methodDescr.getClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_ReturnTypes_dqYA5_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertEquals(String[].class, methodDescr[0].getClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_ReturnTypes_dqYA5_3() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertEquals(String.class, methodDescr[0][0].getClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldFlags_WhenFieldAccessFlagsAreNull_ThenReturnExpectedResult_dbnw0() {
        final Segment segment = new Segment();
        final ClassBands classBands = new ClassBands(segment);
        long[][] expected = new long[10][10];
        long[][] actual = classBands.getFieldFlags();
        assertNotEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_igjf0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] classAttributes = classBands.getClassAttributes();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMinor_DZAp0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassVersionMinor();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMinorWithNullSegment_zSMc1() {
        Segment segment = null;
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassVersionMinor();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRawClassFlagsTest_topm0_bsrZ0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[] expected = classBands.getRawClassFlags();
        long[] actual = {0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRawClassFlagsTest_Ymsq1_EbWg0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        long[] expected = classBands.getRawClassFlags();
        long[] actual = {1, 1, 0, 0, 0, 0, 1, 0};
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRawClassFlagsTest_HlaT2_vUJW0() {
        ClassBands classBands = new ClassBands(new Segment());
        long[] expected = classBands.getRawClassFlags();
        long[] actual = {0, 0, 1, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRawClassFlagsTest_bXka6_nIzq0() {
        ClassBands classBands = new ClassBands(new Segment());
        long[] expected = classBands.getRawClassFlags();
        long[] actual = {0, 0, 0, 0, 1, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_ReturnSize_iEDh3_sobg0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
        int expectedSize = 0;
        assertEquals(expectedSize, methodAttributes.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_tmxe0_rcak0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = classBands.getMethodDescrInts();
        int[][] actual = classBands.getMethodDescrInts();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_rrDb0_aUNi0() throws IOException, Pack200Exception {
    InputStream in = mock(InputStream.class);
    ClassBands classBands = new ClassBands(new Segment());
    classBands.read(in);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIcLocal_yaup0() {
        ClassBands classBands = new ClassBands(new Segment());
        IcTuple[][] result = classBands.getIcLocal();
        assertNotNull(result);
        assertEquals(10, result.length);
        for (IcTuple[] subArray : result) {
            assertNotNull(subArray);
            assertEquals(5, subArray.length);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_ReturnValues_vloG4() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertEquals("value1", methodDescr[0][0]);
        assertEquals("value2", methodDescr[0][1]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_ReturnTypes_dqYA5() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertEquals(String.class, methodDescr.getClass());
        assertEquals(String[].class, methodDescr[0].getClass());
        assertEquals(String.class, methodDescr[0][0].getClass());
    }
}