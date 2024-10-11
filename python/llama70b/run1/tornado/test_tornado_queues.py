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
        q._queue = [1, 2, 3]
        self.assertEqual(q.qsize(), 3)

    def test_empty(self):
        q = Queue()
        self.assertTrue(q.empty())
        q._queue = [1]
        self.assertFalse(q.empty())

    def test_full(self):
        q = Queue(5)
        self.assertFalse(q.full())
        q._queue = [1, 2, 3, 4, 5]
        self.assertTrue(q.full())

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
        q._unfinished_tasks = 1
        q.task_done()
        self.assertEqual(q._unfinished_tasks, 0)

    def test_join(self):
        q = Queue()
        future = q.join()
        self.assertTrue(future.done())

    def test_aiter(self):
        q = Queue()
        q.put_nowait(1)
        q.put_nowait(2)
        iterator = q.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)
        self.assertEqual(iterator.__anext__().result(), 1)
        self.assertEqual(iterator.__anext__().result(), 2)

    def test__init(self):
        q = Queue()
        q._init()
        self.assertIsInstance(q._queue, collections.deque)

    def test__put_internal(self):
        q = Queue()
        q._unfinished_tasks = 0
        q.__put_internal(1)
        self.assertEqual(q._unfinished_tasks, 1)

    def test__get(self):
        q = Queue()
        q._queue = [1, 2, 3]
        self.assertEqual(q._get(), 1)

    def test__put(self):
        q = Queue()
        q._put(1)
        self.assertEqual(q._queue, [1])

    def test__consume_expired(self):
        q = Queue()
        q._putters = [(1, Future()), (2, Future())]
        q._getters = [Future(), Future()]
        q._consume_expired()
        self.assertEqual(q._putters, [])
        self.assertEqual(q._getters, [])

    def test__repr(self):
        q = Queue()
        self.assertIsInstance(q.__repr__(), str)

    def test__str(self):
        q = Queue()
        self.assertIsInstance(q.__str__(), str)

    def test__format(self):
        q = Queue()
        self.assertIsInstance(q._format(), str)

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        q = PriorityQueue()
        self.assertIsInstance(q._queue, list)

    def test_put(self):
        q = PriorityQueue()
        q.put(1)
        self.assertEqual(q._queue, [1])

    def test_get(self):
        q = PriorityQueue()
        q.put(1)
        self.assertEqual(q.get(), 1)

class TestLifoQueue(unittest.TestCase):
    def test_init(self):
        q = LifoQueue()
        self.assertIsInstance(q._queue, list)

    def test_put(self):
        q = LifoQueue()
        q.put(1)
        self.assertEqual(q._queue, [1])

    def test_get(self):
        q = LifoQueue()
        q.put(1)
        self.assertEqual(q.get(), 1)

class TestQueueEmpty(unittest.TestCase):
    def test_init(self):
        qe = QueueEmpty()
        self.assertIsInstance(qe, Exception)

class TestQueueFull(unittest.TestCase):
    def test_init(self):
        qf = QueueFull()
        self.assertIsInstance(qf, Exception)


if __name__ == '__main__':
    unittest.main()