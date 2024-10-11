import unittest
from typing import NamedTuple, Tuple, List
from typed_ast import ast3 as ast
from pathlib import Path
from py_backwards.types import CompilationTarget, CompilationResult, InputOutput, TransformationResult


class TestTypes(unittest.TestCase):
    def test_compilation_result(self):
        result = CompilationResult(files=1, time=1.0, target=(3, 7), dependencies=['a', 'b'])
        self.assertEqual(result.files, 1)
        self.assertEqual(result.time, 1.0)
        self.assertEqual(result.target, (3, 7))
        self.assertEqual(result.dependencies, ['a', 'b'])

    def test_input_output(self):
        result = InputOutput(input=Path('/path/to/input'), output=Path('/path/to/output'))
        self.assertEqual(result.input, Path('/path/to/input'))
        self.assertEqual(result.output, Path('/path/to/output'))

    def test_transformation_result(self):
        tree = ast.parse('x = 1')
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=['a', 'b'])
        self.assertEqual(result.tree, tree)
        self.assertEqual(result.tree_changed, True)
        self.assertEqual(result.dependencies, ['a', 'b'])

if __name__ == '__main__':
    unittest.main()