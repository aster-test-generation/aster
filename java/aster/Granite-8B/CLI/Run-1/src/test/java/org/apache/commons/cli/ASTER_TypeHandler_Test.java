/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Test {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateValueWithException_okkI1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "example";
        Object obj = Integer.class;
        Throwable exception = assertThrows(ParseException.class, () -> typeHandler.createValue(string, obj));
        assertEquals("java.lang.Integer", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateClassWithInvalidClassName_AUIa1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        TypeHandler typeHandler = new TypeHandler(converterMap);
        assertThrows(ParseException.class, () -> typeHandler.createClass("invalidClassName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFile_MhSx0() {
        File file = TypeHandler.createFile("test");
        assertEquals(new File("test"), file);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_1_dOyh0() {
        TypeHandler typeHandler = new TypeHandler();
        Class<String> clazz = String.class;
        Converter<String, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_2_wMqn1() {
        TypeHandler typeHandler = new TypeHandler();
        Class<Integer> clazz = Integer.class;
        Converter<Integer, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_3_wjOO2() {
        TypeHandler typeHandler = new TypeHandler();
        Class<Double> clazz = Double.class;
        Converter<Double, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_4_kuxe3() {
        TypeHandler typeHandler = new TypeHandler();
        Class<Float> clazz = Float.class;
        Converter<Float, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_5_SiDW4() {
        TypeHandler typeHandler = new TypeHandler();
        Class<Long> clazz = Long.class;
        Converter<Long, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_6_WQIF5() {
        TypeHandler typeHandler = new TypeHandler();
        Class<Short> clazz = Short.class;
        Converter<Short, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_7_zfZd6() {
        TypeHandler typeHandler = new TypeHandler();
        Class<Byte> clazz = Byte.class;
        Converter<Byte, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_8_qOcH7() {
        TypeHandler typeHandler = new TypeHandler();
        Class<Character> clazz = Character.class;
        Converter<Character, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_9_cXtY8() {
        TypeHandler typeHandler = new TypeHandler();
        Class<Boolean> clazz = Boolean.class;
        Converter<Boolean, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_10_PBEy9() {
        TypeHandler typeHandler = new TypeHandler();
        Class<Object> clazz = Object.class;
        Converter<Object, ?> result = typeHandler.getConverter(clazz);
        assertNotNull(result);
        assertTrue(result instanceof Converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateNumberWithException_Hnil1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        TypeHandler typeHandler = new TypeHandler(converterMap);
        Throwable exception = assertThrows(ParseException.class, () -> typeHandler.createNumber("abc"));
        assertEquals("For input string: \"abc\"", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDate_NgHC0() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        Date date = typeHandler.createDate("2022-01-01");
        assertEquals(1640995200000L, date.getTime());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateDateWithInvalidDate_GnDv1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> typeHandler.createDate("invalid-date"));
        assertEquals("java.text.ParseException: Unparseable date: \"invalid-date\"", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles_KqcU0() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles(null);
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles2_RZwX1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles4_VUwC3() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("a");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles5_LnkK4() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("ab");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles6_NYqb5() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abc");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles7_yGcj6() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcd");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles8_MRrQ7() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcde");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles9_LBkv8() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcdef");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles10_OLcJ9() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcdefg");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles11_LgDG10() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcdefgh");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles12_sKpX11() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcdefghi");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles13_UawR12() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcdefghij");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles14_rwCp13() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcdefghijk");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles15_BVXK14() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcdefghijkl");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles16_rOUP15() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcdefghijklm");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateFiles17_kEtE16() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        File[] result = TypeHandler.createFiles("abcdefghijklmn");
        assertTrue(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateURL_PlUU0() throws Exception {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "https://www.example.com";
        URL expected = new URL("https://www.example.com");
        URL actual = typeHandler.createURL(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateObjectWithException_CFOJ1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = null;
        TypeHandler typeHandler = new TypeHandler(converterMap);
        Throwable exception = assertThrows(ParseException.class, () -> typeHandler.createObject("InvalidClassName"));
        assertEquals("java.lang.ClassNotFoundException: InvalidClassName", exception.getMessage());
    }
}