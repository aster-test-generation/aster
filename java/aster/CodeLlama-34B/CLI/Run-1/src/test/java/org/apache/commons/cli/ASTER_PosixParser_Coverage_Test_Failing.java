/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PosixParser_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse1_GSIv0_1() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"--help"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals(1, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse1_GSIv0_2() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"--help"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("--help", cmd.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse2_HRou1_1() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"-h"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals(1, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse2_HRou1_2() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"-h"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("-h", cmd.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse3_XXTq2_1() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"--version"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals(1, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse3_XXTq2_2() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"--version"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("--version", cmd.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse4_tlZp3_1() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"-v"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals(1, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse4_tlZp3_2() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"-v"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("-v", cmd.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse5_nCzN4_1() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"--help", "--version"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals(2, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse5_nCzN4_2() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"--help", "--version"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("--help", cmd.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse5_nCzN4_3() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"--help", "--version"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("--version", cmd.getOptions()[1].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse6_vPYU5_1() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"-h", "-v"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals(2, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse6_vPYU5_2() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"-h", "-v"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("-h", cmd.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse6_vPYU5_3() throws Exception {
        Options options = new Options();
        String[] arguments = new String[]{"-h", "-v"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        PosixParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("-v", cmd.getOptions()[1].getOpt());
    }
}