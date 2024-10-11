from tornado.queues import Future
import collections
import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueEmpty, QueueFull, _set_timeout, _QueueIterator
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueEmpty, QueueFull


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
        q._put(1)
        q._put(2)
        self.assertEqual(q.qsize(), 2)

    def test_empty(self):
        q = Queue()
        self.assertTrue(q.empty())
        q._put(1)
        self.assertFalse(q.empty())

    def test_full(self):
        q = Queue(2)
        self.assertFalse(q.full())
        q._put(1)
        q._put(2)
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
        q._put(1)
        future = q.get()
        self.assertTrue(future.done())
        self.assertEqual(future.result(), 1)

    def test_get_nowait(self):
        q = Queue()
        q._put(1)
        self.assertEqual(q.get_nowait(), 1)

    def test_task_done(self):
        q = Queue()
        q._unfinished_tasks = 1
        q.task_done()
        self.assertEqual(q._unfinished_tasks, 0)

    def test_join(self):
        q = Queue()
        q._unfinished_tasks = 1
        future = q.join()
        self.assertTrue(future.done())

    def test_aiter(self):
        q = Queue()
        q._put(1)
        q._put(2)
        iterator = q.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)

    def test_init_private(self):
        q = Queue()
        q._init()
        self.assertIsInstance(q._queue, collections.deque)

    def test_put_internal_private(self):
        q = Queue()
        q.__put_internal(1)
        self.assertEqual(q.qsize(), 1)

    def test_consume_expired_private(self):
        q = Queue()
        q._putters.append((1, Future()))
        q._consume_expired()
        self.assertEqual(len(q._putters), 0)

    def test_repr_magic(self):
        q = Queue()
        self.assertIsInstance(q.__repr__(), str)

    def test_str_magic(self):
        q = Queue()
        self.assertIsInstance(q.__str__(), str)

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        q = PriorityQueue()
        self.assertIsInstance(q._queue, list)

    def test_put(self):
        q = PriorityQueue()
        q._put(1)
        self.assertEqual(q._queue, [1])

    def test_get(self):
        q = PriorityQueue()
        q._put(1)
        self.assertEqual(q._get(), 1)

class TestLifoQueue(unittest.TestCase):
    def test_init(self):
        q = LifoQueue()
        self.assertIsInstance(q._queue, list)

    def test_put(self):
        q = LifoQueue()
        q._put(1)
        self.assertEqual(q._queue, [1])

    def test_get(self):
        q = LifoQueue()
        q._put(1)
        self.assertEqual(q._get(), 1)

class TestQueueEmpty(unittest.TestCase):
    def test_init(self):
        e = QueueEmpty()
        self.assertIsInstance(e, Exception)

class TestQueueFull(unittest.TestCase):
    def test_init(self):
        e = QueueFull()
        self.assertIsInstance(e, Exception)

class TestSetTimeout(unittest.TestCase):
    def test_set_timeout(self):
        future = Future()
        _set_timeout(future, 1)
        self.assertTrue(future.done())

class TestQueue(unittest.TestCase):
    def test_init(self):
        q = Queue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_maxsize(self):
        q = Queue(maxsize=10)
        self.assertEqual(q.maxsize, 10)

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
        q = Queue(maxsize=2)
        self.assertFalse(q.full())
        q._queue = [1, 2]
        self.assertTrue(q.full())

    def test_put(self):
        q = Queue()
        future = q.put(1)
        self.assertEqual(future.result(), None)
        self.assertEqual(q.qsize(), 1)

    def test_put_nowait(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q.qsize(), 1)

    def test_get(self):
        q = Queue()
        q._queue = [1]
        future = q.get()
        self.assertEqual(future.result(), 1)
        self.assertEqual(q.qsize(), 0)

    def test_get_nowait(self):
        q = Queue()
        q._queue = [1]
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.qsize(), 0)

    def test_task_done(self):
        q = Queue()
        q._unfinished_tasks = 1
        q.task_done()
        self.assertEqual(q._unfinished_tasks, 0)

    def test_join(self):
        q = Queue()
        future = q.join()
        self.assertEqual(future.result(), None)

    def test_aiter(self):
        q = Queue()
        q._queue = [1, 2, 3]
        iterator = q.__aiter__()
        self.assertEqual(iterator.__anext__().result(), 1)

    def test_init_private(self):
        q = Queue()
        q._init()
        self.assertEqual(q._queue, [])

    def test_put_internal_private(self):
        q = Queue()
        q.__put_internal(1)
        self.assertEqual(q._unfinished_tasks, 1)
        self.assertEqual(q._queue, [1])

    def test_consume_expired_private(self):
        q = Queue()
        q._putters = [(1, Future()), (2, Future())]
        q._consume_expired()
        self.assertEqual(q._putters, [(2, Future())])

    def test_repr_magic(self):
        q = Queue()
        self.assertEqual(q.__repr__(), "<Queue at 0x... maxsize=0 queue=[]>")

    def test_str_magic(self):
        q = Queue()
        self.assertEqual(q.__str__(), "<Queue maxsize=0>")

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        q = PriorityQueue()
        self.assertEqual(q._queue, [])

    def test_put(self):
        q = PriorityQueue()
        q._put(1)
        self.assertEqual(q._queue, [1])

    def test_get(self):
        q = PriorityQueue()
        q._queue = [1, 2, 3]
        self.assertEqual(q._get(), 1)

class TestLifoQueue(unittest.TestCase):
    def test_init(self):
        q = LifoQueue()
        self.assertEqual(q._queue, [])

    def test_put(self):
        q = LifoQueue()
        q._put(1)
        self.assertEqual(q._queue, [1])

    def test_get(self):
        q = LifoQueue()
        q._queue = [1, 2, 3]
        self.assertEqual(q._get(), 3)

if __name__ == '__main__':
    unittest.main()