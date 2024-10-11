/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QName_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_HnWF0() {
    QName qName1 = new QName("example:local");
    assertTrue(qName1.equals(qName1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObjectsSameValue_MJHn1() {
    QName qName1 = new QName("example:local");
    QName qName2 = new QName("example:local");
    assertTrue(qName1.equals(qName2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObjectsDifferentValue_vMma2() {
    QName qName1 = new QName("example:local");
    QName qName2 = new QName("different:local");
    assertFalse(qName1.equals(qName2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNameWithQualifiedNameConstructor_UJsZ0() {
    QName qName = new QName("qualifiedName");
    assertEquals("qualifiedName", qName.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithPrefixAndLocalName_FUHx0() {
    QName qName = new QName("prefix", "localName");
    assertEquals("prefix", qName.getPrefix());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithQualifiedName_YfOJ0() {
    QName qName = new QName("example:local");
    assertEquals("example:local", qName.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeConsistency_ORfG0() {
    QName qName = new QName("prefix", "localName");
    int firstHash = qName.hashCode();
    int secondHash = qName.hashCode();
    assertEquals(firstHash, secondHash);
}
}