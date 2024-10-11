/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PosixParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithLongOption_SqNu1() throws Exception {
        Options options = new Options();
        options.addOption("l", "long-option", true, "Description");
        String[] arguments = new String[]{"--long-option", "value"};
        boolean stopAtNonOption = true;
        String[] result = new PosixParser().flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(new String[]{"--long-option", "value"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithShortOption_XuHh2() throws Exception {
        Options options = new Options();
        options.addOption("s", "short-option", true, "Description");
        String[] arguments = new String[]{"-s", "value"};
        boolean stopAtNonOption = true;
        String[] result = new PosixParser().flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(new String[]{"-s", "value"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOptionsStringArrayBooleanWhenStopAtNonOptionIsfalse_NlLO1() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "arg2"};
        boolean stopAtNonOption = false;
        String[] result = new PosixParser().flatten(options, arguments, stopAtNonOption);
        Assertions.assertEquals(Arrays.asList("arg1", "arg2"), Arrays.asList(result));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOptionsStringArrayBooleanWhenStopAtNonOptionIstrueAndHasShortOption_BWiq3() throws ParseException {
        Options options = new Options();
        options.addOption("short-opt", true, "description");
        String[] arguments = new String[]{"-s", "arg1", "arg2"};
        boolean stopAtNonOption = true;
        String[] result = new PosixParser().flatten(options, arguments, stopAtNonOption);
        Assertions.assertEquals(Arrays.asList("-s", "arg1", "arg2"), Arrays.asList(result));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOptionsStringArrayBooleanWhenStopAtNonOptionIstrueAndHasOptionToken_ddKj6() throws ParseException {
        Options options = new Options();
        options.addOption("opt", true, "description");
        String[] arguments = new String[]{"-opt", "arg1", "arg2"};
        boolean stopAtNonOption = true;
        String[] result = new PosixParser().flatten(options, arguments, stopAtNonOption);
        Assertions.assertEquals(Arrays.asList("-opt", "arg1", "arg2"), Arrays.asList(result));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOptionsStringArrayBooleanWhenStopAtNonOptionIstrueAndHasOptionTokenAndLongOpt_wagC7() throws ParseException {
        Options options = new Options();
        options.addOption("opt", "long-opt", true, "description");
        String[] arguments = new String[]{"--long-opt", "arg1", "arg2"};
        boolean stopAtNonOption = true;
        String[] result = new PosixParser().flatten(options, arguments, stopAtNonOption);
        Assertions.assertEquals(Arrays.asList("--long-opt", "arg1", "arg2"), Arrays.asList(result));
    }
}