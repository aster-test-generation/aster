/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AttrDefinitionBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAttributeDefinitionMap_wAYN1_BFhT0() {
    AttrDefinitionBands attrDefinitionBands = new AttrDefinitionBands(new Segment());
    AttributeLayoutMap attributeLayoutMap = attrDefinitionBands.getAttributeDefinitionMap();
    assertNotNull(attributeLayoutMap);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadAttributeDefinitionCount_NpPi1_BHay0() throws IOException, Pack200Exception {
    AttrDefinitionBands attrDefinitionBands = new AttrDefinitionBands(new Segment());
    InputStream in = new java.io.ByteArrayInputStream(new byte[0]);
    attrDefinitionBands.read(in);
    assertEquals(0, attrDefinitionBands.header.getAttributeDefinitionCount());
}
}