
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
        instance = Queue(None)
        self.assertEqual(instance.maxsize, None)
        self.assertEqual(instance._maxsize, None)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [])

    def test_Queue_3(self):
        instance = Queue(-1)
        self.assertEqual(instance.maxsize, -1)
        self.assertEqual(instance._maxsize, -1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [])

    def test_Queue_4(self):
        instance = Queue(0)
        self.assertEqual(instance.maxsize, 0)
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [])

    def test_Queue_5(self):
        instance = Queue(1)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [])

    def test_Queue_6(self):
        instance = Queue(None)
        self.assertEqual(instance.maxsize, None)
        self.assertEqual(instance._maxsize, None)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        self.assertEqual(instance._queue, [])

if __name__ == '__main__':
    unittest.main()