/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynamicAttributeIterator_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPrepareForIndividualProperty_SuperCall_Tgra1_Zdkb0() {
    DynamicAttributeIterator iterator = new DynamicAttributeIterator(new BeanPointer(new QName("test"), new Object(), new JXPathBasicBeanInfo(Object.class), new Locale("en")), new QName("test"));
    iterator.prepareForIndividualProperty("test");
}
}