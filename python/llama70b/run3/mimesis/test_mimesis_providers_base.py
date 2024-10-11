import unittest
from mimesis.providers.base import BaseProvider, BaseDataProvider


class TestBaseProvider(unittest.TestCase):
    def test_init(self):
        instance = BaseProvider()
        self.assertIsNone(instance.seed)
        self.assertEqual(instance.random, random)

    def test_reseed(self):
        instance = BaseProvider()
        instance.reseed(42)
        self.assertEqual(instance.seed, 42)
        self.assertIsInstance(instance.random, Random)

    def test_validate_enum(self):
        instance = BaseProvider()
        enum = ['a', 'b', 'c']
        result = instance._validate_enum(None, enum)
        self.assertIn(result, enum)

    def test_str(self):
        instance = BaseProvider()
        result = instance.__str__()
        self.assertEqual(result, 'BaseProvider')

class TestBaseDataProvider(unittest.TestCase):
    def test_init(self):
        instance = BaseDataProvider()
        self.assertIsNone(instance.seed)
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)
        self.assertEqual(instance._data, {})

    def test_setup_locale(self):
        instance = BaseDataProvider()
        instance._setup_locale('en')
        self.assertEqual(instance.locale, 'en')

    def test_update_dict(self):
        instance = BaseDataProvider()
        initial = {'a': 1}
        other = {'a': 2, 'b': 3}
        result = instance._update_dict(initial, other)
        self.assertEqual(result, {'a': 2, 'b': 3})

    def test_pull(self):
        instance = BaseDataProvider()
        instance._pull()
        self.assertIsNotNone(instance._data)

    def test_get_current_locale(self):
        instance = BaseDataProvider()
        result = instance.get_current_locale()
        self.assertEqual(result, locales.DEFAULT_LOCALE)

    def test_override_locale(self):
        instance = BaseDataProvider()
        with instance.override_locale('fr') as provider:
            self.assertEqual(provider.locale, 'fr')
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)

    def test_str(self):
        instance = BaseDataProvider()
        result = instance.__str__()
        self.assertEqual(result, 'BaseDataProvider <{}>'.format(locales.DEFAULT_LOCALE))

if __name__ == '__main__':
    unittest.main()