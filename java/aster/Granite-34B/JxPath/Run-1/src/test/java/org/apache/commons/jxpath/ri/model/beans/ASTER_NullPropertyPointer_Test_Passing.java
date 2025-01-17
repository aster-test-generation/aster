/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPropertyPointer_Test_Passing {
    private boolean byNameAttribute = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection2_fpUP1() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("prefix", "localName")));
        boolean result = nullPropertyPointer.isCollection();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_fdYs1() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name")));
        String path = nullPropertyPointer.asPath();
    }
}