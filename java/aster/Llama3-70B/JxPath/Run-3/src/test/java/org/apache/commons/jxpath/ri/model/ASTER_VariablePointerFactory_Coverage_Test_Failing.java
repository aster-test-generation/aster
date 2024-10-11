/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_VariablePointerFactory_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointer_VariableContextWrapperWithoutContext_ReturnsVariablePointer_wjXT3_jtBi0_1() {
    VariablePointerFactory factory = new VariablePointerFactory();
    QName name = new QName("prefix", "localName");
    Object object = null; 
    NodePointer pointer = factory.createNodePointer(null, name, object);
    assertNotNull(pointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointer_VariableContextWrapperWithContext_ReturnsVariablePointer_QdvM2_JtGp0_1() {
    VariablePointerFactory factory = new VariablePointerFactory();
    QName name = new QName("prefix", "localName");
    Object object = new KeywordVariables("keyword", null); 
    NodePointer pointer = factory.createNodePointer(null, name, object);
    assertNotNull(pointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointer_VariableContextWrapperWithoutContext_ReturnsVariablePointer_wjXT3_jtBi0_2_fid1() {
    VariablePointerFactory factory = new VariablePointerFactory();
    QName name = new QName("prefix", "localName");
    Object object = null; 
    NodePointer pointer = factory.createNodePointer(null, name, object);
    assertTrue(pointer instanceof NodePointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointer_NullName_ThrowsNullPointerException_fLNG8_BdRj0_fid1() {
    VariablePointerFactory factory = new VariablePointerFactory();
    Object object = new Object(); 
    try {
        factory.createNodePointer(null, new QName("name"), object);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointer_VariableContextWrapperWithContext_ReturnsVariablePointer_QdvM2_JtGp0_2_fid1() {
    VariablePointerFactory factory = new VariablePointerFactory();
    QName name = new QName("prefix", "localName");
    Object object = new KeywordVariables("keyword", null); 
    NodePointer pointer = factory.createNodePointer(null, name, object);
    assertTrue(pointer instanceof NodePointer);}
}