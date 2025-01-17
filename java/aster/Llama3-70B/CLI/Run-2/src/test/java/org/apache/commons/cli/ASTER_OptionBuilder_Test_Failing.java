/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionBuilder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_instance_VyLJ5() {
        OptionBuilder optionBuilder1 = OptionBuilder.hasArg(true);
        OptionBuilder optionBuilder2 = OptionBuilder.hasArg(false);
        assertEquals(true, optionBuilder1.isRequired(true).equals(optionBuilder1));
        assertEquals(false, optionBuilder2.isRequired(false).equals(optionBuilder1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithType_WDhB0_fid1() {
        Object newType = new Object();
        OptionBuilder optionBuilder = OptionBuilder.withType(newType);
        assertNotNull(optionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_instance_VyLJ5_fid1() {
        OptionBuilder optionBuilder1 = OptionBuilder.hasArg(true);
        OptionBuilder optionBuilder2 = OptionBuilder.hasArg(false);
        assertNotSame(optionBuilder1, optionBuilder2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_alternatingCalls_GgoP9_YPNN0_1() {
        OptionBuilder optionBuilder = OptionBuilder.hasArg(true);
        optionBuilder = OptionBuilder.hasArg(false);
        optionBuilder = OptionBuilder.hasArg(true);
        assertEquals(true, optionBuilder.isRequired(false).isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_alternatingCalls_GgoP9_YPNN0_2() {
        OptionBuilder optionBuilder = OptionBuilder.hasArg(true);
        optionBuilder = OptionBuilder.hasArg(false);
        optionBuilder = OptionBuilder.hasArg(true);
        assertEquals(false, optionBuilder.isRequired(false).isRequired());
    }
}