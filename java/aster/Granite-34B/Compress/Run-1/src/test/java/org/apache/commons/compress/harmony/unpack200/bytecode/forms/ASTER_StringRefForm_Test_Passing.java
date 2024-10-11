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
public class Aster_StringRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_PQpB0() {
        StringRefForm stringRefForm = new StringRefForm(0, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_widened_InNi1() {
        StringRefForm stringRefForm = new StringRefForm(0, "name", new int[0], true);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_opcode1_ejAX2() {
        StringRefForm stringRefForm = new StringRefForm(1, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_opcode2_LVzh3() {
        StringRefForm stringRefForm = new StringRefForm(2, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_opcode3_rGcN4() {
        StringRefForm stringRefForm = new StringRefForm(3, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_opcode4_qyXz5() {
        StringRefForm stringRefForm = new StringRefForm(4, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_opcode5_qIXi6() {
        StringRefForm stringRefForm = new StringRefForm(5, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_opcode6_EBYK7() {
        StringRefForm stringRefForm = new StringRefForm(6, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_opcode7_fPNy8() {
        StringRefForm stringRefForm = new StringRefForm(7, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_opcode8_svHy9() {
        StringRefForm stringRefForm = new StringRefForm(8, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_opcode9_jVkW10() {
        StringRefForm stringRefForm = new StringRefForm(9, "name", new int[0]);
        int poolID = stringRefForm.getPoolID();
        assert poolID == SegmentConstantPool.CP_STRING;
    }
}