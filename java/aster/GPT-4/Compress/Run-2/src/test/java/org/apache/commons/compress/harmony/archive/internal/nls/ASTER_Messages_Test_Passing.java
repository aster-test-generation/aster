/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.archive.internal.nls;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Messages_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStringWithSingleArgument_pGOo0() throws Exception {
    String expected = "Hello, John";
    String actual = Messages.getString("Hello, {0}", "John");
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatSimpleReplacement_lCqj0() throws Exception {
        String result = Messages.format("Hello {0}", new Object[]{"World"});
        assertEquals("Hello World", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatMultipleReplacements_BEqg1() throws Exception {
        String result = Messages.format("{0} is {1} years old", new Object[]{"Alice", 30});
        assertEquals("Alice is 30 years old", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithNullArgument_bXJx2() throws Exception {
        String result = Messages.format("Hello {0}", new Object[]{null});
        assertEquals("Hello <null>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithMissingArgument_BUWq3() throws Exception {
        String result = Messages.format("Hello {0}, {1}", new Object[]{"Alice"});
        assertEquals("Hello Alice, <missing argument>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithEscapedBraces_dwVU4() throws Exception {
        String result = Messages.format("Curly braces \\{0\\} are not placeholders", new Object[]{"test"});
        assertEquals("Curly braces {0} are not placeholders", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithOutOfBoundsIndex_GvTU6() throws Exception {
        String result = Messages.format("Only {0} provided, but {1} requested", new Object[]{"one"});
        assertEquals("Only one provided, but <missing argument> requested", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithNoPlaceholders_fscy7() throws Exception {
        String result = Messages.format("No placeholders here", new Object[]{"test"});
        assertEquals("No placeholders here", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithComplexString_QyuQ8() throws Exception {
        String result = Messages.format("Item {0}: {1} costs {2} dollars", new Object[]{1, "Apple", 0.75});
        assertEquals("Item 1: Apple costs 0.75 dollars", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStringWithIntegerArgument_nRqK0() throws Exception {
    String expected = "Expected output for specific input";
    String actual = Messages.getString("key_for_specific_input", 123);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStringWithTwoArguments_lDUg0() throws Exception {
    String expected = "Hello, John Doe!";
    String actual = Messages.getString("Hello, {0} {1}!", "John", "Doe");
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStringWithCharArgument_hYPi0() throws Exception {
    String expected = "Hello, A";
    String actual = Messages.getString("Hello, {0}", 'A');
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_NullArgs_PISC0() throws Exception {
        String msg = "Hello";
        Object[] args = null;
        String result = Messages.getString(msg, args);
        assertEquals("Hello", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_WithArgs_ytZM1() throws Exception {
        String msg = "Hello, {0}";
        Object[] args = new Object[]{"World"};
        String result = Messages.getString(msg, args);
        assertEquals("Hello, World", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLocaleWithValidResource_KPja0() throws Exception {
    Locale testLocale = new Locale("en", "US");
    String testResource = "messages";
    ResourceBundle result = Messages.setLocale(testLocale, testResource);
    assertNotNull(result);
}
}