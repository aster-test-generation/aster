/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathContextFactoryConfigurationError_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_WhenSuperMessageIsNull_AndExceptionIsNull_ThenReturnNull_Neth1() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError();
        String message = error.getMessage();
        assert message == null;
    }
}