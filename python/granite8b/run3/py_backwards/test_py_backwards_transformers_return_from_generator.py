import unittest
from py_backwards.transformers.return_from_generator import ReturnFromGeneratorTransformer


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def test_find_generator_returns(self):
        class ExampleClass:
            def method_one(self):
                return 1

            def method_two(self):
                yield 2

            def method_three(self):
                for i in range(3):
                    yield i

        instance = ExampleClass()
        tree = ast.parse(source)
        returns = transformer._find_generator_returns(instance.method_two)
        self.assertEqual(len(returns), 1)
        self.assertEqual(returns[0][0], instance.method_two)
        self.assertEqual(returns[0][1].value.n, 2)
        returns = transformer._find_generator_returns(instance.method_three)
        self.assertEqual(len(returns), 1)
        self.assertEqual(returns[0][0], instance.method_three)
        self.assertEqual(returns[0][1].value.n, 2)

    def test_replace_return(self):
        class ExampleClass:
            def method_one(self):
                return 1

            def method_two(self):
                yield 2

            def method_three(self):
                for i in range(3):
                    yield i

        instance = ExampleClass()
        tree = ast.parse("def func():\n    yield 1\n    yield 2\n")
        transformer._replace_return(instance.method_two, instance.method_two.body[0])
        self.assertEqual(instance.method_two().send(None), 1)
        transformer._replace_return(instance.method_three, instance.method_three.body[0])
        self.assertEqual(list(instance.method_three()), [0, 1, 2])

if __name__ == '__main__':
    unittest.main()