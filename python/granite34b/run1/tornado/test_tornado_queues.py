import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueFull, QueueEmpty


class TestQueue(unittest.TestCase):
    def test_put_nowait(self):
        q = Queue(maxsize=2)
        q.put_nowait(1)
        q.put_nowait(2)
        with self.assertRaises(QueueFull):
            q.put_nowait(3)

    def test_get_nowait(self):
        q = Queue(maxsize=2)
        q.put_nowait(1)
        q.put_nowait(2)
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.get_nowait(), 2)
        with self.assertRaises(QueueEmpty):
            q.get_nowait()

class TestPriorityQueue(unittest.TestCase):
    def test_put_nowait(self):
        q = PriorityQueue()
        q.put_nowait(3)
        q.put_nowait(1)
        q.put_nowait(2)
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.get_nowait(), 2)
        self.assertEqual(q.get_nowait(), 3)

class TestLifoQueue(unittest.TestCase):
    def test_put_nowait(self):
        q = LifoQueue()
        q.put_nowait(1)
        q.put_nowait(2)
        q.put_nowait(3)
        self.assertEqual(q.get_nowait(), 3)
        self.assertEqual(q.get_nowait(), 2)
        self.assertEqual(q.get_nowait(), 1)

if __name__ == '__main__':
    unittest.main()