import unittest
from py_backwards.types import CompilationTarget, CompilationResult, InputOutput, TransformationResult


class TestCompilationTarget(unittest.TestCase):
    def test_compilation_target(self):
        target = CompilationTarget(1, 2)
        self.assertEqual(target.files, 1)
        self.assertEqual(target.time, 2)

class TestCompilationResult(unittest.TestCase):
    def test_compilation_result(self):
        result = CompilationResult(files=1, time=2, target=CompilationTarget(1, 2), dependencies=['a', 'b'])
        self.assertEqual(result.files, 1)
        self.assertEqual(result.time, 2)
        self.assertEqual(result.target.files, 1)
        self.assertEqual(result.target.time, 2)
        self.assertEqual(result.dependencies, ['a', 'b'])

class TestInputOutput(unittest.TestCase):
    def test_input_output(self):
        input_path = Path('input.txt')
        output_path = Path('output.txt')
        input_output = InputOutput(input_path, output_path)
        self.assertEqual(input_output.input, input_path)
        self.assertEqual(input_output.output, output_path)

class TestTransformationResult(unittest.TestCase):
    def test_transformation_result(self):
        import ast
        result = TransformationResult(tree, True, ['a', 'b'])
        self.assertEqual(result.tree, tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.dependencies, ['a', 'b'])

if __name__ == '__main__':
    unittest.main()