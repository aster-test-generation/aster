/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CollectionChildNodeIterator_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetElementNodeIterator_ZXvL0() {
		CollectionChildNodeIterator collectionChildNodeIterator = new CollectionChildNodeIterator(null, null, false, null);
		NodeIterator elementNodeIterator = collectionChildNodeIterator.getElementNodeIterator(null);
	}
}