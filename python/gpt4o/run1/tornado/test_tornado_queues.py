import unittest
from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueEmpty, QueueFull, _set_timeout, _QueueIterator
from tornado.concurrent import Future
from tornado.ioloop import IOLoop
from tornado import gen
import datetime


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

    def test_protected_init(self):
        self.queue._init()
        self.assertEqual(self.queue.qsize(), 0)

    def test_protected_put(self):
        self.queue._put(1)
        self.assertEqual(self.queue.qsize(), 1)

    def test_protected_get(self):
        self.queue._put(1)
        self.assertEqual(self.queue._get(), 1)

class TestLifoQueue(unittest.TestCase):
    def setUp(self):
        self.queue = LifoQueue()

    def test_protected_init(self):
        self.queue._init()
        self.assertEqual(self.queue.qsize(), 0)

    def test_protected_put(self):
        self.queue._put(1)
        self.assertEqual(self.queue.qsize(), 1)

    def test_protected_get(self):
        self.queue._put(1)
        self.assertEqual(self.queue._get(), 1)

class TestSetTimeout(unittest.TestCase):
    def test_set_timeout(self):
        future = Future()
        timeout = datetime.timedelta(seconds=1)
        _set_timeout(future, timeout)
        self.assertFalse(future.done())

if __name__ == '__main__':
    unittest.main()