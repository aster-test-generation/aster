/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.IOException;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AttrDefinitionBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpack_AsxY0() throws Pack200Exception, IOException {
        Segment segment = new Segment();
        AttrDefinitionBands attrDefinitionBands = new AttrDefinitionBands(segment);
        attrDefinitionBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAttributeDefinitionMap_roIu0() throws Exception {
        Segment segment = new Segment();
        AttrDefinitionBands attrDefinitionBands = new AttrDefinitionBands(segment);
        AttributeLayoutMap attributeDefinitionMap = attrDefinitionBands.getAttributeDefinitionMap();
        assertNotNull(attributeDefinitionMap);
    }
}