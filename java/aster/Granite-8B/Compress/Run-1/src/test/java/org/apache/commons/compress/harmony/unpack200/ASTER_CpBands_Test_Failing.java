/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpBands_Test_Failing {
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_Affn3_GFjR0() {
        CpBands cpBands = new CpBands(new Segment());
        SegmentConstantPool constantPool = cpBands.getConstantPool();
        ClassFileEntry entry = null;
        try {
            entry = constantPool.getValue(0, 0);
        } catch (Pack200Exception e) {
            e.printStackTrace();
        }
        assertNotNull(entry);
    }
}