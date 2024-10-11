from tornado.queues import _QueueIterator
import unittest
from tornado.queues import *


class TestQueue(unittest.TestCase):
    def test_init(self):
        instance = Queue()
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, deque([]))
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
    def test_qsize(self):
        instance = Queue()
        result = instance.qsize()
        self.assertEqual(result, 0)
    def test_empty(self):
        instance = Queue()
        result = instance.empty()
        self.assertEqual(result, True)
    def test_full(self):
        instance = Queue()
        result = instance.full()
        self.assertEqual(result, False)
    def test_put(self):
        instance = Queue()
        future = instance.put(1)
        self.assertEqual(future.done(), True)
    def test_put_nowait(self):
        instance = Queue()
        instance.put_nowait(1)
        self.assertEqual(instance._queue, deque([1]))
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
        result = instance.__aiter__()
        self.assertEqual(result, _QueueIterator(instance))
    def test__init(self):
        instance = Queue()
        instance._init()
        self.assertEqual(instance._queue, deque([]))
    def test__get(self):
        instance = Queue()
        self.assertRaises(IndexError, instance._get)
    def test__put(self):
        instance = Queue()
        instance._put(1)
        self.assertEqual(instance._queue, deque([1]))
    def test__consume_expired(self):
        instance = Queue()
        instance._consume_expired()
        self.assertEqual(instance._putters, deque([]))
        self.assertEqual(instance._getters, [])
    def test__format(self):
        instance = Queue()
        result = instance._format()
        self.assertEqual(result, "maxsize=0 queue=[] getters[0] tasks=0")
    def test___repr__(self):
        instance = Queue()
        result = instance.__repr__()
        self.assertEqual(result, "<Queue at 0x7fbb91a0b430 maxsize=0>")
    def test___str__(self):
        instance = Queue()
        result = instance.__str__()
        self.assertEqual(result, "<Queue maxsize=0 queue=[] getters[0] tasks=0>")
class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        instance = PriorityQueue()
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, deque([]))
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
    def test_qsize(self):
        instance = PriorityQueue()
        result = instance.qsize()
        self.assertEqual(result, 0)



class TestQueue(unittest.TestCase):
    def test_Queue(self):
        instance = Queue()
        self.assertEqual(instance.maxsize, 0)
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_1(self):
        instance = Queue(maxsize=0)
        self.assertEqual(instance.maxsize, 0)
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_2(self):
        instance = Queue(maxsize=1)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_3(self):
        instance = Queue(maxsize=-1)
        self.assertEqual(instance.maxsize, -1)
        self.assertEqual(instance._maxsize, -1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_4(self):
        instance = Queue(maxsize=None)
        self.assertEqual(instance.maxsize, None)
        self.assertEqual(instance._maxsize, None)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_5(self):
        instance = Queue(maxsize=1)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_6(self):
        instance = Queue(maxsize=1)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_7(self):
        instance = Queue(maxsize=1)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

if __name__ == '__main__':
    unittest.main()