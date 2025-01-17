/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AttributeLayout_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCodecForLayoutWithoutOorPorSorB_YmPV4_bqpv0() throws Pack200Exception {
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layoutWithoutOorPorSorB", 1);
    Codec codec = attributeLayout.getCodec();
    assertEquals(Codec.UNSIGNED5, codec);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithNullName_HUig1_nYeJ0() {
    AttributeLayout attributeLayout = null;
    try {
        attributeLayout = new AttributeLayout(null, 1, "layout", 1);
    } catch (Pack200Exception e) {
        e.printStackTrace();
    }
    assertEquals(17, attributeLayout.hashCode());
}
}