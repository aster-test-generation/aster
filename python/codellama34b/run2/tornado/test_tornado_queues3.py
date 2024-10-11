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
        instance.task_done()
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        instance.join()
        self.assertEqual(instance._finished.is_set(), True)

    def test_PriorityQueue(self):
        instance = PriorityQueue()
        self.assertEqual(instance.maxsize, 0)
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        instance.task_done()
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        instance.join()
        self.assertEqual(instance._finished.is_set(), True)

    def test_LifoQueue(self):
        instance = LifoQueue()
        self.assertEqual(instance.maxsize, 0)
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        instance.task_done()
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)
        instance.join()
        self.assertEqual(instance._finished.is_set(), True)

    def test_QueueEmpty(self):
        instance = QueueEmpty()
        self.assertEqual(instance.__str__(), "QueueEmpty")

    def test_QueueFull(self):
        instance = QueueFull()
        self.assertEqual(instance.__str__(), "QueueFull")

    def test__set_timeout(self):
        future = Future()
        _set_timeout(future, 1)
        self.assertEqual(future.done(), False)

    def test__QueueIterator(self):
        instance = _QueueIterator()
        self.assertEqual(instance.__anext__(), None)

if __name__ == '__main__':
    unittest.main()