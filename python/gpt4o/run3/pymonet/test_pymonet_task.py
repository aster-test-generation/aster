import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        fork = lambda reject, resolve: resolve(42)
        task = Task(fork)
        self.assertEqual(task.fork, fork)

    def test_of(self):
        task = Task.of(42)
        result = []
        task.fork(lambda x: result.append(f"reject: {x}"), lambda x: result.append(f"resolve: {x}"))
        self.assertEqual(result, ["resolve: 42"])

    def test_reject(self):
        task = Task.reject(42)
        result = []
        task.fork(lambda x: result.append(f"reject: {x}"), lambda x: result.append(f"resolve: {x}"))
        self.assertEqual(result, ["reject: 42"])

    def test_map(self):
        task = Task.of(42).map(lambda x: x + 1)
        result = []
        task.fork(lambda x: result.append(f"reject: {x}"), lambda x: result.append(f"resolve: {x}"))
        self.assertEqual(result, ["resolve: 43"])

    def test_bind(self):
        task = Task.of(42).bind(lambda x: Task.of(x + 1))
        result = []
        task.fork(lambda x: result.append(f"reject: {x}"), lambda x: result.append(f"resolve: {x}"))
        self.assertEqual(result, ["resolve: 43"])

if __name__ == '__main__':
    unittest.main()