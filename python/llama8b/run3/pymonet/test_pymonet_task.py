import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task(lambda _, resolve: resolve(1))
        self.assertEqual(task.fork(lambda _, resolve: resolve(1)).result(), 1)

    def test_of(self):
        task = Task.of(1)
        self.assertEqual(task.fork(lambda _, resolve: resolve(1)).result(), 1)

    def test_reject(self):
        task = Task.reject(1)
        self.assertEqual(task.fork(lambda _, resolve: resolve(1)).result(), 1)

    def test_map(self):
        task = Task.of(1).map(lambda x: x + 1)
        self.assertEqual(task.fork(lambda _, resolve: resolve(2)).result(), 2)

    def test_bind(self):
        task = Task.of(1).bind(lambda x: Task.of(x + 1))
        self.assertEqual(task.fork(lambda _, resolve: resolve(2)).result(), 2)

    def test_str_method(self):
        task = Task.of(1)
        result = str(task)
        self.assertEqual(result, "Task")

    def test_repr_method(self):
        task = Task.of(1)
        result = repr(task)
        self.assertEqual(result, "Task(1)")

if __name__ == '__main__':
    unittest.main()