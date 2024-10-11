/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QName_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameObject_LKqF0() {
        QName qName1 = new QName("prefix", "localName");
        QName qName2 = qName1;
        boolean result = qName1.equals(qName2);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentObject_bkXs1() {
        QName qName1 = new QName("prefix", "localName");
        QName qName2 = new QName("prefix", "localName");
        boolean result = qName1.equals(qName2);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsNull_qyUT2() {
        QName qName = new QName("prefix", "localName");
        boolean result = qName.equals(null);
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_QualifiedName_HzGW0() {
        QName qName = new QName("qualifiedName");
        assertEquals("qualifiedName", qName.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_PrefixLocalName_cqAd1() {
        QName qName = new QName("prefix", "localName");
        assertEquals("localName", qName.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_QualifiedName_oLWh0() {
        QName qName = new QName("prefix", "localName");
        String prefix = qName.getPrefix();
        assertEquals("prefix", prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_Prefix_LocalName_lHUG1() {
        QName qName = new QName("qualifiedName");
        String prefix = qName.getPrefix();
        assertNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithQualifiedName_NTKI0() {
        QName qName = new QName("qualifiedName");
        String result = qName.toString();
        assert result.equals("qualifiedName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithPrefixAndLocalName_LUNo1() {
        QName qName = new QName("prefix", "localName");
        String result = qName.toString();
        assert result.equals("prefix:localName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_QualifiedName_afFu0_CFjY1() {
        QName qName = new QName("qualifiedName");
        int result = qName.hashCode();
        org.junit.Assert.assertEquals(result, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_Prefix_LocalName_lFxn1_tHeW0() {
        QName qName = new QName("prefix", "localName");
        int result = qName.hashCode();
        org.junit.Assert.assertEquals(result, result);
    }
}