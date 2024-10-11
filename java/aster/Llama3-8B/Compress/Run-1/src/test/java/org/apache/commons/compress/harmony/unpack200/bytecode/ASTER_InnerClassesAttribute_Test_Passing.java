/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InnerClassesAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_rorh0() {
    InnerClassesAttribute obj1 = new InnerClassesAttribute("test");
    assertEquals(true, obj1.equals(obj1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_lmhu1() {
    InnerClassesAttribute obj1 = new InnerClassesAttribute("test");
    Object obj2 = new Object();
    assertEquals(false, obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_WKCp2() {
    InnerClassesAttribute obj1 = new InnerClassesAttribute("test");
    assertEquals(false, obj1.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameAttributeName_PIVf4() {
    InnerClassesAttribute obj1 = new InnerClassesAttribute("test");
    InnerClassesAttribute obj2 = new InnerClassesAttribute("test");
    assertEquals(true, obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameAttributeNameNull_fizg6() {
    InnerClassesAttribute obj1 = new InnerClassesAttribute(null);
    InnerClassesAttribute obj2 = new InnerClassesAttribute(null);
    assertEquals(true, obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoWrite_txye0() throws IOException {
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute("name");
        DataOutputStream dataOutputStream = new DataOutputStream(new java.io.ByteArrayOutputStream());
        innerClassesAttribute.doWrite(dataOutputStream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentAttributeName_muAx3_fid1() {
    InnerClassesAttribute obj1 = new InnerClassesAttribute("test1");
    InnerClassesAttribute obj2 = new InnerClassesAttribute("test2");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentAttributeNameNull_XEAr5_fid1() {
    InnerClassesAttribute obj1 = new InnerClassesAttribute("test");
    InnerClassesAttribute obj2 = new InnerClassesAttribute(null);
    assertEquals(true, obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Jjsx0_fid1() {
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute("test");
        assertEquals("InnerClasses: null", innerClassesAttribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeAttributeNameNull_HIth0_fid1() {
    InnerClassesAttribute attribute = new InnerClassesAttribute(null);
    int result = attribute.hashCode();
}
}