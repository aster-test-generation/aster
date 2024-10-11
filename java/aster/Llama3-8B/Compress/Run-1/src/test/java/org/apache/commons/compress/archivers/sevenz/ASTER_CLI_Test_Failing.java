/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CLI_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithOneArgument_EKOG1_ludh0() {
    String[] args = new String[] {"test"};
    try {
        CLI.main(args);
    } catch (Exception e) {
        fail("Exception was thrown");
    }
    assertEquals("Mode: list test", System.out.toString());
    File file = new File("test");
    assertTrue(file.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithTwoArguments_yJce4_yKcG0() {
    String[] args = new String[] {"test", "list"};
    try {
        CLI.main(args);
    } catch (Exception e) {
        fail("Exception was thrown");
    }
    assertEquals("Mode: list test", System.out.toString());
    File file = new File("test");
    assertTrue(file.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithOneArgument_cpCk1_EASx0() {
    String[] args = new String[1];
    args[0] = "file";
    try {
        CLI.main(args);
    } catch (Exception e) {
        assertEquals("file\n", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithTwoArguments_JKeH2_ENdf0() {
    String[] args = new String[2];
    args[0] = "file";
    args[1] = "LIST";
    try {
        CLI.main(args);
    } catch (Exception e) {
        fail("Exception was thrown");
    }
    assertEquals("LIST file\n", System.out.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithTwoArgumentsInvalidMode_rFmw3_CXGc0() {
    String[] args = new String[2];
    args[0] = "file";
    args[1] = "InvalidMode";
    try {
        CLI.main(args);
    } catch (Exception e) {
        assertEquals("Invalid mode: InvalidMode\nfile doesn't exist or is a directory\n", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithNoArguments_hSwT0_BJXm1_fid3() {
    String[] args = new String[0];
    try {
        CLI.main(args);
    } catch (Exception e) {
        fail("Exception was thrown");
    }
    assertEquals("Parameters: archive-name [list]", System.out.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithOneArgumentFileDoesNotExist_PuIa2_NYOP0_fid3() {
    String[] args = new String[] {"test"};
    try {
        CLI.main(args);
        fail("Expected an exception");
    } catch (Exception e) {
        assertEquals("test doesn't exist or is a directory", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithOneArgumentFileIsDirectory_qXkU3_pbMu0_fid3() {
    String[] args = new String[] {"test"};
    File file = new File("test");
    file.mkdirs();
    try {
        CLI.main(args);
    } catch (Exception e) {
        assertEquals("test doesn't exist or is a directory", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithTwoArgumentsFileDoesNotExist_zXNn5_KeDo0_fid3() {
    String[] args = new String[] {"test", "list"};
    try {
        CLI.main(args);
    } catch (Exception e) {
        assertEquals("test doesn't exist or is a directory", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithOneArgument_cpCk1_EASx0_fid3() {
    String[] args = new String[1];
    args[0] = "file";
    try {
        CLI.main(args);
    } catch (Exception e) {
        assertEquals("Usage: java -jar cli.jar [mode] [file]\n", e.getMessage());
    }
}
}