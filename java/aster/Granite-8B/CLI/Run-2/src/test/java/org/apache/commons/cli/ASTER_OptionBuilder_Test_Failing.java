/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionBuilder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChar_hyCe0_2() {
        Option option = OptionBuilder.create('a');
        assertEquals('a', option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_pmLD0() {
        Option option = OptionBuilder.create();
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateString_dKRJ1_2() {
        Option option = OptionBuilder.create("abc");
        assertEquals("abc", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithLongOpt_Eyzp1_2() {
        Option option = OptionBuilder.create("longOpt");
        assertEquals("longOpt", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChar_hyCe0() {
        Option option = OptionBuilder.create('a');
        assertNotNull(option);
        assertEquals('a', option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateString_dKRJ1() {
        Option option = OptionBuilder.create("abc");
        assertNotNull(option);
        assertEquals("abc", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithLongOpt_Eyzp1() {
        Option option = OptionBuilder.create("longOpt");
        assertNotNull(option);
        assertEquals("longOpt", option.getLongOpt());
    }
}