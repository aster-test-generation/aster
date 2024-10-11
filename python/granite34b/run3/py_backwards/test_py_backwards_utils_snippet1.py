import unittest
from py_backwards.utils.snippet import snippet, let, extend

class TestSnippet(unittest.TestCase):
    def test_let(self):
        let(x=1)
        self.assertEqual(x, 1)

    def test_extend(self):
        extend(x=2)
        self.assertEqual(x, 2)

    def test_snippet(self):
        class MyClass:
            def __init__(self, x):
                self.x = x

            def __str__(self):
                return f"MyClass({self.x})"

            def __repr__(self):
                return f"MyClass({self.x})"

            def __eq__(self, other):
                return self.x == other.x

        snippet_kwargs = {'x': 3}
        snippet_body = snippet(MyClass).get_body(**snippet_kwargs)
        result = exec(compile(''.join(map(str, snippet_body)), '<string>', 'exec'))
        instance = result['MyClass'](**snippet_kwargs)
        self.assertEqual(instance.x, 3)
        self.assertEqual(str(instance), "MyClass(3)")
        self.assertEqual(repr(instance), "MyClass(3)")
        self.assertEqual(instance, MyClass(3))

if __name__ == '__main__':
    unittest.main()