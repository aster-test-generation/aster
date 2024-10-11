/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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

public class Aster_TypeHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_RaCv0() throws ParseException {
        String string = "123";
        Number expected = 123;
        Number actual = TypeHandler.createNumber(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_ioyZ0_1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertEquals(16, map.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_ioyZ0() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertEquals(16, map.size());
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
}