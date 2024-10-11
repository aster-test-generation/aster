# import unittest
# import datetime
# from tornado.queues import Queue, PriorityQueue, LifoQueue, QueueFull, QueueEmpty, _set_timeout, _QueueIterator
# from tornado.concurrent import Future
# from tornado.ioloop import IOLoop
# from tornado import gen
#
# class TestQueue(unittest.TestCase):
#     def test_init(self):
#         q = Queue(maxsize=10)
#         self.assertEqual(q.maxsize, 10)
#
#     def test_init_negative_maxsize(self):
#         with self.assertRaises(ValueError):
#             Queue(maxsize=-1)
#
#     def test_init_none_maxsize(self):
#         with self.assertRaises(TypeError):
#             Queue(maxsize=None)
#
#     def test_qsize(self):
#         q = Queue()
#         self.assertEqual(q.qsize(), 0)
#
#     def test_empty(self):
#         q = Queue()
#         self.assertTrue(q.empty())
#
#     def test_full(self):
#         q = Queue(maxsize=1)
#         self.assertFalse(q.full())
#         q.put_nowait(1)
#         self.assertTrue(q.full())
#
#     def test_put_nowait(self):
#         q = Queue()
#         q.put_nowait(1)
#         self.assertEqual(q.qsize(), 1)
#
#     def test_put_nowait_full(self):
#         q = Queue(maxsize=1)
#         q.put_nowait(1)
#         with self.assertRaises(QueueFull):
#             q.put_nowait(2)
#
#     def test_get_nowait(self):
#         q = Queue()
#         q.put_nowait(1)
#         self.assertEqual(q.get_nowait(), 1)
#
#     def test_get_nowait_empty(self):
#         q = Queue()
#         with self.assertRaises(QueueEmpty):
#             q.get_nowait()
#
#     def test_task_done(self):
#         q = Queue()
#         q.put_nowait(1)
#         q.get_nowait()
#         q.task_done()
#         self.assertEqual(q._unfinished_tasks, 0)
#
#     def test_task_done_too_many(self):
#         q = Queue()
#         with self.assertRaises(ValueError):
#             q.task_done()
#
#     def test_join(self):
#         q = Queue()
#         future = q.join()
#         self.assertTrue(future.done())
#
#     def test_aiter(self):
#         q = Queue()
#         iterator = q.__aiter__()
#         self.assertIsInstance(iterator, _QueueIterator)
#
#     def test_repr(self):
#         q = Queue()
#         self.assertIn("Queue", repr(q))
#
#     def test_str(self):
#         q = Queue()
#         self.assertIn("Queue", str(q))
#
#     def test_format(self):
#         q = Queue()
#         self.assertIn("maxsize=0", q._format())
#
#     def test_put_internal(self):
#         q = Queue()
#         q._Queue__put_internal(1)
#         self.assertEqual(q.qsize(), 1)
#
#     def test_consume_expired(self):
#         q = Queue()
#         future = Future()
#         future.set_result(None)
#         q._putters.append((1, future))
#         q._consume_expired()
#         self.assertEqual(len(q._putters), 0)
#
# class TestPriorityQueue(unittest.TestCase):
#     def test_init(self):
#         q = PriorityQueue()
#         self.assertEqual(q.qsize(), 0)
#
#     def test_put(self):
#         q = PriorityQueue()
#         q.put_nowait(1)
#         self.assertEqual(q.qsize(), 1)
#
#     def test_get(self):
#         q = PriorityQueue()
#         q.put_nowait(1)
#         self.assertEqual(q.get_nowait(), 1)
#
# class TestLifoQueue(unittest.TestCase):
#     def test_init(self):
#         q = LifoQueue()
#         self.assertEqual(q.qsize(), 0)
#
#     def test_put(self):
#         q = LifoQueue()
#         q.put_nowait(1)
#         self.assertEqual(q.qsize(), 1)
#
#     def test_get(self):
#         q = LifoQueue()
#         q.put_nowait(1)
#         self.assertEqual(q.get_nowait(), 1)
#
# class TestSetTimeout(unittest.TestCase):
#     def test_set_timeout(self):
#         future = Future()
#         _set_timeout(future, 0.1)
#         IOLoop.current().start()
#         self.assertTrue(future.done())
#
# if __name__ == '__main__':
#     unittest.main()