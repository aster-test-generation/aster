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

public class Aster_OptionBuilder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testWithValueSeparator_zlUG0() throws Exception {
        OptionBuilder.withValueSeparator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_1() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals("opt", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_2() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(null, option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_3() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(null, option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_4() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(null, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_5() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(String.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_6() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(false, option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_7() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_8() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(false, option.hasOptionalArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_9() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(false, option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_10() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(false, option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_11() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(false, option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_12() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(false, option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_ndCA0_13() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertEquals(false, option.hasArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_miom0() throws Exception {
        Option option = OptionBuilder.create();
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithLongOpt_IVTX1_1() throws Exception {
        Option option = OptionBuilder.create("longOpt");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithLongOpt_IVTX1_2() throws Exception {
        Option option = OptionBuilder.create("longOpt");
        assertEquals("longOpt", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithOpt_pYhG2_1() throws Exception {
        Option option = OptionBuilder.create('o');
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithOpt_pYhG2_2() throws Exception {
        Option option = OptionBuilder.create('o');
        assertEquals('o', option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithOpt_HXKG0_1() throws Exception {
        Option option = OptionBuilder.create('a');
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithOpt_HXKG0_2() throws Exception {
        Option option = OptionBuilder.create('a');
        assertEquals('a', option.getOpt().charAt(0));
    }
}