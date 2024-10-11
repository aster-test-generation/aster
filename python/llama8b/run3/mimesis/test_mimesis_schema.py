import unittest
from mimesis.schema import AbstractField, Schema


class TestAbstractField(unittest.TestCase):
    def test_init(self):
        field = AbstractField(locale='en', seed=123, providers=['provider1', 'provider2'])
        self.assertEqual(field.locale, 'en')
        self.assertEqual(field.seed, 123)
        self.assertEqual(field._gen.locale, 'en')
        self.assertEqual(field._gen.seed, 123)
        self.assertEqual(field._gen.providers, ['provider1', 'provider2'])
        self.assertEqual(field._table, {})

    def test_call(self):
        field = AbstractField(locale='en', seed=123, providers=['provider1', 'provider2'])
        result = field('name', key=lambda x: x * 2)
        self.assertEqual(result, 2)

    def test_call_with_provider(self):
        field = AbstractField(locale='en', seed=123, providers=['provider1', 'provider2'])
        result = field('provider1.method', key=lambda x: x * 2)
        self.assertEqual(result, 2)

    def test_call_with_tail_parser(self):
        field = AbstractField(locale='en', seed=123, providers=['provider1', 'provider2'])
        result = field('provider1.method1.method2', key=lambda x: x * 2)
        self.assertEqual(result, 2)

    def test_call_with_unacceptable_field(self):
        field = AbstractField(locale='en', seed=123, providers=['provider1', 'provider2'])
        with self.assertRaises(UnacceptableField):
            field('provider1.method.method')

    def test_call_with_supported_field(self):
        field = AbstractField(locale='en', seed=123, providers=['provider1', 'provider2'])
        result = field('provider1.choice')
        self.assertEqual(result, 'choice')

    def test_call_with_unsupported_field(self):
        field = AbstractField(locale='en', seed=123, providers=['provider1', 'provider2'])
        with self.assertRaises(UnsupportedField):
            field('unsupported_field')

    def test_str(self):
        field = AbstractField(locale='en', seed=123, providers=['provider1', 'provider2'])
        self.assertEqual(str(field), 'AbstractField <en>')

class TestSchema(unittest.TestCase):
    def test_init(self):
        schema = Schema(lambda: {'name': 'John', 'age': 30})
        self.assertEqual(schema.schema, lambda: {'name': 'John', 'age': 30})

    def test_create(self):
        schema = Schema(lambda: {'name': 'John', 'age': 30})
        result = schema.create(iterations=2)
        self.assertEqual(len(result), 2)
        self.assertEqual(result[0], {'name': 'John', 'age': 30})
        self.assertEqual(result[1], {'name': 'John', 'age': 30})

if __name__ == '__main__':
    unittest.main()