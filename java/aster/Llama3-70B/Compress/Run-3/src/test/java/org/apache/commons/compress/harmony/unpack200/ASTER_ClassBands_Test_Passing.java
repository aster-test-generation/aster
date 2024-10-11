/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
public void testGetCodeHandlerStartP_eidL0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] result = classBands.getCodeHandlerStartP();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldAttributes_aZcE0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<Attribute>[][] result = classBands.getFieldAttributes();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_hpiP0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    classBands.unpack();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodAttributes_Jslp0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<Attribute>[][] result = classBands.getMethodAttributes();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIcLocal_Rlya0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    IcTuple[][] icLocal = classBands.getIcLocal();
    assertNotNull(icLocal);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeMaxNALocals_mOfg0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] result = classBands.getCodeMaxNALocals();
    assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerCount_SFgH0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] result = classBands.getCodeHandlerCount();
    assertArrayEquals(new int[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassFieldCount_gSfV0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] result = classBands.getClassFieldCount();
    assertArrayEquals(new int[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodDescrInts_jIdH0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] result = classBands.getMethodDescrInts();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassVersionMajor_apsR0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] result = classBands.getClassVersionMajor();
    assertArrayEquals(new int[]{}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerEndPO_hCoK0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] result = classBands.getCodeHandlerEndPO();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHasAttributes_cPtz0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    boolean[] result = classBands.getCodeHasAttributes();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldDescrInts_pTVX0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] result = classBands.getFieldDescrInts();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassInterfacesInts_JlAh0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] result = classBands.getClassInterfacesInts();
    assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerCatchPO_Awes0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] result = classBands.getCodeHandlerCatchPO();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeHandlerClassRCN_SEvo0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[][] result = classBands.getCodeHandlerClassRCN();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodeMaxStack_WfgN0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = {};
    int[] actual = classBands.getCodeMaxStack();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCodeAttributes_woDu0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<List<Attribute>> result = classBands.getOrderedCodeAttributes();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodDescr_PTIK0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    String[][] result = classBands.getMethodDescr();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldFlags1_GwDS0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    long[][] result = classBands.getFieldFlags();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassAttributes_SQlu0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    ArrayList<Attribute>[] result = classBands.getClassAttributes();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassVersionMinor_fCwz0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] result = classBands.getClassVersionMinor();
    assertArrayEquals(new int[]{}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassVersionMinor_RVYl0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] result = classBands.getClassVersionMinor();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFieldFlags2_bJxr1_fzfd0() {
    Segment segment = new Segment();
    ClassBands classBands = new ClassBands(segment);
    int[] expected = new int[0]; // Initialize expected array
    int[] actual = classBands.getClassVersionMinor();
    assertArrayEquals(expected, actual);
}
}