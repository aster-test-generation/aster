import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        fork = lambda _, resolve: resolve(1)
        task = Task(fork)
        self.assertEqual(task.fork, fork)

    def test_of(self):
        value = 1
        task = Task.of(value)
        self.assertEqual(task.fork, lambda _, resolve: resolve(value))

    def test_reject(self):
        value = 1
        task = Task.reject(value)
        self.assertEqual(task.fork, lambda reject, _: reject(lambda: value))

    def test_map(self):
        value = 1
        task = Task.of(value)
        fn = lambda x: x + 1
        result = task.map(fn)
        self.assertEqual(result.fork, lambda reject, resolve: resolve(fn(value)))

    def test_bind(self):
        value = 1
        task = Task.of(value)
        fn = lambda x: Task.of(x + 1)
        result = task.bind(fn)
        self.assertEqual(result.fork, lambda reject, resolve: fn(value).fork(reject, resolve))

class TestTask(unittest.TestCase):
    def test_init(self):
        instance = Task(lambda _, resolve: resolve(1))
        self.assertEqual(instance.fork(lambda arg: arg, lambda arg: arg), 1)

    def test_of(self):
        instance = Task.of(1)
        self.assertEqual(instance.fork(lambda arg: arg, lambda arg: arg), 1)

    def test_reject(self):
        instance = Task.reject(1)
        self.assertEqual(instance.fork(lambda arg: arg, lambda arg: arg), 1)

    def test_map(self):
        instance = Task.of(1).map(lambda arg: arg + 1)
        self.assertEqual(instance.fork(lambda arg: arg, lambda arg: arg), 2)

    def test_bind(self):
        instance = Task.of(1).bind(lambda arg: Task.of(arg + 1))
        self.assertEqual(instance.fork(lambda arg: arg, lambda arg: arg), 2)

if __name__ == '__main__':
    unittest.main()