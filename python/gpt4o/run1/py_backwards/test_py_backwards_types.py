import unittest
from pathlib import Path
from typing import List
from typed_ast import ast3 as ast
from py_backwards.types import CompilationResult, InputOutput, TransformationResult


class TestCompilationResult(unittest.TestCase):
    def test_compilation_result_files(self):
        result = CompilationResult(files=5, time=10.0, target=(3, 7), dependencies=['dep1', 'dep2'])
        self.assertEqual(result.files, 5)

    def test_compilation_result_time(self):
        result = CompilationResult(files=5, time=10.0, target=(3, 7), dependencies=['dep1', 'dep2'])
        self.assertEqual(result.time, 10.0)

    def test_compilation_result_target(self):
        result = CompilationResult(files=5, time=10.0, target=(3, 7), dependencies=['dep1', 'dep2'])
        self.assertEqual(result.target, (3, 7))

    def test_compilation_result_dependencies(self):
        result = CompilationResult(files=5, time=10.0, target=(3, 7), dependencies=['dep1', 'dep2'])
        self.assertEqual(result.dependencies, ['dep1', 'dep2'])

class TestInputOutput(unittest.TestCase):
    def test_input_output_input(self):
        input_path = Path('/path/to/input')
        output_path = Path('/path/to/output')
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(io.input, input_path)

    def test_input_output_output(self):
        input_path = Path('/path/to/input')
        output_path = Path('/path/to/output')
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(io.output, output_path)

class TestTransformationResult(unittest.TestCase):
    def test_transformation_result_tree(self):
        tree = ast.AST()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=['dep1', 'dep2'])
        self.assertEqual(result.tree, tree)

    def test_transformation_result_tree_changed(self):
        tree = ast.AST()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=['dep1', 'dep2'])
        self.assertTrue(result.tree_changed)

    def test_transformation_result_dependencies(self):
        tree = ast.AST()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=['dep1', 'dep2'])
        self.assertEqual(result.dependencies, ['dep1', 'dep2'])

if __name__ == '__main__':
    unittest.main()