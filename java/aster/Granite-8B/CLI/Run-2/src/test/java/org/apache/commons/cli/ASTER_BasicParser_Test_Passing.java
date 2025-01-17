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

public class Aster_BasicParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_LrZi0_1() {
        Options options = new Options();
        BasicParser parser = new BasicParser();
        String[] arguments = new String[]{"arg1", "arg2", "arg3"};
        String[] flattenedArgs = parser.flatten(options, arguments, false);
        assertNotNull(flattenedArgs);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_LrZi0_2() {
        Options options = new Options();
        BasicParser parser = new BasicParser();
        String[] arguments = new String[]{"arg1", "arg2", "arg3"};
        String[] flattenedArgs = parser.flatten(options, arguments, false);
        assertEquals(3, flattenedArgs.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_LrZi0_3() {
        Options options = new Options();
        BasicParser parser = new BasicParser();
        String[] arguments = new String[]{"arg1", "arg2", "arg3"};
        String[] flattenedArgs = parser.flatten(options, arguments, false);
        assertTrue(flattenedArgs[0].equals("arg1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_LrZi0_4() {
        Options options = new Options();
        BasicParser parser = new BasicParser();
        String[] arguments = new String[]{"arg1", "arg2", "arg3"};
        String[] flattenedArgs = parser.flatten(options, arguments, false);
        assertTrue(flattenedArgs[1].equals("arg2"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_LrZi0_5() {
        Options options = new Options();
        BasicParser parser = new BasicParser();
        String[] arguments = new String[]{"arg1", "arg2", "arg3"};
        String[] flattenedArgs = parser.flatten(options, arguments, false);
        assertTrue(flattenedArgs[2].equals("arg3"));
    }
}