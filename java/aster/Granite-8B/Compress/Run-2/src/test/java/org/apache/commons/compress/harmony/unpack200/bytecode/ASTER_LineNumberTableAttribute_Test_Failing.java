/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LineNumberTableAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_wBoT0() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
        ClassConstantPool pool = new ClassConstantPool();
        attribute.resolve(pool);
    }
}