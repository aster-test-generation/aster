from tornado.queues import _set_timeout
import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueEmpty, QueueFull
from tornado.concurrent import Future
from tornado.ioloop import IOLoop
from collections import deque
import datetime
import heapq
import time


class TestQueue(unittest.TestCase):
    def test_queue_init(self):
        q = Queue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_queue_put(self):
        q = Queue()
        future = q.put(1, timeout=1)
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())
        q.get_nowait()
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())

    def test_queue_get(self):
        q = Queue()
        q.put(1)
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())

    def test_queue_full(self):
        q = Queue(maxsize=1)
        q.put(1)
        with self.assertRaises(QueueFull):
            q.put(2)

    def test_queue_empty(self):
        q = Queue()
        with self.assertRaises(QueueEmpty):
            q.get_nowait()

    def test_queue_task_done(self):
        q = Queue()
        q.task_done()
        with self.assertRaises(ValueError):
            q.task_done()

    def test_queue_join(self):
        q = Queue()
        q.join()
        self.assertTrue(q._finished.is_set())

    def test_queue_repr(self):
        q = Queue()
        self.assertEqual(repr(q), "<Queue at %s %s>" % (hex(id(q)), q._format()))

    def test_queue_str(self):
        q = Queue()
        self.assertEqual(str(q), "<Queue %s>" % q._format())

    def test_queue_format(self):
        q = Queue()
        self.assertEqual(q._format(), "maxsize=0")

    def test_queue_get_timeout(self):
        q = Queue()
        future = q.get(timeout=1)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())

    def test_queue_put_timeout(self):
        q = Queue()
        future = q.put(1, timeout=1)
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())

    def test_queue_priority_queue(self):
        pq = PriorityQueue()
        pq.put(1)
        pq.put(2)
        self.assertEqual(pq.get_nowait(), 1)

    def test_queue_lifo_queue(self):
        lifo = LifoQueue()
        lifo.put(1)
        lifo.put(2)
        self.assertEqual(lifo.get_nowait(), 2)

    def test_queue_set_timeout(self):
        future = Future()
        _set_timeout(future, 1)
        self.assertFalse(future.done())

    def test_queue_getters(self):
        q = Queue()
        q.put(1)
        q.put(2)
        self.assertEqual(q.get_nowait(), 1)

    def test_queue_putters(self):
        q = Queue()
        q.put(1)
        q.put(2)
        self.assertEqual(q.get_nowait(), 1)

    def test_queue_consume_expired(self):
        q = Queue()
        q.put(1)
        q.put(2)
        q._consume_expired()
        self.assertEqual(q.qsize(), 1)

    def test_queue_init_queue(self):
        q = Queue()
        self.assertEqual(q._queue, deque())

    def test_queue_init_priority_queue(self):
        pq = PriorityQueue()
        self.assertEqual(pq._queue, [])

    def test_queue_init_lifo_queue(self):
        lifo = LifoQueue()
        self.assertEqual(lifo._queue, [])

    def test_queue_get_queue(self):
        q = Queue()
        self.assertEqual(q._get(), None)

    def test_queue_put_queue(self):
        q = Queue()
        q._put(1)
        self.assertEqual(q._queue, deque([1]))

    def test_queue_get_priority_queue(self):
        pq = PriorityQueue()
        self.assertEqual(pq._get(), None)

    def test_queue_put_priority_queue(self):
        pq = PriorityQueue()
        pq._put(1)
        self.assertEqual(pq._queue, [1])

    def test_queue_get_lifo_queue(self):
        lifo = LifoQueue()
        self.assertEqual(lifo._get(), None)

    def test_queue_put_lifo_queue(self):
        lifo = LifoQueue()
        lifo._put(1)
        self.assertEqual(lifo._queue, [1])

if __name__ == '__main__':
    unittest.main()