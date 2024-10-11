/**
 * Generated by Aster
 */
package org.apache.commons.cli;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_OptionBuilder_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithTypeCasting_nyOJ0() {
        Class<?> expectedType = Integer.class;
        OptionBuilder result = OptionBuilder.withType(expectedType);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithLongOpt_SetsLongOption_DBoA0() {
        String expectedLongOpt = "testOption";
        OptionBuilder.withLongOpt(expectedLongOpt);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithLongOpt_ReturnsSameInstance_LAlA1() {
        OptionBuilder result = OptionBuilder.withLongOpt("anyOption");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredTrue_fJop0() {
        OptionBuilder result = OptionBuilder.isRequired(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredFalse_QpXH1() {
        OptionBuilder result = OptionBuilder.isRequired(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasArgFalse_Pvgn1_vGgP0_1() {
    OptionBuilder result = OptionBuilder.hasArg(false);
    assertEquals(false, OptionBuilder.isRequired());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasArgFalse_Pvgn1_vGgP0_2() {
    OptionBuilder result = OptionBuilder.hasArg(false);
    assertSame(OptionBuilder.hasArg(false), result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWithDescriptionReturnsSameInstance_maWa1_vWng0_1() {
    OptionBuilder instance1 = OptionBuilder.withDescription("Description one");
    OptionBuilder instance2 = OptionBuilder.withDescription("Description two");
    assertNotNull(instance1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWithDescriptionReturnsSameInstance_maWa1_vWng0_2() {
    OptionBuilder instance1 = OptionBuilder.withDescription("Description one");
    OptionBuilder instance2 = OptionBuilder.withDescription("Description two");
    assertNotNull(instance2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWithDescriptionReturnsSameInstance_maWa1_vWng0_3() {
    OptionBuilder instance1 = OptionBuilder.withDescription("Description one");
    OptionBuilder instance2 = OptionBuilder.withDescription("Description two");
    assertEquals(instance1, instance2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWithArgNameReturnsSameInstance_ezjO1_lmhU0() {
    OptionBuilder firstCallInstance = OptionBuilder.withArgName("firstCall");
    OptionBuilder secondCallInstance = OptionBuilder.withArgName("secondCall");
    assert firstCallInstance != null : "Instances returned by withArgName should not be null";
    assert secondCallInstance != null : "Instances returned by withArgName should not be null";
    assert firstCallInstance == secondCallInstance : "Both calls to withArgName should return the same instance of OptionBuilder";
}
}