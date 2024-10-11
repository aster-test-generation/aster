
import unittest
from tornado.queues import *

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

if __name__ == '__main__':
    unittest.main()