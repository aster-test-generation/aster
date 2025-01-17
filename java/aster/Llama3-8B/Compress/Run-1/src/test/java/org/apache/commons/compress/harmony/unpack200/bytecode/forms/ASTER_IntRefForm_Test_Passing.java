/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IntRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_zYns0() {
    IntRefForm intRefForm = new IntRefForm(1, "name", new int[]{1, 2, 3});
    int result = intRefForm.getPoolID();
    assert result == SegmentConstantPool.CP_INT;
}
}