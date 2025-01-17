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
public class Aster_ClassRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPoolID_AImT0() throws Exception {
        ClassRefForm classRefForm = new ClassRefForm(0, "name", new int[]{});
        int result = classRefForm.getPoolID();
        assertEquals(SegmentConstantPool.CP_CLASS, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPoolIDWithWidened_jepe1() throws Exception {
        ClassRefForm classRefForm = new ClassRefForm(0, "name", new int[]{}, true);
        int result = classRefForm.getPoolID();
        assertEquals(SegmentConstantPool.CP_CLASS, result);
    }
}