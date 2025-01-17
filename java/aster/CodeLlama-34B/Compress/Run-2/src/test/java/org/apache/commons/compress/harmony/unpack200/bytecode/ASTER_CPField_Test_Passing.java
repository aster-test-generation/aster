/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_nqMd0() {
    CPUTF8 name = new CPUTF8("name");
    CPUTF8 descriptor = new CPUTF8("descriptor");
    long flags = 0;
    List<Attribute> attributes = new ArrayList<>();
    CPField field = new CPField(name, descriptor, flags, attributes);
    String actual = field.toString();
    String expected = "Field: name(descriptor)";
    assertEquals(expected, actual);
}
}