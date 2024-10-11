import unittest
from py_backwards.types import CompilationTarget, CompilationResult, InputOutput, TransformationResult


class TestCompilationTarget(unittest.TestCase):
    def test_init(self):
        target = CompilationTarget((1, 2))
        self.assertEqual(target[0], 1)
        self.assertEqual(target[1], 2)

    def test_eq(self):
        target1 = CompilationTarget((1, 2))
        target2 = CompilationTarget((1, 2))
        self.assertEqual(target1, target2)

    def test_str(self):
        target = CompilationTarget((1, 2))
        self.assertEqual(str(target), "(1, 2)")

    def test_repr(self):
        target = CompilationTarget((1, 2))
        self.assertEqual(repr(target), "CompilationTarget((1, 2))")

class TestCompilationResult(unittest.TestCase):
    def test_init(self):
        result = CompilationResult(files=1, time=2.0, target=CompilationTarget((1, 2)), dependencies=["dep1", "dep2"])
        self.assertEqual(result.files, 1)
        self.assertEqual(result.time, 2.0)
        self.assertEqual(result.target, CompilationTarget((1, 2)))
        self.assertEqual(result.dependencies, ["dep1", "dep2"])

    def test_eq(self):
        result1 = CompilationResult(files=1, time=2.0, target=CompilationTarget((1, 2)), dependencies=["dep1", "dep2"])
        result2 = CompilationResult(files=1, time=2.0, target=CompilationTarget((1, 2)), dependencies=["dep1", "dep2"])
        self.assertEqual(result1, result2)

    def test_str(self):
        result = CompilationResult(files=1, time=2.0, target=CompilationTarget((1, 2)), dependencies=["dep1", "dep2"])
        self.assertEqual(str(result), "CompilationResult(files=1, time=2.0, target=(1, 2), dependencies=['dep1', 'dep2'])")

    def test_repr(self):
        result = CompilationResult(files=1, time=2.0, target=CompilationTarget((1, 2)), dependencies=["dep1", "dep2"])
        self.assertEqual(repr(result), "CompilationResult(files=1, time=2.0, target=CompilationTarget((1, 2)), dependencies=['dep1', 'dep2'])")

class TestInputOutput(unittest.TestCase):
    def test_init(self):
        input_path = Path("input.txt")
        output_path = Path("output.txt")
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(io.input, input_path)
        self.assertEqual(io.output, output_path)

    def test_eq(self):
        input_path = Path("input.txt")
        output_path = Path("output.txt")
        io1 = InputOutput(input=input_path, output=output_path)
        io2 = InputOutput(input=input_path, output=output_path)
        self.assertEqual(io1, io2)

    def test_str(self):
        input_path = Path("input.txt")
        output_path = Path("output.txt")
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(str(io), "InputOutput(input=input.txt, output=output.txt)")

    def test_repr(self):
        input_path = Path("input.txt")
        output_path = Path("output.txt")
        io = InputOutput(input=input_path, output=output_path)
        self.assertEqual(repr(io), "InputOutput(input=Path('input.txt'), output=Path('output.txt'))")

class TestTransformationResult(unittest.TestCase):
    def test_init(self):
        tree = ast.AST()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=["dep1", "dep2"])
        self.assertEqual(result.tree, tree)
        self.assertEqual(result.tree_changed, True)
        self.assertEqual(result.dependencies, ["dep1", "dep2"])

    def test_eq(self):
        tree = ast.AST()
        result1 = TransformationResult(tree=tree, tree_changed=True, dependencies=["dep1", "dep2"])
        result2 = TransformationResult(tree=tree, tree_changed=True, dependencies=["dep1", "dep2"])
        self.assertEqual(result1, result2)

    def test_str(self):
        tree = ast.AST()
        result = TransformationResult(tree=tree, tree_changed=True, dependencies=["dep1", "dep2"])
        self.assertEqual(str(result), "TransformationResult(tree=<_ast.AST object at 0x...>, tree_changed=True, dependencies=['dep1', 'dep2'])")

if __name__ == '__main__':
    unittest.main()