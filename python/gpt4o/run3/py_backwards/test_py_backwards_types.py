import unittest
from pathlib import Path
from typed_ast import ast3 as ast
from py_backwards.types import CompilationResult, InputOutput, TransformationResult


class TestCompilationResult(unittest.TestCase):
    def test_compilation_result_fields(self):
        result = CompilationResult(files=10, time=5.5, target=(3, 7), dependencies=['dep1', 'dep2'])
        self.assertEqual(result.files, 10)
        self.assertEqual(result.time, 5.5)
        self.assertEqual(result.target, (3, 7))
        self.assertEqual(result.dependencies, ['dep1', 'dep2'])

class TestInputOutput(unittest.TestCase):
    def test_input_output_fields(self):
        input_path = Path('/path/to/input')
        output_path = Path('/path/to/output')
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(io.input, input_path)
        self.assertEqual(io.output, output_path)

class TestTransformationResult(unittest.TestCase):
    def test_transformation_result_fields(self):
        tree = ast.AST()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=['dep1', 'dep2'])
        self.assertEqual(result.tree, tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(result.dependencies, ['dep1', 'dep2'])

if __name__ == '__main__':
    unittest.main()