
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.SimplePathInterpreter;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SimplePathInterpreter_ESTest extends SimplePathInterpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertTrue(jXPathBasicBeanInfo0.isDynamic());
      assertNotNull(jXPathBasicBeanInfo0);
      
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertTrue(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(beanPropertyPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
      assertTrue(beanPropertyPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getIndex());
      assertTrue(beanPropertyPointer0.isContainer());
      assertNull(beanPropertyPointer0.getNamespaceURI());
      assertFalse(beanPropertyPointer0.isNode());
      assertNotNull(beanPropertyPointer0);
      
      Step[] stepArray0 = new Step[4];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer((EvalContext) null, beanPropertyPointer0, stepArray0, 890);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 890
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = new NullPointer(locale0, "!");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertNotNull(nullPointer0);
      
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      assertEquals("div", coreOperationDivide0.getSymbol());
      assertNotNull(coreOperationDivide0);
      
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, coreOperationDivide0);
      assertEquals("div", coreOperationDivide0.getSymbol());
      assertEquals("=", nameAttributeTest0.getSymbol());
      assertTrue(nameAttributeTest0.computeContextDependent());
      assertNotNull(nameAttributeTest0);
      
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[8];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, nullPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("Predicate value is null: ", "Predicate value is null: ");
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertNotNull(qName0);
      
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertNotNull(jXPathBasicBeanInfo0);
      
      Locale locale0 = Locale.KOREAN;
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertNotNull(rootContext0);
      
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertNotNull(constant0);
      
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNotEqual0, constant0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertEquals("<", coreOperationLessThan0.getSymbol());
      assertNotNull(coreOperationLessThan0);
      
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThan0, coreOperationNotEqual0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertEquals("<", coreOperationLessThan0.getSymbol());
      assertEquals("=", coreOperationEqual0.getSymbol());
      assertNotNull(coreOperationEqual0);
      
      expressionArray0[0] = (Expression) coreOperationEqual0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, 2035, 2035, 7, 2035).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      BeanPointer beanPointer1 = (BeanPointer)SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(beanPointer1.equals((Object)beanPointer0));
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(beanPointer1.isRoot());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isContainer());
      assertEquals(0, beanPointer1.getIndex());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isCollection());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(7, stepArray0.length);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertNotNull(beanPointer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("Predicate value is null: ", "Predicate value is null: ");
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertNotNull(qName0);
      
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertNotNull(jXPathBasicBeanInfo0);
      
      Locale locale0 = Locale.KOREAN;
      assertEquals("", locale0.getISO3Country());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertEquals("", locale0.getISO3Country());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertEquals("", locale0.getISO3Country());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertEquals("", locale0.getISO3Country());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(0, rootContext0.getPosition());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertNotNull(rootContext0);
      
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      expressionArray0[0] = (Expression) constant0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertNotNull(coreOperationNegate0);
      
      expressionArray0[1] = (Expression) coreOperationNegate0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-1883), (-1249), (-1657), (-520), (-1155)).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("Predicate value is null: :Predicate value is null: ", qName0.toString());
      assertEquals("Predicate value is null: ", qName0.getName());
      assertEquals("Predicate value is null: ", qName0.getPrefix());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertEquals("", locale0.getISO3Country());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isCollection());
      assertFalse(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isLeaf());
      assertFalse(nodePointer0.isActual());
      assertEquals(2147483646, nodePointer0.getIndex());
      assertEquals(0, nodePointer0.getLength());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(0, rootContext0.getPosition());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(7, stepArray0.length);
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertNotNull(nullPointer0);
      
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(nullPointer1.equals((Object)nullPointer0));
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertTrue(nullPointer1.isNode());
      assertFalse(nullPointer1.isRoot());
      assertTrue(nullPointer1.isLeaf());
      assertNull(nullPointer1.getNamespaceURI());
      assertFalse(nullPointer1.isCollection());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isAttribute());
      assertFalse(nullPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertNotNull(nullPointer1);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContextReferenceImpl0, object0, nullPointer1);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(nullPointer0.equals((Object)nullPointer1));
      assertFalse(nullPointer1.equals((Object)nullPointer0));
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl0));
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertTrue(nullPointer1.isNode());
      assertFalse(nullPointer1.isRoot());
      assertTrue(nullPointer1.isLeaf());
      assertNull(nullPointer1.getNamespaceURI());
      assertFalse(nullPointer1.isCollection());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isAttribute());
      assertFalse(nullPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertNotNull(jXPathContextReferenceImpl1);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl2 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContextReferenceImpl1));
      assertFalse(jXPathContextReferenceImpl2.equals((Object)jXPathContextReferenceImpl1));
      assertFalse(jXPathContextReferenceImpl2.equals((Object)jXPathContextReferenceImpl0));
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(jXPathContextReferenceImpl2.isLenient());
      assertNotSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertNotSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl2);
      assertNotSame(jXPathContextReferenceImpl2, jXPathContextReferenceImpl1);
      assertNotSame(jXPathContextReferenceImpl2, jXPathContextReferenceImpl0);
      assertNotNull(jXPathContextReferenceImpl2);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl1, nullPointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContextReferenceImpl1));
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContextReferenceImpl2));
      assertFalse(nullPointer0.equals((Object)nullPointer1));
      assertFalse(nullPointer1.equals((Object)nullPointer0));
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl2));
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl0));
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertTrue(nullPointer1.isNode());
      assertFalse(nullPointer1.isRoot());
      assertTrue(nullPointer1.isLeaf());
      assertNull(nullPointer1.getNamespaceURI());
      assertFalse(nullPointer1.isCollection());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isAttribute());
      assertFalse(nullPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(0, rootContext0.getPosition());
      assertNotNull(rootContext0);
      
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContextReferenceImpl1));
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContextReferenceImpl2));
      assertFalse(nullPointer0.equals((Object)nullPointer1));
      assertFalse(nullPointer1.equals((Object)nullPointer0));
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl2));
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl0));
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertTrue(nullPointer1.isNode());
      assertFalse(nullPointer1.isRoot());
      assertTrue(nullPointer1.isLeaf());
      assertNull(nullPointer1.getNamespaceURI());
      assertFalse(nullPointer1.isCollection());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isAttribute());
      assertFalse(nullPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(0, rootContext0.getPosition());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertEquals(0, initialContext0.getPosition());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertNotSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertNotSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl2);
      assertNotSame(nullPointer0, nullPointer1);
      assertNotSame(nullPointer1, nullPointer0);
      assertNotSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl2);
      assertNotSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
      assertNotNull(initialContext0);
      
      Step[] stepArray0 = new Step[6];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(1000, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      Object object1 = new Object();
      assertFalse(object1.equals((Object)object0));
      assertNotNull(object1);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl3 = (JXPathContextReferenceImpl)JXPathContext.newContext(object1);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(object1.equals((Object)object0));
      assertFalse(jXPathContextReferenceImpl3.equals((Object)jXPathContextReferenceImpl2));
      assertFalse(jXPathContextReferenceImpl3.equals((Object)jXPathContextReferenceImpl1));
      assertFalse(jXPathContextReferenceImpl3.equals((Object)jXPathContextReferenceImpl0));
      assertFalse(jXPathContextReferenceImpl3.isLenient());
      assertNotSame(object1, object0);
      assertNotSame(jXPathContextReferenceImpl3, jXPathContextReferenceImpl2);
      assertNotSame(jXPathContextReferenceImpl3, jXPathContextReferenceImpl1);
      assertNotSame(jXPathContextReferenceImpl3, jXPathContextReferenceImpl0);
      assertNotNull(jXPathContextReferenceImpl3);
      
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(rootContext0, nullPointer1, stepArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.US;
      assertEquals("US", locale0.getCountry());
      assertEquals("en_US", locale0.toString());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = new NullPointer(locale0, "&apos;");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("US", locale0.getCountry());
      assertEquals("en_US", locale0.toString());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isNode());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(nullPointer0);
      
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals(2, expressionArray0.length);
      assertNotNull(coreOperationAdd0);
      
      expressionArray0[0] = (Expression) coreOperationAdd0;
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      expressionArray0[1] = (Expression) constant0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-831), Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nullPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.US;
      assertEquals("US", locale0.getCountry());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_US", locale0.toString());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = new NullPointer(locale0, "&apos;");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("US", locale0.getCountry());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_US", locale0.toString());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isCollection());
      assertNotNull(nullPointer0);
      
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("<<unknown namespace>>", "!0?{oia&oef0tHt");
      assertEquals("!0?{oia&oef0tHt", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:!0?{oia&oef0tHt", qName0.toString());
      assertNotNull(qName0);
      
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      assertEquals("!0?{oia&oef0tHt", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:!0?{oia&oef0tHt", qName0.toString());
      assertTrue(extensionFunction0.computeContextDependent());
      assertEquals(3, expressionArray0.length);
      assertNotNull(extensionFunction0);
      
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      assertEquals("!0?{oia&oef0tHt", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:!0?{oia&oef0tHt", qName0.toString());
      assertTrue(extensionFunction0.computeContextDependent());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertEquals(3, expressionArray0.length);
      assertNotNull(coreOperationNegate0);
      
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationNegate0);
      assertEquals("!0?{oia&oef0tHt", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:!0?{oia&oef0tHt", qName0.toString());
      assertTrue(extensionFunction0.computeContextDependent());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertTrue(nameAttributeTest0.computeContextDependent());
      assertEquals("=", nameAttributeTest0.getSymbol());
      assertEquals(3, expressionArray0.length);
      assertNotNull(nameAttributeTest0);
      
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Constant constant0 = new Constant("xml");
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertNotNull(constant0);
      
      expressionArray0[1] = (Expression) constant0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[0], nameAttributeTest0);
      assertEquals("!0?{oia&oef0tHt", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:!0?{oia&oef0tHt", qName0.toString());
      assertTrue(extensionFunction0.computeContextDependent());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertTrue(nameAttributeTest0.computeContextDependent());
      assertEquals("=", nameAttributeTest0.getSymbol());
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertEquals(3, expressionArray0.length);
      assertNotNull(coreOperationGreaterThan0);
      
      expressionArray0[2] = (Expression) coreOperationGreaterThan0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nullPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("z}gK9", "z}gK9");
      assertEquals("z}gK9", qName0.getPrefix());
      assertEquals("z}gK9", qName0.getName());
      assertEquals("z}gK9:z}gK9", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("z}gK9", qName0.getPrefix());
      assertEquals("z}gK9", qName0.getName());
      assertEquals("z}gK9:z}gK9", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      Step[] stepArray0 = new Step[8];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, variablePointer0, stepArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'z}gK9:z}gK9'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3876));
      assertEquals((-3876), nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      assertEquals((-3876), nodeTypeTest0.getNodeType());
      assertFalse(selfContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getPosition());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertNotNull(selfContext0);
      
      Locale locale0 = Locale.ITALIAN;
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = new NullPointer(locale0, "name");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isAttribute());
      assertNotNull(nullPointer0);
      
      Step[] stepArray0 = new Step[6];
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant("<<unknown namespace>>");
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      expressionArray0[0] = (Expression) constant0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], expressionArray0[0]);
      assertEquals("mod", coreOperationMod0.getSymbol());
      assertEquals(8, expressionArray0.length);
      assertNotNull(coreOperationMod0);
      
      expressionArray0[1] = (Expression) coreOperationMod0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertEquals(8, expressionArray0.length);
      assertNotNull(coreOperationUnion0);
      
      expressionArray0[2] = (Expression) coreOperationUnion0;
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertTrue(nullPropertyPointer0.isContainer());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertFalse(nullPropertyPointer0.isActual());
      assertFalse(nullPropertyPointer0.isCollection());
      assertFalse(nullPropertyPointer0.isRoot());
      assertFalse(nullPropertyPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertNotNull(nullPropertyPointer0);
      
      QName qName0 = nullPropertyPointer0.getName();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertTrue(nullPropertyPointer0.isContainer());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertFalse(nullPropertyPointer0.isActual());
      assertFalse(nullPropertyPointer0.isCollection());
      assertFalse(nullPropertyPointer0.isRoot());
      assertFalse(nullPropertyPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals("*", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("*", qName0.getName());
      assertNotNull(qName0);
      
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertTrue(nullPropertyPointer0.isContainer());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertFalse(nullPropertyPointer0.isActual());
      assertFalse(nullPropertyPointer0.isCollection());
      assertFalse(nullPropertyPointer0.isRoot());
      assertFalse(nullPropertyPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals("*", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("*", qName0.getName());
      assertTrue(extensionFunction0.computeContextDependent());
      assertEquals(8, expressionArray0.length);
      assertNotNull(extensionFunction0);
      
      expressionArray0[3] = (Expression) extensionFunction0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], extensionFunction0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      assertEquals("<", coreOperationLessThan0.getSymbol());
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertTrue(nullPropertyPointer0.isContainer());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertFalse(nullPropertyPointer0.isActual());
      assertFalse(nullPropertyPointer0.isCollection());
      assertFalse(nullPropertyPointer0.isRoot());
      assertFalse(nullPropertyPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals("*", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("*", qName0.getName());
      assertTrue(extensionFunction0.computeContextDependent());
      assertEquals(8, expressionArray0.length);
      assertNotNull(coreOperationLessThan0);
      
      expressionArray0[4] = (Expression) coreOperationLessThan0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[1], expressionArray0[1]);
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertEquals(8, expressionArray0.length);
      assertNotNull(coreOperationGreaterThan0);
      
      expressionArray0[5] = (Expression) coreOperationGreaterThan0;
      CoreFunction coreFunction0 = new CoreFunction(272, expressionArray0);
      assertEquals(8, coreFunction0.getArgumentCount());
      assertEquals(272, coreFunction0.getFunctionCode());
      assertEquals(8, expressionArray0.length);
      assertNotNull(coreFunction0);
      
      Expression expression0 = coreFunction0.getArg1();
      assertEquals(8, coreFunction0.getArgumentCount());
      assertEquals(272, coreFunction0.getFunctionCode());
      assertFalse(expression0.isContextDependent());
      assertFalse(expression0.computeContextDependent());
      assertEquals(8, expressionArray0.length);
      assertSame(expression0, constant0);
      assertNotNull(expression0);
      
      expressionArray0[6] = expression0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreFunction0, expressionArray0[2]);
      assertEquals(8, coreFunction0.getArgumentCount());
      assertEquals(272, coreFunction0.getFunctionCode());
      assertEquals("div", coreOperationDivide0.getSymbol());
      assertEquals(8, expressionArray0.length);
      assertNotNull(coreOperationDivide0);
      
      expressionArray0[7] = (Expression) coreOperationDivide0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(559, (-1)).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(selfContext0, nullPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("Not supported node test for attributes: ", ")RFgY-hx_iI");
      assertEquals("Not supported node test for attributes: :)RFgY-hx_iI", qName0.toString());
      assertEquals(")RFgY-hx_iI", qName0.getName());
      assertEquals("Not supported node test for attributes: ", qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = new BeanPointer(qName0, "Not supported node test for attributes: ", (JXPathBeanInfo) null, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Not supported node test for attributes: :)RFgY-hx_iI", qName0.toString());
      assertEquals(")RFgY-hx_iI", qName0.getName());
      assertEquals("Not supported node test for attributes: ", qName0.getPrefix());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertNotNull(beanPointer0);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("Not supported node test for attributes: :)RFgY-hx_iI", qName0.toString());
      assertEquals(")RFgY-hx_iI", qName0.getName());
      assertEquals("Not supported node test for attributes: ", qName0.getPrefix());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertNotNull(rootContext0);
      
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("Not supported node test for attributes: :)RFgY-hx_iI", qName0.toString());
      assertEquals(")RFgY-hx_iI", qName0.getName());
      assertEquals("Not supported node test for attributes: ", qName0.getPrefix());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertEquals(0, initialContext0.getPosition());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertNotNull(initialContext0);
      
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant("Not supported node test for attributes: ");
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertNotNull(constant0);
      
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertNotNull(coreOperationNegate0);
      
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNegate0, constant0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertNotNull(coreOperationGreaterThan0);
      
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationNegate0, coreOperationGreaterThan0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      
      expressionArray0[1] = (Expression) coreOperationNotEqual0;
      Expression[] expressionArray1 = new Expression[8];
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      expressionArray1[0] = (Expression) constant0;
      expressionArray1[1] = (Expression) constant0;
      expressionArray1[2] = (Expression) coreOperationGreaterThan0;
      expressionArray1[3] = (Expression) coreOperationGreaterThan0;
      expressionArray1[4] = (Expression) constant0;
      expressionArray1[5] = (Expression) coreOperationGreaterThan0;
      expressionArray1[6] = (Expression) coreOperationGreaterThan0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNotEqual0, expressionArray1[0]);
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertEquals(8, expressionArray1.length);
      assertNotNull(coreOperationLessThanOrEqual0);
      
      expressionArray1[7] = (Expression) coreOperationLessThanOrEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray1);
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertEquals("Not supported node test for attributes: :)RFgY-hx_iI", qName0.toString());
      assertEquals(")RFgY-hx_iI", qName0.getName());
      assertEquals("Not supported node test for attributes: ", qName0.getPrefix());
      assertTrue(extensionFunction0.computeContextDependent());
      assertEquals(8, expressionArray1.length);
      assertNotNull(extensionFunction0);
      
      expressionArray0[2] = (Expression) extensionFunction0;
      Step[] stepArray0 = new Step[6];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(initialContext0, beanPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: Not supported node test for attributes: :)RFgY-hx_iI
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("z0JoI3d^ts");
      assertEquals("z0JoI3d^ts", qName0.toString());
      assertEquals("z0JoI3d^ts", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("z0JoI3d^ts", qName0.toString());
      assertEquals("z0JoI3d^ts", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("z0JoI3d^ts", qName0.toString());
      assertEquals("z0JoI3d^ts", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertNotNull(rootContext0);
      
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("z0JoI3d^ts", qName0.toString());
      assertEquals("z0JoI3d^ts", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(0, initialContext0.getPosition());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertNotNull(initialContext0);
      
      Expression[] expressionArray0 = new Expression[9];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      assertEquals(9, coreFunction0.getArgumentCount());
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(9, expressionArray0.length);
      assertNotNull(coreFunction0);
      
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreFunction0, coreFunction0);
      assertEquals(9, coreFunction0.getArgumentCount());
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertEquals(9, expressionArray0.length);
      assertNotNull(coreOperationGreaterThan0);
      
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      Step[] stepArray0 = new Step[8];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(initialContext0, variablePointer0, expressionArray0, stepArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'z0JoI3d^ts'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SelfContext selfContext0 = new SelfContext((EvalContext) null, (NodeTest) null);
      assertFalse(selfContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getPosition());
      assertNotNull(selfContext0);
      
      AttributeContext attributeContext0 = new AttributeContext(selfContext0, (NodeTest) null);
      assertFalse(selfContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getPosition());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertNotNull(attributeContext0);
      
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(1000, expressionArray0);
      assertEquals(3, coreFunction0.getArgumentCount());
      assertEquals(1000, coreFunction0.getFunctionCode());
      assertEquals(3, expressionArray0.length);
      assertNotNull(coreFunction0);
      
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      assertEquals(3, coreFunction0.getArgumentCount());
      assertEquals(1000, coreFunction0.getFunctionCode());
      assertEquals("<", coreOperationLessThan0.getSymbol());
      assertEquals(3, expressionArray0.length);
      assertNotNull(coreOperationLessThan0);
      
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationLessThan0, coreFunction0);
      assertEquals(3, coreFunction0.getArgumentCount());
      assertEquals(1000, coreFunction0.getFunctionCode());
      assertEquals("<", coreOperationLessThan0.getSymbol());
      assertEquals("mod", coreOperationMod0.getSymbol());
      assertEquals(3, expressionArray0.length);
      assertNotNull(coreOperationMod0);
      
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertEquals(3, expressionArray0.length);
      assertNotNull(coreOperationOr0);
      
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationOr0, expressionArray0[0]);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertEquals("div", coreOperationDivide0.getSymbol());
      assertEquals(3, expressionArray0.length);
      assertNotNull(coreOperationDivide0);
      
      PredicateContext predicateContext0 = new PredicateContext(attributeContext0, coreOperationDivide0);
      assertFalse(selfContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getPosition());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertEquals("or", coreOperationOr0.getSymbol());
      assertEquals("div", coreOperationDivide0.getSymbol());
      assertEquals(0, predicateContext0.getDocumentOrder());
      assertFalse(predicateContext0.isChildOrderingRequired());
      assertEquals(0, predicateContext0.getPosition());
      assertEquals(3, expressionArray0.length);
      assertNotNull(predicateContext0);
      
      Step[] stepArray0 = new Step[3];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(predicateContext0, (NodePointer) null, expressionArray0, stepArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertEquals(0, initialContext0.getPosition());
      assertNotNull(initialContext0);
      
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertEquals(2, expressionArray0.length);
      assertNotNull(coreOperationUnion0);
      
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationUnion0, coreOperationUnion0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertEquals(2, expressionArray0.length);
      assertNotNull(coreOperationLessThanOrEqual0);
      
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(step0).getAxis();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[3] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(initialContext0, (NodePointer) null, stepArray0, 3);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, (NodeSet) null);
      assertFalse(nodeSetContext0.isChildOrderingRequired());
      assertEquals(0, nodeSetContext0.getPosition());
      assertEquals(0, nodeSetContext0.getDocumentOrder());
      assertNotNull(nodeSetContext0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "Not supported node test for attributes: ");
      assertEquals("Not supported node test for attributes: ", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":Not supported node test for attributes: ", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("Not supported node test for attributes: ", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":Not supported node test for attributes: ", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      Step[] stepArray0 = new Step[8];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(nodeSetContext0, variablePointer0, stepArray0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':Not supported node test for attributes: '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isRoot());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isActual());
      assertNotNull(nullPointer0);
      
      QName qName0 = new QName("<<unknown namespace>>", "");
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("<<unknown namespace>>:", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("<<unknown namespace>>:", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("<<unknown namespace>>:", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(step0).getAxis();
      doReturn(nodeNameTest0).when(step0).getNodeTest();
      doReturn((Expression[]) null).when(step0).getPredicates();
      Step[] stepArray0 = new Step[8];
      stepArray0[3] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer((EvalContext) null, nullPointer0, stepArray0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      Locale locale0 = Locale.TAIWAN;
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isActual());
      assertNotNull(nullPointer0);
      
      Step[] stepArray0 = new Step[1];
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, initialContext0.getPosition());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertNotNull(initialContext0);
      
      NullPointer nullPointer1 = (NullPointer)SimplePathInterpreter.createNullPointer(initialContext0, nullPointer0, stepArray0, 1);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isActual());
      assertEquals(0, initialContext0.getPosition());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertFalse(nullPointer1.isContainer());
      assertTrue(nullPointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer1.isLeaf());
      assertNull(nullPointer1.getNamespaceURI());
      assertFalse(nullPointer1.isCollection());
      assertTrue(nullPointer1.isNode());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isAttribute());
      assertEquals(1, stepArray0.length);
      assertSame(nullPointer0, nullPointer1);
      assertSame(nullPointer1, nullPointer0);
      assertNotNull(nullPointer1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("Predicate value is null: ", "Predicate value is null: ");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNotEqual0, constant0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThan0, coreOperationNotEqual0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("Predicate value is null: ", "Predicate value is null: ");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[0];
      Expression[] expressionArray1 = new Expression[7];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray1[0] = (Expression) coreOperationAnd0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray1[1] = (Expression) coreOperationOr0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray1[2] = (Expression) coreOperationAdd0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationOr0);
      expressionArray1[3] = (Expression) nameAttributeTest0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray1[4] = (Expression) coreOperationUnion0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, (-1883), Integer.MIN_VALUE, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray1).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(rootContext0, beanPointer0, stepArray0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Predicate value is null: 
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("Predicate value is null: ", "Predicate value is null: ");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expressionArray0[0], constant0);
      expressionArray0[1] = (Expression) coreOperationDivide0;
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[2] = (Expression) variableReference0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Predicate value is null: :Predicate value is null: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("Predicate value is null: ", "Predicate value is null: ");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[0];
      Expression[] expressionArray1 = new Expression[7];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray1[0] = (Expression) coreOperationAnd0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray1[1] = (Expression) coreOperationOr0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray1[2] = (Expression) coreOperationAdd0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationOr0);
      expressionArray1[3] = (Expression) nameAttributeTest0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray1[4] = (Expression) coreOperationUnion0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, (-1883), Integer.MIN_VALUE, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray1, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("Predicate value is null: ", "Predicate value is null: ");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[9];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(expressionPath0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThanOrEqual0, coreOperationNegate0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(222).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      Expression[] expressionArray0 = new Expression[0];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, (NodePointer) null, expressionArray0, stepArray0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression; Factory is not set on the JXPathContext - cannot create path: /org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("Predicate value is null: ", "Predicate value is null: ");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Step[] stepArray0 = new Step[7];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Step[] stepArray0 = new Step[1];
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(step0).getAxis();
      doReturn(nodeNameTest0, nodeNameTest0).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nullPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("<<unknown namespace>>", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(step0).getAxis();
      doReturn(nodeNameTest0).when(step0).getNodeTest();
      doReturn((Expression[]) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nullPointer0, stepArray0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("Gi^h!e9R");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Gi^h!e9R");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Step[] stepArray0 = new Step[0];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath(parentContext0, variablePointer0, stepArray0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) simplePathInterpreter0);
      QName qName0 = new QName((String) null, (String) null);
      Object object0 = new Object();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.GERMANY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      BeanPropertyPointer beanPropertyPointer0 = (BeanPropertyPointer)beanPointer0.getPropertyPointer();
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("org.apache.commons.jxpath.JXPathTypeConversionException");
      expressionArray0[0] = (Expression) constant0;
      Step[] stepArray0 = new Step[9];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(rootContext0, beanPropertyPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
