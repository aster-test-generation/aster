/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.file.Path;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValueWithNullString_JstU0() {
        try {
            Object result = TypeHandler.createValue(null, String.class);
            assertNull(result);
        } catch (ParseException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValueWithEmptyString_UCuz1() {
        try {
            Object result = TypeHandler.createValue("", String.class);
            assertEquals("", result);
        } catch (ParseException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValueWithValidString_VKEl2() {
        try {
            Object result = TypeHandler.createValue("hello", String.class);
            assertEquals("hello", result);
        } catch (ParseException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValueWithNullClass_LyuE4() {
        try {
            Object result = TypeHandler.createValue("hello", null);
            assertNotNull(result);
        } catch (ParseException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValueWithValidClass_mDXR6() {
        try {
            Object result = TypeHandler.createValue("123", Integer.class);
            assertEquals(123, result);
        } catch (ParseException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithValidClassName_ieLa0() throws ParseException {
        String className = "java.lang.String";
        Class<?> expectedClass = String.class;
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithInvalidClassName_hZOl1() throws ParseException {
        String className = "invalid.class.name";
        try {
            TypeHandler.createClass(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithEmptyClassName_GVfv3() throws ParseException {
        String className = "";
        try {
            TypeHandler.createClass(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("java.lang.ClassNotFoundException: ", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_yMdX0() throws ParseException {
        String string = "123";
        Class<Integer> clazz = Integer.class;
        Integer expected = 123;
        Integer actual = TypeHandler.createValue(string, clazz);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_NullStringAndClass_Lzeq5() throws ParseException {
        String string = null;
        Class<Integer> clazz = null;
        Integer expected = null;
        Integer actual = TypeHandler.createValue(string, clazz);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_NegativeNumber_RCbN8() throws ParseException {
        String string = "-123";
        Class<Integer> clazz = Integer.class;
        Integer expected = -123;
        Integer actual = TypeHandler.createValue(string, clazz);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_DecimalNumber_OlId9() throws ParseException {
        String string = "123.456";
        Class<Double> clazz = Double.class;
        Double expected = 123.456;
        Double actual = TypeHandler.createValue(string, clazz);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefault_fvqz0() {
        TypeHandler defaultHandler = TypeHandler.getDefault();
        assertNotNull(defaultHandler);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertNotNull(map);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_2() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertEquals(17, map.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_3() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Object.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_4() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Class.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_5() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Date.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_6() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(File.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_7() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Path.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_8() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Number.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_9() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(URL.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_10() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(FileInputStream.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_11() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Long.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_12() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Integer.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_13() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Short.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_14() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Byte.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_15() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Character.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_16() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Double.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_17() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Float.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_18() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(BigInteger.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_kuVv0_19() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(BigDecimal.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverterWithValidClass_FChx0() {
        TypeHandler typeHandler = new TypeHandler();
        Converter<String, ?> converter = typeHandler.getConverter(String.class);
        assertNotNull(converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverterWithDefaultConverter_Xdbx2() {
        TypeHandler typeHandler = new TypeHandler();
        Converter<String, ?> converter = typeHandler.getConverter(String.class);
        assertEquals(Converter.DEFAULT, converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverterWithCustomConverter_QFmG3() {
        TypeHandler typeHandler = new TypeHandler();
        Converter<String, ?> converter = typeHandler.getConverter(String.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverterWithNullClass_cEoP4() {
        TypeHandler typeHandler = new TypeHandler();
        Converter<String, ?> converter = typeHandler.getConverter(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverterWithConverterMapContainingDifferentType_hwxf8() {
        TypeHandler typeHandler = new TypeHandler();
        Converter<Integer, ?> converter = typeHandler.getConverter(Integer.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_InvalidFilePath_ekwO1() {
        String filePath = "path/to/invalid_file.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_EmptyFilePath_NlSW3() {
        try {
            TypeHandler.openFile("");
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertEquals("java.io.FileNotFoundException:  (No such file or directory)", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileDoesNotExist_DTwS4() {
        String filePath = "path/to/non_existent_file.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertEquals("java.io.FileNotFoundException: " + filePath + " (No such file or directory)", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsDirectory_PqsC5() {
        String filePath = "path/to/directory";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotReadable_JRAR6() {
        String filePath = "path/to/unreadable_file.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertEquals("java.io.FileNotFoundException: " + filePath + " (No such file or directory)", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotWritable_FIDY7() {
        String filePath = "path/to/unwritable_file.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotExecutable_HhJH8() {
        String filePath = "path/to/unexecutable_file.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertEquals("java.io.FileNotFoundException: " + filePath + " (No such file or directory)", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotAFile_jtbG9() {
        String filePath = "path/to/non_file.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertEquals("java.io.FileNotFoundException: path/to/non_file.txt (No such file or directory)", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFiles_ValidStringArrayWithDuplicates_YaeK11() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateURLWithInvalidString_AzmQ1() {
        String invalidUrl = "invalid_url";
        try {
            TypeHandler.createURL(invalidUrl);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertEquals("java.net.MalformedURLException: no protocol: invalid_url", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithValidClassName_FCVP0_1() throws ParseException {
        String className = "java.lang.String";
        Object obj = TypeHandler.createObject(className);
        assertNotNull(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithValidClassName_FCVP0_2() throws ParseException {
        String className = "java.lang.String";
        Object obj = TypeHandler.createObject(className);
        assertTrue(obj instanceof String);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithInvalidClassName_TYOf1() throws ParseException {
        String className = "invalid.class.name";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithEmptyClassName_dkEB3() throws ParseException {
        String className = "";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("java.lang.ClassNotFoundException: ", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithNonExistentClass_FMNs5() throws ParseException {
        String className = "com.example.NonExistentClass";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("java.lang.ClassNotFoundException: com.example.NonExistentClass", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithInterface_PeLA6() throws ParseException {
        String className = "java.lang.Runnable";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("java.lang.NoSuchMethodException: java.lang.Runnable.<init>()", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithAbstractClass_YVzb7() throws ParseException {
        String className = "java.lang.AbstractList";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("java.lang.ClassNotFoundException: java.lang.AbstractList", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithArrayClass_TPwu8() throws ParseException {
        String className = "java.lang.String[]";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("java.lang.ClassNotFoundException: java/lang/String[]", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithPrimitiveClass_yQIg9() throws ParseException {
        String className = "int";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("java.lang.ClassNotFoundException: int", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_InvalidClass_hThm4_WKcN0() throws ParseException {
        String string = "123";
        Class<String> clazz = String.class;
        String expected = null;
        Object actual = TypeHandler.createValue(string, clazz);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverterWithInvalidClass_Tgze1_oMvk0() {
        TypeHandler typeHandler = new TypeHandler();
        Converter<?, ?> converter = typeHandler.getConverter(Integer.class);
        assertNotNull(converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithValidClassName_FCVP0() throws ParseException {
        String className = "java.lang.String";
        Object obj = TypeHandler.createObject(className);
        assertNotNull(obj);
        assertTrue(obj instanceof String);
    }
}