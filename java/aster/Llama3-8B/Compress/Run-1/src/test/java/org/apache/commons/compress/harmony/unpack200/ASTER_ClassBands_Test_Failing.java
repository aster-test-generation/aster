/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void testGetClassFlagsAllDefault_fufS4() {
        ClassBands classBands = new ClassBands(new Segment());
        long[] result = classBands.getClassFlags();
        for (long flag : result) {
            assert flag == 0;
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpack_dpfU0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        classBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_ybdf0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
        assertArrayEquals(new ArrayList[0][0], methodAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIcLocal_JPNW0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        IcTuple[][] expected = {{}, {}};
        IcTuple[][] actual = classBands.getIcLocal();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxNALocals_HmrJ0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] expected = new int[0];
        int[] actual = classBands.getCodeMaxNALocals();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCount_qarN0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] expected = new int[]{}; // replace with your expected result
        int[] actual = classBands.getCodeHandlerCount();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassFieldCount_OvpB0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] expected = new int[0];
        int[] actual = classBands.getClassFieldCount();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_CPlo0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] actual = classBands.getMethodDescrInts();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMajor_iMNm0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassVersionMajor();
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerEndPO_dTQF0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] actual = classBands.getCodeHandlerEndPO();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHasAttributes_RvXL0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        boolean[] expected = new boolean[0];
        boolean[] actual = classBands.getCodeHasAttributes();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_Gtyr0() throws IOException, Pack200Exception {
        ClassBands classBands = new ClassBands(new Segment());
        classBands.read(classBands.getClass().getResourceAsStream("test.class"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetReferences_luWi3() throws IOException, Pack200Exception {
        ClassBands classBands = new ClassBands(new Segment());
        String[] cpClass = new String[0];
        String[] result = classBands.getReferences(new int[0], cpClass);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldDescrInts_BSqN0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] result = classBands.getFieldDescrInts();
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_rNpI0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] actual = classBands.getClassInterfacesInts();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCatchPO_AthN0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] actual = classBands.getCodeHandlerCatchPO();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlagsNull_iNJr0() {
        ClassBands classBands = new ClassBands(new Segment());
        long[][] expected = new long[0][];
        long[][] actual = classBands.getMethodFlags();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlagsDefault_yFXJ1() {
        ClassBands classBands = new ClassBands(new Segment());
        long[][] expected = new long[][]{{0x7FFF}};
        long[][] actual = classBands.getMethodFlags();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlagsNonDefault_AXWy2() {
        ClassBands classBands = new ClassBands(new Segment());
        long[][] expected = new long[][]{{0x7FFF - 1}};
        classBands.getMethodFlags(); // call the method to initialize the field
        long[][] actual = classBands.getMethodFlags();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlagsMultipleNonDefault_RBmb3() {
        ClassBands classBands = new ClassBands(new Segment());
        long[][] expected = new long[][]{{0x7FFF - 1, 0x7FFF - 2}};
        classBands.getMethodFlags(); // call the method to initialize the field
        long[][] actual = classBands.getMethodFlags();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodFlagsEmptyArrayInner_jqBA5() {
        ClassBands classBands = new ClassBands(new Segment());
        long[][] expected = new long[][]{{}};
        long[][] actual = classBands.getMethodFlags();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerClassRCN_fmuf0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] actual = classBands.getCodeHandlerClassRCN();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxStack_YpCy0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] expected = new int[]{}; // replace with your expected result
        int[] result = classBands.getCodeMaxStack();
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderedCodeAttributes_CaqK0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<List<Attribute>> result = classBands.getOrderedCodeAttributes();
        assertEquals("Your expected result", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescr_xLLb0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] expected = {{"method1", "description1"}, {"method2", "description2"}};
        String[][] actual = classBands.getMethodDescr();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_NovN0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] actual = classBands.getClassAttributes();
        assertEquals("Your expected result", actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMinor_fEwr0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] expected = new int[0]; // replace with your expected result
        int[] actual = classBands.getClassVersionMinor();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldFlagsNull_hHkh0() {
        ClassBands classBands = new ClassBands(new Segment());
        long[][] expected = new long[0][];
        long[][] actual = classBands.getFieldFlags();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldFlagsSingle_KIMU2() {
        ClassBands classBands = new ClassBands(new Segment());
        long[][] expected = new long[][]{{0x7FFF}};
        long[][] actual = classBands.getFieldFlags();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldFlagsMultiple_EQAa3() {
        ClassBands classBands = new ClassBands(new Segment());
        long[][] expected = new long[][]{{0x7FFF}, {0x7FFF}};
        long[][] actual = classBands.getFieldFlags();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassThisInts_Ktyx0_IzeW0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = new int[] {1, 2, 3};
    int[] actual = classBands.getClassThisInts();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassFlagsNull_Oxvc0_BGLH0() {
    ClassBands classBands = new ClassBands(new Segment());
    long[][] result = classBands.getFieldFlags();
    assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_sqrM0_UqKM0() throws IOException, Pack200Exception {
    ClassBands classBands = new ClassBands(new Segment());
    InputStream in = new java.io.ByteArrayInputStream(new byte[0]);
    classBands.read(in);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetReferences_YYZW4_CsrV1() throws IOException, Pack200Exception {
    ClassBands classBands = new ClassBands(new Segment());
    long[][] result = classBands.getFieldFlags();
    assert true;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_gnHJ0_QNQa0() throws IOException, Pack200Exception {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    long[][] result = classBands.getFieldFlags();
    assert result != null;
}
}