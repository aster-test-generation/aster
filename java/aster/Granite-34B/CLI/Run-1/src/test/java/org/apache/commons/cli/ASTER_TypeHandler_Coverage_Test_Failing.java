/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_sJVT0_sKKe0() throws Exception {
        Map<Class<?>, Converter<?, ? extends Throwable>> converterMap = new HashMap<>();
        TypeHandler typeHandler = new TypeHandler(converterMap);
        String string = "someString";
        Object obj = new Object();
        Object result = TypeHandler.createValue(string, obj);
        assertEquals(obj, result);
    }
}