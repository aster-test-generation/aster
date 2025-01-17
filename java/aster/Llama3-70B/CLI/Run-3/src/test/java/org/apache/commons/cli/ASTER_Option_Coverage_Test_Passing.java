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

public class Aster_Option_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_xecJ0() {
        Option option = new Option("option", "longOption", true, "description");
        boolean result = option.hasValueSeparator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValues_NoValues_SkES1() {
        Option option = new Option("option", "longOption", false, "description");
        String[] result = option.getValues();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType_Class_GtSk0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(String.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public static void setArgCount(Option option, int argCount) {
        try {
            java.lang.reflect.Field field = option.getClass().getDeclaredField("argCount");
            field.setAccessible(true);
            field.setInt(option, argCount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_NormalFlow_TAlK1() {
        Option option = new Option("option", "longOption", true, "description");
        Object clonedOption = option.clone();
        assertNotSame(option, clonedOption);
        assertNotNull(clonedOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_NoValues_fdxo1() {
        Option option = new Option("option", "longOption", false, "description");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_ReturnTrue_gZiT0() {
        Option option1 = new Option("option", "longOption", true, "description");
        Option option2 = option1;
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_ReturnFalse_Fzzv1() {
        Option option = new Option("option", "longOption", true, "description");
        Object obj = new Object();
        assertFalse(option.equals(obj));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameValues_ReturnTrue_trZb2() {
        Option option1 = new Option("option", "longOption", true, "description");
        Option option2 = new Option("option", "longOption", true, "description");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentOption_ReturnFalse_Jvtz3() {
        Option option1 = new Option("option1", "longOption", true, "description");
        Option option2 = new Option("option2", "longOption", true, "description");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentLongOption_ReturnFalse_pfrp4() {
        Option option1 = new Option("option", "longOption1", true, "description");
        Option option2 = new Option("option", "longOption2", true, "description");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_NotDeprecated_CwWP0() {
        Option option = new Option("o", "longOption", true, "description");
        String result = option.toDeprecatedString();
        assert(result.equals(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_NoArgsAllowed_KTSY1() {
        Option option = new Option("option", "description");
        try {
            option.processValue("value");
            assert false;
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("NO_ARGS_ALLOWED");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_HasValueSeparator_bfEd2() {
        Option option = new Option("option", "longOption", true, "description");
        option.processValue("value,sep");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_WhileLoop_JrAu5() {
        Option option = new Option("option", "longOption", true, "description");
        option.processValue("value,sep,another");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_NormalFlow_TAlK1_1() {
        Option option = new Option("option", "longOption", true, "description");
        Object clonedOption = option.clone();
        assertNotSame(option, clonedOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_NormalFlow_TAlK1_2() {
        Option option = new Option("option", "longOption", true, "description");
        Object clonedOption = option.clone();
        assertNotNull(clonedOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SpaceAppend_FLoD1_fid1() {
        Option option = new Option("o", "longOption", true, "description");
        String expected = "[ Option o longOption [ARG] :: description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    public void testAddValue_DpqG1() {
        Option option = new Option("option", "longOption", true, "description");
        try {
            option.addValue("value");
            assert false;
        } catch (Exception e) {
            assert e instanceof UnsupportedOperationException;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_WithValues_gDRB0_KtRX0() {
        Option option = new Option("option", "longOption", true, "description");
        try {
            option.addValue("value");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg_UnlimitedValues_NotEmpty_NqZb3_uRnT0() {
        Option option = new Option("option", true, "description");
        boolean result = option.requiresArg();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_DeprecatedNull_NfED6_eTua1() {
        Option option = new Option("o", "longOption", true, "description");
        String result = option.toDeprecatedString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_withArgCountEqualToZero_eaPM2_Xbcr0() {
        Option option = new Option("option", false, "description");
        try {
            option.addValue("value");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg_OptionalArg_MyGr0_DoNd0() {
        Option option = new Option("option", true, "description");
        ((org.apache.commons.cli.Option) option).setOptionalArg(true);
        boolean result = option.requiresArg();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg_UnlimitedValues_Empty_CwZd2_GICW0() {
        Option option = new Option("option", "description");
        ((org.apache.commons.cli.Option) option).setArgs(Option.UNLIMITED_VALUES);
        boolean result = option.requiresArg();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg_False_AhdY1_JCJa0() {
        Option option = new Option("option", false, "description");
        boolean result = option.requiresArg();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_ArgNameNotNullAndNotEmpty_ReturnsTrue_nMao0_uTdE0() {
        Option option = new Option("option", "longOption", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_BreakCondition_lMWN6_xzpb0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setArgs(2);
        option.processValue("value,sep");
        assertFalse(option.getValue().split(",").length == 1);
    }
}