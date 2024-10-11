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
        self.assertIsInstance(future, concurrent.futures.Future)

    def test_submit_running(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        instance.submit(test_func)
        future = instance.submit(test_func)
        self.assertIsInstance(future, concurrent.futures.Future)

    def test_submit_exception(self):
        instance = MonoWorker()
        def test_func():
            raise Exception("Test exception")
        with self.assertRaises(Exception):
            instance.submit(test_func)

    def test_submit_cancel(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        future = instance.submit(test_func)
        future.cancel()
        self.assertTrue(future.cancelled())

    def test_submit_done(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        future = instance.submit(test_func)
        future.result()
        self.assertTrue(future.done())

    def test_submit_result(self):
        instance = MonoWorker()
        def test_func():
            return "test"
        future = instance.submit(test_func)
        result = future.result()
        self.assertEqual(result, "test")

    def test_str_method(self):
        instance = MonoWorker()
        result = str(instance)
        self.assertEqual(result, "MonoWorker")

    def test_repr_method(self):
        instance = MonoWorker()
        result = repr(instance)
        self.assertEqual(result, "MonoWorker()")

if __name__ == '__main__':
    unittest.main()