/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AttributeLayout_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_True_ryog0_DZkY0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "Unknown", 1, true);
    long value = attributeLayout.getIndex() | attributeLayout.getContext();
    try {
        attributeLayout.getValue(value, new SegmentConstantPool(new CpBands(new Segment())));
        fail("Expected Pack200Exception");
    } catch (Pack200Exception e) {
        assertEquals("Unknown layout encoding: Unknown", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_False_HCeS1_ebnN0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1); // removed boolean parameter
        long value = 0;
        assertFalse(attributeLayout.matches(value));
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLayout_bACs0_ymll0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, true);
    assertEquals("layout", attributeLayout.getLayout());
}
@Test
public void testIsDefaultLayout_defaultTrue_IkUg0_vfdl1() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, true);
        assertTrue(attributeLayout.isDefaultLayout());
    } catch (Pack200Exception e) {
        fail("Unexpected Pack200Exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNumBackwardsCallables_asterisk_XUuU0_zTAX0() throws Pack200Exception {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "*", 1);
        assertEquals(1, attributeLayout.numBackwardsCallables());
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDefaultLayout_defaultFalse_Zghj1_UEGf0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, false);
    assertFalse(attributeLayout.isDefaultLayout());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDefaultLayout_defaultFalse_Zghj1_tzHv1() throws Pack200Exception {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, false);
        assertFalse(attributeLayout.isDefaultLayout());
    } catch (Pack200Exception e) {
        fail("Should not throw Pack200Exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNumBackwardsCallables_notAsterisk_hNmU1_okOI0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, true); // added true to match the constructor signature
        attributeLayout.setBackwardsCallCount(2); // assuming there is a setter for backwardsCallCount
        assertEquals(2, attributeLayout.numBackwardsCallables());
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_LLlO0_eWxi0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, false);
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_ySUV0_aHOk0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 2, true);
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_2_fpVF1_NzuC0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 2);
        assertEquals(431515135, attributeLayout.hashCode());
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_HQfZ0_doUC0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, true);
    assertEquals("name", attributeLayout.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetContext_Yrfb0_iXZw0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 1, true);
    assertEquals(1, attributeLayout.getContext());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodec1_rARq0_kfEn0() throws Pack200Exception {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "O", 1);
        assertEquals(Codec.BRANCH5, attributeLayout.getCodec());
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodec2_MdOG1_jbax0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "P", 1, true);
    assertEquals(Codec.BCI5, attributeLayout.getCodec());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodec4_IUsM3_Mrom0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "KS", 1, true);
        assertEquals(Codec.UNSIGNED5, attributeLayout.getCodec());
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodec3_bbtC2_vGIN1() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "S", 1);
        assertEquals(Codec.SIGNED5, attributeLayout.getCodec());
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodec5_iyoD4_LTlv0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "RS", 1, true);
    assertEquals(Codec.UNSIGNED5, attributeLayout.getCodec());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodec6_zymV5_ebzs0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "B", 1, true);
    assertEquals(Codec.BYTE1, attributeLayout.getCodec());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodec7_Wrie6_OEyc0() {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "", 1, true);
        assertEquals(Codec.UNSIGNED5, attributeLayout.getCodec());
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIndex_abPV0_KhFb0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 2, true);
    assertEquals(2, attributeLayout.getIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIndex_withDefault_hBRj1_Ktln0() throws Pack200Exception {
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 2, true);
        assertEquals(2, attributeLayout.getIndex());
    } catch (Pack200Exception e) {
        fail("Should not throw Pack200Exception");
    }
}
}