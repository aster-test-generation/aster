import unittest
from mimesis.schema import AbstractField, Schema, Field


class TestAbstractField(unittest.TestCase):
    def test_init(self):
        instance = AbstractField(locale='en', seed=123)
        self.assertEqual(instance.locale, 'en')
        self.assertEqual(instance.seed, 123)

    def test_call(self):
        instance = AbstractField(locale='en', seed=123)
        result = instance('name', key=lambda x: x.upper())
        self.assertIsInstance(result, str)

    def test_call_undefined_field(self):
        instance = AbstractField(locale='en', seed=123)
        with self.assertRaises(UndefinedField):
            instance(None)

    def test_call_unsupported_field(self):
        instance = AbstractField(locale='en', seed=123)
        with self.assertRaises(UnsupportedField):
            instance('unsupported_field')

    def test_str_method(self):
        instance = AbstractField(locale='en', seed=123)
        result = instance.__str__()
        self.assertEqual(result, 'AbstractField <en>')

    def test_private_method__table(self):
        instance = AbstractField(locale='en', seed=123)
        instance._AbstractField__table = {'name': lambda: 'value'}
        result = instance._AbstractField__table['name']()
        self.assertEqual(result, 'value')

    def test_private_method_tail_parser(self):
        instance = AbstractField(locale='en', seed=123)
        result = instance._AbstractField__tail_parser('provider.method', instance._gen)
        self.assertIsInstance(result, callable)

class TestSchema(unittest.TestCase):
    def test_init(self):
        schema = lambda: {'name': 'value'}
        instance = Schema(schema)
        self.assertEqual(instance.schema, schema)

    def test_init_undefined_schema(self):
        with self.assertRaises(UndefinedSchema):
            Schema(None)

    def test_create(self):
        schema = lambda: {'name': 'value'}
        instance = Schema(schema)
        result = instance.create(iterations=2)
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], dict)

if __name__ == '__main__':
    unittest.main()