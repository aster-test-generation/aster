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

public class Aster_PosixParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_SingleDash_YKKg0() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_DoubleDash_xlyE1() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"--"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"--"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_LongOptionWithoutEqual_kvGS2() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Option A");
        String[] arguments = new String[]{"--optionA"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"--optionA"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_LongOptionWithEqual_aZXc3() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("b", "optionB", true, "Option B");
        String[] arguments = new String[]{"--optionB=value"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"--optionB", "value"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_AmbiguousLongOption_krDq4() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("c", "optionC1", false, "Option C1");
        options.addOption("c", "optionC2", false, "Option C2");
        String[] arguments = new String[]{"--optionC"};
        try {
            parser.flatten(options, arguments, false);
            fail("Expected an AmbiguousOptionException to be thrown");
        } catch (AmbiguousOptionException e) {
            assertEquals("optionC", e.getOption());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_ShortOption_kcIp5() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("d", null, false, "Option D");
        String[] arguments = new String[]{"-d"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-d"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_ShortOptionWithArgument_JrGE6() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("e", null, true, "Option E");
        String[] arguments = new String[]{"-e", "value"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-e", "value"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_UnrecognizedShortOption_clxK7() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-f"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-f"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_NonOption_orKg8() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"arg1"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"arg1"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_StopAtNonOption_MNFa9() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("g", null, false, "Option G");
        String[] arguments = new String[]{"-g", "arg2"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-g"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_MultipleOptions_AHhN10() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("h", null, false, "Option H");
        options.addOption("i", null, true, "Option I");
        String[] arguments = new String[]{"-h", "-i", "value", "arg3"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-h", "-i", "value", "arg3"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_BurstToken_uAws11() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("j", null, false, "Option J");
        String[] arguments = new String[]{"-jkl"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-j", "-k", "-l"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_EmptyArguments_Waws12() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithLongOptionAndArgument_RmeG3() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "optionA", true, "Option A");
        String[] arguments = new String[]{"--optionA=123"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"--optionA", "123"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithShortOption_fqRa4() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("b", null, false, "Option B");
        String[] arguments = new String[]{"-b"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-b"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithShortOptionAndArgument_KliY5() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("c", null, true, "Option C");
        String[] arguments = new String[]{"-c", "value"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-c", "value"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithAmbiguousShortOption_MBDk6() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("d", "optionD1", false, "Option D1");
        options.addOption("d", "optionD2", false, "Option D2");
        String[] arguments = new String[]{"-d"};
        try {
            parser.flatten(options, arguments, false);
            fail("Expected an AmbiguousOptionException to be thrown");
        } catch (AmbiguousOptionException e) {
            assertEquals("Ambiguous option: -d", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithUnrecognizedOption_JIUx7() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-x"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-x"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithStopAtNonOption_zyso8() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "123", "456"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-a", "123"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithNonOptionArgument_dCJe9() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"arg"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"arg"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithMultipleOptions_mwAa10() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("e", "optionE", false, "Option E");
        options.addOption("f", "optionF", true, "Option F");
        String[] arguments = new String[]{"--optionE", "-f", "value"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"--optionE", "-f", "value"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithMixedArguments_xjHR11() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("g", "optionG", true, "Option G");
        String[] arguments = new String[]{"--optionG=789", "arg1", "arg2"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"--optionG", "789", "arg1", "arg2"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOptionBursting_MduJ12() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("h", "optionH", false, "Option H");
        String[] arguments = new String[]{"-hij"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-h", "ij"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenLongOptionWithEqual_wbtJ3() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "optionA", true, "Option A");
        String[] arguments = new String[]{"--optionA=value"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"--optionA", "value"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenAmbiguousLongOption_uOCi4() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Option A");
        options.addOption("b", "optionB", false, "Option B");
        String[] arguments = new String[]{"--option"};
        try {
            parser.flatten(options, arguments, false);
            fail("Expected an AmbiguousOptionException to be thrown");
        } catch (ParseException e) {
            assertTrue(e instanceof AmbiguousOptionException);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenShortOption_JSOj5() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] arguments = new String[]{"-a"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenShortOptionWithArgument_cOsG6() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] arguments = new String[]{"-a", "value"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-a", "value"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenStopAtNonOption_uHmR8() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "arg"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenBurstToken_cXvq9() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] arguments = new String[]{"-abc"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-a", "-b", "-c"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenGobble_aKNq10() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "arg1", "arg2"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenNullArguments_FzUO12() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        try {
            parser.flatten(options, null, false);
            fail("Expected a NullPointerException to be thrown");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOptionWithMultipleMatching_ykHc13() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Option A");
        options.addOption("b", "optionB", false, "Option B");
        String[] arguments = new String[]{"-o"};
        try {
            parser.flatten(options, arguments, false);
            fail("Expected an AmbiguousOptionException to be thrown");
        } catch (ParseException e) {
            assertTrue(e instanceof AmbiguousOptionException);
        }
    }
}