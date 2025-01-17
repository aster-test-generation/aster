/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_EventFilesCheckpoint_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextFile_XbCL0_CHQz0() {
    EventFilesCheckpoint eventFilesCheckpoint = new EventFilesCheckpoint();
    ArrayList<File> files = new ArrayList<>();
    files.add(new File("file1"));
    files.add(new File("file2"));
    files.add(new File("file3"));
    eventFilesCheckpoint.setFiles(files);
    File result = eventFilesCheckpoint.currentFile();
    assertEquals(files.get(0), result);
}
}