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

public class Aster_GnuParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten1_QfJB0() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "value", "arg"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-a", "value", "arg"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten2_nwuB1() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", false, "description");
        String[] arguments = new String[]{"-a", "value", "arg"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-a", "value", "arg"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten3_Glcj2() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", true, "description");
        String[] arguments = new String[]{"-a", "value", "arg"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-a", "value", "arg"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten4_FBIP3() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", false, "description");
        String[] arguments = new String[]{"--", "arg"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"--", "arg"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten5_UGHh4() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", true, "description");
        String[] arguments = new String[]{"-a=value", "arg"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-a", "value", "arg"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten6_bBhm5() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", false, "description");
        String[] arguments = new String[]{"-", "arg"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-", "arg"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten7_bzKp6() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", true, "description");
        String[] arguments = new String[]{"-ab", "arg"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-a", "-b", "arg"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten8_VXQX7() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", false, "description");
        String[] arguments = new String[]{"arg", "-a"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"arg", "-a"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten9_MDFz8() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", true, "description");
        String[] arguments = new String[]{"arg", "-a=value"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"arg", "-a", "value"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten10_zLfh9() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", false, "description");
        String[] arguments = new String[]{"arg1", "arg2", "-a"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"arg1", "arg2", "-a"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten11_DNkD10() throws Exception {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("a", true, "description");
        String[] arguments = new String[]{"arg1", "arg2", "-a=value"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"arg1", "arg2", "-a", "value"}, result);
    }
}