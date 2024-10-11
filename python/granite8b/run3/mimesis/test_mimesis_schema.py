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
        self.assertIsNotNone(result)

    def test_magic_method(self):
        field = Field()
        result = str(field)
        self.assertEqual(result, 'Field <en>')

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