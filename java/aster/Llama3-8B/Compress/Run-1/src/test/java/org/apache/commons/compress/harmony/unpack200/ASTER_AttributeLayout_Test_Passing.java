/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AttributeLayout_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue8_WwJJ7_jLIW0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 2);
    Segment segment = new Segment();
    CpBands cpBands = new CpBands(segment);
    SegmentConstantPool pool = new SegmentConstantPool(cpBands);
    try {
        attributeLayout.getValue(10L, pool);
        fail("Expected Pack200Exception");
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesTrue_hRTb0_cWEU0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, true);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown, but it should not be");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLayout_vjHJ0_vRde0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1);
        assertEquals("layout", attributeLayout.getLayout());
    } catch (Pack200Exception e) {
        fail("Unexpected Pack200Exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLayoutDefault_Cluc1_watN1() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, true);
    assertEquals("layout", attributeLayout.getLayout());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDefaultLayoutDefault1_IlIO1_ORVI0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1);
        boolean result = attributeLayout.isDefaultLayout();
        assert (result);
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringDefault_AXUl1_HxnB0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 0);
    } catch (Pack200Exception e) {
        fail("Unexpected Pack200Exception: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_NameNotNull_ContextNotNull_LayoutNotNull_IndexNotNull_YocE1_ncmI0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1);
        int result = attributeLayout.hashCode();
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_eFMl0_kYcT1() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("testName", 1, "testLayout", 1);
    assertEquals("testName", attributeLayout.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNameWithDefault_jInM1_mnmp0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("testName", 1, "testLayout", 1);
        assertEquals("testName", attributeLayout.getName());
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown unexpectedly");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCodec1_nXHU0_FCnj0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "O", 1);
        Codec codec = attributeLayout.getCodec();
        assertEquals(Codec.BRANCH5, codec);
    } catch (Pack200Exception e) {
        fail("Unexpected Pack200Exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCodec7_PZiI6_mJhV0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "SRS", 1);
        Codec codec = attributeLayout.getCodec();
        assertEquals(Codec.UNSIGNED5, codec);
    } catch (Pack200Exception e) {
        fail("Unexpected exception: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetContextDefault_YgVe1_THqZ0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 2);
        assertEquals(1, attributeLayout.getContext());
    } catch (Pack200Exception e) {
        fail("Unexpected Pack200Exception: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIndex_cRaa0_WSjn0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 2);
        int result = attributeLayout.getIndex();
        assertEquals(2, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown unexpectedly");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIndexWithDefault_nBWu1_Tmxk0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 2);
        int result = attributeLayout.getIndex();
        assertEquals(2, result);
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
}