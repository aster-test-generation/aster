/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_AmbiguousOptionException_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_nullOption_XskS3() {
        AmbiguousOptionException exception = new AmbiguousOptionException(null, Collections.singletonList("option1"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_nullOptions_IJmo4() {
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", null);
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_emptyOption_NGNr5() {
        AmbiguousOptionException exception = new AmbiguousOptionException("", Collections.singletonList("option1"));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_emptyAndNullOptions_uEOR8() {
        AmbiguousOptionException exception = new AmbiguousOptionException("", Collections.singletonList(null));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_nullAndEmptyOption_RsCc9() {
        AmbiguousOptionException exception = new AmbiguousOptionException(null, Collections.singletonList(""));
        Collection<String> matchingOptions = exception.getMatchingOptions();
        assertTrue(matchingOptions.isEmpty());
    }
}