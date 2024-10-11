import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue

class TestQueue(unittest.TestCase):
    def test_queue_put_get(self):
        q = Queue()
        q.put(1)
        self.assertEqual(q.get_nowait(), 1)

    def test_queue_put_get_async(self):
        q = Queue()
        future = q.put(1)
        self.assertEqual(q.get_nowait(), 1)
        future.add_done_callback(lambda f: q.put(2))
        self.assertEqual(q.get_nowait(), 2)

    def test_queue_full(self):
        q = Queue(maxsize=1)
        q.put(1)
        with self.assertRaises(QueueFull):
            q.put(2)

    def test_queue_empty(self):
        q = Queue()
        with self.assertRaises(QueueEmpty):
            q.get_nowait()

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