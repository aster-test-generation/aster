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
public class Aster_FieldRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPoolID_nJYB0() throws Exception {
        FieldRefForm fieldRefForm = new FieldRefForm(1, "name", new int[]{1, 2, 3});
        int poolID = fieldRefForm.getPoolID();
        assertEquals(SegmentConstantPool.CP_FIELD, poolID);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPoolID_opcode_2_mjEd2() throws Exception {
        FieldRefForm fieldRefForm = new FieldRefForm(2, "name", new int[]{1, 2, 3});
        int poolID = fieldRefForm.getPoolID();
        assertEquals(SegmentConstantPool.CP_FIELD, poolID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPoolID_rewrite_empty_UoKV3() throws Exception {
        FieldRefForm fieldRefForm = new FieldRefForm(1, "name", new int[0]);
        int poolID = fieldRefForm.getPoolID();
        assertEquals(SegmentConstantPool.CP_FIELD, poolID);
}
}