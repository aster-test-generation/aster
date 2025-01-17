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

public class Aster_BasicParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_YFlv0() {
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "arg2", "arg3"};
        boolean stopAtNonOption = true;
        BasicParser parser = new BasicParser();
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(arguments, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_withLongOption_Ienv1() {
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt", "arg1", "arg2", "arg3"};
        boolean stopAtNonOption = true;
        BasicParser parser = new BasicParser();
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(arguments, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_withShortOption_HBRU2() {
        Options options = new Options();
        options.addOption("shortOpt", true, "description");
        String[] arguments = new String[]{"-shortOpt", "arg1", "arg2", "arg3"};
        boolean stopAtNonOption = true;
        BasicParser parser = new BasicParser();
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(arguments, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_withRequiredOption_swQx3() {
        Options options = new Options();
        options.addRequiredOption("requiredOpt", "longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt", "arg1", "arg2", "arg3"};
        boolean stopAtNonOption = true;
        BasicParser parser = new BasicParser();
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(arguments, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_withOptionGroup_MipQ4() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("opt1", true, "description"));
        group.addOption(new Option("opt2", true, "description"));
        options.addOptionGroup(group);
        String[] arguments = new String[]{"-opt1", "arg1", "-opt2", "arg2", "arg3"};
        boolean stopAtNonOption = true;
        BasicParser parser = new BasicParser();
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(arguments, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_withoutStopAtNonOption_sxlL6() {
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "--", "arg2", "arg3"};
        boolean stopAtNonOption = false;
        BasicParser parser = new BasicParser();
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(new String[]{"arg1", "--", "arg2", "arg3"}, result);
    }
}