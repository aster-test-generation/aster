/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NarrowClassRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPoolTrue_gorh0() {
    NarrowClassRefForm narrowClassRefForm = new NarrowClassRefForm(1, "name", new int[]{1});
    boolean result = narrowClassRefForm.nestedMustStartClassPool();
    assert (result == true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPoolFalse_eZlY1() {
    NarrowClassRefForm narrowClassRefForm = new NarrowClassRefForm(1, "name", new int[]{1}, true);
    boolean result = narrowClassRefForm.nestedMustStartClassPool();
    assert (result == false);
}
}