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
public class Aster_CPMethod_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyName_EjcG1_QcdU0_fid3() {
        CPUTF8 name = new CPUTF8("", 0);
        CPUTF8 descriptor = new CPUTF8("testDescriptor", 0);
        long flags = 0;
        List<Attribute> attributes = new ArrayList<>();
        CPMethod cpMethod = new CPMethod(name, descriptor, flags, attributes);
        String expected = "Method: ()";
        String actual = cpMethod.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_QSIr0_YZho0_fid3() {
        CPUTF8 name = new CPUTF8("testName", 0);
        CPUTF8 descriptor = new CPUTF8("testDescriptor", 0);
        long flags = 0;
        List<Attribute> attributes = new ArrayList<>();
        CPMethod cpMethod = new CPMethod(name, descriptor, flags, attributes);
        String expected = "Method: testName(testDescriptor)";
        String actual = cpMethod.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyDescriptor_eoME2_oRiz0_fid3() {
        CPUTF8 name = new CPUTF8("testName", 0);
        CPUTF8 descriptor = new CPUTF8("", 0);
        long flags = 0;
        List<Attribute> attributes = new ArrayList<>();
        CPMethod cpMethod = new CPMethod(name, descriptor, flags, attributes);
        String expected = "Method: testName()";
        String actual = cpMethod.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyNameAndDescriptor_AMYq3_vWkc0_fid3() {
        CPUTF8 name = new CPUTF8("", 0);
        CPUTF8 descriptor = new CPUTF8("", 0);
        long flags = 0;
        List<Attribute> attributes = new ArrayList<>();
        CPMethod cpMethod = new CPMethod(name, descriptor, flags, attributes);
        String expected = "Method: ()";
        String actual = cpMethod.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithFlags_QtBI4_TMNa0_fid3() {
        CPUTF8 name = new CPUTF8("testName", 0);
        CPUTF8 descriptor = new CPUTF8("testDescriptor", 0);
        long flags = 1;
        List<Attribute> attributes = new ArrayList<>();
        CPMethod cpMethod = new CPMethod(name, descriptor, flags, attributes);
        String expected = "Method: testName(testDescriptor)";
        String actual = cpMethod.toString();
        assertEquals(expected, actual);
    }
}