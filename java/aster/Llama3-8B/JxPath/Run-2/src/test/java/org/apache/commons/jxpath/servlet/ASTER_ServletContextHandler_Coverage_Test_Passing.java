/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockServletContext;
public class Aster_ServletContextHandler_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_jxuJ0() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        Set<String> expectedPropertyNames = new HashSet<>();
        expectedPropertyNames.add("property1");
        expectedPropertyNames.add("property2");
        expectedPropertyNames.add("property3");
        String[] actualPropertyNames = servletContextHandler.getPropertyNames(expectedPropertyNames);
        assertNotNull(actualPropertyNames);
        assertArrayEquals(expectedPropertyNames.toArray(), actualPropertyNames);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesEmptyContext_hlgG1() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        Set<String> expectedPropertyNames = new HashSet<>();
        String[] actualPropertyNames = servletContextHandler.getPropertyNames(expectedPropertyNames);
        assertNotNull(actualPropertyNames);
        assertArrayEquals(new String[0], actualPropertyNames);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesNullContext_fRuv2() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        String[] actualPropertyNames = servletContextHandler.getPropertyNames(null);
        assertNotNull(actualPropertyNames);
        assertArrayEquals(new String[0], actualPropertyNames);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollectPropertyNames_NullBean_suGA2() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        HashSet set = new HashSet();
        servletContextHandler.collectPropertyNames(set, null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_jxuJ0_1() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        Set<String> expectedPropertyNames = new HashSet<>();
        expectedPropertyNames.add("property1");
        expectedPropertyNames.add("property2");
        expectedPropertyNames.add("property3");
        String[] actualPropertyNames = servletContextHandler.getPropertyNames(expectedPropertyNames);
        assertNotNull(actualPropertyNames);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_jxuJ0_2() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        Set<String> expectedPropertyNames = new HashSet<>();
        expectedPropertyNames.add("property1");
        expectedPropertyNames.add("property2");
        expectedPropertyNames.add("property3");
        String[] actualPropertyNames = servletContextHandler.getPropertyNames(expectedPropertyNames);
        assertArrayEquals(expectedPropertyNames.toArray(), actualPropertyNames);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesEmptyContext_hlgG1_1() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        Set<String> expectedPropertyNames = new HashSet<>();
        String[] actualPropertyNames = servletContextHandler.getPropertyNames(expectedPropertyNames);
        assertNotNull(actualPropertyNames);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesEmptyContext_hlgG1_2() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        Set<String> expectedPropertyNames = new HashSet<>();
        String[] actualPropertyNames = servletContextHandler.getPropertyNames(expectedPropertyNames);
        assertArrayEquals(new String[0], actualPropertyNames);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesNullContext_fRuv2_1() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        String[] actualPropertyNames = servletContextHandler.getPropertyNames(null);
        assertNotNull(actualPropertyNames);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesNullContext_fRuv2_2() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        String[] actualPropertyNames = servletContextHandler.getPropertyNames(null);
        assertArrayEquals(new String[0], actualPropertyNames);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCollectPropertyNames_EmptySet_WXNY6_bZWS0() {
    ServletContextHandler servletContextHandler = new ServletContextHandler();
    HashSet set = new HashSet();
    servletContextHandler.collectPropertyNames(set, new MockServletContext());
}
}