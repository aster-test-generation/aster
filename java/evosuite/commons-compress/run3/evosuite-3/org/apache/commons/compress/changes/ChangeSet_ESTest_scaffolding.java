
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


package org.apache.commons.compress.changes;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ChangeSet_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.compress.changes.ChangeSet"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.name", "mkim754"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ChangeSet_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.compress.archivers.ArchiveEntry",
      "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE",
      "org.apache.commons.compress.changes.ChangeSet",
      "org.apache.commons.compress.changes.Change",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TYPE",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader",
      "org.apache.commons.compress.changes.Change$ChangeType",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, ChangeSet_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ChangeSet_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.compress.changes.ChangeSet",
      "org.apache.commons.compress.changes.Change$ChangeType",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader",
      "org.apache.commons.compress.changes.Change",
      "org.apache.commons.compress.archivers.tar.TarArchiveEntry",
      "org.apache.commons.compress.utils.IOUtils",
      "org.apache.commons.compress.archivers.zip.NioZipEncoding",
      "org.apache.commons.compress.archivers.zip.ZipEncodingHelper",
      "org.apache.commons.compress.archivers.tar.TarUtils",
      "org.apache.commons.compress.archivers.zip.ZipShort",
      "org.apache.commons.compress.archivers.zip.X000A_NTFS",
      "org.apache.commons.compress.archivers.zip.ZipEightByteInteger",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$PERMISSION",
      "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp",
      "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry",
      "org.apache.commons.compress.utils.ByteUtils",
      "org.apache.commons.compress.archivers.ar.ArArchiveEntry",
      "org.apache.commons.compress.archivers.zip.ZipArchiveEntry",
      "org.apache.commons.compress.archivers.jar.JarArchiveEntry",
      "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry",
      "org.apache.commons.compress.archivers.zip.GeneralPurposeBit",
      "org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource",
      "org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TYPE"
    );
  }
}
