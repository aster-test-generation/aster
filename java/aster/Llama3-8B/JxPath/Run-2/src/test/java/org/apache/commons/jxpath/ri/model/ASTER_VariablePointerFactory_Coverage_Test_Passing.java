/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_VariablePointerFactory_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointer_NullLocale_KmNP11_BNQO0() {
    Object object = new Object();
    QName name = new QName("testName");
    Locale locale = null;
    VariablePointerFactory factory = new VariablePointerFactory();
    NodePointer result = factory.createNodePointer(null, name, object);
}
}