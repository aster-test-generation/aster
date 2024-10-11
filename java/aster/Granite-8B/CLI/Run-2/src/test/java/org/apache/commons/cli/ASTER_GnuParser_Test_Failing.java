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

public class Aster_GnuParser_Test_Failing {
    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten3_tBOr2_2() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo", "bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, true);
        assertEquals(1, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten4_jkbO3_3() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar=bar", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals("--foo=bar", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten4_jkbO3_5() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals("baz", result[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten6_eQhn5_3() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar=bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals("--foo=bar", result[0]);
    }

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten7_JCYw6_2() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, true);
        assertEquals(1, result.length);
    }

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten9_QcSo8_2() {
        Options options = new Options();
        String[] arguments = new String[]{"-f", "bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, true);
        assertEquals(1, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten2_QzAU1_2_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo", "bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals(3, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten2_QzAU1_5_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo", "bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals("baz", result[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten3_tBOr2_3_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo", "bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, true);
        assertEquals("baz", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten4_jkbO3_2() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals(3, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten4_jkbO3_3_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals("--foo", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten4_jkbO3_4_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals("bar", result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten6_eQhn5_3_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals("--foo", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten6_eQhn5_4_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals("bar", result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten7_JCYw6_3_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"--foo=bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, true);
        assertEquals("baz", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten8_HQve7_2_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"-f", "bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals(3, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten8_HQve7_5_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"-f", "bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, false);
        assertEquals("baz", result[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten9_QcSo8_3_fid1() {
        Options options = new Options();
        String[] arguments = new String[]{"-f", "bar", "--", "baz"};
        String[] result = new GnuParser().flatten(options, arguments, true);
        assertEquals("baz", result[0]);
    }
}