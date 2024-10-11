/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_vOCw0() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", Object.class);
        assertEquals(Object.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue3_CLbY2() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", Integer.class);
        assertEquals(Integer.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue4_EkUz3() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", Double.class);
        assertEquals(Double.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue5_roHM4() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", Float.class);
        assertEquals(Float.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue6_EJrm5() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", Long.class);
        assertEquals(Long.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue7_QSAI6() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", Short.class);
        assertEquals(Short.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue8_pxXM7() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", Byte.class);
        assertEquals(Byte.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue10_Yyfx9() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", Boolean.class);
        assertEquals(Boolean.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_SOzP0() throws Exception {
        final String string = "test";
        final FileInputStream expected = new FileInputStream(string);
        final FileInputStream actual = TypeHandler.openFile(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_rMCB1() throws Exception {
        final String string = "test.txt";
        final FileInputStream expected = new FileInputStream(string);
        final FileInputStream actual = TypeHandler.openFile(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_KeJm2() throws Exception {
        final String string = null;
        final FileInputStream expected = null;
        final FileInputStream actual = TypeHandler.openFile(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_TUjL3() throws Exception {
        final String string = "test";
        final FileInputStream expected = null;
        final FileInputStream actual = TypeHandler.openFile(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_UOKA7() throws Exception {
        final String string = "";
        final FileInputStream expected = new FileInputStream(string);
        final FileInputStream actual = TypeHandler.openFile(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_KjmH10() throws Exception {
        final String string = "";
        final FileInputStream expected = null;
        final FileInputStream actual = TypeHandler.openFile(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_qBpz0_1() throws Exception {
        assertEquals(new Integer(1), TypeHandler.createNumber("1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_KeJm2_fid1() throws Exception {
        final String string = null;
        final FileInputStream expected = new FileInputStream(string);
        final FileInputStream actual = TypeHandler.openFile(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_qBpz0_3_fid1() throws Exception {
        assertEquals(new Float(1), TypeHandler.createNumber("1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_qBpz0_4() throws Exception {
        assertEquals(new Double(1), TypeHandler.createNumber("1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_qBpz0_5() throws Exception {
        assertEquals(new Byte((byte) 1), TypeHandler.createNumber("1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_qBpz0_6() throws Exception {
        assertEquals(new Short((short) 1), TypeHandler.createNumber("1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDate_xTQl0() {
        TypeHandler typeHandler = new TypeHandler();
        String string = "2022-01-01";
        Date date = typeHandler.createDate(string);
        assertEquals("2022-01-01", date.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_abBB0() {
        TypeHandler typeHandler = new TypeHandler();
        String input = "example";
        File[] result = TypeHandler.createFiles(input);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateURLWithInvalidString_RtWd1() {
        String string = "invalid string";
        try {
            TypeHandler.createURL(string);
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Error parsing URL"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateURLWithNullString_cEBD2() {
        String string = null;
        try {
            TypeHandler.createURL(string);
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("String is null"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_vMne1() throws Exception {
        String className = "java.lang.Integer";
        Object result = TypeHandler.createObject(className);
        assertEquals(Integer.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_PjAO2() throws Exception {
        String className = "java.lang.Boolean";
        Object result = TypeHandler.createObject(className);
        assertEquals(Boolean.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_QLUY3() throws Exception {
        String className = "java.lang.Long";
        Object result = TypeHandler.createObject(className);
        assertEquals(Long.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_bJpg4() throws Exception {
        String className = "java.lang.Float";
        Object result = TypeHandler.createObject(className);
        assertEquals(Float.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_dCKQ5() throws Exception {
        String className = "java.lang.Double";
        Object result = TypeHandler.createObject(className);
        assertEquals(Double.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_BFNX6() throws Exception {
        String className = "java.lang.Character";
        Object result = TypeHandler.createObject(className);
        assertEquals(Character.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_wgsP7() throws Exception {
        String className = "java.lang.Byte";
        Object result = TypeHandler.createObject(className);
        assertEquals(Byte.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_cZSY8() throws Exception {
        String className = "java.lang.Short";
        Object result = TypeHandler.createObject(className);
        assertEquals(Short.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_qBpz0() throws Exception {
        assertEquals(new Integer(1), TypeHandler.createNumber("1"));
        assertEquals(new Long(1), TypeHandler.createNumber("1"));
        assertEquals(new Float(1), TypeHandler.createNumber("1"));
        assertEquals(new Double(1), TypeHandler.createNumber("1"));
        assertEquals(new Byte((byte) 1), TypeHandler.createNumber("1"));
        assertEquals(new Short((short) 1), TypeHandler.createNumber("1"));
    }
}