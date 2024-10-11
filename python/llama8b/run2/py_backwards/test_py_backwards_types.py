import unittest
from py_backwards.types import CompilationTarget, CompilationResult, InputOutput, TransformationResult
from typing import List, Tuple, NamedTuple


class TestCompilationTarget(unittest.TestCase):
    def test_compilation_target(self):
        target = CompilationTarget(1, 2)
        self.assertEqual(target, (1, 2))

class TestCompilationResult(unittest.TestCase):
    def test_compilation_result(self):
        result = CompilationResult(1, 2.0, CompilationTarget(1, 2), ['file1', 'file2'])
        self.assertEqual(result.files, 1)
        self.assertEqual(result.time, 2.0)
        self.assertEqual(result.target, CompilationTarget(1, 2))
        self.assertEqual(result.dependencies, ['file1', 'file2'])

class TestInputOutput(unittest.TestCase):
    def test_input_output(self):
        input_path = Path('input.txt')
        output_path = Path('output.txt')
        io = InputOutput(input_path, output_path)
        self.assertEqual(io.input, input_path)
        self.assertEqual(io.output, output_path)

class TestTransformationResult(unittest.TestCase):
    def test_transformation_result(self):
        tree = ast.parse('''
            def foo():
                pass
        ''')
        result = TransformationResult(tree, True, ['file1', 'file2'])
        self.assertEqual(result.tree, tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.dependencies, ['file1', 'file2'])

if __name__ == '__main__':
    unittest.main()