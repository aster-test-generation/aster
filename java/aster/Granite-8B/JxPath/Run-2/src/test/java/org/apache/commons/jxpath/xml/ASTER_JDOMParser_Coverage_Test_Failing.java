/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMParser_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseXMLCreateSAXBuilder_Iwfv0() {
        JDOMParser jDOMParser = new JDOMParser();
        jDOMParser.parseXML(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseXMLSetExpandEntities_JqNe1() {
        JDOMParser jDOMParser = new JDOMParser();
        jDOMParser.setExpandEntityReferences(true);
        jDOMParser.parseXML(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseXMLSetIgnoringElementContentWhitespace_poZB2() {
        JDOMParser jDOMParser = new JDOMParser();
        jDOMParser.setIgnoringElementContentWhitespace(true);
        jDOMParser.parseXML(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseXMLSetValidation_KOfp3() {
        JDOMParser jDOMParser = new JDOMParser();
        jDOMParser.setValidating(true);
        jDOMParser.parseXML(null);
}
}