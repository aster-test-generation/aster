/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_GnuParser_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten1_oyaj0() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"--foo", "bar", "--baz"};
        String[] expected = {"--foo", "bar", "--baz"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten2_BjPQ1() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"--foo=bar", "--baz"};
        String[] expected = {"--foo", "bar", "--baz"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten3_mpSL2() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"-Dfoo=bar", "--baz"};
        String[] expected = {"-Dfoo", "bar", "--baz"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten4_YJrv3() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"--", "--foo", "bar", "--baz"};
        String[] expected = {"--", "--foo", "bar", "--baz"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten5_oUKE4() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"-D", "foo=bar", "--baz"};
        String[] expected = {"-D", "foo=bar", "--baz"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten6_qEyw5() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"--foo", "bar", "-D", "foo=bar", "--baz"};
        String[] expected = {"--foo", "bar", "-D", "foo=bar", "--baz"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten7_fJwu6() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"--foo", "bar", "-D", "foo=bar", "--", "--baz"};
        String[] expected = {"--foo", "bar", "-D", "foo=bar", "--", "--baz"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten8_Diti7() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"--foo", "bar", "-D", "foo=bar", "--", "--baz", "qux"};
        String[] expected = {"--foo", "bar", "-D", "foo=bar", "--", "--baz", "qux"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten9_ryga8() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"--foo", "bar", "-D", "foo=bar", "--", "--baz", "qux", "quux"};
        String[] expected = {"--foo", "bar", "-D", "foo=bar", "--", "--baz", "qux", "quux"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten10_uxNx9() {
        GnuParser parser = new GnuParser();
        String[] arguments = {"--foo", "bar", "-D", "foo=bar", "--", "--baz", "qux", "quux", "corge"};
        String[] expected = {"--foo", "bar", "-D", "foo=bar", "--", "--baz", "qux", "quux", "corge"};
        String[] actual = parser.flatten(null, arguments, false);
        assertEquals(expected, actual);
    }
}