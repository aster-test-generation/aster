
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


package org.apache.commons.jxpath.ri.model.beans;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class NullPointer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jxpath.ri.model.beans.NullPointer"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/Users/mkim754/IdeaProjects/aster-benchmark/commons-jxpath-1.3"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NullPointer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.jxpath.Variables",
      "org.apache.commons.jxpath.ri.Compiler",
      "org.apache.commons.jxpath.JXPathBeanInfo",
      "org.apache.commons.jxpath.BasicVariables",
      "org.apache.commons.jxpath.JXPathInvalidSyntaxException",
      "org.apache.commons.jxpath.JXPathAbstractFactoryException",
      "org.apache.commons.jxpath.JXPathInvalidAccessException",
      "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual",
      "org.apache.commons.jxpath.ri.model.beans.PropertyPointer",
      "org.apache.commons.jxpath.ri.model.beans.BeanPointer",
      "org.apache.commons.jxpath.ri.model.NodePointer",
      "org.apache.commons.jxpath.ri.model.VariablePointer$1",
      "org.apache.commons.jxpath.ri.compiler.CoreOperation",
      "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer",
      "org.apache.commons.jxpath.ri.model.VariablePointerFactory$VariableContextWrapper",
      "org.apache.commons.jxpath.ri.model.VariablePointer",
      "org.apache.commons.jxpath.Functions",
      "org.apache.commons.jxpath.ri.model.container.ContainerPointer",
      "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory",
      "org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory",
      "org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl",
      "org.apache.commons.jxpath.ri.model.NodeIterator",
      "org.apache.commons.jxpath.JXPathContextFactory",
      "org.apache.commons.jxpath.ri.axes.RootContext",
      "org.apache.commons.jxpath.ri.axes.InitialContext",
      "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare",
      "org.apache.commons.jxpath.ExpressionContext",
      "org.apache.commons.jxpath.ri.QName",
      "org.apache.commons.jxpath.MapDynamicPropertyHandler",
      "org.apache.commons.jxpath.ri.model.beans.CollectionPointer",
      "org.apache.commons.jxpath.CompiledExpression",
      "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl",
      "org.apache.commons.jxpath.NodeSet",
      "org.apache.commons.jxpath.IdentityManager",
      "org.apache.commons.jxpath.util.ValueUtils",
      "org.apache.commons.jxpath.JXPathContext",
      "org.apache.commons.jxpath.ri.compiler.TreeCompiler",
      "org.apache.commons.jxpath.JXPathException",
      "org.apache.commons.jxpath.JXPathNotFoundException",
      "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer",
      "org.apache.commons.jxpath.ri.model.beans.NullPointer",
      "org.apache.commons.jxpath.PackageFunctions",
      "org.apache.commons.jxpath.JXPathIntrospector",
      "org.apache.commons.jxpath.ri.compiler.NodeTest",
      "org.apache.commons.jxpath.ri.model.VariablePointerFactory",
      "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory",
      "org.apache.commons.jxpath.JXPathBasicBeanInfo$1",
      "org.apache.commons.jxpath.KeyManager",
      "org.apache.commons.jxpath.JXPathContextFactoryConfigurationError",
      "org.apache.commons.jxpath.JXPathTypeConversionException",
      "org.apache.commons.jxpath.JXPathBasicBeanInfo",
      "org.apache.commons.jxpath.ri.compiler.NameAttributeTest",
      "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1",
      "org.apache.commons.jxpath.DynamicPropertyHandler",
      "org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest",
      "org.apache.commons.jxpath.ri.EvalContext",
      "org.apache.commons.jxpath.JXPathFunctionNotFoundException",
      "org.apache.commons.jxpath.Container",
      "org.apache.commons.jxpath.ri.model.NodePointerFactory",
      "org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory",
      "org.apache.commons.jxpath.ri.NamespaceResolver",
      "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer",
      "org.apache.commons.jxpath.Pointer",
      "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer",
      "org.apache.commons.jxpath.AbstractFactory",
      "org.apache.commons.jxpath.ri.compiler.Expression",
      "org.apache.commons.jxpath.ri.compiler.Operation",
      "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer",
      "org.apache.commons.jxpath.Function",
      "org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NullPointer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jxpath.ri.model.NodePointer",
      "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer",
      "org.apache.commons.jxpath.ri.model.beans.NullPointer",
      "org.apache.commons.jxpath.ri.QName",
      "org.apache.commons.jxpath.PackageFunctions",
      "org.apache.commons.jxpath.JXPathContext",
      "org.apache.commons.jxpath.JXPathContextFactory",
      "org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl",
      "org.apache.commons.jxpath.ri.compiler.TreeCompiler",
      "org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory",
      "org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory",
      "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory",
      "org.apache.commons.jxpath.ri.model.VariablePointerFactory",
      "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory",
      "org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory",
      "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1",
      "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl",
      "org.apache.commons.jxpath.util.ValueUtils",
      "org.apache.commons.jxpath.JXPathBasicBeanInfo$1",
      "org.apache.commons.jxpath.JXPathBasicBeanInfo",
      "org.apache.commons.jxpath.JXPathIntrospector",
      "org.apache.commons.jxpath.ri.model.beans.BeanPointer",
      "org.apache.commons.jxpath.ri.NamespaceResolver",
      "org.apache.commons.jxpath.BasicVariables",
      "org.apache.commons.jxpath.ri.model.VariablePointer",
      "org.apache.commons.jxpath.ri.model.beans.PropertyPointer",
      "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer",
      "org.apache.commons.jxpath.JXPathException",
      "org.apache.commons.jxpath.ri.parser.XPathParser",
      "org.apache.commons.jxpath.ri.parser.SimpleCharStream",
      "org.apache.commons.jxpath.ri.parser.XPathParserTokenManager",
      "org.apache.commons.jxpath.ri.parser.Token",
      "org.apache.commons.jxpath.ri.parser.XPathParser$JJCalls",
      "org.apache.commons.jxpath.ri.Parser",
      "org.apache.commons.jxpath.ri.model.beans.PropertyIterator",
      "org.apache.commons.jxpath.ri.JXPathCompiledExpression",
      "org.apache.commons.jxpath.ri.parser.ParseException",
      "org.apache.commons.jxpath.ri.parser.XPathParserConstants",
      "org.apache.commons.jxpath.JXPathInvalidSyntaxException",
      "org.apache.commons.jxpath.ri.parser.TokenMgrError",
      "org.apache.commons.jxpath.ri.compiler.NodeTest",
      "org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest",
      "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator",
      "org.apache.commons.jxpath.ri.model.beans.CollectionPointer",
      "org.apache.commons.jxpath.ri.compiler.NodeNameTest",
      "org.apache.commons.jxpath.ri.compiler.Step",
      "org.apache.commons.jxpath.ri.compiler.Expression",
      "org.apache.commons.jxpath.ri.compiler.Path",
      "org.apache.commons.jxpath.ri.compiler.LocationPath",
      "org.apache.commons.jxpath.ri.EvalContext",
      "org.apache.commons.jxpath.ri.axes.InitialContext",
      "org.apache.commons.jxpath.ri.axes.RootContext",
      "org.apache.commons.jxpath.ri.axes.ChildContext",
      "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer",
      "org.apache.commons.jxpath.util.ReverseComparator",
      "org.apache.commons.jxpath.ri.model.VariablePointer$1",
      "org.apache.commons.jxpath.ri.compiler.Operation",
      "org.apache.commons.jxpath.ri.compiler.CoreFunction",
      "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter",
      "org.apache.commons.jxpath.JXPathInvalidAccessException",
      "org.apache.commons.jxpath.ri.compiler.VariableReference",
      "org.apache.commons.jxpath.ri.compiler.NodeTypeTest",
      "org.apache.commons.jxpath.FunctionLibrary",
      "org.apache.commons.jxpath.JXPathNotFoundException",
      "org.apache.commons.jxpath.ri.compiler.Constant"
    );
  }
}
