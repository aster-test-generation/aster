/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QName_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_mcGA0() {
        QName qName = new QName("prefix", "localName");
        assertTrue(qName.equals(qName));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentObject_OedM1() {
        QName qName1 = new QName("prefix1", "localName1");
        QName qName2 = new QName("prefix2", "localName2");
        assertFalse(qName1.equals(qName2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_nmGG2() {
        QName qName = new QName("prefix", "localName");
        assertFalse(qName.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_uliz0() {
        QName qName = new QName("prefix", "localName");
        assertEquals("localName", qName.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_Acyq0() {
        QName qName = new QName("prefix", "localName");
        assertEquals("prefix", qName.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_yhLt0() {
        QName qName = new QName("prefix", "localName");
        String expected = "prefix:localName";
        String actual = qName.toString();
        assertEquals(expected, actual);
    }
}