/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NarrowClassRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPoolWhenWidenedIsTrue_WkNE0() throws Exception {
    NarrowClassRefForm form = new NarrowClassRefForm(1, "TestClass", new int[]{1, 2, 3}, true);
    assertFalse(form.nestedMustStartClassPool());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPoolWhenWidenedIsFalse_eWwn1() throws Exception {
    NarrowClassRefForm form = new NarrowClassRefForm(1, "TestClass", new int[]{1, 2, 3}, false);
    assertTrue(form.nestedMustStartClassPool());
}
}