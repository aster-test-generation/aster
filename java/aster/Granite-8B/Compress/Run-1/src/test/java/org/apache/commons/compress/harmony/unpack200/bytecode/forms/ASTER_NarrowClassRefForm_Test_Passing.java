/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NarrowClassRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNestedMustStartClassPool_Tdzm0() {
        NarrowClassRefForm narrowClassRefForm = new NarrowClassRefForm(0, "name", new int[]{});
        boolean result = narrowClassRefForm.nestedMustStartClassPool();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNestedMustStartClassPoolWidened_thuc1() {
        NarrowClassRefForm narrowClassRefForm = new NarrowClassRefForm(0, "name", new int[]{}, true);
        boolean result = narrowClassRefForm.nestedMustStartClassPool();
        assertFalse(result);
    }
}