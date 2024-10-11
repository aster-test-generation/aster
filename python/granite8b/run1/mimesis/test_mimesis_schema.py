import unittest
from mimesis.schema import Field, Schema


class TestField(unittest.TestCase):
    def test_call_method(self):
        field = Field()
        result = field('choice')
        self.assertIsNotNone(result)

    def test_private_method(self):
        field = Field()
        result = field._AbstractField__call('choice')
        self.assertIsNotNone(result)

    def test_protected_method(self):
        field = Field()
        result = field._AbstractField__table
        self.assertIsInstance(result, dict)

    def test_magic_method(self):
        field = Field()
        result = str(field)
        self.assertIsInstance(result, str)

class TestSchema(unittest.TestCase):
    def test_create_method(self):
        schema = Schema(lambda: {'name': 'John', 'age': 30})
        result = schema.create(iterations=2)
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], dict)
        self.assertEqual(result[0]['name'], 'John')
        self.assertEqual(result[0]['age'], 30)

if __name__ == '__main__':
    unittest.main()