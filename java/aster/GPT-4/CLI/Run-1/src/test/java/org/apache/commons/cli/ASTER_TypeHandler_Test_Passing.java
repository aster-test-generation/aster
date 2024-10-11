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
    public void testCreateValueWithValidClass_VBdq0() throws ParseException {
        String inputString = "example";
        Class<?> inputClass = String.class;
        Object result = TypeHandler.createValue(inputString, inputClass);
        assertEquals("example", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithValidClassName_dplj0_1() throws ParseException {
        Class<?> result = TypeHandler.createClass("java.lang.String");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithValidClassName_dplj0_2() throws ParseException {
        Class<?> result = TypeHandler.createClass("java.lang.String");
        assertEquals(String.class, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFileWithValidPath_FSHt0_1() {
        String validPath = "valid/path/to/file.txt";
        File result = TypeHandler.createFile(validPath);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFileWithValidPath_FSHt0_2() {
        String validPath = "valid/path/to/file.txt";
        File result = TypeHandler.createFile(validPath);
        assertEquals("file.txt", result.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValueWithValidInput_iODE0() throws ParseException {
        String input = "123";
        Class<Integer> clazz = Integer.class;
        Integer expected = 123;
        Integer result = TypeHandler.createValue(input, clazz);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNotNull_NsrL0() {
        TypeHandler result = TypeHandler.getDefault();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_2() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Object.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_3() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Class.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_4() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Date.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_5() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(File.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_6() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Path.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_7() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Number.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_8() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(URL.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_9() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(FileInputStream.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_10() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Long.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_11() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Integer.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_12() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Short.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_13() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Byte.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_14() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Character.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_15() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Double.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_16() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(Float.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_17() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(BigInteger.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_18() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertTrue(defaultMap.containsKey(BigDecimal.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_19() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertEquals(Converter.OBJECT, defaultMap.get(Object.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_20() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertEquals(Converter.CLASS, defaultMap.get(Class.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_21() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertEquals(Converter.DATE, defaultMap.get(Date.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_22() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertEquals(Converter.FILE, defaultMap.get(File.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_23() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertEquals(Converter.PATH, defaultMap.get(Path.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_24() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertEquals(Converter.NUMBER, defaultMap.get(Number.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_25() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertEquals(Converter.URL, defaultMap.get(URL.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_26() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(FileInputStream.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_27() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(Long.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_28() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(Integer.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_29() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(Short.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_30() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(Byte.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_31() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(Character.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_32() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(Double.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_33() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(Float.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_34() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(BigInteger.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0_35() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap.get(BigDecimal.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverterWithDefault_FFEV0() {
        TypeHandler handler = new TypeHandler();
        Converter<String, ?> result = handler.getConverter(String.class);
        assertEquals(Converter.DEFAULT, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_ValidClassName() throws ParseException {
        String validClassName = "java.lang.Object";
        Object result = TypeHandler.createObject(validClassName);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumberWithValidNumberString_iUYF0_1() throws ParseException {
        String validNumberString = "123";
        Number result = TypeHandler.createNumber(validNumberString);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumberWithValidNumberString_iUYF0_2() throws ParseException {
        String validNumberString = "123";
        Number result = TypeHandler.createNumber(validNumberString);
        assertEquals(123, result.intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithValidClassName_hJrD0_1() throws ParseException {
        Object result = TypeHandler.createObject("java.lang.Object");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithValidClassName_hJrD0_2() throws ParseException {
        Object result = TypeHandler.createObject("java.lang.Object");
        assertTrue(result instanceof Object);
    }

    @Test
    public void testCreateFilesThrowsException_UoEP0_SUAm0() {
        assertThrows(UnsupportedOperationException.class, () -> TypeHandler.createFiles("test"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClassWithValidClassName_dplj0() throws ParseException {
        Class<?> result = TypeHandler.createClass("java.lang.String");
        assertNotNull(result);
        assertEquals(String.class, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFileWithValidPath_FSHt0() {
        String validPath = "valid/path/to/file.txt";
        File result = TypeHandler.createFile(validPath);
        assertNotNull(result);
        assertEquals("file.txt", result.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_KzII0() {
        Map<Class<?>, Converter<?, ? extends Throwable>> defaultMap = TypeHandler.createDefaultMap();
        assertNotNull(defaultMap);
        assertTrue(defaultMap.containsKey(Object.class));
        assertTrue(defaultMap.containsKey(Class.class));
        assertTrue(defaultMap.containsKey(Date.class));
        assertTrue(defaultMap.containsKey(File.class));
        assertTrue(defaultMap.containsKey(Path.class));
        assertTrue(defaultMap.containsKey(Number.class));
        assertTrue(defaultMap.containsKey(URL.class));
        assertTrue(defaultMap.containsKey(FileInputStream.class));
        assertTrue(defaultMap.containsKey(Long.class));
        assertTrue(defaultMap.containsKey(Integer.class));
        assertTrue(defaultMap.containsKey(Short.class));
        assertTrue(defaultMap.containsKey(Byte.class));
        assertTrue(defaultMap.containsKey(Character.class));
        assertTrue(defaultMap.containsKey(Double.class));
        assertTrue(defaultMap.containsKey(Float.class));
        assertTrue(defaultMap.containsKey(BigInteger.class));
        assertTrue(defaultMap.containsKey(BigDecimal.class));
        assertEquals(Converter.OBJECT, defaultMap.get(Object.class));
        assertEquals(Converter.CLASS, defaultMap.get(Class.class));
        assertEquals(Converter.DATE, defaultMap.get(Date.class));
        assertEquals(Converter.FILE, defaultMap.get(File.class));
        assertEquals(Converter.PATH, defaultMap.get(Path.class));
        assertEquals(Converter.NUMBER, defaultMap.get(Number.class));
        assertEquals(Converter.URL, defaultMap.get(URL.class));
        assertNotNull(defaultMap.get(FileInputStream.class));
        assertNotNull(defaultMap.get(Long.class));
        assertNotNull(defaultMap.get(Integer.class));
        assertNotNull(defaultMap.get(Short.class));
        assertNotNull(defaultMap.get(Byte.class));
        assertNotNull(defaultMap.get(Character.class));
        assertNotNull(defaultMap.get(Double.class));
        assertNotNull(defaultMap.get(Float.class));
        assertNotNull(defaultMap.get(BigInteger.class));
        assertNotNull(defaultMap.get(BigDecimal.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumberWithValidNumberString_iUYF0() throws ParseException {
        String validNumberString = "123";
        Number result = TypeHandler.createNumber(validNumberString);
        assertNotNull(result);
        assertEquals(123, result.intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithValidClassName_hJrD0() throws ParseException {
        Object result = TypeHandler.createObject("java.lang.Object");
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }
}