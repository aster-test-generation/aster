from tornado.queues import Future
import collections
import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueEmpty, QueueFull, _set_timeout, _QueueIterator


class TestQueue(unittest.TestCase):
    def test_init(self):
        q = Queue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_maxsize(self):
        q = Queue(5)
        self.assertEqual(q.maxsize, 5)

    def test_qsize(self):
        q = Queue()
        q.put_nowait(1)
        q.put_nowait(2)
        self.assertEqual(q.qsize(), 2)

    def test_empty(self):
        q = Queue()
        self.assertTrue(q.empty())
        q.put_nowait(1)
        self.assertFalse(q.empty())

    def test_full(self):
        q = Queue(2)
        q.put_nowait(1)
        q.put_nowait(2)
        self.assertTrue(q.full())
        q.get_nowait()
        self.assertFalse(q.full())

    def test_put(self):
        q = Queue()
        future = q.put(1)
        self.assertTrue(future.done())
        self.assertEqual(q.qsize(), 1)

    def test_put_nowait(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q.qsize(), 1)

    def test_get(self):
        q = Queue()
        q.put_nowait(1)
        future = q.get()
        self.assertTrue(future.done())
        self.assertEqual(future.result(), 1)

    def test_get_nowait(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q.get_nowait(), 1)

    def test_task_done(self):
        q = Queue()
        q.put_nowait(1)
        q.task_done()
        self.assertEqual(q._unfinished_tasks, 0)

    def test_join(self):
        q = Queue()
        q.put_nowait(1)
        future = q.join()
        self.assertTrue(future.done())

    def test_aiter(self):
        q = Queue()
        q.put_nowait(1)
        q.put_nowait(2)
        iterator = q.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)

    def test__init(self):
        q = Queue()
        q._init()
        self.assertIsInstance(q._queue, collections.deque)

    def test__get(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q._get(), 1)

    def test__put(self):
        q = Queue()
        q._put(1)
        self.assertEqual(q.qsize(), 1)

    def test__put_internal(self):
        q = Queue()
        q.__put_internal(1)
        self.assertEqual(q.qsize(), 1)
        self.assertEqual(q._unfinished_tasks, 1)

    def test__consume_expired(self):
        q = Queue()
        q._putters.append((1, Future()))
        q._getters.append(Future())
        q._consume_expired()
        self.assertEqual(len(q._putters), 0)
        self.assertEqual(len(q._getters), 0)

    def test__repr__(self):
        q = Queue()
        self.assertEqual(q.__repr__(), "<Queue at 0x... maxsize=0 queue=deque([])>")

    def test__str__(self):
        q = Queue()
        self.assertEqual(q.__str__(), "<Queue maxsize=0>")

    def test__format(self):
        q = Queue()
        self.assertEqual(q._format(), "maxsize=0 queue=deque([])")

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        q = PriorityQueue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_put(self):
        q = PriorityQueue()
        q.put_nowait(2)
        q.put_nowait(1)
        self.assertEqual(q.qsize(), 2)
        self.assertEqual(q.get_nowait(), 1)

    def test_get(self):
        q = PriorityQueue()
        q.put_nowait(2)
        q.put_nowait(1)
        self.assertEqual(q.get_nowait(), 1)

class TestLifoQueue(unittest.TestCase):
    def test_init(self):
        q = LifoQueue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_put(self):
        q = LifoQueue()
        q.put_nowait(1)
        q.put_nowait(2)
        self.assertEqual(q.qsize(), 2)
        self.assertEqual(q.get_nowait(), 2)

if __name__ == '__main__':
    unittest.main()