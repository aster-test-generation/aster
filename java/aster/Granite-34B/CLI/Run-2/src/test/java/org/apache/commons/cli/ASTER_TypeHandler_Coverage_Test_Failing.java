/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void createValueWithStringAndAbstractClass_iQZw2() throws ParseException {
        TypeHandler typeHandler = new TypeHandler();
        String string = "test";
        Object obj = Number.class;
        Object result = TypeHandler.createValue(string, (Class<?>) obj);
    }
}