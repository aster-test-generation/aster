/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LongForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPoolID_Bdky0() throws Exception {
        LongForm longForm = new LongForm(1, "name", new int[]{1, 2, 3});
        assertEquals(SegmentConstantPool.CP_LONG, longForm.getPoolID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPoolIDWithZeroOpcode_HiIG1() throws Exception {
        LongForm longForm = new LongForm(0, "name", new int[]{1, 2, 3});
        assertEquals(SegmentConstantPool.CP_LONG, longForm.getPoolID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPoolIDWithNegativeOpcode_FYYg2() throws Exception {
        LongForm longForm = new LongForm(-1, "name", new int[]{1, 2, 3});
        assertEquals(SegmentConstantPool.CP_LONG, longForm.getPoolID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPoolIDWithEmptyRewriteArray_Spra3() throws Exception {
        LongForm longForm = new LongForm(1, "name", new int[0]);
        assertEquals(SegmentConstantPool.CP_LONG, longForm.getPoolID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPoolIDWithNullName_MiIt4() throws Exception {
        LongForm longForm = new LongForm(1, null, new int[]{1, 2, 3});
        assertEquals(SegmentConstantPool.CP_LONG, longForm.getPoolID());
    }
}