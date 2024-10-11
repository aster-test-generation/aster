
import unittest
from tornado.queues import *

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
        instance = Queue(1)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_2(self):
        instance = Queue(1)
        instance.put(1)
        self.assertEqual(instance.qsize(), 1)
        self.assertEqual(instance.empty(), False)
        self.assertEqual(instance.full(), True)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 1)
        self.assertEqual(instance._finished.is_set(), False)

    def test_Queue_3(self):
        instance = Queue(1)
        instance.put(1)
        self.assertEqual(instance.get(), 1)
        self.assertEqual(instance.qsize(), 0)
        self.assertEqual(instance.empty(), True)
        self.assertEqual(instance.full(), False)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_4(self):
        instance = Queue(1)
        instance.put(1)
        self.assertEqual(instance.get_nowait(), 1)
        self.assertEqual(instance.qsize(), 0)
        self.assertEqual(instance.empty(), True)
        self.assertEqual(instance.full(), False)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_5(self):
        instance = Queue(1)
        instance.put(1)
        self.assertEqual(instance.task_done(), None)
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_6(self):
        instance = Queue(1)
        instance.put(1)
        self.assertEqual(instance.join(), None)
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_7(self):
        instance = Queue(1)
        instance.put(1)
        self.assertEqual(instance.__aiter__(), None)
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_8(self):
        instance = Queue(1)
        instance.put(1)
        self.assertEqual(instance.__repr__(), None)
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

if __name__ == '__main__':
    unittest.main()