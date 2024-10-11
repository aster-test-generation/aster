import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue

class TestQueue(unittest.TestCase):
    def test_queue_put_get(self):
        q = Queue()
        q.put(1)
        q.put(2)
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.get_nowait(), 2)

    def test_queue_put_get_async(self):
        q = Queue()
        future1 = q.put(1)
        future2 = q.put(2)
        future3 = q.get()
        future4 = q.get()
        self.assertEqual(q.qsize(), 2)
        future_set_result_unless_cancelled(future1, None)
        future_set_result_unless_cancelled(future2, None)
        self.assertEqual(q.qsize(), 0)
        self.assertEqual(future3.result(), 1)
        self.assertEqual(future4.result(), 2)

    def test_queue_full(self):
        q = Queue(maxsize=1)
        q.put(1)
        self.assertRaises(QueueFull, q.put, 2)

    def test_queue_empty(self):
        q = Queue()
        self.assertTrue(q.empty())
        q.put(1)
        self.assertFalse(q.empty())
        q.get_nowait()
        self.assertTrue(q.empty())

    def test_queue_iterator(self):
        q = Queue()
        q.put(1)
        q.put(2)
        self.assertEqual(list(q), [1, 2])

class TestPriorityQueue(TestQueue):
    def test_priority_queue(self):
        q = PriorityQueue()
        q.put(2)
        q.put(1)
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.get_nowait(), 2)

class TestLifoQueue(TestQueue):
    def test_lifo_queue(self):
        q = LifoQueue()
        q.put(1)
        q.put(2)
        self.assertEqual(q.get_nowait(), 2)
        self.assertEqual(q.get_nowait(), 1)

if __name__ == '__main__':
    unittest.main()