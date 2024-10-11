/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PhoneticEngine_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_UnreachableCase_JsWh15_zjcY0_fid2() {
        try {
            PhoneticEngine engine = new PhoneticEngine(null, RuleType.EXACT, true);
            engine.encode("example", LanguageSet.from(new HashSet<>()));
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }
}