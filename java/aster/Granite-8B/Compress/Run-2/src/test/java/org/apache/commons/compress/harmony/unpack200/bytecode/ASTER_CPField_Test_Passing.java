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
public class Aster_CPField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Cxhr0() {
        CPUTF8 utf8 = new CPUTF8("example");
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        List<Attribute> attributes = new ArrayList<>();
        CPField field = new CPField(name, descriptor, 0, attributes);
        assertEquals("Field: name(descriptor)", field.toString());
    }
}