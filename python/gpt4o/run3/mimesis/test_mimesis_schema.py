from mimesis.schema import Generic
import unittest
from mimesis.schema import AbstractField, Schema, UndefinedField, UnacceptableField, UnsupportedField, UndefinedSchema


class TestAbstractField(unittest.TestCase):
    def setUp(self):
        self.field = AbstractField()

    def test_init(self):
        self.assertEqual(self.field.locale, 'en')
        self.assertIsNone(self.field.seed)
        self.assertIsInstance(self.field._gen, Generic)

    def test_call_with_undefined_field(self):
        with self.assertRaises(UndefinedField):
            self.field()

    def test_call_with_unsupported_field(self):
        with self.assertRaises(UnsupportedField):
            self.field('unsupported_field')

    def test_call_with_valid_field(self):
        result = self.field('name')
        self.assertIsInstance(result, str)

    def test_call_with_key_function(self):
        result = self.field('name', key=lambda x: x.upper())
        self.assertIsInstance(result, str)
        self.assertEqual(result, result.upper())

    def test_call_with_unacceptable_field(self):
        with self.assertRaises(UnacceptableField):
            self.field('provider.method.submethod')

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

    def test_create_single_iteration(self):
        result = self.schema.create()
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0], {'name': 'John'})

    def test_create_multiple_iterations(self):
        result = self.schema.create(iterations=3)
        self.assertEqual(len(result), 3)
        self.assertEqual(result[0], {'name': 'John'})
        self.assertEqual(result[1], {'name': 'John'})
        self.assertEqual(result[2], {'name': 'John'})

if __name__ == '__main__':
    unittest.main()