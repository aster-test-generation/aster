import unittest
from tornado.queues import *



class TestQueue(unittest.TestCase):
    def test_init(self):
        instance = Queue(1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_qsize(self):
        instance = Queue(1)
        result = instance.qsize()
        self.assertEqual(result, 0)

    def test_empty(self):
        instance = Queue(1)
        result = instance.empty()
        self.assertEqual(result, True)

    def test_full(self):
        instance = Queue(1)
        result = instance.full()
        self.assertEqual(result, False)

    def test_put(self):
        instance = Queue(1)
        result = instance.put(1)
        self.assertEqual(result, None)

    def test_put_nowait(self):
        instance = Queue(1)
        result = instance.put_nowait(1)
        self.assertEqual(result, None)

    def test_get(self):
        instance = Queue(1)
        result = instance.get()
        self.assertEqual(result, None)

    def test_get_nowait(self):
        instance = Queue(1)
        result = instance.get_nowait()
        self.assertEqual(result, None)

    def test_task_done(self):
        instance = Queue(1)
        result = instance.task_done()
        self.assertEqual(result, None)

    def test_join(self):
        instance = Queue(1)
        result = instance.join()
        self.assertEqual(result, None)

    def test_aiter(self):
        instance = Queue(1)
        result = instance.__aiter__()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = Queue(1)
        result = instance.__repr__()
        self.assertEqual(result, None)

    def test_str(self):
        instance = Queue(1)
        result = instance.__str__()
        self.assertEqual(result, None)

    def test_format(self):
        instance = Queue(1)
        result = instance._format()
        self.assertEqual(result, None)

    def test_consume_expired(self):
        instance = Queue(1)
        result = instance._consume_expired()
        self.assertEqual(result, None)

    def test_put_internal(self):
        instance = Queue(1)
        result = instance.__put_internal(1)
        self.assertEqual(result, None)

    def test_get_internal(self):
        instance = Queue(1)
        result = instance._get()
        self.assertEqual(result, None)

    def test_init_internal(self):
        instance = Queue(1)
        result = instance._init()
        self.assertEqual(result, None)

class TestPriorityQueue(unittest.TestCase):
    def test_init(self):
        instance = PriorityQueue(1)
        self.assertEqual(instance._maxsize, 1)
        self.assertEqual(instance._getters, [])
        self.assertEqual(instance._putters, [])
        self.assertEqual(instance._unfinished_tasks, 0)
        self.assertEqual(instance._finished.is_set(), True)

    def test_qsize(self):
        instance = PriorityQueue(1)
        result = instance.qsize()
        self.assertEqual(result, 0)

    def test_empty(self):
        instance = PriorityQueue(1)
        result = instance.empty()
        self.assertEqual(result, True)

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

class TestQueue(unittest.TestCase):
    def test_Queue(self):
        result = Queue()
        self.assertEqual(result, Queue())

    def test_Queue_maxsize(self):
        result = Queue(maxsize=0)
        self.assertEqual(result, Queue(maxsize=0))

    def test_Queue_qsize(self):
        result = Queue().qsize()
        self.assertEqual(result, 0)

    def test_Queue_empty(self):
        result = Queue().empty()
        self.assertEqual(result, True)

    def test_Queue_full(self):
        result = Queue().full()
        self.assertEqual(result, False)

    def test_Queue_put(self):
        result = Queue().put(1)
        self.assertEqual(result, Queue().put(1))

    def test_Queue_put_nowait(self):
        result = Queue().put_nowait(1)
        self.assertEqual(result, Queue().put_nowait(1))

    def test_Queue_get(self):
        result = Queue().get()
        self.assertEqual(result, Queue().get())

    def test_Queue_get_nowait(self):
        result = Queue().get_nowait()
        self.assertEqual(result, Queue().get_nowait())

    def test_Queue_task_done(self):
        result = Queue().task_done()
        self.assertEqual(result, Queue().task_done())

    def test_Queue_join(self):
        result = Queue().join()
        self.assertEqual(result, Queue().join())

    def test_Queue___aiter__(self):
        result = Queue().__aiter__()
        self.assertEqual(result, Queue().__aiter__())

    def test_Queue___repr__(self):
        result = Queue().__repr__()
        self.assertEqual(result, Queue().__repr__())

    def test_Queue___str__(self):
        result = Queue().__str__()
        self.assertEqual(result, Queue().__str__())

    def test_PriorityQueue(self):
        result = PriorityQueue()
        self.assertEqual(result, PriorityQueue())

    def test_PriorityQueue_maxsize(self):
        result = PriorityQueue(maxsize=0)
        self.assertEqual(result, PriorityQueue(maxsize=0))

    def test_PriorityQueue_qsize(self):
        result = PriorityQueue().qsize()
        self.assertEqual(result, 0)

    def test_PriorityQueue_empty(self):
        result = PriorityQueue().empty()
        self.assertEqual(result, True)

    def test_PriorityQueue_full(self):
        result = PriorityQueue().full()
        self.assertEqual(result, False)

    def test_PriorityQueue_put(self):
        result = PriorityQueue().put(1)
        self.assertEqual(result, PriorityQueue().put(1))

    def test_PriorityQueue_put_nowait(self):
        result = PriorityQueue().put_nowait(1)
        self.assertEqual(result, PriorityQueue().put_nowait(1))

    def test_PriorityQueue_get(self):
        result = PriorityQueue().get()
        self.assertEqual(result, PriorityQueue().get())

    def test_PriorityQueue_get_nowait(self):
        result = PriorityQueue().get_nowait()
        self.assertEqual(result, PriorityQueue().get_nowait())

    def test_PriorityQueue_task_done(self):
        result = PriorityQueue().task_done()
        self.assertEqual(result, PriorityQueue().task_done())

    def test_PriorityQueue_join(self):
        result = PriorityQueue().join()
        self.assertEqual(result, PriorityQueue().join())


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