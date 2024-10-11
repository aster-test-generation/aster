import unittest
from py_backwards.types import CompilationResult, InputOutput, TransformationResult


class TestCompilationResult(unittest.TestCase):
    def test_compilation_result_init(self):
        result = CompilationResult(files=1, time=1.0, target=(1, 2), dependencies=['a', 'b'])
        self.assertEqual(result.files, 1)
        self.assertEqual(result.time, 1.0)
        self.assertEqual(result.target, (1, 2))
        self.assertEqual(result.dependencies, ['a', 'b'])

    def test_compilation_result_eq(self):
        result1 = CompilationResult(files=1, time=1.0, target=(1, 2), dependencies=['a', 'b'])
        result2 = CompilationResult(files=1, time=1.0, target=(1, 2), dependencies=['a', 'b'])
        self.assertEqual(result1, result2)

class TestInputOutput(unittest.TestCase):
    def test_input_output_init(self):
        input_path = Path('/path/to/input')
        output_path = Path('/path/to/output')
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(io.input, input_path)
        self.assertEqual(io.output, output_path)

    def test_input_output_eq(self):
        input_path = Path('/path/to/input')
        output_path = Path('/path/to/output')
        io1 = InputOutput(input=input_path, output=output_path)
        io2 = InputOutput(input=input_path, output=output_path)
        self.assertEqual(io1, io2)

class TestTransformationResult(unittest.TestCase):
    def test_transformation_result_init(self):
        tree = ast.Add()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=['a', 'b'])
        self.assertEqual(result.tree, tree)
        self.assertEqual(result.tree_changed, True)
        self.assertEqual(result.dependencies, ['a', 'b'])

    def test_transformation_result_eq(self):
        tree = ast.Add()
        result1 = TransformationResult(tree=tree, tree_changed=True, dependencies=['a', 'b'])
        result2 = TransformationResult(tree=tree, tree_changed=True, dependencies=['a', 'b'])
        self.assertEqual(result1, result2)

if __name__ == '__main__':
    unittest.main()