/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AttrDefinitionBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAttributeDefinitionMap_FrhV0() {
    AttrDefinitionBands attrDefinitionBands = new AttrDefinitionBands(new Segment());
    AttributeLayoutMap attributeDefinitionMap = attrDefinitionBands.getAttributeDefinitionMap();
    assertNotNull(attributeDefinitionMap);
}
}