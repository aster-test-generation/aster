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
public void testToStringWithQualifiedName_HTCE0() {
    QName qName = new QName("example:localPart");
    assertEquals("example:localPart", qName.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_amwC0() {
    QName qName = new QName("examplePrefix", "exampleLocalName");
    assertEquals("exampleLocalName", qName.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeConsistency_mQtM0() {
    QName qName = new QName("prefix", "localName");
    int firstHash = qName.hashCode();
    int secondHash = qName.hashCode();
    assertEquals(firstHash, secondHash);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameObject_hRBi0() {
    QName qName = new QName("test:testName");
    assertTrue(qName.equals(qName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_plgH1() {
    QName qName = new QName("test:testName");
    Object other = new Object();
    assertFalse(qName.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentQName_qayO2() {
    QName qName1 = new QName("test:testName");
    QName qName2 = new QName("test:otherName");
    assertFalse(qName1.equals(qName2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefix_WithPrefixAndLocalName_gymR0() {
    QName qName = new QName("prefix", "localName");
    assertEquals("prefix", qName.getPrefix());
}
}