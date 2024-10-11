import unittest
from py_backwards.utils.snippet import snippet

class ExampleClass:
    def method_one(self, x):
        return x + 1

    def method_two(self, y):
        return y * 2

    def _protected_method(self, z):
        return z + 3

    def __private_method(self, z):
        return z ** 2

    def __str__(self):
        return "ExampleClass"

    def __repr__(self):
        return f"ExampleClass({self.method_one(0)})"

def example_function(z):
    return z - 1

class TestExampleClass(unittest.TestCase):
    def test_method_one(self):
        instance = ExampleClass()
        result = instance.method_one(1)
        self.assertEqual(result, 2)

    def test_method_two(self):
        instance = ExampleClass()
        result = instance.method_two(2)
        self.assertEqual(result, 4)

    def test_protected_method(self):
        instance = ExampleClass()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_private_method(self):
        instance = ExampleClass()
        result = instance._ExampleClass__private_method(3)
        self.assertEqual(result, 9)

    def test_str_method(self):
        instance = ExampleClass()
        result = instance.__str__()
        self.assertEqual(result, "ExampleClass")

    def test_repr_method(self):
        instance = ExampleClass()
        result = instance.__repr__()
        self.assertEqual(result, "ExampleClass(1)")

class TestExampleFunction(unittest.TestCase):
    def test_example_function(self):
        result = example_function(3)
        self.assertEqual(result, 2)

class TestSnippet(unittest.TestCase):
    def test_snippet(self):
        @snippet
        def test_snippet(x: int, y: int) -> None:
            let(z = x + y)
            extend(z)

        tree = test_snippet.get_body(x=1, y=2)
        self.assertEqual(len(tree), 3)
        self.assertEqual(tree[0].targets[0].id, 'z')
        self.assertEqual(tree[0].value.left.id, 'x')
        self.assertEqual(tree[0].value.op, '+')
        self.assertEqual(tree[0].value.right.id, 'y')
        self.assertEqual(tree[1].func.id, 'extend')
        self.assertEqual(tree[1].args[0].id, 'z')
        self.assertEqual(tree[2].func.id, 'print')
        self.assertEqual(tree[2].args[0].id, 'z')

if __name__ == '__main__':
    unittest.main()