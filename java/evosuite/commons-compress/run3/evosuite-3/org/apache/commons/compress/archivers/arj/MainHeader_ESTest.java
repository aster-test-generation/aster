
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


package org.apache.commons.compress.archivers.arj;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.arj.MainHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MainHeader_ESTest extends MainHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.dateTimeCreated = (-1257);
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=-1257, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.reserved = 1;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=1, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.securityVersion = (-4898);
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=-4898, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.arjFlags = (-5105);
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=-5105, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.lastChapter = (-1501);
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=-1501, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.encryptionVersion = 474;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=474, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.minVersionToExtract = 1925;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=1925, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.securityEnvelopeLength = (-1);
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=-1, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.fileSpecPosition = 64;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=64, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.archiverVersionNumber = 32;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=32, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.securityEnvelopeFilePosition = (-971);
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=-971, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MainHeader.Flags mainHeader_Flags0 = new MainHeader.Flags();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MainHeader.HostOS mainHeader_HostOS0 = new MainHeader.HostOS();
  }
}
