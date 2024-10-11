import unittest
from py_backwards.types import CompilationResult, InputOutput, TransformationResult
from typed_ast import ast3 as ast
from pathlib import Path


class TestCompilationResult(unittest.TestCase):
    def test_compilation_result_fields(self):
        result = CompilationResult(files=10, time=5.0, target=(3, 7), dependencies=['dep1', 'dep2'])
        self.assertEqual(result.files, 10)
        self.assertEqual(result.time, 5.0)
        self.assertEqual(result.target, (3, 7))
        self.assertEqual(result.dependencies, ['dep1', 'dep2'])

    def test_compilation_result_str(self):
        result = CompilationResult(files=10, time=5.0, target=(3, 7), dependencies=['dep1', 'dep2'])
        self.assertEqual(str(result), "CompilationResult(files=10, time=5.0, target=(3, 7), dependencies=['dep1', 'dep2'])")

    def test_compilation_result_repr(self):
        result = CompilationResult(files=10, time=5.0, target=(3, 7), dependencies=['dep1', 'dep2'])
        self.assertEqual(repr(result), "CompilationResult(files=10, time=5.0, target=(3, 7), dependencies=['dep1', 'dep2'])")

class TestInputOutput(unittest.TestCase):
    def test_input_output_fields(self):
        input_path = Path('/input/path')
        output_path = Path('/output/path')
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(io.input, input_path)
        self.assertEqual(io.output, output_path)

    def test_input_output_str(self):
        input_path = Path('/input/path')
        output_path = Path('/output/path')
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(str(io), f"InputOutput(input={input_path.as_posix()}, output={output_path.as_posix()})")

    def test_input_output_repr(self):
        input_path = Path('/input/path')
        output_path = Path('/output/path')
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(str(io), f"InputOutput(input={input_path}, output={output_path})")

class TestTransformationResult(unittest.TestCase):
    def test_transformation_result_fields(self):
        tree = ast.AST()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=['dep1', 'dep2'])
        self.assertEqual(result.tree, tree)
        self.assertEqual(result.tree_changed, True)
        self.assertEqual(result.dependencies, ['dep1', 'dep2'])

    def test_transformation_result_str(self):
        tree = ast.AST()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=['dep1', 'dep2'])
        self.assertEqual(str(result), f"TransformationResult(tree={tree}, tree_changed=True, dependencies=['dep1', 'dep2'])")

    def test_transformation_result_repr(self):
        tree = ast.AST()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=['dep1', 'dep2'])
        self.assertEqual(repr(result), f"TransformationResult(tree={tree}, tree_changed=True, dependencies=['dep1', 'dep2'])")

if __name__ == '__main__':
    unittest.main()