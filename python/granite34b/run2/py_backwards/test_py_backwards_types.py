import unittest
from py_backwards.types import CompilationTarget, CompilationResult, InputOutput, TransformationResult


class TestCompilationTarget(unittest.TestCase):
    def test_compilation_target(self):
        target = CompilationTarget(major=3, minor=7)
        self.assertEqual(target[0], 3)
        self.assertEqual(target[1], 7)

class TestCompilationResult(unittest.TestCase):
    def test_compilation_result(self):
        result = CompilationResult(10, 1.23, CompilationTarget(3, 7), tuple(['a', 'b', 'c']))
        self.assertEqual(result.files, 10)
        self.assertEqual(result.time, 1.23)
        self.assertEqual(result.target, CompilationTarget(3, 7))
        self.assertEqual(result.dependencies, ['a', 'b', 'c'])

class TestInputOutput(unittest.TestCase):
    def test_input_output(self):
        from pathlib import Path
        self.assertEqual(input_output.input, Path('/path/to/input'))
        self.assertEqual(input_output.output, Path('/path/to/output'))

class TestTransformationResult(unittest.TestCase):
    def test_transformation_result(self):
        import ast
        result = TransformationResult(tree, True, ['a', 'b', 'c'])
        self.assertEqual(result.tree, tree)
        self.assertEqual(result.tree_changed, True)
        self.assertEqual(result.dependencies, ['a', 'b', 'c'])

if __name__ == '__main__':
    unittest.main()