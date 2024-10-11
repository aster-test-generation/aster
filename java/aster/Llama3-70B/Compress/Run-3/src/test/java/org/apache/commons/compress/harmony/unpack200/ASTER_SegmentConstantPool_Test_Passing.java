/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_SegmentConstantPool_Test_Passing {
SegmentConstantPool segmentconstantpool;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegexMatches_allMatch_xspl0() {
    boolean result = SegmentConstantPool.regexMatches(SegmentConstantPool.REGEX_MATCH_ALL, "anyString");
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchSpecificPoolEntryIndex_EmptyIndexList_huLd0() {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    String[] primaryArray = new String[] {};
    String[] secondaryArray = new String[] {};
    String primaryCompareString = "";
    String secondaryCompareRegex = "";
    int desiredIndex = 0;
    assertEquals(-1, scp.matchSpecificPoolEntryIndex(primaryArray, secondaryArray, primaryCompareString, secondaryCompareRegex, desiredIndex));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchSpecificPoolEntryIndex_NoMatch_fAhH1() {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    String[] primaryArray = new String[] {"a", "b", "c"};
    String[] secondaryArray = new String[] {"x", "y", "z"};
    String primaryCompareString = "a";
    String secondaryCompareRegex = "w";
    int desiredIndex = 0;
    assertEquals(-1, scp.matchSpecificPoolEntryIndex(primaryArray, secondaryArray, primaryCompareString, secondaryCompareRegex, desiredIndex));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchSpecificPoolEntryIndex_FirstMatch_kbmR2() {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    String[] primaryArray = new String[] {"a", "b", "c"};
    String[] secondaryArray = new String[] {"x", "y", "z"};
    String primaryCompareString = "a";
    String secondaryCompareRegex = "x";
    int desiredIndex = 0;
    assertEquals(0, scp.matchSpecificPoolEntryIndex(primaryArray, secondaryArray, primaryCompareString, secondaryCompareRegex, desiredIndex));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchSpecificPoolEntryIndex_SecondMatch_bAPF3() {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    String[] primaryArray = new String[] {"a", "a", "c"};
    String[] secondaryArray = new String[] {"x", "x", "z"};
    String primaryCompareString = "a";
    String secondaryCompareRegex = "x";
    int desiredIndex = 1;
    assertEquals(1, scp.matchSpecificPoolEntryIndex(primaryArray, secondaryArray, primaryCompareString, secondaryCompareRegex, desiredIndex));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchSpecificPoolEntryIndex_NoDesiredIndex_xguJ4() {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    String[] primaryArray = new String[] {"a", "a", "c"};
    String[] secondaryArray = new String[] {"x", "x", "z"};
    String primaryCompareString = "a";
    String secondaryCompareRegex = "x";
    int desiredIndex = 2;
    assertEquals(-1, scp.matchSpecificPoolEntryIndex(primaryArray, secondaryArray, primaryCompareString, secondaryCompareRegex, desiredIndex));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchSpecificPoolEntryIndex_Jzgp0() {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool segmentConstantPool = new SegmentConstantPool(bands);
    String[] nameArray = new String[] {"test1", "test2"};
    String compareString = "test1";
    int desiredIndex = 0;
    int result = segmentConstantPool.matchSpecificPoolEntryIndex(nameArray, compareString, desiredIndex);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_NegativeIndex_pZIu1() {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    try {
        scp.getValue(SegmentConstantPool.UTF_8, -2);
        fail("Expected Pack200Exception");
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testmatchSpecificPoolEntryIndex_AlCq0() throws Exception {
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(new CpBands(new Segment()));
    String[] primaryArray = {"primary1", "primary2", "primary3"};
    String desiredClassName = "primary2";
    int desiredIndex = 1;
    int result = segmentconstantpool.matchSpecificPoolEntryIndex(primaryArray, desiredClassName, desiredIndex);
    assertEquals(desiredIndex, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testmatchSpecificPoolEntryIndex_Hrso0() throws Exception{
    Segment segment = new Segment();
    CpBands cpBands = new CpBands(segment);
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(cpBands);
    String[] nameArray = {"test1", "test2", "test3"};
    String compareString = "test2";
    int desiredIndex = 1;
    int result = segmentconstantpool.matchSpecificPoolEntryIndex(nameArray, compareString, desiredIndex);
    assertEquals(desiredIndex, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegexMatches_initMatch_FDim1_MMoU0() {
    SegmentConstantPool scp = new SegmentConstantPool(new CpBands(new Segment()));
    boolean result = SegmentConstantPool.regexMatches(SegmentConstantPool.REGEX_MATCH_INIT, scp.INITSTRING + "extra");
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetClassSpecificPoolEntry_CP_FIELD_zhjN0() throws Exception {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(bands);
    ConstantPoolEntry expectedEntry = mock(ConstantPoolEntry.class);
    String[] array = new String[] {"desiredClassName"};
    when(bands.getCpFieldClass()).thenReturn(array);
    when(segmentconstantpool.getConstantPoolEntry(SegmentConstantPool.CP_FIELD, 1)).thenReturn(expectedEntry);
    ConstantPoolEntry actualEntry = segmentconstantpool.getClassSpecificPoolEntry(SegmentConstantPool.CP_FIELD, 1, "desiredClassName");
    assertEquals(expectedEntry, actualEntry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetClassSpecificPoolEntry_CP_FIELD_Rvlx0() throws Exception {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(bands);
    ConstantPoolEntry expectedEntry = mock(ConstantPoolEntry.class);
    String[] array = new String[] {"desiredClassName"};
    when(bands.getCpFieldClass()).thenReturn(array);
    when(segmentconstantpool.matchSpecificPoolEntryIndex(array, "desiredClassName", 1)).thenReturn(1);
    when(segmentconstantpool.getConstantPoolEntry(SegmentConstantPool.CP_FIELD, 1)).thenReturn(expectedEntry);
    ConstantPoolEntry actualEntry = segmentconstantpool.getClassSpecificPoolEntry(SegmentConstantPool.CP_FIELD, 1, "desiredClassName");
    assertEquals(expectedEntry, actualEntry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetClassSpecificPoolEntry_CP_FIELD_hAdz0() throws Exception {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(bands);
    ConstantPoolEntry expectedEntry = mock(ConstantPoolEntry.class);
    when(bands.getCpFieldClass()).thenReturn(new String[] {"desiredClassName"});
    when(segmentconstantpool.getConstantPoolEntry(SegmentConstantPool.CP_FIELD, 0)).thenReturn(expectedEntry);
    ConstantPoolEntry actualEntry = segmentconstantpool.getClassSpecificPoolEntry(SegmentConstantPool.CP_FIELD, 0, "desiredClassName");
    assertEquals(expectedEntry, actualEntry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetClassSpecificPoolEntry_CP_FIELD_mNJk0() throws Exception {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(bands);
    ConstantPoolEntry expectedEntry = mock(ConstantPoolEntry.class);
    String[] array = new String[] {"desiredClassName"};
    when(bands.getCpFieldClass()).thenReturn(array);
    when(segmentconstantpool.matchSpecificPoolEntryIndex(array, "desiredClassName", 0)).thenReturn(0);
    when(segmentconstantpool.getConstantPoolEntry(SegmentConstantPool.CP_FIELD, 0)).thenReturn(expectedEntry);
    ConstantPoolEntry actualEntry = segmentconstantpool.getClassSpecificPoolEntry(SegmentConstantPool.CP_FIELD, 0, "desiredClassName");
    assertEquals(expectedEntry, actualEntry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetClassSpecificPoolEntry_CP_CLASS_Jhzt0() throws Exception {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(bands);
    ConstantPoolEntry expectedEntry = mock(ConstantPoolEntry.class);
    when(segmentconstantpool.getConstantPoolEntry(SegmentConstantPool.CP_CLASS, 1)).thenReturn(expectedEntry);
    when(bands.getCpFieldClass()).thenReturn(new String[] {"desiredClassName"});
    ConstantPoolEntry actualEntry = segmentconstantpool.getClassSpecificPoolEntry(SegmentConstantPool.CP_CLASS, 1, "desiredClassName");
    assertEquals(expectedEntry, actualEntry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetConstantPoolEntry_CP_IMETHOD_OUZP0() throws Exception {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(bands);
    String[] array = new String[] {"desiredClassName"};
    when(bands.getCpIMethodClass()).thenReturn(array);
    when(segmentconstantpool.matchSpecificPoolEntryIndex(array, "desiredClassName", 1)).thenReturn(1);
    ConstantPoolEntry expectedEntry = mock(ConstantPoolEntry.class);
    when(segmentconstantpool.getConstantPoolEntry(SegmentConstantPool.CP_IMETHOD, 1)).thenReturn(expectedEntry);
    ConstantPoolEntry actualEntry = segmentconstantpool.getClassSpecificPoolEntry(SegmentConstantPool.CP_IMETHOD, 1, "desiredClassName");
    assertEquals(expectedEntry, actualEntry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetClassSpecificPoolEntry_jucQ0_1() throws Exception {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(bands);
    String name = "some.class.name";
    String[] classes = {"some.class.name", "another.class.name"};
    when(bands.getCpFieldClass()).thenReturn(classes);
    int index = 0;
    when(segmentconstantpool.matchSpecificPoolEntryIndex(classes, name, 0)).thenReturn(index);
    ConstantPoolEntry entry = mock(ConstantPoolEntry.class);
    when(segmentconstantpool.getConstantPoolEntry(1, index)).thenReturn(entry);
    ConstantPoolEntry result = segmentconstantpool.getClassSpecificPoolEntry(1, 0, name);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetClassSpecificPoolEntry_jucQ0_2() throws Exception {
    CpBands bands = new CpBands(new Segment());
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(bands);
    String name = "some.class.name";
    String[] classes = {"some.class.name", "another.class.name"};
    when(bands.getCpFieldClass()).thenReturn(classes);
    int index = 0;
    when(segmentconstantpool.matchSpecificPoolEntryIndex(classes, name, 0)).thenReturn(index);
    ConstantPoolEntry entry = mock(ConstantPoolEntry.class);
    when(segmentconstantpool.getConstantPoolEntry(1, index)).thenReturn(entry);
    ConstantPoolEntry result = segmentconstantpool.getClassSpecificPoolEntry(1, 0, name);
    assertEquals(entry, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetClassSpecificPoolEntry_CP_FIELD_wHTM0() throws Exception {
    Segment segment = new Segment();
    CpBands bands = Mockito.spy(new CpBands(segment));
    SegmentConstantPool segmentconstantpool = new SegmentConstantPool(bands);
    String[] array = new String[] {"desiredClassName"};
    Mockito.doReturn(array).when(bands).getCpFieldClass();
    int cp = 1; // Assuming CP_FIELD is 1
    long desiredIndex = 1;
    String desiredClassName = "desiredClassName";
    ConstantPoolEntry expectedEntry = Mockito.mock(ConstantPoolEntry.class);
    Mockito.when(segmentconstantpool.getConstantPoolEntry(cp, 1)).thenReturn(expectedEntry);
    ConstantPoolEntry result = segmentconstantpool.getClassSpecificPoolEntry(cp, desiredIndex, desiredClassName);
    assertEquals(expectedEntry, result);
    Mockito.verify(bands, Mockito.times(1)).getCpFieldClass();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassSpecificPoolEntry_CP_FIELD_JpOj0_ZdQs0() {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    int CP_FIELD = 1; // Define CP_FIELD
    try {
        ConstantPoolEntry entry = scp.getClassSpecificPoolEntry(CP_FIELD, 1, "desiredClassName");
        assertNotNull(entry);
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantPoolEntry_UTF8_AiBD0_HJki0() {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    try {
        ConstantPoolEntry entry = scp.getClassSpecificPoolEntry(SegmentConstantPool.UTF_8, 10, "someClassName");
        assertNotNull(entry);
        assertEquals(10, entry.getGlobalIndex());
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantPoolEntry_CP_INT_MEMp1_bEhF0() {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    try {
        ConstantPoolEntry entry = scp.getClassSpecificPoolEntry(SegmentConstantPool.CP_INT, 20, "someClassName");
        assertNotNull(entry);
        assertEquals(20, entry.getGlobalIndex());
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantPoolEntry_NULL_CQss2_xZyF0() {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool scp = new SegmentConstantPool(bands);
    try {
        ConstantPoolEntry entry = scp.getClassSpecificPoolEntry(-1, -1, "someClassName");
        assertNull(entry);
    } catch (Pack200Exception e) {
    }
}
}