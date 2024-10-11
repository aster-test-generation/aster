import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueFull, QueueEmpty, _set_timeout, _QueueIterator
from tornado.concurrent import Future
from tornado.locks import Event
import datetime

class TestQueue(unittest.TestCase):
    def test_init(self):
        q = Queue()
        self.assertEqual(q.maxsize, 0)
        self.assertTrue(q._finished.is_set())

    def test_maxsize(self):
        q = Queue(5)
        self.assertEqual(q.maxsize, 5)

    def test_qsize(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q.qsize(), 1)

    def test_empty(self):
        q = Queue()
        self.assertTrue(q.empty())

    def test_full(self):
        q = Queue(1)
        q.put_nowait(1)
        self.assertTrue(q.full())

    def test_put_nowait(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q.qsize(), 1)

    def test_put(self):
        q = Queue()
        future = q.put(1)
        self.assertTrue(future.done())

    def test_get_nowait(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q.get_nowait(), 1)

    def test_get(self):
        q = Queue()
        q.put_nowait(1)
        future = q.get()
        self.assertTrue(future.done())
        self.assertEqual(future.result(), 1)

    def test_task_done(self):
        q = Queue()
        q.put_nowait(1)
        q.get_nowait()
        q.task_done()
        self.assertEqual(q._unfinished_tasks, 0)

    def test_join(self):
        q = Queue()
        future = q.join()
        self.assertTrue(future.done())

    def test_aiter(self):
        q = Queue()
        iterator = q.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)

    def test_private_put_internal(self):
        q = Queue()
        q._Queue__put_internal(1)
        self.assertEqual(q.qsize(), 1)

    def test_private_repr(self):
        q = Queue()
        repr_str = q.__repr__()
        self.assertIn("Queue", repr_str)

    def test_private_str(self):
        q = Queue()
        str_repr = q.__str__()
        self.assertIn("Queue", str_repr)

    def test_protected_format(self):
        q = Queue()
        format_str = q._format()
        self.assertIn("maxsize=0", format_str)

    def test_protected_init(self):
        q = Queue()
        q._init()
        self.assertIsInstance(q._queue, collections.deque)

    def test_protected_get(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q._get(), 1)

    def test_protected_put(self):
        q = Queue()
        q._put(1)
        self.assertEqual(q.qsize(), 1)

    def test_protected_consume_expired(self):
        q = Queue()
        q._consume_expired()
        self.assertEqual(len(q._putters), 0)
        self.assertEqual(len(q._getters), 0)

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        q = PriorityQueue()
        self.assertIsInstance(q._queue, list)

    def test_put(self):
        q = PriorityQueue()
        q.put_nowait(1)
        self.assertEqual(q.qsize(), 1)

    def test_get(self):
        q = PriorityQueue()
        q.put_nowait(1)
        self.assertEqual(q.get_nowait(), 1)

class TestLifoQueue(unittest.TestCase):
    def test_init(self):
        q = LifoQueue()
        self.assertIsInstance(q._queue, list)

    def test_put(self):
        q = LifoQueue()
        q.put_nowait(1)
        self.assertEqual(q.qsize(), 1)

    def test_get(self):
        q = LifoQueue()
        q.put_nowait(1)
        self.assertEqual(q.get_nowait(), 1)

class TestSetTimeout(unittest.TestCase):
    def test_set_timeout(self):
        future = Future()
        _set_timeout(future, 1)
        self.assertFalse(future.done())

class TestQueueIterator(unittest.TestCase):
    def test_anext(self):
        q = Queue()
        iterator = _QueueIterator(q)
        future = iterator.__anext__()
        self.assertIsInstance(future, Future)

if __name__ == '__main__':
    unittest.main()