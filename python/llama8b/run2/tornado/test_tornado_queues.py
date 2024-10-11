import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueEmpty, QueueFull
from tornado.concurrent import Future
from tornado.ioloop import IOLoop
from datetime import timedelta
import collections
import heapq


class TestQueue(unittest.TestCase):
    def test_queue_init(self):
        q = Queue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_queue_put(self):
        q = Queue()
        future = q.put(1, timeout=timedelta(seconds=1))
        self.assertIsInstance(future, Future)

    def test_queue_get(self):
        q = Queue()
        future = q.get(timeout=timedelta(seconds=1))
        self.assertIsInstance(future, Future)

    def test_queue_task_done(self):
        q = Queue()
        q.task_done()

    def test_queue_join(self):
        q = Queue()
        future = q.join(timeout=timedelta(seconds=1))
        self.assertIsInstance(future, Future)

    def test_queue_aiter(self):
        q = Queue()
        iterator = q.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)

    def test_queue_str(self):
        q = Queue()
        self.assertEqual(str(q), "<Queue 0>")

    def test_queue_repr(self):
        q = Queue()
        self.assertEqual(repr(q), "<Queue at 0x... 0>")

    def test_queue_private_method(self):
        q = Queue()
        with self.assertRaises(AttributeError):
            q.__private_method()

    def test_queue_protected_method(self):
        q = Queue()
        with self.assertRaises(AttributeError):
            q._Queue__private_method()

    def test_queue_magic_method(self):
        q = Queue()
        self.assertEqual(q.__str__(), "<Queue 0>")
        self.assertEqual(q.__repr__(), "<Queue at 0x... 0>")

class TestPriorityQueue(unittest.TestCase):
    def test_priority_queue_init(self):
        pq = PriorityQueue()
        self.assertEqual(pq.maxsize, 0)
        self.assertEqual(pq.qsize(), 0)
        self.assertTrue(pq.empty())
        self.assertFalse(pq.full())

    def test_priority_queue_put(self):
        pq = PriorityQueue()
        future = pq.put(1, timeout=timedelta(seconds=1))
        self.assertIsInstance(future, Future)

    def test_priority_queue_get(self):
        pq = PriorityQueue()
        future = pq.get(timeout=timedelta(seconds=1))
        self.assertIsInstance(future, Future)

    def test_priority_queue_task_done(self):
        pq = PriorityQueue()
        pq.task_done()

    def test_priority_queue_join(self):
        pq = PriorityQueue()
        future = pq.join(timeout=timedelta(seconds=1))
        self.assertIsInstance(future, Future)

    def test_priority_queue_aiter(self):
        pq = PriorityQueue()
        iterator = pq.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)

    def test_priority_queue_str(self):
        pq = PriorityQueue()
        self.assertEqual(str(pq), "<PriorityQueue 0>")

    def test_priority_queue_repr(self):
        pq = PriorityQueue()
        self.assertEqual(repr(pq), "<PriorityQueue at 0x... 0>")

    def test_priority_queue_private_method(self):
        pq = PriorityQueue()
        with self.assertRaises(AttributeError):
            pq.__private_method()

    def test_priority_queue_protected_method(self):
        pq = PriorityQueue()
        with self.assertRaises(AttributeError):
            pq._PriorityQueue__private_method()

    def test_priority_queue_magic_method(self):
        pq = PriorityQueue()
        self.assertEqual(pq.__str__(), "<PriorityQueue 0>")
        self.assertEqual(pq.__repr__(), "<PriorityQueue at 0x... 0>")

class TestLifoQueue(unittest.TestCase):
    def test_lifo_queue_init(self):
        li = LifoQueue()
        self.assertEqual(li.maxsize, 0)
        self.assertEqual(li.qsize(), 0)
        self.assertTrue(li.empty())
        self.assertFalse(li.full())

    def test_lifo_queue_put(self):
        li = LifoQueue()
        future = li.put(1, timeout=timedelta(seconds=1))
        self.assertIsInstance(future, Future)

    def test_lifo_queue_get(self):
        li = LifoQueue()
        future = li.get(timeout=timedelta(seconds=1))
        self.assertIsInstance(future, Future)

    def test_lifo_queue_task_done(self):
        li = LifoQueue()
        li.task_done()

    def test_lifo_queue_join(self):
        li = LifoQueue()
        future = li.join(timeout=timedelta(seconds=1))
        self.assertIsInstance(future, Future)

if __name__ == '__main__':
    unittest.main()