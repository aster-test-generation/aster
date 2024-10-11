import unittest
from mimesis.schema import AbstractField, Schema


class TestAbstractField(unittest.TestCase):
    def test_call_method(self):
        field = AbstractField()
        result = field('name')
        self.assertIsNotNone(result)

    def test_str_method(self):
        field = AbstractField()
        result = str(field)
        self.assertEqual(result, 'AbstractField <en>')

class TestSchema(unittest.TestCase):
    def test_create_method(self):
        schema = Schema(lambda: {'name': 'John'})
        result = schema.create()
        self.assertEqual(result, [{'name': 'John'}])

if __name__ == '__main__':
    unittest.main()