
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


package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.jxpath.ExtendedKeyManager;
import org.apache.commons.jxpath.KeyManager;
import org.apache.commons.jxpath.util.KeyManagerUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class KeyManagerUtils_ESTest extends KeyManagerUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KeyManager keyManager0 = mock(KeyManager.class, new ViolatedAssumptionAnswer());
      ExtendedKeyManager extendedKeyManager0 = KeyManagerUtils.getExtendedKeyManager(keyManager0);
      ExtendedKeyManager extendedKeyManager1 = KeyManagerUtils.getExtendedKeyManager(extendedKeyManager0);
      assertSame(extendedKeyManager0, extendedKeyManager1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeyManagerUtils keyManagerUtils0 = new KeyManagerUtils();
  }
}
