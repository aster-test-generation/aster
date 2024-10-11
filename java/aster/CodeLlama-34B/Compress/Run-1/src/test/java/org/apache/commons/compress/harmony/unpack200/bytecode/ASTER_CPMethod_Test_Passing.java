/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_noAttributes_qPTM0_tcFb0() {
    CPUTF8 name = new CPUTF8("testMethod", 0);
    CPUTF8 descriptor = new CPUTF8("()V", 0);
    long flags = 0;
    List<Attribute> attributes = new ArrayList<>();
    CPMethod method = new CPMethod(name, descriptor, flags, attributes);
    int expectedHashCode = Objects.hash(name, descriptor, flags, attributes);
    int actualHashCode = method.hashCode();
}
}