
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
        self.assertEqual(instance._queue, [])

    def test_Queue_1(self):
        instance = Queue(1)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [])

    def test_Queue_2(self):
        instance = Queue(1)
        instance.put(1)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [1])

    def test_Queue_3(self):
        instance = Queue(1)
        instance.put(1)
        instance.put(2)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [1])

    def test_Queue_4(self):
        instance = Queue(1)
        instance.put(1)
        instance.put(2)
        instance.put(3)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [1])

    def test_Queue_5(self):
        instance = Queue(1)
        instance.put(1)
        instance.put(2)
        instance.put(3)
        instance.put(4)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [1])

if __name__ == '__main__':
    unittest.main()