import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue

class TestQueue(unittest.TestCase):
    def test_put_get(self):
        q = Queue()
        q.put(1)
        self.assertEqual(q.get(), 1)

    def test_put_nowait(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q.get_nowait(), 1)

    def test_full(self):
        q = Queue(maxsize=1)
        q.put(1)
        self.assertTrue(q.full())

    def test_empty(self):
        q = Queue()
        self.assertTrue(q.empty())

    def test_qsize(self):
        q = Queue()
        q.put(1)
        self.assertEqual(q.qsize(), 1)

    def test_put_get_timeout(self):
        q = Queue()
        future = q.get(timeout=0.1)
        self.assertFalse(future.done())

    def test_put_nowait_timeout(self):
        q = Queue()
        future = q.put_nowait(1, timeout=0.1)
        self.assertFalse(future.done())

    def test_put_get_cancel(self):
        q = Queue()
        future = q.get()
        future.cancel()
        self.assertTrue(future.cancelled())

    def test_put_nowait_cancel(self):
        q = Queue()
        future = q.put_nowait(1)
        future.cancel()
        self.assertTrue(future.cancelled())

class TestPriorityQueue(TestQueue):
    def test_put_get(self):
        q = PriorityQueue()
        q.put(1)
        self.assertEqual(q.get(), 1)

    def test_put_nowait(self):
        q = PriorityQueue()
        q.put_nowait(1)
        self.assertEqual(q.get_nowait(), 1)

    def test_full(self):
        q = PriorityQueue(maxsize=1)
        q.put(1)
        self.assertTrue(q.full())

    def test_empty(self):
        q = PriorityQueue()
        self.assertTrue(q.empty())

    def test_qsize(self):
        q = PriorityQueue()
        q.put(1)
        self.assertEqual(q.qsize(), 1)

    def test_put_get_timeout(self):
        q = PriorityQueue()
        future = q.get(timeout=0.1)
        self.assertFalse(future.done())

    def test_put_nowait_timeout(self):
        q = PriorityQueue()
        future = q.put_nowait(1, timeout=0.1)
        self.assertFalse(future.done())

    def test_put_get_cancel(self):
        q = PriorityQueue()
        future = q.get()
        future.cancel()
        self.assertTrue(future.cancelled())

    def test_put_nowait_cancel(self):
        q = PriorityQueue()
        future = q.put_nowait(1)
        future.cancel()
        self.assertTrue(future.cancelled())

class TestLifoQueue(TestQueue):
    def test_put_get(self):
        q = LifoQueue()
        q.put(1)
        self.assertEqual(q.get(), 1)

    def test_put_nowait(self):
        q = LifoQueue()
        q.put_nowait(1)
        self.assertEqual(q.get_nowait(), 1)

    def test_full(self):
        q = LifoQueue(maxsize=1)
        q.put(1)
        self.assertTrue(q.full())

    def test_empty(self):
        q = LifoQueue()
        self.assertTrue(q.empty())

    def test_qsize(self):
        q = LifoQueue()
        q.put(1)
        self.assertEqual(q.qsize(), 1)

    def test_put_get_timeout(self):
        q = LifoQueue()
        future = q.get(timeout=0.1)
        self.assertFalse(future.done())

    def test_put_nowait_timeout(self):
        q = LifoQueue()
        future = q.put_nowait(1, timeout=0.1)
        self.assertFalse(future.done())

if __name__ == '__main__':
    unittest.main()