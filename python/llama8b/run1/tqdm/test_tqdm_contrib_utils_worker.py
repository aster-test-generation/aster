import unittest
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def test_init(self):
        instance = MonoWorker()
        self.assertIsInstance(instance.pool, ThreadPoolExecutor)
        self.assertIsInstance(instance.futures, deque)

    def test_submit(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        future = instance.submit(test_func)
        self.assertIsInstance(future, object)

    def test_submit_exception(self):
        instance = MonoWorker()
        def test_func():
            raise Exception("Test exception")
        with self.assertRaises(Exception):
            instance.submit(test_func)

    def test_submit_running(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        future = instance.submit(test_func)
        instance.submit(test_func)
        self.assertTrue(future.running())

    def test_submit_waiting(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        future = instance.submit(test_func)
        instance.submit(test_func)
        self.assertTrue(future.done())

    def test_submit_cancel(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        future = instance.submit(test_func)
        future.cancel()
        self.assertTrue(future.cancelled())

    def test_submit_str(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        result = str(instance.submit(test_func))
        self.assertEqual(result, "<Future at 0x...>")

    def test_submit_repr(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        result = repr(instance.submit(test_func))
        self.assertEqual(result, "<Future at 0x...>")

if __name__ == '__main__':
    unittest.main()