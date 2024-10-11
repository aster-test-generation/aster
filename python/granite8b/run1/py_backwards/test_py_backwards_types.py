import unittest
from py_backwards.types import *


class TestCompilationTarget(unittest.TestCase):
    def test_compilation_target_init(self):
        target = CompilationTarget(1, 2)
        self.assertEqual(target.files, 1)
        self.assertEqual(target.time, 2)

class TestCompilationResult(unittest.TestCase):
    def test_compilation_result_init(self):
        result = CompilationResult(files=1, time=2, target=CompilationTarget(1, 2), dependencies=['a', 'b'])
        self.assertEqual(result.files, 1)
        self.assertEqual(result.time, 2)
        self.assertEqual(result.target.files, 1)
        self.assertEqual(result.target.time, 2)
        self.assertEqual(result.dependencies, ['a', 'b'])

class TestInputOutput(unittest.TestCase):
    def test_input_output_init(self):
        io = InputOutput(input=Path('a'), output=Path('b'))
        self.assertEqual(io.input, Path('a'))
        self.assertEqual(io.output, Path('b'))

class TestTransformationResult(unittest.TestCase):
    def test_transformation_result_init(self):
        result = TransformationResult(tree=ast.AST(), tree_changed=True, dependencies=['a', 'b'])
        self.assertEqual(result.tree, expected_ast)
        self.assertEqual(result.tree_changed, True)
        self.assertEqual(result.dependencies, ['a', 'b'])

if __name__ == '__main__':
    unittest.main()