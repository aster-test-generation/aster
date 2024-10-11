/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
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
public class Aster_PageContextHandler_Test_Passing {
    private PageContextHandler pagecontexthandler;
    private Object pageContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_nuum0() throws Exception {
        PageContextHandler handler = new PageContextHandler();
        Object pageContext = new Object(); // Initialize pageContext object
        String[] propertyNames = handler.getPropertyNames(pageContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithNullParameter_goqD1() throws Exception {
        PageContextHandler handler = new PageContextHandler();
        Object pageContext = null;
        String[] propertyNames = handler.getPropertyNames(pageContext);
    }
}