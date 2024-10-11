/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LangAttributePointer_Test_Passing {
    LangAttributePointer langattributepointer;
    LangAttributePointer langAttributePointer;
    LangAttributePointer anotherLangAttributePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers() throws Exception {
        langattributepointer = Mockito.mock(LangAttributePointer.class);
        NodePointer nodePointer1 = Mockito.mock(NodePointer.class);
        NodePointer nodePointer2 = Mockito.mock(NodePointer.class);
        Mockito.when(langattributepointer.compareChildNodePointers(nodePointer1, nodePointer2)).thenReturn(0);
        int result = langattributepointer.compareChildNodePointers(nodePointer1, nodePointer2);
        Assertions.assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_NullParent_odnK0() {
        LangAttributePointer langAttributePointer = new LangAttributePointer(null);
        assertEquals("@xml:lang", langAttributePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_VariableParent_VzEu3() {
        VariablePointer parent = new VariablePointer(new QName("prefix", "localName"));
        LangAttributePointer langAttributePointer = new LangAttributePointer(parent);
    }
}