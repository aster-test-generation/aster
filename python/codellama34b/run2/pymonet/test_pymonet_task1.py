import unittest
from pymonet.task import Task

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