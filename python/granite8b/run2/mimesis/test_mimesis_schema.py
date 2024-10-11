import unittest
from mimesis.schema import Field, Schema


class TestField(unittest.TestCase):
    def test_call_method(self):
        field = Field()
        result = field('choice')
        self.assertEqual(result, field._gen.choice)

    def test_call_method_with_key(self):
        field = Field()
        result = field('choice', key=lambda x: x.upper())
        self.assertEqual(result, field._gen.choice().upper())

    def test_call_method_with_kwargs(self):
        field = Field()
        result = field('choice', min=1, max=10)
        self.assertGreaterEqual(result, 1)
        self.assertLessEqual(result, 10)

    def test_call_private_method(self):
        field = Field()
        result = field('_gen.choice')
        self.assertEqual(result, field._gen.choice)

    def test_call_protected_method(self):
        field = Field()
        result = field('_AbstractField.__init__')
        self.assertEqual(result, field._AbstractField.__init__)

    def test_call_magic_method(self):
        field = Field()
        result = field('__str__')
        self.assertEqual(result, field.__str__)

class TestSchema(unittest.TestCase):
    def test_create_method(self):
        schema = Schema(lambda: {'name': 'John', 'age': 30})
        result = schema.create(iterations=2)
        self.assertEqual(len(result), 2)
        for item in result:
            self.assertEqual(item['name'], 'John')
            self.assertEqual(item['age'], 30)

if __name__ == '__main__':
    unittest.main()