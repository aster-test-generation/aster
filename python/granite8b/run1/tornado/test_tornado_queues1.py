import unittest
from tornado.queues import Queue

class TestQueue(unittest.TestCase):
    def test_init(self):
        q = Queue(maxsize=10)
        self.assertEqual(q.maxsize, 10)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_put_get(self):
        q = Queue(maxsize=10)
        q.put(1)
        q.put(2)
        self.assertEqual(q.qsize(), 2)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())
        self.assertEqual(q.get(), 1)
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())
        self.assertEqual(q.get(), 2)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_put_get_timeout(self):
        q = Queue(maxsize=10)
        future = q.get(timeout=0.1)
        self.assertFalse(future.done())
        self.assertRaises(gen.TimeoutError, future.result)

    def test_put_nowait(self):
        q = Queue(maxsize=10)
        q.put_nowait(1)
        q.put_nowait(2)
        self.assertEqual(q.qsize(), 2)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())

    def test_put_nowait_full(self):
        q = Queue(maxsize=1)
        q.put_nowait(1)
        self.assertRaises(QueueFull, q.put_nowait, 2)

    def test_get_nowait(self):
        q = Queue(maxsize=10)
        q.put_nowait(1)
        q.put_nowait(2)
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.get_nowait(), 2)
        self.assertRaises(QueueEmpty, q.get_nowait)

    def test_get_nowait_empty(self):
        q = Queue(maxsize=10)
        self.assertRaises(QueueEmpty, q.get_nowait)

    def test_task_done(self):
        q = Queue(maxsize=10)
        q.put_nowait(1)
        q.put_nowait(2)
        q.task_done()
        q.task_done()
        self.assertRaises(ValueError, q.task_done)

    def test_join(self):
        q = Queue(maxsize=10)
        future = q.join()
        self.assertFalse(future.done())
        q.put_nowait(1)
        q.put_nowait(2)
        q.task_done()
        q.task_done()
        self.assertTrue(future.done())

if __name__ == '__main__':
    unittest.main()