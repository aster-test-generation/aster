/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_AmbiguousOptionException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_empty_dMGj0() {
        AmbiguousOptionException exception = new AmbiguousOptionException("", Collections.emptyList());
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_singleOption_AyEB1_1() {
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", Collections.singletonList("option1"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertEquals(1, matchingOptions.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_singleOption_AyEB1_2() {
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", Collections.singletonList("option1"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.contains("option1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_multipleOptions_uQiA2_1() {
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", Arrays.asList("option1", "option2", "option3"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertEquals(3, matchingOptions.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_multipleOptions_uQiA2_2() {
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", Arrays.asList("option1", "option2", "option3"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.contains("option1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_multipleOptions_uQiA2_3() {
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", Arrays.asList("option1", "option2", "option3"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.contains("option2"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_multipleOptions_uQiA2_4() {
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", Arrays.asList("option1", "option2", "option3"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.contains("option3"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_emptyOptions_BIjb6() {
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", Collections.emptyList());
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_nullAndEmptyOptions_OxDa7() {
        AmbiguousOptionException exception = new AmbiguousOptionException(null, Collections.emptyList());
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_nullOption_XskS3_fid1() {
        AmbiguousOptionException exception = new AmbiguousOptionException(null, Collections.singletonList("option1"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_emptyOption_NGNr5_fid1() {
        AmbiguousOptionException exception = new AmbiguousOptionException("", Collections.singletonList("option1"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_emptyAndNullOptions_uEOR8_fid1() {
        AmbiguousOptionException exception = new AmbiguousOptionException("", Collections.singletonList(null));
        Collection<String> matchingOptions = exception.getMatchingOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_nullAndEmptyOption_RsCc9_fid1() {
        AmbiguousOptionException exception = new AmbiguousOptionException(null, Collections.singletonList(""));
        Collection<String> matchingOptions = exception.getMatchingOptions();
    }
}