/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_Rule_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMapWithSingletonLanguageSet_VukH0() {
        LanguageSet mockLanguageSet = mock(LanguageSet.class);
        when(mockLanguageSet.isSingleton()).thenReturn(true);
        when(mockLanguageSet.getAny()).thenReturn("English");
        NameType nameType = NameType.GENERIC;
        RuleType ruleType = RuleType.EXACT;
        Map<String, List<Rule>> result = Rule.getInstanceMap(nameType, ruleType, mockLanguageSet);
        verify(mockLanguageSet).isSingleton();
        verify(mockLanguageSet).getAny();
    }
}