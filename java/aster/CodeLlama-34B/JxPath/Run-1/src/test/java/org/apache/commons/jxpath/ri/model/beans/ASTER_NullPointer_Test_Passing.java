/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPointer_Test_Passing {
    private String id;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_tRlv0() {
        NullPointer nullPointer = new NullPointer(Locale.ENGLISH, "id");
        assertTrue(nullPointer.equals(nullPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullName_uHiy3() {
        NullPointer nullPointer = new NullPointer(Locale.ENGLISH, "id");
        assertFalse(nullPointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentType_uGmc4() {
        NullPointer nullPointer = new NullPointer(Locale.ENGLISH, "id");
        assertFalse(nullPointer.equals("string"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_KqDD0() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        assertFalse(nullPointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode1_KFTq0() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        int actual = nullPointer.hashCode();
        assertEquals(0, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode2_OLEX1() {
        QName name = new QName("prefix", "localName");
        NullPointer nullPointer = new NullPointer(name, new Locale("en", "US"));
        int actual = nullPointer.hashCode();
        assertEquals(name.hashCode(), actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName1_MwAI0() {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        QName name = nullPointer.getName();
        assertEquals(new QName("en", "id"), name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer1_oNlj0_1() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer1_oNlj0_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertTrue(propertyPointer instanceof NullPropertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer2_oasY1_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(propertyPointer.getBean(), nullPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer3_coJT2_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(propertyPointer.getPropertyName(), "id");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer4_wJhK3_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(propertyPointer.getImmediateValuePointer(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer5_gMGR4_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(propertyPointer.getImmediateNode(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer6_PuBY5_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(propertyPointer.hashCode(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer7_QCjc6_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(propertyPointer.getPropertyIndex(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer8_WmSW7_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(propertyPointer.getName(), new QName("id"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer9_zSlu8_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(propertyPointer.getLength(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer10_ApxM9_2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(propertyPointer.getPropertyNames(), new String[]{"id"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithId_kcxZ0() {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        String path = nullPointer.asPath();
        assertEquals("id(id)", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithoutParent_wTRh2() {
        NullPointer nullPointer = new NullPointer(new QName("name"), new Locale("en"));
        String path = nullPointer.asPath();
        assertEquals("null()", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_AhxV0() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        int length = nullPointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithNameAndLocale_QNyn2() {
        QName name = new QName("prefix", "localName");
        Locale locale = new Locale("en", "US");
        NullPointer nullPointer = new NullPointer(name, locale);
        int length = nullPointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue1_DlBW0() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        Object baseValue = nullPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue3_zLTu2() {
        QName name = new QName("name");
        VariablePointer variablePointer = new VariablePointer(name);
        NullPointer nullPointer = new NullPointer(variablePointer, name);
        Object baseValue = nullPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue4_emIu3() {
        QName name = new QName("name");
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(variables, name);
        NullPointer nullPointer = new NullPointer(variablePointer, name);
        Object baseValue = nullPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue6_rgWT5() {
        QName name = new QName("name");
        NullPointer nullPointer = new NullPointer(name, new Locale("en", "US"));
        Object baseValue = nullPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_True_Xzer0() {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        assertTrue(nullPointer.isActual());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_False_IBdw1() {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        assertFalse(nullPointer.isActual());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_WYon0() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        assertTrue(nullPointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithInvalidInput_wpqV1() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        assertFalse(nullPointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameNameDifferentLocale_bfSg5_cMGx0() {
        QName name = new QName("prefix", "localName");
        NullPointer nullPointer1 = new NullPointer(name, Locale.ENGLISH);
        NullPointer nullPointer2 = new NullPointer(name, Locale.FRENCH);
        assertFalse(nullPointer1.equals(nullPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue7_QXLL6_nFvJ0() {
        QName name = new QName("name");
        NullPointer nullPointer = new NullPointer(name, Locale.ENGLISH);
        Object baseValue = nullPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer1_oNlj0() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertTrue(propertyPointer instanceof NullPropertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer2_oasY1() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertEquals(propertyPointer.getBean(), nullPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer3_coJT2() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertEquals(propertyPointer.getPropertyName(), "id");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer4_wJhK3() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertEquals(propertyPointer.getImmediateValuePointer(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer5_gMGR4() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertEquals(propertyPointer.getImmediateNode(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer6_PuBY5() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertEquals(propertyPointer.hashCode(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer7_QCjc6() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertEquals(propertyPointer.getPropertyIndex(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer8_WmSW7() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertEquals(propertyPointer.getName(), new QName("id"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer9_zSlu8() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertEquals(propertyPointer.getLength(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer10_ApxM9() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertEquals(propertyPointer.getPropertyNames(), new String[]{"id"});
    }
}