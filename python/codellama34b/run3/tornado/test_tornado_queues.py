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
        self.assertEqual(future.result(), None)

    def test_put_nowait(self):
        instance = Queue()
        instance.put_nowait(1)

    def test_get(self):
        instance = Queue()
        future = instance.get()
        self.assertEqual(future.result(), 1)

    def test_get_nowait(self):
        instance = Queue()
        result = instance.get_nowait()
        self.assertEqual(result, 1)

    def test_task_done(self):
        instance = Queue()
        instance.task_done()

    def test_join(self):
        instance = Queue()
        future = instance.join()
        self.assertEqual(future.result(), None)

    def test___aiter__(self):
        instance = Queue()
        result = instance.__aiter__()
        self.assertEqual(result, None)

    def test__init(self):
        instance = Queue()
        instance._init()

    def test__get(self):
        instance = Queue()
        result = instance._get()
        self.assertEqual(result, 1)

    def test__put(self):
        instance = Queue()
        instance._put(1)

    def test___put_internal(self):
        instance = Queue()
        instance.__put_internal(1)

    def test__consume_expired(self):
        instance = Queue()
        instance._consume_expired()

    def test___repr__(self):
        instance = Queue()
        result = instance.__repr__()
        self.assertEqual(result, "<Queue at 0x000001F9D4962E88 maxsize=0 queue=[] getters[0] tasks=1>")

    def test___str__(self):
        instance = Queue()
        result = instance.__str__()
        self.assertEqual(result, "<Queue maxsize=0 queue=[] getters[0] tasks=1>")

    def test___format(self):
        instance = Queue()
        result = instance._format()
        self.assertEqual(result, "maxsize=0 queue=[] getters[0] tasks=1")

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        instance = PriorityQueue()
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_qsize(self):
        instance = PriorityQueue()
        result = instance.qsize()
        self.assertEqual(result, 0)

    def test_empty(self):
        instance = PriorityQueue()
        result = instance.empty()
        self.assertEqual(result, True)

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
        instance = Queue(None)
        self.assertEqual(instance.maxsize, 0)
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_3(self):
        instance = Queue(-1)
        self.assertEqual(instance.maxsize, -1)
        self.assertEqual(instance._maxsize, -1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_4(self):
        instance = Queue(0)
        self.assertEqual(instance.maxsize, 0)
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_5(self):
        instance = Queue(1)
        self.assertEqual(instance.maxsize, 1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_6(self):
        instance = Queue(None)
        self.assertEqual(instance.maxsize, 0)
        self.assertEqual(instance._maxsize, 0)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_Queue_7(self):
        instance = Queue(-1)
        self.assertEqual(instance.maxsize, -1)
        self.assertEqual(instance._maxsize, -1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

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


class TestQueue(unittest.TestCase):
    def test_Queue(self):
        q = Queue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())
        self.assertEqual(q.get(), None)
        self.assertEqual(q.get_nowait(), None)
        self.assertEqual(q.put(1), None)
        self.assertEqual(q.put_nowait(1), None)
        self.assertEqual(q.task_done(), None)
        self.assertEqual(q.join(), None)
        self.assertEqual(q.__aiter__(), None)
        self.assertEqual(q._init(), None)
        self.assertEqual(q._get(), None)
        self.assertEqual(q._put(1), None)
        self.assertEqual(q.__put_internal(1), None)
        self.assertEqual(q._consume_expired(), None)
        self.assertEqual(q.__repr__(), None)
        self.assertEqual(q.__str__(), None)
        self.assertEqual(q._format(), None)

    def test_PriorityQueue(self):
        q = PriorityQueue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())
        self.assertEqual(q.get(), None)
        self.assertEqual(q.get_nowait(), None)
        self.assertEqual(q.put(1), None)
        self.assertEqual(q.put_nowait(1), None)
        self.assertEqual(q.task_done(), None)
        self.assertEqual(q.join(), None)
        self.assertEqual(q.__aiter__(), None)
        self.assertEqual(q._init(), None)
        self.assertEqual(q._get(), None)
        self.assertEqual(q._put(1), None)
        self.assertEqual(q.__put_internal(1), None)
        self.assertEqual(q._consume_expired(), None)
        self.assertEqual(q.__repr__(), None)
        self.assertEqual(q.__str__(), None)
        self.assertEqual(q._format(), None)

    def test_LifoQueue(self):
        q = LifoQueue()
        self.assertEqual(q.maxsize, 0)
        self.assertEqual(q.qsize(), 0)
        self.assertTrue(q.empty())
        self.assertFalse(q.full())
        self.assertEqual(q.get(), None)
        self.assertEqual(q.get_nowait(), None)
        self.assertEqual(q.put(1), None)
        self.assertEqual(q.put_nowait(1), None)
        self.assertEqual(q.task_done(), None)
        self.assertEqual(q.join(), None)
        self.assertEqual(q.__aiter__(), None)
        self.assertEqual(q._init(), None)
        self.assertEqual(q._get(), None)
        self.assertEqual(q._put(1), None)
        self.assertEqual(q.__put_internal(1), None)
        self.assertEqual(q._consume_expired(), None)
        self.assertEqual(q.__repr__(), None)
        self.assertEqual(q.__str__(), None)
        self.assertEqual(q._format(), None)

if __name__ == '__main__':
    unittest.main()