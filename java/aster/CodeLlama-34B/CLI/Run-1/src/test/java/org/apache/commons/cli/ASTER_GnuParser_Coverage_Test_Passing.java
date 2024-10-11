/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_GnuParser_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_dash_IdyL0() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"-"};
        String[] expected = new String[]{"-"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_equalPos_aGzH1() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("foo", "bar");
        String[] arguments = new String[]{"--foo=bar"};
        String[] expected = new String[]{"--foo", "bar"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_substring_pbii2() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("D", "property", true, "property");
        String[] arguments = new String[]{"-Dproperty=value"};
        String[] expected = new String[]{"-D", "property=value"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_stopAtNonOption_UCkn3() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("foo", "bar");
        String[] arguments = new String[]{"--foo", "bar", "--", "baz"};
        String[] expected = new String[]{"--foo", "bar", "--", "baz"};
        String[] actual = parser.flatten(options, arguments, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_noOptions_mEdy4() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"foo", "bar"};
        String[] expected = new String[]{"foo", "bar"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_noArguments_czEC5() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{};
        String[] expected = new String[]{};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_nullOptions_Ivax7() {
        GnuParser parser = new GnuParser();
        Options options = null;
        String[] arguments = new String[]{"foo", "bar"};
        String[] expected = new String[]{"foo", "bar"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }
}