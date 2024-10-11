import unittest
from py_backwards.types import *


class TestCompilationTarget(unittest.TestCase):
    def test_compilation_target(self):
        result = CompilationTarget((1, 2))
        self.assertEqual(result, (1, 2))

class TestCompilationResult(unittest.TestCase):
    def test_compilation_result(self):
        result = CompilationResult(1, 2.0, (3, 4), [5])
        self.assertEqual(result, (1, 2.0, (3, 4), [5]))

class TestInputOutput(unittest.TestCase):
    def test_input_output(self):
        result = InputOutput(Path('a'), Path('b'))
        self.assertEqual(result, (Path('a'), Path('b')))

class TestTransformationResult(unittest.TestCase):
    def test_transformation_result(self):
        result = TransformationResult(1, True, [2])
        self.assertEqual(result, (1, True, [2]))

if __name__ == '__main__':
    unittest.main()