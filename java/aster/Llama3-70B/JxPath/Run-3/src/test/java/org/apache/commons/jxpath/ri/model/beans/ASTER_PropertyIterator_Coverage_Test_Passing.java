/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import java.util.Locale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PropertyIterator_Coverage_Test_Passing {
    private String name;
    private int position = 0;
    PropertyIterator propertyIterator;
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_wiHx0_FypQ0() throws Exception {
    BeanPointer pointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class, true), Locale.US);
    PropertyIterator propertyIterator = new PropertyIterator(pointer, "name", false, null);
}
}