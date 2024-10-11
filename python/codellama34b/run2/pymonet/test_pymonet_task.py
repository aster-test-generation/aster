import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        fork = lambda _, resolve: resolve(1)
        instance = Task(fork)
        self.assertEqual(instance.fork, fork)

    def test_of(self):
        value = 1
        result = Task.of(value)
        self.assertEqual(result.fork, lambda _, resolve: resolve(value))

    def test_reject(self):
        value = 1
        result = Task.reject(value)
        self.assertEqual(result.fork, lambda reject, _: reject(lambda: value))

    def test_map(self):
        def fn(x):
            return x + 1
        fork = lambda _, resolve: resolve(1)
        instance = Task(fork)
        result = instance.map(fn)
        self.assertEqual(result.fork, lambda reject, resolve: fork(lambda arg: reject(fn(arg)), lambda arg: resolve(fn(arg))))

    def test_bind(self):
        def fn(x):
            return Task.of(x + 1)
        fork = lambda _, resolve: resolve(1)
        instance = Task(fork)
        result = instance.bind(fn)
        self.assertEqual(result.fork, lambda reject, resolve: fork(lambda arg: reject(arg), lambda arg: fn(arg).fork(reject, resolve)))

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
        instance = Task.of(1)
        result = instance.map(lambda arg: arg + 1)
        self.assertEqual(result.fork(lambda arg: arg, lambda arg: arg), 2)

    def test_bind(self):
        instance = Task.of(1)
        result = instance.bind(lambda arg: Task.of(arg + 1))
        self.assertEqual(result.fork(lambda arg: arg, lambda arg: arg), 2)

if __name__ == '__main__':
    unittest.main()