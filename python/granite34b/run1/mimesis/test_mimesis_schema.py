import unittest
from mimesis.schema import AbstractField, Schema


class TestAbstractField(unittest.TestCase):
    def setUp(self):
        self.field = AbstractField()

    def test_call_method(self):
        result = self.field('name')
        self.assertIsNotNone(result)

    def test_call_method_with_key(self):
        result = self.field('name', key=lambda x: x.upper())
        self.assertEqual(result, result.upper())

    def test_call_method_with_kwargs(self):
        result = self.field('name', length=10)
        self.assertEqual(len(result), 10)

    def test_call_method_with_invalid_name(self):
        with self.assertRaises(UnsupportedField):
            self.field('invalid_name')

    def test_call_method_with_invalid_key(self):
        with self.assertRaises(UnacceptableField):
            self.field('name', key=lambda x: x.split('.'))

    def test_str_method(self):
        result = str(self.field)
        self.assertEqual(result, 'AbstractField <en>')

class TestSchema(unittest.TestCase):
    def setUp(self):
        self.schema = Schema(lambda: {'name': 'John'})

    def test_create_method(self):
        result = self.schema.create()
        self.assertEqual(result, [{'name': 'John'}])

    def test_create_method_with_iterations(self):
        result = self.schema.create(iterations=3)
        self.assertEqual(result, [{'name': 'John'}] * 3)

if __name__ == '__main__':
    unittest.main()