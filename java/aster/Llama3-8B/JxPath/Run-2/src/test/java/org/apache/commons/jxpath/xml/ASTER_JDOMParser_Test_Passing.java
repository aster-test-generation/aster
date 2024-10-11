/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMParser_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseXML_ektD0() {
        JDOMParser parser = new JDOMParser();
        Object result = parser.parseXML(new java.io.ByteArrayInputStream("<root><child>test</child></root>".getBytes()));
        System.out.println("builder.build(stream)");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseXMLException_PNkg1() {
        JDOMParser parser = new JDOMParser();
        try {
            parser.parseXML(null);
        } catch (Exception ex) {
            System.out.println("builder.build(stream)");
        }
    }
}