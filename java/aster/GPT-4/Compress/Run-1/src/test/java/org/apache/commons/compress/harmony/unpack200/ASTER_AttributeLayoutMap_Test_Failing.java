/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AttributeLayoutMap_Test_Failing {
private AttributeLayoutMap attributeLayoutMap;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAttributeLayout_dCeO0_wDmr0() {
    try {
        AttributeLayoutMap attributeLayoutMap = new AttributeLayoutMap();
        int index = 1;
        int context = 0;
        AttributeLayout result = attributeLayoutMap.getAttributeLayout(index, context);
        assertNull(result, "Expected null when no layouts are defined for given context");
    } catch (Pack200Exception e) {
        fail("Exception should not be thrown");
    }
}
}