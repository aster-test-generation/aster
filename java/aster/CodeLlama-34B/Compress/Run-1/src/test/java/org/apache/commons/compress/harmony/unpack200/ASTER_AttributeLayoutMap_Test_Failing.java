/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AttributeLayoutMap_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAttributeLayout_nullMap_sibo7() {
    AttributeLayoutMap map = null;
    AttributeLayout layout = map.getAttributeLayout("name", 0);
    assertNull(layout);
}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAttributeLayout_context2_TpDz2_mATq1() {
        try {
            AttributeLayoutMap map = new AttributeLayoutMap();
            AttributeLayout layout = map.getAttributeLayout("name", 2);
            assertNotNull(layout);
            assertEquals("name", layout.getName());
            assertEquals(2, layout.getContext());
        } catch (Pack200Exception e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAttributeLayout_context0_fwVn0_mFtH1() {
    try {
        AttributeLayoutMap map = new AttributeLayoutMap();
        AttributeLayout layout = map.getAttributeLayout("name", 0);
        assertNotNull(layout);
        assertEquals("name", layout.getName());
        assertEquals(0, layout.getContext());
    } catch (Pack200Exception e) {
        e.printStackTrace();
    }
}
}