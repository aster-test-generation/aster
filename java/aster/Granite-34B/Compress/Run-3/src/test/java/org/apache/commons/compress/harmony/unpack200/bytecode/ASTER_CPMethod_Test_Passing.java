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
public class Aster_CPMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_vfsV0() throws Exception {
    CPUTF8 utf8 = new CPUTF8("UTF-8");
    CPUTF8 name = new CPUTF8("testMethod");
    CPUTF8 descriptor = new CPUTF8("()V");
    long flags = 0L;
    List<Attribute> attributes = new ArrayList<>();
    CPMethod method = new CPMethod(name, descriptor, flags, attributes);
    String expected = "Method: testMethod()";
    String actual = method.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithFlags_UkCl2() throws Exception {
    CPUTF8 utf8 = new CPUTF8("UTF-8");
    CPUTF8 name = new CPUTF8("testMethod");
    CPUTF8 descriptor = new CPUTF8("()V");
    long flags = 1L;
    List<Attribute> attributes = new ArrayList<>();
    CPMethod method = new CPMethod(name, descriptor, flags, attributes);
    String expected = "Method: testMethod()";
    String actual = method.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithDescriptor_UWAB3() throws Exception {
    CPUTF8 utf8 = new CPUTF8("UTF-8");
    CPUTF8 name = new CPUTF8("testMethod");
    CPUTF8 descriptor = new CPUTF8("(I)V");
    long flags = 0L;
    List<Attribute> attributes = new ArrayList<>();
    CPMethod method = new CPMethod(name, descriptor, flags, attributes);
    String expected = "Method: testMethod(int)";
    String actual = method.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithParameters_JAWb4() throws Exception {
    CPUTF8 utf8 = new CPUTF8("UTF-8");
    CPUTF8 name = new CPUTF8("testMethod");
    CPUTF8 descriptor = new CPUTF8("(IZZ)V");
    long flags = 0L;
    List<Attribute> attributes = new ArrayList<>();
    CPMethod method = new CPMethod(name, descriptor, flags, attributes);
    String expected = "Method: testMethod(int, boolean, boolean)";
    String actual = method.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithArrayDescriptor_hjmh5() throws Exception {
    CPUTF8 utf8 = new CPUTF8("UTF-8");
    CPUTF8 name = new CPUTF8("testMethod");
    CPUTF8 descriptor = new CPUTF8("([I)V");
    long flags = 0L;
    List<Attribute> attributes = new ArrayList<>();
    CPMethod method = new CPMethod(name, descriptor, flags, attributes);
    String expected = "Method: testMethod(int[])";
    String actual = method.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithObjectDescriptor_YhiD6() throws Exception {
    CPUTF8 utf8 = new CPUTF8("UTF-8");
    CPUTF8 name = new CPUTF8("testMethod");
    CPUTF8 descriptor = new CPUTF8("(Lcom/example/Test;)V");
    long flags = 0L;
    List<Attribute> attributes = new ArrayList<>();
    CPMethod method = new CPMethod(name, descriptor, flags, attributes);
    String expected = "Method: testMethod(com.example.Test)";
    String actual = method.toString();
    assertEquals(expected, actual);
}
}