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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue2_PwvJ1() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", String.class);
        assertEquals(String.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue9_yoWk8() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        Object result = typeHandler.createValue("string", Character.class);
        assertEquals(Character.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_mqXB0() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        String className = "java.lang.String";
        Class<?> result = TypeHandler.createClass(className);
        assertEquals(String.class, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFile_NFFH0() {
        TypeHandler handler = new TypeHandler();
        File file = handler.createFile("test.txt");
        assertEquals("test.txt", file.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_RBWb0() throws Exception {
        TypeHandler typeHandler = new TypeHandler();
        String string = "example";
        Class<String> clazz = String.class;
        String result = TypeHandler.createValue(string, clazz);
        assertEquals("example", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValueWithConverter_KOqI1() throws Exception {
        TypeHandler typeHandler = new TypeHandler(new HashMap<Class<?>, Converter<?, ? extends Throwable>>());
        String string = "example";
        Class<String> clazz = String.class;
        String result = TypeHandler.createValue(string, clazz);
        assertEquals("example", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefault_UxWz0() {
        TypeHandler result = TypeHandler.getDefault();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverter_JlMp1() {
        TypeHandler handler = TypeHandler.getDefault();
        Converter<Object, ?> result = handler.getConverter(Object.class);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertNotNull(map);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_2() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Object.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_3() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Class.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_4() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Date.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_5() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(File.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_6() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Path.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_7() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Number.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_8() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(URL.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_9() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(FileInputStream.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_10() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Long.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_11() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Integer.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_12() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Short.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_13() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Byte.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_14() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Character.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_15() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Double.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_16() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(Float.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_17() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(BigInteger.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0_18() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertTrue(map.containsKey(BigDecimal.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_qBpz0_2() throws Exception {
        assertEquals(new Long(1), TypeHandler.createNumber("1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_qBpz0_3() throws Exception {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateURL_PpiQ0_1() throws ParseException {
        String string = "http://www.example.com";
        URL url = TypeHandler.createURL(string);
        assertNotNull(url);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateURL_PpiQ0_2() throws ParseException {
        String string = "http://www.example.com";
        URL url = TypeHandler.createURL(string);
        assertEquals("http", url.getProtocol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateURL_PpiQ0_3() throws ParseException {
        String string = "http://www.example.com";
        URL url = TypeHandler.createURL(string);
        assertEquals("www.example.com", url.getHost());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_LSVc0() throws Exception {
        String className = "java.lang.String";
        Object result = TypeHandler.createObject(className);
        assertEquals(String.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_Okmf9() throws Exception {
        String className = "java.util.Date";
        Object result = TypeHandler.createObject(className);
        assertEquals(java.util.Date.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDefaultMap_ywWe0() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertNotNull(map);
        assertTrue(map.containsKey(Object.class));
        assertTrue(map.containsKey(Class.class));
        assertTrue(map.containsKey(Date.class));
        assertTrue(map.containsKey(File.class));
        assertTrue(map.containsKey(Path.class));
        assertTrue(map.containsKey(Number.class));
        assertTrue(map.containsKey(URL.class));
        assertTrue(map.containsKey(FileInputStream.class));
        assertTrue(map.containsKey(Long.class));
        assertTrue(map.containsKey(Integer.class));
        assertTrue(map.containsKey(Short.class));
        assertTrue(map.containsKey(Byte.class));
        assertTrue(map.containsKey(Character.class));
        assertTrue(map.containsKey(Double.class));
        assertTrue(map.containsKey(Float.class));
        assertTrue(map.containsKey(BigInteger.class));
        assertTrue(map.containsKey(BigDecimal.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateURL_PpiQ0() throws ParseException {
        String string = "http://www.example.com";
        URL url = TypeHandler.createURL(string);
        assertNotNull(url);
        assertEquals("http", url.getProtocol());
        assertEquals("www.example.com", url.getHost());
    }
}