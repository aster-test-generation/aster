/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ParallelScatterZipCreator_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getStatisticsMessageTest3_Xdns2_1() {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    ParallelScatterZipCreator parallelScatterZipCreator = new ParallelScatterZipCreator(executorService);
    ScatterStatistics statistics = parallelScatterZipCreator.getStatisticsMessage();
    assertEquals(0, statistics.getMergingElapsed());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getStatisticsMessageTest4_Qhki3_1() {
    ParallelScatterZipCreator parallelScatterZipCreator = new ParallelScatterZipCreator();
    ScatterStatistics statistics = parallelScatterZipCreator.getStatisticsMessage();
    assertEquals(0, statistics.getMergingElapsed());}
}