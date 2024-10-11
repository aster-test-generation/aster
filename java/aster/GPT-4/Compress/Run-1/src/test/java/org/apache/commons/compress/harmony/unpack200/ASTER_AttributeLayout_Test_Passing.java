/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AttributeLayout_Test_Passing {
private static final String LAYOUT = "KQ";
private static final String TYPE_STRING = "Ljava/lang/String;";
private static final long VALUE = 123L;
@Mock
    private SegmentConstantPool mockPool;
@Mock
    private ClassFileEntry mockEntry;
@InjectMocks
    private AttributeLayout attributeLayout;
private final String layout = "someLayout";
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLayout_GLJJ0() throws Exception {
    AttributeLayout attributeLayout = new AttributeLayout("testName", 1, "testLayout", 0);
    assertEquals("testLayout", attributeLayout.getLayout());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDefaultLayout_True_PVTb0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("testName", 1, "testLayout", 0, true);
    assertTrue(attributeLayout.isDefaultLayout());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_NotStringType_1() throws Exception {
        attributeLayout = new AttributeLayout("TestAttribute", 1, LAYOUT, 0);
        // Setup
        String modifiedLayout = "K" + TYPE_STRING + LAYOUT.substring(2);
        when(mockPool.getValue(anyInt(), anyLong())).thenReturn(mockEntry);
        // Execute
        ClassFileEntry result = attributeLayout.getValue(VALUE, TYPE_STRING, mockPool);
        // Verify
        verify(mockPool).getValue(0, VALUE); // Assuming the index is 0 for simplicity
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_NotStringType_2() throws Exception {
        attributeLayout = new AttributeLayout("TestAttribute", 1, LAYOUT, 0);
        // Setup
        String modifiedLayout = "K" + TYPE_STRING + LAYOUT.substring(2);
        when(mockPool.getValue(anyInt(), anyLong())).thenReturn(mockEntry);
        // Execute
        ClassFileEntry result = attributeLayout.getValue(VALUE, TYPE_STRING, mockPool);
        // Verify
        verify(mockPool).getValue(0, VALUE); // Assuming the index is 0 for simplicity
        assertEquals(mockEntry, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_StringType_1() throws Exception {
        attributeLayout = new AttributeLayout("TestAttribute", 1, LAYOUT, 0);
        // Setup
        when(mockPool.getValue(anyInt(), anyLong())).thenReturn(mockEntry);
        // Execute
        ClassFileEntry result = attributeLayout.getValue(VALUE, "Ljava/lang/String;", mockPool);
        // Verify
        verify(mockPool).getValue(0, VALUE); // Assuming the index is 0 for simplicity
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_StringType_2() throws Exception {
        attributeLayout = new AttributeLayout("TestAttribute", 1, LAYOUT, 0);
        // Setup
        when(mockPool.getValue(anyInt(), anyLong())).thenReturn(mockEntry);
        // Execute
        ClassFileEntry result = attributeLayout.getValue(VALUE, "Ljava/lang/String;", mockPool);
        // Verify
        verify(mockPool).getValue(0, VALUE); // Assuming the index is 0 for simplicity
        assertEquals(mockEntry, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_LayoutNotStartingWithKQ_1() throws Exception {
        attributeLayout = new AttributeLayout("TestAttribute", 1, LAYOUT, 0);
        // Re-setup attributeLayout with different layout
        attributeLayout = new AttributeLayout("TestAttribute", 1, "KR", 0);
        // Setup
        when(mockPool.getValue(anyInt(), anyLong())).thenReturn(mockEntry);
        // Execute
        ClassFileEntry result = attributeLayout.getValue(VALUE, TYPE_STRING, mockPool);
        // Verify
        verify(mockPool).getValue(0, VALUE); // Assuming the index is 0 for simplicity
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_LayoutNotStartingWithKQ_2() throws Exception {
        attributeLayout = new AttributeLayout("TestAttribute", 1, LAYOUT, 0);
        // Re-setup attributeLayout with different layout
        attributeLayout = new AttributeLayout("TestAttribute", 1, "KR", 0);
        // Setup
        when(mockPool.getValue(anyInt(), anyLong())).thenReturn(mockEntry);
        // Execute
        ClassFileEntry result = attributeLayout.getValue(VALUE, TYPE_STRING, mockPool);
        // Verify
        verify(mockPool).getValue(0, VALUE); // Assuming the index is 0 for simplicity
        assertEquals(mockEntry, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNumBackwardsCallablesWithAsteriskLayout_ARDd0() throws Exception {
    AttributeLayout attributeLayout = new AttributeLayout("test", 1, "*", 0);
    int result = attributeLayout.numBackwardsCallables();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNumBackwardsCallablesWithNonAsteriskLayout_wIZy1() throws Exception {
    AttributeLayout attributeLayout = new AttributeLayout("test", 1, "B", 0);
    int result = attributeLayout.numBackwardsCallables();
    assertEquals(0, result); // Assuming backwardsCallCount is initialized to 0
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithRU_OrZu0_1() throws Pack200Exception {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool pool = new SegmentConstantPool(bands);
    AttributeLayout attributeLayout = new AttributeLayout("test", 0, "RU", 1);
    ClassFileEntry result = attributeLayout.getValue(1, "RU", pool);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithRU_OrZu0_2() throws Pack200Exception {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool pool = new SegmentConstantPool(bands);
    AttributeLayout attributeLayout = new AttributeLayout("test", 0, "RU", 1);
    ClassFileEntry result = attributeLayout.getValue(1, "RU", pool);
    assertTrue(result instanceof ClassFileEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithKS_GIpK1_1() throws Pack200Exception {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool pool = new SegmentConstantPool(bands);
    AttributeLayout attributeLayout = new AttributeLayout("test", 0, "KS", 1);
    ClassFileEntry result = attributeLayout.getValue(1, "Ljava/lang/String;", pool);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithKS_GIpK1_2() throws Pack200Exception {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool pool = new SegmentConstantPool(bands);
    AttributeLayout attributeLayout = new AttributeLayout("test", 0, "KS", 1);
    ClassFileEntry result = attributeLayout.getValue(1, "Ljava/lang/String;", pool);
    assertTrue(result instanceof ClassFileEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithKJ_bfAD2_1() throws Pack200Exception {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool pool = new SegmentConstantPool(bands);
    AttributeLayout attributeLayout = new AttributeLayout("test", 0, "KJ", 1);
    ClassFileEntry result = attributeLayout.getValue(1, "J", pool);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithKJ_bfAD2_2() throws Pack200Exception {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool pool = new SegmentConstantPool(bands);
    AttributeLayout attributeLayout = new AttributeLayout("test", 0, "KJ", 1);
    ClassFileEntry result = attributeLayout.getValue(1, "J", pool);
    assertTrue(result instanceof ClassFileEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_ttWJ0() throws Exception {
    String expected = "SomeContext: SomeName";
    String[] contextNames = {"SomeContext"};
    AttributeLayout attributeLayout = new AttributeLayout("SomeName", 0, "SomeLayout", 1);
    assertEquals(expected, attributeLayout.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithNonNullValues_kVZn0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("TestName", 5, "TestLayout", 10);
    int expectedHashCode = 1;
    expectedHashCode = expectedHashCode * 31 + "TestName".hashCode();
    expectedHashCode = expectedHashCode * 31 + "TestLayout".hashCode();
    expectedHashCode = expectedHashCode * 31 + 10;
    expectedHashCode = expectedHashCode * 31 + 5;
    assertEquals(expectedHashCode, attributeLayout.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithNullValues_wXng1() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout(null, 3, null, 7);
    int expectedHashCode = 1;
    expectedHashCode = expectedHashCode * 31 + 7;
    expectedHashCode = expectedHashCode * 31 + 3;
    assertEquals(expectedHashCode, attributeLayout.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithMixedValues_Pepu2() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("TestName", 1, null, 20);
    int expectedHashCode = 1;
    expectedHashCode = expectedHashCode * 31 + "TestName".hashCode();
    expectedHashCode = expectedHashCode * 31 + 20;
    expectedHashCode = expectedHashCode * 31 + 1;
    assertEquals(expectedHashCode, attributeLayout.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_XTYc0() throws Exception {
    AttributeLayout attributeLayout = new AttributeLayout("TestName", 1, "TestLayout", 0);
    assertEquals("TestName", attributeLayout.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetContext_Mduy0() throws Exception {
    AttributeLayout attributeLayout = new AttributeLayout("testName", 5, "testLayout", 1);
    assertEquals(5, attributeLayout.getContext());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIndex_VCBA0() throws Exception {
    AttributeLayout attributeLayout = new AttributeLayout("testName", 1, "testLayout", 5);
    assertEquals(5, attributeLayout.getIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecWithBranch5_SgQC0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("test", 1, "O", 0);
    Codec result = attributeLayout.getCodec();
    assertEquals(Codec.BRANCH5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecWithBCI5_TCKv1() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("test", 1, "P", 0);
    Codec result = attributeLayout.getCodec();
    assertEquals(Codec.BCI5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecWithSigned5_GCay2() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("test", 1, "S", 0);
    Codec result = attributeLayout.getCodec();
    assertEquals(Codec.SIGNED5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecWithByte1_PWLH3() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("test", 1, "B", 0);
    Codec result = attributeLayout.getCodec();
    assertEquals(Codec.BYTE1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecWithUnsigned5Default_DceG4() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("test", 1, "X", 0);
    Codec result = attributeLayout.getCodec();
    assertEquals(Codec.UNSIGNED5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecWithSigned5Exclusion_wJup5() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("test", 1, "KS", 0);
    Codec result = attributeLayout.getCodec();
    assertEquals(Codec.UNSIGNED5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecWithSigned5Exclusion2_Ppyt6() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("test", 1, "RS", 0);
    Codec result = attributeLayout.getCodec();
    assertEquals(Codec.UNSIGNED5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_wSbH0() throws Pack200Exception {
        Segment segment = new Segment();
        CpBands bands = new CpBands(segment);
        SegmentConstantPool pool = new SegmentConstantPool(bands);
        AttributeLayout attributeLayout = new AttributeLayout("TestAttribute", 1, "TestLayout", 0);
        long testValue = 123L;
        ClassFileEntry expected = pool.getValue(0, testValue); // Assuming getValue method is correctly implemented in SegmentConstantPool
        ClassFileEntry result = attributeLayout.getValue(testValue, pool);
        assertEquals(expected, result);
    }
}