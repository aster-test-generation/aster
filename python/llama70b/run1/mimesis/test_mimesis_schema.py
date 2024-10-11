import unittest
from mimesis.schema import AbstractField, Schema, Field


class TestAbstractField(unittest.TestCase):
    def test_init(self):
        field = AbstractField(locale='en', seed=123)
        self.assertEqual(field.locale, 'en')
        self.assertEqual(field.seed, 123)

    def test_call(self):
        field = AbstractField(locale='en', seed=123)
        result = field(name='test', key=lambda x: x.upper())
        self.assertIsInstance(result, str)

    def test_call_undefined_field(self):
        field = AbstractField(locale='en', seed=123)
        with self.assertRaises(UndefinedField):
            field(name=None)

    def test_call_unsupported_field(self):
        field = AbstractField(locale='en', seed=123)
        with self.assertRaises(UnsupportedField):
            field(name='unsupported')

    def test_str_method(self):
        field = AbstractField(locale='en', seed=123)
        result = field.__str__()
        self.assertEqual(result, 'AbstractField <en>')

    def test_repr_method(self):
        field = AbstractField(locale='en', seed=123)
        result = field.__repr__()
        self.assertEqual(result, 'AbstractField(locale=\'en\', seed=123)')

    def test_private_method__table(self):
        field = AbstractField(locale='en', seed=123)
        result = field._AbstractField__table
        self.assertIsInstance(result, dict)

    def test_protected_method__gen(self):
        field = AbstractField(locale='en', seed=123)
        result = field._gen
        self.assertIsInstance(result, Generic)

class TestSchema(unittest.TestCase):
    def test_init(self):
        schema = Schema(schema=lambda: {'test': 'value'})
        self.assertIsInstance(schema.schema, Callable)

    def test_create(self):
        schema = Schema(schema=lambda: {'test': 'value'})
        result = schema.create(iterations=2)
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], dict)

    def test_init_undefined_schema(self):
        with self.assertRaises(UndefinedSchema):
            Schema(schema=None)

if __name__ == '__main__':
    unittest.main()