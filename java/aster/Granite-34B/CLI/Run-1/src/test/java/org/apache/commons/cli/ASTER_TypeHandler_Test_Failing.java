/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_FWif0() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Object.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue3_HYjs2() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Integer.class);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue4_yVUL3() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Float.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue5_vtzC4() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Double.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue6_ijzE5() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Long.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue7_qZxe6() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Short.class);
        assertEquals(Short.valueOf("0"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue8_Xzut7() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Byte.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithNullConverterMap_JkoM3() throws Exception {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String className = "java.lang.String";
        Class<?> expected = String.class;
        Class<?> actual = TypeHandler.createClass(className);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithEmptyClassName_NsYe4() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        String className = "";
        Class<?> expected = null;
        Class<?> actual = TypeHandler.createClass(className);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithNullClassName_FfcS5() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        String className = null;
        Class<?> expected = null;
        Class<?> actual = TypeHandler.createClass(className);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithInvalidClassName_DLmp6() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        String className = "invalid.class.name";
        Class<?> expected = null;
        Class<?> actual = TypeHandler.createClass(className);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_mXVy2() throws Exception {
        Number result = TypeHandler.createNumber("abc");
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_svdx3() throws Exception {
        Number result = TypeHandler.createNumber(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDate_anFf0() {
        TypeHandler typeHandler = new TypeHandler();
        String string = "2022-01-01";
        Date expected = new Date(2022, 0, 1);
        Date actual = typeHandler.createDate(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_ZXLb0() {
        TypeHandler typeHandler = new TypeHandler();
        String string = "example";
        File[] files = TypeHandler.createFiles(string);
        assertEquals(0, files.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_yWsK1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = TypeHandler.createFiles(string);
        assertEquals(0, files.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_andFiles_vTej2() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = new File[1];
        files = TypeHandler.createFiles(string);
        assertEquals(0, files.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_andFiles_andLength_dVPy3() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = new File[1];
        int length = 1;
        files = TypeHandler.createFiles(string);
        assertEquals(length, files.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_andFiles_andLength_andIndex_cqJG4_1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = new File[1];
        int length = 1;
        int index = 0;
        files = TypeHandler.createFiles(string);
        assertEquals(length, files.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_andFiles_andLength_andIndex_cqJG4_2() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = new File[1];
        int length = 1;
        int index = 0;
        files = TypeHandler.createFiles(string);
        assertEquals(index, files[index].length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_andFiles_andLength_andIndex_andName_gARQ5_1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = new File[1];
        int length = 1;
        int index = 0;
        String name = "example.txt";
        files = TypeHandler.createFiles(string);
        assertEquals(length, files.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_andFiles_andLength_andIndex_andName_gARQ5_2() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = new File[1];
        int length = 1;
        int index = 0;
        String name = "example.txt";
        files = TypeHandler.createFiles(string);
        assertEquals(index, files[index].length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_andFiles_andLength_andIndex_andName_gARQ5_3() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = new File[1];
        int length = 1;
        int index = 0;
        String name = "example.txt";
        files = TypeHandler.createFiles(string);
        assertEquals(name, files[index].getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_mzpI0_zQgS0() {
        try {
            File file = new File("test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            assertEquals(fileInputStream, TypeHandler.openFile("test.txt"));
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue3_HYjs2_fid1() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Integer.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue7_qZxe6_fid1() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Short.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue9_cbHl8_fid1() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Character.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue10_OWtF9_fid1() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = TypeHandler.createValue("string", Boolean.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_RpGN0_fid1() throws ParseException {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createObject("className");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectCoverage_hpzD1_fid1() throws ParseException {
        TypeHandler typeHandler = new TypeHandler();
        typeHandler.createObject("className");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_andFiles_andLength_andIndex_cqJG4() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = new File[1];
        int length = 1;
        int index = 0;
        files = TypeHandler.createFiles(string);
        assertEquals(length, files.length);
        assertEquals(index, files[index].length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_withConverterMap_andFiles_andLength_andIndex_andName_gARQ5() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        File[] files = new File[1];
        int length = 1;
        int index = 0;
        String name = "example.txt";
        files = TypeHandler.createFiles(string);
        assertEquals(length, files.length);
        assertEquals(index, files[index].length());
        assertEquals(name, files[index].getName());
    }
}