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
public class Aster_IMethodRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_vLQY0() {
        IMethodRefForm iMethodRefForm = new IMethodRefForm(0, "name", new int[]{});
        int actual = iMethodRefForm.getPoolID();
        int expected = SegmentConstantPool.CP_IMETHOD;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_lineCoverage_YWVc1() {
        IMethodRefForm iMethodRefForm = new IMethodRefForm(0, "name", new int[]{});
        iMethodRefForm.getPoolID();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_branchCoverage_case1_LVNj2() {
        IMethodRefForm iMethodRefForm = new IMethodRefForm(0, "name", new int[]{});
        int actual = iMethodRefForm.getPoolID();
        assert actual == SegmentConstantPool.CP_IMETHOD;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPoolIDTest_branchCoverage_case2_gcuX3() {
        IMethodRefForm iMethodRefForm = new IMethodRefForm(0, "name", new int[]{});
        int actual = iMethodRefForm.getPoolID();
        assert actual != SegmentConstantPool.CP_IMETHOD;
    }
}