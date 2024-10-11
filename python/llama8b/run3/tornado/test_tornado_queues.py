import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueEmpty, QueueFull
from tornado.concurrent import Future
from tornado.ioloop import IOLoop
from datetime import timedelta
from collections import deque
from tornado.queues import Queue, PriorityQueue, LifoQueue
import collections
import heapq
import datetime
import time


class TestQueue(unittest.TestCase):
    def test_init(self):
        q = Queue(maxsize=5)
        self.assertEqual(q.maxsize, 5)
        self.assertEqual(q.qsize(), 0)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())

    def test_put(self):
        q = Queue(maxsize=5)
        future = q.put(1, timeout=timedelta(seconds=1))
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())

    def test_get(self):
        q = Queue(maxsize=5)
        q.put(1)
        q.put(2)
        result = q.get()
        self.assertEqual(result, 1)
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())

    def test_get_nowait(self):
        q = Queue(maxsize=5)
        q.put(1)
        q.put(2)
        result = q.get_nowait()
        self.assertEqual(result, 1)
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())

    def test_put_nowait(self):
        q = Queue(maxsize=5)
        q.put(1)
        q.put_nowait(2)
        self.assertEqual(q.qsize(), 2)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())

    def test_task_done(self):
        q = Queue(maxsize=5)
        q.task_done()
        self.assertEqual(q._unfinished_tasks, 0)

    def test_join(self):
        q = Queue(maxsize=5)
        future = q.join(timeout=timedelta(seconds=1))
        self.assertEqual(future.result(), None)

    def test_repr(self):
        q = Queue(maxsize=5)
        self.assertEqual(repr(q), "<Queue at %s maxsize=5>" % hex(id(q)))

    def test_str(self):
        q = Queue(maxsize=5)
        self.assertEqual(str(q), "<Queue maxsize=5>")

    def test_empty(self):
        q = Queue(maxsize=5)
        self.assertTrue(q.empty())

    def test_full(self):
        q = Queue(maxsize=5)
        q.put(1)
        q.put(2)
        self.assertTrue(q.full())

    def test_put_timeout(self):
        q = Queue(maxsize=5)
        future = q.put(1, timeout=timedelta(seconds=1))
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(future.done())

    def test_get_timeout(self):
        q = Queue(maxsize=5)
        future = q.get(timeout=timedelta(seconds=1))
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(future.done())

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        pq = PriorityQueue()
        self.assertEqual(pq.maxsize, 0)
        self.assertEqual(pq.qsize(), 0)
        self.assertTrue(pq.empty())
        self.assertFalse(pq.full())

    def test_put(self):
        pq = PriorityQueue()
        pq.put(1)
        pq.put(2)
        result = pq.get()
        self.assertEqual(result, 1)
        self.assertEqual(pq.qsize(), 1)
        self.assertFalse(pq.empty())
        self.assertFalse(pq.full())

    def test_get(self):
        pq = PriorityQueue()
        pq.put(1)
        pq.put(2)
        result = pq.get()
        self.assertEqual(result, 1)
        self.assertEqual(pq.qsize(), 1)
        self.assertFalse(pq.empty())
        self.assertFalse(pq.full())

class TestLifoQueue(unittest.TestCase):
    def test_init(self):
        li = LifoQueue()
        self.assertEqual(li.maxsize, 0)
        self.assertEqual(li.qsize(), 0)
        self.assertTrue(li.empty())
        self.assertFalse(li.full())

    def test_put(self):
        li = LifoQueue()
        li.put(1)
        li.put(2)
        result = li.get()
        self.assertEqual(result, 2)
        self.assertEqual(li.qsize(), 1)
        self.assertFalse(li.empty())
        self.assertFalse(li.full())

    def test_get(self):
        li = LifoQueue()
        li.put(1)
        li.put(2)
        result = li.get()
        self.assertEqual(result, 2)
        self.assertEqual(li.qsize(), 1)
        self.assertFalse(li.empty())
        self.assertFalse(li.full())

class TestQueue(unittest.TestCase):
    def test_queue_init(self):
        q = Queue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertFalse(q.empty())
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

    def test_queue_str(self):
        q = Queue()
        self.assertEqual(str(q), "<Queue 0>")

    def test_queue_repr(self):
        q = Queue()
        self.assertEqual(repr(q), "<Queue at 0x%x 0>" % id(q))

    def test_queue_put_nowait(self):
        q = Queue()
        q.put_nowait(1)

    def test_queue_get_nowait(self):
        q = Queue()
        q.get_nowait()

    def test_queue_full(self):
        q = Queue(maxsize=1)
        q.put_nowait(1)
        with self.assertRaises(QueueFull):
            q.put_nowait(2)

    def test_queue_empty(self):
        q = Queue()
        with self.assertRaises(QueueEmpty):
            q.get_nowait()

    def test_queue_timeout(self):
        q = Queue()
        future = q.put(1, timeout=timedelta(seconds=1))
        with self.assertRaises(gen.TimeoutError):
            future.result()

    def test_queue_iterator(self):
        q = Queue()
        iterator = q.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)

    def test_queue_private_methods(self):
        q = Queue()
        q._init()
        q._get()
        q._put(1)
        q._consume_expired()

class TestPriorityQueue(unittest.TestCase):
    def test_priority_queue_init(self):
        pq = PriorityQueue()
        self.assertEqual(pq.maxsize, 0)
        self.assertEqual(pq.qsize(), 0)
        self.assertFalse(pq.empty())
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

    def test_priority_queue_str(self):
        pq = PriorityQueue()
        self.assertEqual(str(pq), "<PriorityQueue 0>")

    def test_priority_queue_repr(self):
        pq = PriorityQueue()
        self.assertEqual(repr(pq), "<PriorityQueue at 0x%x 0>" % id(pq))

    def test_priority_queue_put_nowait(self):
        pq = PriorityQueue()
        pq.put_nowait(1)

    def test_priority_queue_get_nowait(self):
        pq = PriorityQueue()
        pq.get_nowait()

    def test_priority_queue_full(self):
        pq = PriorityQueue(maxsize=1)
        pq.put_nowait(1)
        with self.assertRaises(QueueFull):
            pq.put_nowait(2)

    def test_priority_queue_empty(self):
        pq = PriorityQueue()
        with self.assertRaises(QueueEmpty):
            pq.get_nowait()

    def test_priority_queue_timeout(self):
        pq = PriorityQueue()
        future = pq.put(1, timeout=timedelta(seconds=1))
        with self.assertRaises(gen.TimeoutError):
            future.result()

    def test_priority_queue_iterator(self):
        pq = PriorityQueue()
        iterator = pq.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)

    def test_priority_queue_private_methods(self):
        pq = PriorityQueue()
        pq._init()
        pq._get()
        pq._put(1)
        pq._consume_expired()

class TestLifoQueue(unittest.TestCase):
    def test_lifo_queue_init(self):
        li = LifoQueue()
        self.assertEqual(li.maxsize, 0)
        self.assertEqual(li.qsize(), 0)
        self.assertFalse(li.empty())
        self.assertFalse(li.full())

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