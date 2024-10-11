/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import java.util.List;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNamespaceIterator_Test_Passing {
@Mock
    private DOMNodePointer parent;
private JDOMNamespaceIterator jdomnamespaceiterator;
@Mock
    private List namespaces;
    private int position = 0;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition_fid2() throws Exception {
        jdomnamespaceiterator = new JDOMNamespaceIterator(parent);
        // Arrange
        jdomnamespaceiterator.setPosition(0);
        // Act
        int result = jdomnamespaceiterator.getPosition();
        // Assert
        assertEquals(0, result);
    }
}