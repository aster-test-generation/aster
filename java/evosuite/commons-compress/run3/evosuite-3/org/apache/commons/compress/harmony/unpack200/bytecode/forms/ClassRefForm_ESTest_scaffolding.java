
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


package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ClassRefForm_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm"; 
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
    java.lang.System.setProperty("user.dir", "/Users/mkim754/IdeaProjects/aster-benchmark/commons-compress-1.26.1"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ClassRefForm_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ShortForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.IMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm",
      "org.apache.commons.compress.harmony.pack200.Pack200Exception",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.MultiANewArrayForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm",
      "org.apache.commons.compress.harmony.unpack200.SegmentConstantPool",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.Attribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm",
      "org.apache.commons.compress.harmony.unpack200.Segment",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ClassRefForm_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ShortForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.IMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.MultiANewArrayForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm",
      "org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager",
      "org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry",
      "org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode",
      "org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPConstantNumber",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8",
      "org.apache.commons.compress.harmony.unpack200.bytecode.Attribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPMember",
      "org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPClass",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPLong",
      "org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPString",
      "org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPRef",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger",
      "org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation",
      "org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute",
      "org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue",
      "org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef",
      "org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation",
      "org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute"
    );
  }
}
