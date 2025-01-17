/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_PdGt0() {
        CPUTF8 name = new CPUTF8("example");
        CPUTF8 descriptor = new CPUTF8("()V");
        long flags = 0x0001;
        List<Attribute> attributes = new ArrayList<>();
        CPMethod method = new CPMethod(name, descriptor, flags, attributes);
        String expected = "Method: example(())V";
        String actual = method.toString();
        assertEquals(expected, actual);
    }
}