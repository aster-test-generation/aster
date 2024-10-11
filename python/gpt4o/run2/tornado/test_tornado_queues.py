import unittest
import datetime
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueFull, QueueEmpty, _set_timeout, _QueueIterator
from tornado.concurrent import Future
from tornado.locks import Event


class TestQueue(unittest.TestCase):
    def setUp(self):
        self.queue = Queue()

    def test_init(self):
        self.assertEqual(self.queue.maxsize, 0)
        self.assertEqual(self.queue.qsize(), 0)
        self.assertTrue(self.queue.empty())
        self.assertFalse(self.queue.full())

    def test_maxsize(self):
        self.assertEqual(self.queue.maxsize, 0)

    def test_qsize(self):
        self.assertEqual(self.queue.qsize(), 0)

    def test_empty(self):
        self.assertTrue(self.queue.empty())

    def test_full(self):
        self.assertFalse(self.queue.full())

    def test_put_nowait(self):
        self.queue.put_nowait(1)
        self.assertEqual(self.queue.qsize(), 1)

    def test_put_nowait_full(self):
        self.queue = Queue(1)
        self.queue.put_nowait(1)
        with self.assertRaises(QueueFull):
            self.queue.put_nowait(2)

    def test_get_nowait(self):
        self.queue.put_nowait(1)
        self.assertEqual(self.queue.get_nowait(), 1)

    def test_get_nowait_empty(self):
        with self.assertRaises(QueueEmpty):
            self.queue.get_nowait()

    def test_task_done(self):
        self.queue.put_nowait(1)
        self.queue.get_nowait()
        self.queue.task_done()
        self.assertEqual(self.queue._unfinished_tasks, 0)

    def test_task_done_too_many(self):
        with self.assertRaises(ValueError):
            self.queue.task_done()

    def test_join(self):
        future = self.queue.join()
        self.assertTrue(future.done())

    def test_aiter(self):
        iterator = self.queue.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)

    def test_repr(self):
        self.assertIn("Queue", repr(self.queue))

    def test_str(self):
        self.assertIn("Queue", str(self.queue))

    def test_format(self):
        self.assertIn("maxsize=0", self.queue._format())

    def test_put(self):
        future = self.queue.put(1)
        self.assertTrue(future.done())

    def test_get(self):
        self.queue.put_nowait(1)
        future = self.queue.get()
        self.assertTrue(future.done())
        self.assertEqual(future.result(), 1)

    def test_private_put_internal(self):
        self.queue._Queue__put_internal(1)
        self.assertEqual(self.queue.qsize(), 1)

    def test_protected_init(self):
        self.queue._init()
        self.assertEqual(self.queue.qsize(), 0)

    def test_protected_get(self):
        self.queue.put_nowait(1)
        self.assertEqual(self.queue._get(), 1)

    def test_protected_put(self):
        self.queue._put(1)
        self.assertEqual(self.queue.qsize(), 1)

    def test_protected_consume_expired(self):
        self.queue._consume_expired()
        self.assertEqual(self.queue.qsize(), 0)

class TestPriorityQueue(unittest.TestCase):
    def setUp(self):
        self.queue = PriorityQueue()

    def test_init(self):
        self.assertEqual(self.queue.qsize(), 0)

    def test_put(self):
        self.queue.put_nowait(1)
        self.assertEqual(self.queue.qsize(), 1)

    def test_get(self):
        self.queue.put_nowait(1)
        self.assertEqual(self.queue.get_nowait(), 1)

class TestLifoQueue(unittest.TestCase):
    def setUp(self):
        self.queue = LifoQueue()

    def test_init(self):
        self.assertEqual(self.queue.qsize(), 0)

    def test_put(self):
        self.queue.put_nowait(1)
        self.assertEqual(self.queue.qsize(), 1)

    def test_get(self):
        self.queue.put_nowait(1)
        self.assertEqual(self.queue.get_nowait(), 1)

class TestSetTimeout(unittest.TestCase):
    def test_set_timeout(self):
        future = Future()
        _set_timeout(future, 0.1)
        self.assertFalse(future.done())

class TestQueue(unittest.TestCase):
    def test_init(self):
        q = Queue()
        self.assertEqual(q.maxsize, 0)

    def test_init_with_maxsize(self):
        q = Queue(10)
        self.assertEqual(q.maxsize, 10)

    def test_init_with_none_maxsize(self):
        with self.assertRaises(TypeError):
            Queue(None)

    def test_init_with_negative_maxsize(self):
        with self.assertRaises(ValueError):
            Queue(-1)

    def test_qsize(self):
        q = Queue()
        self.assertEqual(q.qsize(), 0)

    def test_empty(self):
        q = Queue()
        self.assertTrue(q.empty())

    def test_full(self):
        q = Queue(1)
        self.assertFalse(q.full())

    def test_put_nowait(self):
        q = Queue(1)
        q.put_nowait(1)
        self.assertEqual(q.qsize(), 1)

    def test_put_nowait_full(self):
        q = Queue(1)
        q.put_nowait(1)
        with self.assertRaises(QueueFull):
            q.put_nowait(2)

    def test_get_nowait(self):
        q = Queue()
        q.put_nowait(1)
        self.assertEqual(q.get_nowait(), 1)

    def test_get_nowait_empty(self):
        q = Queue()
        with self.assertRaises(QueueEmpty):
            q.get_nowait()

    def test_task_done(self):
        q = Queue()
        q.put_nowait(1)
        q.get_nowait()
        q.task_done()
        self.assertEqual(q._unfinished_tasks, 0)

    def test_task_done_too_many(self):
        q = Queue()
        with self.assertRaises(ValueError):
            q.task_done()

    def test_join(self):
        q = Queue()
        future = q.join()
        self.assertIsInstance(future, Future)

    def test_aiter(self):
        q = Queue()
        iterator = q.__aiter__()
        self.assertIsInstance(iterator, _QueueIterator)

    def test_repr(self):
        q = Queue()
        self.assertIn("Queue", repr(q))

    def test_str(self):
        q = Queue()
        self.assertIn("Queue", str(q))

    def test_format(self):
        q = Queue()
        self.assertIn("maxsize=0", q._format())

    def test_put_internal(self):
        q = Queue()
        q._Queue__put_internal(1)
        self.assertEqual(q.qsize(), 1)

    def test_consume_expired(self):
        q = Queue()
        future = Future()
        future.set_result(None)
        q._putters.append((1, future))
        q._consume_expired()
        self.assertEqual(len(q._putters), 0)

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        q = PriorityQueue()
        self.assertEqual(q.qsize(), 0)

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
        self.assertEqual(q.qsize(), 0)

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

if __name__ == '__main__':
    unittest.main()