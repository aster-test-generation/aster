import unittest
from mimesis.schema import AbstractField, Schema
from mimesis.exceptions import (
    UnacceptableField,
    UndefinedField,
    UndefinedSchema,
    UnsupportedField,
)
from mimesis.providers.generic import Generic


class TestAbstractField(unittest.TestCase):
    def setUp(self):
        self.field = AbstractField()

    def test_init(self):
        self.assertEqual(self.field.locale, 'en')
        self.assertIsNone(self.field.seed)
        self.assertIsInstance(self.field._gen, Generic)
        self.assertEqual(self.field._table, {})

    def test_call_with_undefined_field(self):
        with self.assertRaises(UndefinedField):
            self.field()

    def test_call_with_unsupported_field(self):
        with self.assertRaises(UnsupportedField):
            self.field('unsupported_field')

    def test_call_with_unacceptable_field(self):
        with self.assertRaises(UnacceptableField):
            self.field('provider.method.submethod')

    def test_call_with_valid_field(self):
        result = self.field('name')
        self.assertIsInstance(result, str)

    def test_call_with_key_function(self):
        result = self.field('name', key=lambda x: x.upper())
        self.assertIsInstance(result, str)
        self.assertEqual(result, result.upper())

    def test_str_method(self):
        result = self.field.__str__()
        self.assertEqual(result, 'AbstractField <en>')

class TestSchema(unittest.TestCase):
    def setUp(self):
        self.schema = Schema(lambda: {'name': 'John'})

    def test_init_with_callable(self):
        self.assertTrue(callable(self.schema.schema))

    def test_init_with_non_callable(self):
        with self.assertRaises(UndefinedSchema):
            Schema({'name': 'John'})

    def test_create(self):
        result = self.schema.create(2)
        self.assertEqual(len(result), 2)
        self.assertEqual(result[0], {'name': 'John'})

if __name__ == '__main__':
    unittest.main()