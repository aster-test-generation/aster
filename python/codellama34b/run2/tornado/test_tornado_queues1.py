
import unittest
from tornado.queues import *

class TestQueue(unittest.TestCase):
    def test_init(self):
        instance = Queue()
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_maxsize(self):
        instance = Queue()
        self.assertEqual(instance.maxsize, 0)

    def test_qsize(self):
        instance = Queue()
        self.assertEqual(instance.qsize(), 0)

    def test_empty(self):
        instance = Queue()
        self.assertEqual(instance.empty(), True)

    def test_full(self):
        instance = Queue()
        self.assertEqual(instance.full(), False)

    def test_put(self):
        instance = Queue()
        future = instance.put(1)
        self.assertEqual(future.done(), True)

    def test_put_nowait(self):
        instance = Queue()
        instance.put_nowait(1)
        self.assertEqual(instance._queue, [1])

    def test_get(self):
        instance = Queue()
        future = instance.get()
        self.assertEqual(future.done(), False)

    def test_get_nowait(self):
        instance = Queue()
        self.assertRaises(QueueEmpty, instance.get_nowait)

    def test_task_done(self):
        instance = Queue()
        instance.task_done()
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_join(self):
        instance = Queue()
        future = instance.join()
        self.assertEqual(future.done(), True)

    def test___aiter__(self):
        instance = Queue()
        self.assertEqual(instance.__aiter__(), _QueueIterator(instance))

    def test__init(self):
        instance = Queue()
        instance._init()
        self.assertEqual(instance._queue, [])

    def test__get(self):
        instance = Queue()
        self.assertRaises(QueueEmpty, instance._get)

    def test__put(self):
        instance = Queue()
        instance._put(1)
        self.assertEqual(instance._queue, [1])

    def test__consume_expired(self):
        instance = Queue()
        instance._consume_expired()
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._getters, [])

    def test___repr__(self):
        instance = Queue()
        self.assertEqual(instance.__repr__(), "<Queue at 0x000001E488888888 maxsize=0 queue=[] getters[0] tasks=0>")

    def test___str__(self):
        instance = Queue()
        self.assertEqual(instance.__str__(), "<Queue maxsize=0 queue=[] getters[0] tasks=0>")

    def test__format(self):
        instance = Queue()
        self.assertEqual(instance._format(), "maxsize=0 queue=[] getters[0] tasks=0")

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        instance = PriorityQueue()
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

if __name__ == '__main__':
    unittest.main()