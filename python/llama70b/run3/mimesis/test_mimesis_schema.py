import unittest
from mimesis.schema import AbstractField, Schema, Field


class TestAbstractField(unittest.TestCase):
    def test_init(self):
        instance = AbstractField(locale='en', seed=42)
        self.assertEqual(instance.locale, 'en')
        self.assertEqual(instance.seed, 42)

    def test_call(self):
        instance = AbstractField(locale='en', seed=42)
        result = instance('name', key=lambda x: x.upper())
        self.assertIsInstance(result, str)

    def test_call_undefined_field(self):
        instance = AbstractField(locale='en', seed=42)
        with self.assertRaises(UndefinedField):
            instance(None)

    def test_call_unsupported_field(self):
        instance = AbstractField(locale='en', seed=42)
        with self.assertRaises(UnsupportedField):
            instance('unsupported_field')

    def test_str_method(self):
        instance = AbstractField(locale='en', seed=42)
        result = instance.__str__()
        self.assertEqual(result, 'AbstractField <en>')

    def test_private_method__table(self):
        instance = AbstractField(locale='en', seed=42)
        instance._AbstractField__table['test'] = lambda: 'test'
        self.assertIn('test', instance._AbstractField__table)

    def test_private_method__gen(self):
        instance = AbstractField(locale='en', seed=42)
        self.assertIsInstance(instance._AbstractField__gen, Generic)

class TestSchema(unittest.TestCase):
    def test_init(self):
        schema = lambda: {'test': 'test'}
        instance = Schema(schema)
        self.assertEqual(instance.schema, schema)

    def test_init_undefined_schema(self):
        with self.assertRaises(UndefinedSchema):
            Schema(None)

    def test_create(self):
        schema = lambda: {'test': 'test'}
        instance = Schema(schema)
        result = instance.create(iterations=2)
        self.assertEqual(len(result), 2)
        self.assertEqual(result[0], {'test': 'test'})

class TestField(unittest.TestCase):
    def test_field(self):
        instance = Field(locale='en', seed=42)
        self.assertIsInstance(instance, AbstractField)

if __name__ == '__main__':
    unittest.main()