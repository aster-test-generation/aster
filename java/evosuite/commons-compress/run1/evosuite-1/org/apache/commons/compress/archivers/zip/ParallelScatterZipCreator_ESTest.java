
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier;
import org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator;
import org.apache.commons.compress.archivers.zip.ScatterZipOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParallelScatterZipCreator_ESTest extends ParallelScatterZipCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      forkJoinPool0.awaitTermination(0L, timeUnit0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0);
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      parallelScatterZipCreator0.writeTo((ZipArchiveOutputStream) null);
      forkJoinPool0.isShutdown();
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry((ZipArchiveEntry) jarArchiveEntry0, inputStreamSupplier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
      ZipArchiveEntry zipArchiveEntry0 = null;
      parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry((ZipArchiveEntry) null, inputStreamSupplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ForkJoinPool forkJoinPool0 = new ForkJoinPool();
          DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier((Path) null);
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0, 0);
          String string0 = "BEST_EFFORT";
          // Undeclared exception!
          try { 
            defaultBackingStoreSupplier0.get();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Unable to create temporary file or directory
             //
             verifyException("java.nio.file.TempFileHelper", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      MockFile mockFile0 = new MockFile("'h{~dZ~$x+'|s");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0, 9);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
      OpenOption[] openOptionArray0 = new OpenOption[7];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.TRUNCATE_EXISTING;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        LinkOption.valueOf("'h{~dZ~$x+'|s");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant java.nio.file.LinkOption.'h{~dZ~$x+'|s
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(26121);
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0);
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntry$1");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.createCallable((ZipArchiveEntry) jarArchiveEntry0, inputStreamSupplier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      MockThread.getDefaultUncaughtExceptionHandler();
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(97, forkJoinPool_ForkJoinWorkerThreadFactory0, (Thread.UncaughtExceptionHandler) null, false);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0);
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submitStreamAwareCallable((Callable<? extends ScatterZipOutputStream>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ForkJoinTask$AdaptedCallable", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForkJoinTask.getPool();
      MockFile mockFile0 = new MockFile("", "(.");
      mockFile0.setReadable(false);
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null, defaultBackingStoreSupplier0, (-586));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntry0, inputStreamSupplier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
          ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadPoolExecutor_CallerRunsPolicy0);
          URI uRI0 = MockURI.aFileURI;
          MockFile mockFile0 = new MockFile(uRI0);
          String string0 = "";
          MockFile mockFile1 = new MockFile(mockFile0, "");
          Path path0 = mockFile1.toPath();
          DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
          // Undeclared exception!
          try { 
            defaultBackingStoreSupplier0.get();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/tmp/foo.bar/parallelscatter1009488561301872202n1\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixChannelFactory.open(UnixChannelFactory.java:247)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:136)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:148)
             // sun.nio.fs.UnixFileSystemProvider.newByteChannel(UnixFileSystemProvider.java:212)
             // java.nio.file.Files.newByteChannel(Files.java:361)
             // java.nio.file.Files.createFile(Files.java:632)
             // java.nio.file.TempFileHelper.create(TempFileHelper.java:138)
             // java.nio.file.TempFileHelper.createTempFile(TempFileHelper.java:161)
             // java.nio.file.Files.createTempFile(Files.java:852)
             // org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier.get(DefaultBackingStoreSupplier.java:64)
             // sun.reflect.GeneratedMethodAccessor87.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadFactory0, threadPoolExecutor_DiscardOldestPolicy0);
      BlockingQueue<Runnable> blockingQueue0 = scheduledThreadPoolExecutor0.getQueue();
      ThreadFactory threadFactory1 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(937, 937, 134695760L, timeUnit0, blockingQueue0, threadFactory1);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator(threadPoolExecutor0, (ScatterGatherBackingStoreSupplier) null, 586);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
          ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
          Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
          parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
          parallelScatterZipCreator0.getStatisticsMessage();
          String string0 = ", compressedSize=";
          String string1 = "8p>6]#Ft]sczJ,hoe~v";
          MockPrintStream mockPrintStream0 = null;
          try {
            mockPrintStream0 = new MockPrintStream(", compressedSize=", "8p>6]#Ft]sczJ,hoe~v");
            fail("Expecting exception: UnsupportedEncodingException");
          
          } catch(Throwable e) {
             //
             // 8p>6]#Ft]sczJ,hoe~v
             //
             verifyException("java.io.PrintStream", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(1024);
      MockFile mockFile0 = new MockFile("t77uu%B!ghuR[~2", "t77uu%B!ghuR[~2");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      assertNotNull(callable0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForkJoinTask.getPool();
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null);
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry((ZipEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
          MockFile mockFile0 = new MockFile("0=a", "{-fG7p]1B=lO");
          mockFile0.setWritable(true);
          Path path0 = mockFile0.toPath();
          DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0, defaultBackingStoreSupplier0);
          Callable<StandardOpenOption> callable0 = (Callable<StandardOpenOption>) mock(Callable.class, new ViolatedAssumptionAnswer());
          doReturn((Object) null).when(callable0).call();
          parallelScatterZipCreator0.submit(callable0);
          // Undeclared exception!
          try { 
            defaultBackingStoreSupplier0.get();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/Users/mkim754/IdeaProjects/aster-benchmark/commons-compress-1.26.1/0=a/{-fG7p]1B=lO/parallelscatter1220573724462946418n1\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixChannelFactory.open(UnixChannelFactory.java:247)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:136)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:148)
             // sun.nio.fs.UnixFileSystemProvider.newByteChannel(UnixFileSystemProvider.java:212)
             // java.nio.file.Files.newByteChannel(Files.java:361)
             // java.nio.file.Files.createFile(Files.java:632)
             // java.nio.file.TempFileHelper.create(TempFileHelper.java:138)
             // java.nio.file.TempFileHelper.createTempFile(TempFileHelper.java:161)
             // java.nio.file.Files.createTempFile(Files.java:852)
             // org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier.get(DefaultBackingStoreSupplier.java:64)
             // sun.reflect.GeneratedMethodAccessor87.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(889);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0);
      forkJoinPool0.isShutdown();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntry0, inputStreamSupplier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }
}
