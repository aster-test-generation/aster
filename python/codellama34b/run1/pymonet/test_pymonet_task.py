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
        self.assertEqual(result.fork(lambda arg: arg, lambda arg: arg), value)

    def test_reject(self):
        value = 1
        result = Task.reject(value)
        self.assertEqual(result.fork(lambda arg: arg, lambda arg: arg), value)

    def test_map(self):
        value = 1
        fn = lambda arg: arg + 1
        task = Task.of(value)
        result = task.map(fn)
        self.assertEqual(result.fork(lambda arg: arg, lambda arg: arg), value + 1)

    def test_bind(self):
        value = 1
        fn = lambda arg: Task.of(arg + 1)
        task = Task.of(value)
        result = task.bind(fn)
        self.assertEqual(result.fork(lambda arg: arg, lambda arg: arg), value + 1)

if __name__ == '__main__':
    unittest.main()