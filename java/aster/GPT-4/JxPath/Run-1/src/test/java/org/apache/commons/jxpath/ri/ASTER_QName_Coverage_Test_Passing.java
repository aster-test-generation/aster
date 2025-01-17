/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QName_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ysfY0() {
        QName qName = new QName("example:local");
        assertEquals("example:local", qName.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_NURD0() {
        QName qName = new QName("prefix", "localName");
        int expectedHashCode = "prefix:localName".hashCode(); // Assuming name is constructed as "prefix:localName"
        assertEquals(expectedHashCode, qName.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_hvlW1() {
        QName qName = new QName("test:testName");
        Object differentObject = new Object();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_nZzr0_xlyr0() {
    QName qName = new QName("test:testName");
    assertEquals(true, qName.equals(qName), "Should return true when comparing the same object");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_WOUv2_PKTo0() {
    QName qName = new QName("test:testName");
    assertFalse(qName.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NonEqualObjects_gwtI4_eCOo0() {
    QName qName1 = new QName("test:testName1");
    QName qName2 = new QName("test:testName2");
    assertFalse(qName1.equals(qName2), "Should return false when comparing objects with different qualified names");
}
}