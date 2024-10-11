/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import java.io.IOException;
import org.objectweb.asm.Attribute;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AttributeDefinitionBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPack_gTYM0_CrRG0() throws IOException, Pack200Exception {
    org.apache.commons.compress.harmony.pack200.Segment segment = new org.apache.commons.compress.harmony.pack200.Segment();
    AttributeDefinitionBands attributeDefinitionBands = new AttributeDefinitionBands(segment, 1, new Attribute[0]);
    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
    attributeDefinitionBands.pack(out);
    assertNotEquals(0, out.toByteArray().length);
}
}