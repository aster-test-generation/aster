from py_backwards.types import Path
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
        self.assertTrue(target1 == target2)

    def test_neq(self):
        target1 = CompilationTarget((1, 2))
        target2 = CompilationTarget((2, 3))
        self.assertTrue(target1 != target2)

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
        self.assertTrue(result1 == result2)

    def test_neq(self):
        result1 = CompilationResult(files=1, time=2.0, target=CompilationTarget((1, 2)), dependencies=["dep1", "dep2"])
        result2 = CompilationResult(files=2, time=3.0, target=CompilationTarget((2, 3)), dependencies=["dep3", "dep4"])
        self.assertTrue(result1 != result2)

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
        self.assertTrue(io1 == io2)

    def test_neq(self):
        input_path = Path("input.txt")
        output_path = Path("output.txt")
        io1 = InputOutput(input=input_path, output=output_path)
        io2 = InputOutput(input=Path("other_input.txt"), output=Path("other_output.txt"))
        self.assertTrue(io1 != io2)

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


if __name__ == '__main__':
    unittest.main()