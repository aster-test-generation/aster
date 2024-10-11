import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_of(self):
        task = Task.of(1)
        result = task.fork(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, 0)

    def test_reject(self):
        task = Task.reject(1)
        result = task.fork(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, 2)

    def test_map(self):
        task = Task.of(1).map(lambda x: x + 1)
        result = task.fork(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, 1)

    def test_bind(self):
        task = Task.of(1).bind(lambda x: Task.of(x + 1))
        result = task.fork(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, 1)

    def test_private_method(self):
        task = Task(lambda _, resolve: resolve(1))
        result = task._Task__fork(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, 1)

    def test_protected_method(self):
        task = Task(lambda _, resolve: resolve(1))
        result = task.map(lambda x: x + 1)
        self.assertEqual(result.fork(lambda x: x + 1, lambda x: x - 1), 2)

    def test_magic_methods(self):
        task = Task(lambda _, resolve: resolve(1))
        self.assertEqual(str(task), str(Task))
        self.assertEqual(repr(task), "Task(<function Task.__init__ at 0x7f361099b0d0>)")
        self.assertEqual(task == Task(lambda _, resolve: resolve(1)), True)
        self.assertEqual(task == Task(lambda _, resolve: resolve(2)), False)

if __name__ == '__main__':
    unittest.main()