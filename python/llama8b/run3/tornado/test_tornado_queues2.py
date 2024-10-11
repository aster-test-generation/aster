import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueEmpty, QueueFull
from tornado.concurrent import Future
from tornado.ioloop import IOLoop
import collections
import datetime
import heapq
import time

class TestQueue(unittest.TestCase):
    def test_queue_init(self):
        q = Queue(maxsize=5)
        self.assertEqual(q.maxsize, 5)
        self.assertEqual(q.qsize(), 0)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())

    def test_queue_put(self):
        q = Queue(maxsize=5)
        future = q.put(1, timeout=1)
        self.assertIsInstance(future, Future)
        result = q.get_nowait()
        self.assertEqual(result, 1)

    def test_queue_get(self):
        q = Queue(maxsize=5)
        q.put(1)
        result = q.get_nowait()
        self.assertEqual(result, 1)

    def test_queue_get_timeout(self):
        q = Queue(maxsize=5)
        future = q.get(timeout=1)
        self.assertIsInstance(future, Future)
        result = q.put_nowait(1)
        self.assertEqual(result, None)

    def test_queue_task_done(self):
        q = Queue(maxsize=5)
        q.task_done()
        self.assertEqual(q._unfinished_tasks, 0)

    def test_queue_join(self):
        q = Queue(maxsize=5)
        future = q.join(timeout=1)
        self.assertIsInstance(future, Future)
        result = q.put_nowait(1)
        self.assertEqual(result, None)

    def test_queue_repr(self):
        q = Queue(maxsize=5)
        self.assertEqual(repr(q), "<Queue at %s maxsize=5>" % hex(id(q)))

    def test_queue_str(self):
        q = Queue(maxsize=5)
        self.assertEqual(str(q), "<Queue maxsize=5>")

    def test_queue_full(self):
        q = Queue(maxsize=5)
        q.put(1)
        q.put(2)
        q.put(3)
        q.put(4)
        q.put(5)
        with self.assertRaises(QueueFull):
            q.put(6)

    def test_queue_empty(self):
        q = Queue(maxsize=5)
        with self.assertRaises(QueueEmpty):
            q.get_nowait()

    def test_queue_priority_queue(self):
        pq = PriorityQueue()
        pq.put(1)
        pq.put(2)
        pq.put(3)
        result = pq.get_nowait()
        self.assertEqual(result, 1)

    def test_queue_lifo_queue(self):
        lifo = LifoQueue()
        lifo.put(1)
        lifo.put(2)
        lifo.put(3)
        result = lifo.get_nowait()
        self.assertEqual(result, 3)

    def test_queue_timeout(self):
        q = Queue(maxsize=5)
        future = q.put(1, timeout=1)
        self.assertIsInstance(future, Future)
        time.sleep(1)
        with self.assertRaises(gen.TimeoutError):
            future.result()

if __name__ == '__main__':
    unittest.main()