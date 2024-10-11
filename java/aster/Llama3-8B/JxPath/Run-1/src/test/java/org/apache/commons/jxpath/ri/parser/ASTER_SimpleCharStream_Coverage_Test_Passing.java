// /**
//  * Generated by Aster
//  */
// package org.apache.commons.jxpath.ri.parser;
// import org.apache.commons.jxpath.ri.axes.NamespaceContext;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
// import org.apache.commons.jxpath.ri.compiler.Expression;
// import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
// import org.apache.commons.jxpath.servlet.HttpSessionAndServletContext;
// import org.apache.commons.jxpath.servlet.KeywordVariables;
// import org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator;
// import org.apache.commons.jxpath.JXPathBasicBeanInfo;
// import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer;
// import org.apache.commons.jxpath.servlet.HttpSessionHandler;
// import org.apache.commons.jxpath.ri.axes.SelfContext;
// import org.apache.commons.jxpath.functions.MethodFunction;
// import org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator;
// import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
// import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
// import org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator;
// import org.apache.commons.jxpath.ri.compiler.Constant;
// import org.apache.commons.jxpath.ri.axes.UnionContext;
// import org.apache.commons.jxpath.ri.axes.ChildContext;
// import org.apache.commons.jxpath.servlet.PageScopeContext;
// import org.apache.commons.jxpath.ri.model.NodePointer;
// import org.apache.commons.jxpath.servlet.ServletRequestAndContext;
// import org.apache.commons.jxpath.ri.compiler.NodeTest;
// import org.apache.commons.jxpath.util.TypeUtils;
// import org.apache.commons.jxpath.functions.ConstructorFunction;
// import org.apache.commons.jxpath.CompiledExpression;
// import org.apache.commons.jxpath.xml.DocumentContainer;
// import org.apache.commons.jxpath.ri.model.VariablePointer;
// import org.apache.commons.jxpath.ri.model.beans.CollectionAttributeNodeIterator;
// import org.apache.commons.jxpath.ri.compiler.Operation;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
// import org.apache.commons.jxpath.ri.NamespaceResolver;
// import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer;
// import org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer;
// import org.apache.commons.jxpath.BasicVariables;
// import org.apache.commons.jxpath.BasicNodeSet;
// import org.apache.commons.jxpath.JXPathFunctionNotFoundException;
// import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
// import org.apache.commons.jxpath.JXPathContextFactory;
// import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
// import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
// import org.apache.commons.jxpath.util.ReverseComparator;
// import org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer;
// import org.apache.commons.jxpath.JXPathAbstractFactoryException;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
// import org.apache.commons.jxpath.ri.parser.XPathParserConstants;
// import org.apache.commons.jxpath.xml.DOMParser;
// import org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator;
// import org.apache.commons.jxpath.xml.JDOMParser;
// import org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl;
// import org.apache.commons.jxpath.servlet.ServletRequestHandler;
// import org.apache.commons.jxpath.ri.parser.SimpleCharStream;
// import org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression;
// import org.apache.commons.jxpath.Function;
// import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
// import org.apache.commons.jxpath.servlet.JXPathServletContexts;
// import org.apache.commons.jxpath.ClassFunctions;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
// import org.apache.commons.jxpath.ri.axes.RootContext;
// import org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory;
// import org.apache.commons.jxpath.JXPathInvalidAccessException;
// import org.apache.commons.jxpath.servlet.Constants;
// import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
// import org.apache.commons.jxpath.ri.model.container.ContainerPointer;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
// import org.apache.commons.jxpath.util.ClassLoaderUtil;
// import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer;
// import org.apache.commons.jxpath.FunctionLibrary;
// import org.apache.commons.jxpath.util.KeyManagerUtils;
// import org.apache.commons.jxpath.KeyManager;
// import org.apache.commons.jxpath.ri.parser.Token;
// import org.apache.commons.jxpath.ExpressionContext;
// import org.apache.commons.jxpath.ri.parser.XPathParserTokenManager;
// import org.apache.commons.jxpath.ri.parser.ParseException;
// import org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator;
// import org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator;
// import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyIterator;
// import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
// import org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory;
// import org.apache.commons.jxpath.PackageFunctions;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
// import org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator;
// import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory;
// import org.apache.commons.jxpath.ri.axes.InitialContext;
// import org.apache.commons.jxpath.ri.axes.NodeSetContext;
// import org.apache.commons.jxpath.JXPathIntrospector;
// import org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory;
// import org.apache.commons.jxpath.ri.axes.AncestorContext;
// import org.apache.commons.jxpath.ExtendedKeyManager;
// import org.apache.commons.jxpath.ri.compiler.CoreFunction;
// import org.apache.commons.jxpath.IdentityManager;
// import org.apache.commons.jxpath.util.JXPath11CompatibleTypeConverter;
// import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
// import org.apache.commons.jxpath.ExceptionHandler;
// import org.apache.commons.jxpath.Variables;
// import org.apache.commons.jxpath.ri.Parser;
// import org.apache.commons.jxpath.JXPathContext;
// import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
// import org.apache.commons.jxpath.servlet.PageContextHandler;
// import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
// import org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory;
// import org.apache.commons.jxpath.JXPathTypeConversionException;
// import org.apache.commons.jxpath.ri.model.VariablePointerFactory;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationCompare;
// import org.apache.commons.jxpath.ri.model.beans.LangAttributePointer;
// import org.apache.commons.jxpath.util.ValueUtils;
// import org.apache.commons.jxpath.Functions;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
// import org.apache.commons.jxpath.ri.compiler.Path;
// import org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator;
// import org.apache.commons.jxpath.JXPathNotFoundException;
// import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
// import org.apache.commons.jxpath.ri.EvalContext;
// import org.apache.commons.jxpath.ri.compiler.Step;
// import org.apache.commons.jxpath.servlet.PageScopeContextHandler;
// import org.apache.commons.jxpath.ri.parser.TokenMgrError;
// import org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory;
// import org.apache.commons.jxpath.MapDynamicPropertyHandler;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
// import org.apache.commons.jxpath.ri.compiler.CoreOperation;
// import org.apache.commons.jxpath.AbstractFactory;
// import org.apache.commons.jxpath.DynamicPropertyHandler;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
// import org.apache.commons.jxpath.Pointer;
// import org.apache.commons.jxpath.ri.model.NodePointerFactory;
// import org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer;
// import org.apache.commons.jxpath.util.MethodLookupUtils;
// import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory;
// import org.apache.commons.jxpath.ri.model.NodeIterator;
// import org.apache.commons.jxpath.JXPathBeanInfo;
// import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
// import org.apache.commons.jxpath.XMLDocumentContainer;
// import org.apache.commons.jxpath.ri.axes.AttributeContext;
// import org.apache.commons.jxpath.ri.model.beans.PropertyIterator;
// import org.apache.commons.jxpath.ri.parser.XPathParser;
// import org.apache.commons.jxpath.ri.Compiler;
// import org.apache.commons.jxpath.ri.axes.SimplePathInterpreter;
// import org.apache.commons.jxpath.xml.XMLParser2;
// import org.apache.commons.jxpath.ri.model.beans.NullPointer;
// import org.apache.commons.jxpath.ri.JXPathCompiledExpression;
// import org.apache.commons.jxpath.ri.QName;
// import org.apache.commons.jxpath.ri.InfoSetUtil;
// import org.apache.commons.jxpath.util.TypeConverter;
// import org.apache.commons.jxpath.ri.axes.PredicateContext;
// import org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
// import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
// import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
// import org.apache.commons.jxpath.ri.axes.ParentContext;
// import org.apache.commons.jxpath.util.BasicTypeConverter;
// import org.apache.commons.jxpath.ri.axes.DescendantContext;
// import org.apache.commons.jxpath.ri.compiler.VariableReference;
// import org.apache.commons.jxpath.ri.model.dom.NamespacePointer;
// import org.apache.commons.jxpath.ri.compiler.LocationPath;
// import org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer;
// import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
// import org.apache.commons.jxpath.xml.XMLParser;
// import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
// import org.apache.commons.jxpath.JXPathContextFactoryConfigurationError;
// import org.apache.commons.jxpath.Container;
// import org.apache.commons.jxpath.NodeSet;
// import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
// import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
// import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
// import org.apache.commons.jxpath.servlet.ServletContextHandler;
// import org.apache.commons.jxpath.JXPathException;
// import static org.junit.jupiter.api.Assertions.*;
// import java.util.*;
// import org.junit.jupiter.api.*;
// import java.util.concurrent.TimeUnit;
// import static org.mockito.Mockito.when;
// import static org.mockito.Mockito.*;
// import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
// import org.springframework.mock.web.*;
// import static org.junit.jupiter.api.Assertions.*;
// import java.util.*;
// import org.junit.jupiter.api.*;
// import java.util.concurrent.TimeUnit;
// import static org.mockito.Mockito.when;
// import static org.mockito.Mockito.*;
// import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
// import org.springframework.mock.web.*;
// public class Aster_SimpleCharStream_Coverage_Test_Passing {


// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testReInit_BufferIsNull_BufferSizeIsZero_hqnW2_4() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 1, 1, 10);
//         simpleCharStream.ReInit(new java.io.StringReader(""), 1, 1, 0);
//         assertEquals(0, simpleCharStream.bufcolumn.length);}
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testReInit_BufferIsNotNull_BufferSizeIsZero_RwwK3_1() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 1, 1, 10);
//         simpleCharStream.buffer = new char[5];
//         simpleCharStream.ReInit(new java.io.StringReader(""), 1, 1, 0);
//         assertEquals(0, simpleCharStream.bufferSize);}
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testReInit_BufferIsNotNull_BufferSizeIsZero_RwwK3_2() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 1, 1, 10);
//         simpleCharStream.buffer = new char[5];
//         simpleCharStream.ReInit(new java.io.StringReader(""), 1, 1, 0);
//         assertNull(simpleCharStream.buffer);}
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testReInit_BufferIsNotNull_BufferSizeIsZero_RwwK3_3() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 1, 1, 10);
//         simpleCharStream.buffer = new char[5];
//         simpleCharStream.ReInit(new java.io.StringReader(""), 1, 1, 0);
//         assertEquals(0, simpleCharStream.bufline.length);}
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testReInit_BufferIsNotNull_BufferSizeIsZero_RwwK3_4() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 1, 1, 10);
//         simpleCharStream.buffer = new char[5];
//         simpleCharStream.ReInit(new java.io.StringReader(""), 1, 1, 0);
//         assertEquals(0, simpleCharStream.bufcolumn.length);}
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testReInit_BufferIsNull_BufferSizeIsNegative_fbUJ4_1() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 1, 1, 10);
//         simpleCharStream.ReInit(new java.io.StringReader(""), 1, 1, -5);
//         assertEquals(10, simpleCharStream.bufferSize);}
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testReInit_BufferIsNull_BufferSizeIsNegative_fbUJ4_2() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 1, 1, 10);
//         simpleCharStream.ReInit(new java.io.StringReader(""), 1, 1, -5);
//         assertEquals(10, simpleCharStream.buffer.length);}
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testReInit_BufferIsNull_BufferSizeIsNegative_fbUJ4_3() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 1, 1, 10);
//         simpleCharStream.ReInit(new java.io.StringReader(""), 1, 1, -5);
//         assertEquals(10, simpleCharStream.bufline.length);}
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testReInit_BufferIsNull_BufferSizeIsNegative_fbUJ4_4() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 1, 1, 10);
//         simpleCharStream.ReInit(new java.io.StringReader(""), 1, 1, -5);
//         assertEquals(10, simpleCharStream.bufcolumn.length);}

// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffWrapAround_IIPY0() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(true);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffNoWrapAround_JTbh1() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(false);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffWrapAroundArrayCopy_hHry2() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(true);
//         assertEquals(simpleCharStream.buffer.length, simpleCharStream.bufsize + 2048);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffNoWrapAroundArrayCopy_xTEj3() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(false);
//         assertEquals(simpleCharStream.buffer.length, simpleCharStream.bufsize + 2048);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffWrapAroundBuffer_PzXN4() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(true);
//         assertNotEquals(simpleCharStream.buffer, null);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffNoWrapAroundBuffer_TCNM5() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(false);
//         assertNotEquals(simpleCharStream.buffer, null);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffWrapAroundBufline_cgED6() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(true);
//         assertNotEquals(simpleCharStream.bufline, null);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffNoWrapAroundBufline_fWeQ7() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(false);
//         assertNotEquals(simpleCharStream.bufline, null);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffWrapAroundBufcolumn_pBug8() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(true);
//         assertNotEquals(simpleCharStream.bufcolumn, null);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffNoWrapAroundBufcolumn_HUKU9() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(false);
//         assertNotEquals(simpleCharStream.bufcolumn, null);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffWrapAroundMaxNextCharInd_oigq10() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(true);
//         assertEquals(simpleCharStream.maxNextCharInd, simpleCharStream.bufpos + simpleCharStream.bufsize - simpleCharStream.tokenBegin);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffNoWrapAroundMaxNextCharInd_XRyN11() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(false);
//         assertEquals(simpleCharStream.maxNextCharInd, simpleCharStream.bufpos - simpleCharStream.tokenBegin);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffWrapAroundCatch_ryUl12() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         try {
//             simpleCharStream.ExpandBuff(true);
//         } catch (Throwable t) {
//             assertEquals(t.getMessage(), "Error");
//         }
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffNoWrapAroundCatch_VAGy13() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         try {
//             simpleCharStream.ExpandBuff(false);
//         } catch (Throwable t) {
//             assertEquals(t.getMessage(), "Error");
//         }
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffWrapAroundBufsize_Cgej14() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(true);
//         assertEquals(simpleCharStream.bufsize, simpleCharStream.bufsize + 2048);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
//     public void testExpandBuffNoWrapAroundBufsize_ewCP15() {
//         SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
//         simpleCharStream.ExpandBuff(false);
//         assertEquals(simpleCharStream.bufsize, simpleCharStream.bufsize + 2048);
//     }

// }



