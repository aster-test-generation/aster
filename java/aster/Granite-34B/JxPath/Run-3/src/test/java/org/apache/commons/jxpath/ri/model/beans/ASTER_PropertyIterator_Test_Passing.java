/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PropertyIterator_Test_Passing {
    @Mock
    private BeanPointer pointer;
    @Mock
    private JXPathBasicBeanInfo beanInfo;
    @Mock
    private Locale locale;
    @Mock
    private DOMNodePointer startWith;
    private PropertyIterator propertyiterator;
    private String name;
    private int position = 0;
    private boolean targetReady = false;
    private PropertyPointer propertyNodePointer;
    private boolean includeStart = false;
    private int startIndex = 0;
    private boolean empty = false;
    private boolean reverse;
}