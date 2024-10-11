import unittest
from mimesis.schema import Field, Schema


class TestField(unittest.TestCase):
    def setUp(self):
        self.field = Field()

    def test_call_method(self):
        result = self.field('name')
        self.assertIsNotNone(result)

    def test_call_method_with_key(self):
        def key(x):
            return x.upper()

        result = self.field('name', key=key)
        self.assertIsNotNone(result)
        self.assertEqual(result.upper(), result)

    def test_call_private_method(self):
        result = self.field('__str__')
        self.assertEqual(result, 'Field <en>')

    def test_call_protected_method(self):
        result = self.field('_AbstractField__table')
        self.assertDictEqual(result, {})

    def test_call_magic_method(self):
        result = self.field('__init__')
        self.assertIsNone(result)

class TestSchema(unittest.TestCase):
    def setUp(self):
        def schema():
            return {'name': 'John', 'age': 30}

        self.schema = Schema(schema)

    def test_create_schema(self):
        result = self.schema.create()
        self.assertListEqual(result, [{'name': 'John', 'age': 30}])

    def test_create_schema_with_iterations(self):
        result = self.schema.create(iterations=2)
        self.assertListEqual(result, [{'name': 'John', 'age': 30}, {'name': 'John', 'age': 30}])

if __name__ == '__main__':
    unittest.main()