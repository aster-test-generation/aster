from tornado.queues import QueueFull
import unittest
from tornado.queues import Queue
from tornado.queues import Queue, PriorityQueue, LifoQueue


class TestQueue(unittest.TestCase):
    def test_queue_init(self):
        q = Queue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_queue_put_get(self):
        q = Queue()
        q.put(1)
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_queue_put_get_full(self):
        q = Queue(maxsize=1)
        q.put(1)
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertTrue(q.full())
        with self.assertRaises(QueueFull):
            q.put(2)
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertTrue(q.full())
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_queue_put_get_timeout(self):
        q = Queue()
        future = q.put(1, timeout=0.1)
        self.assertTrue(future.done())
        self.assertEqual(q.qsize(), 1)
        self.assertFalse(q.empty())
        self.assertFalse(q.full())
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())
        future = q.get(timeout=0.1)
        self.assertTrue(future.done())
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_queue_put_get_cancel(self):
        q = Queue()
        future = q.put(1)
        self.assertTrue(future.done())
        future.cancel()
        self.assertTrue(future.done())
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())
        future = q.get()
        self.assertFalse(future.done())
        future.cancel()
        self.assertTrue(future.done())
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())

    def test_queue_aiter(self):
        q = Queue()
        q.put(1)
        q.put(2)
        q.put(3)
        async def test_aiter():
            async for item in q:
                self.assertEqual(item, 1)
                break
            async for item in q:
                self.assertEqual(item, 2)
                break
            async for item in q:
                self.assertEqual(item, 3)
                break
            async for item in q:
                self.fail("should not reach here")
        test_aiter()

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

class TestQueue(unittest.TestCase):
    def test_queue_put_get(self):
        q = Queue()
        q.put(1)
        q.put(2)
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.get_nowait(), 2)

    def test_queue_put_get_async(self):
        q = Queue()
        future1 = q.put(1)
        future2 = q.put(2)
        future3 = q.get()
        future4 = q.get()
        self.assertEqual(q.qsize(), 2)
        future_set_result_unless_cancelled(future1, None)
        future_set_result_unless_cancelled(future2, None)
        self.assertEqual(q.qsize(), 0)
        self.assertEqual(future3.result(), 1)
        self.assertEqual(future4.result(), 2)

    def test_queue_full(self):
        q = Queue(maxsize=1)
        q.put(1)
        self.assertRaises(QueueFull, q.put, 2)

    def test_queue_empty(self):
        q = Queue()
        self.assertTrue(q.empty())
        q.put(1)
        self.assertFalse(q.empty())
        q.get_nowait()
        self.assertTrue(q.empty())

    def test_queue_iterator(self):
        q = Queue()
        q.put(1)
        q.put(2)
        self.assertEqual(list(q), [1, 2])

class TestPriorityQueue(TestQueue):
    def test_priority_queue(self):
        q = PriorityQueue()
        q.put(2)
        q.put(1)
        self.assertEqual(q.get_nowait(), 1)
        self.assertEqual(q.get_nowait(), 2)

class TestLifoQueue(TestQueue):
    def test_lifo_queue(self):
        q = LifoQueue()
        q.put(1)
        q.put(2)
        self.assertEqual(q.get_nowait(), 2)
        self.assertEqual(q.get_nowait(), 1)

if __name__ == '__main__':
    unittest.main()