import unittest
from mimesis.providers.base import BaseProvider, BaseDataProvider
from mimesis.exceptions import NonEnumerableError, UnsupportedLocale
from mimesis import locales
from mimesis.random import Random


class TestBaseProvider(unittest.TestCase):
    def test_init_with_seed(self):
        instance = BaseProvider(seed=42)
        self.assertEqual(instance.seed, 42)

    def test_init_without_seed(self):
        instance = BaseProvider()
        self.assertIsNone(instance.seed)

    def test_reseed(self):
        instance = BaseProvider()
        instance.reseed(42)
        self.assertEqual(instance.seed, 42)

    def test_validate_enum_with_none(self):
        instance = BaseProvider()
        result = instance._validate_enum(None, list)
        self.assertIsInstance(result, str)

    def test_validate_enum_with_valid_item(self):
        instance = BaseProvider()
        result = instance._validate_enum('a', str)
        self.assertEqual(result, 'a')

    def test_validate_enum_with_invalid_item(self):
        instance = BaseProvider()
        with self.assertRaises(NonEnumerableError):
            instance._validate_enum(1, str)

    def test_str_method(self):
        instance = BaseProvider()
        result = instance.__str__()
        self.assertEqual(result, "BaseProvider")

class TestBaseDataProvider(unittest.TestCase):
    def test_init_with_locale_and_seed(self):
        instance = BaseDataProvider(locale=locales.EN, seed=42)
        self.assertEqual(instance.locale, locales.EN)
        self.assertEqual(instance.seed, 42)

    def test_init_without_locale_and_seed(self):
        instance = BaseDataProvider()
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)
        self.assertIsNone(instance.seed)

    def test_setup_locale_with_supported_locale(self):
        instance = BaseDataProvider()
        instance._setup_locale(locales.EN)
        self.assertEqual(instance.locale, locales.EN)

    def test_setup_locale_with_unsupported_locale(self):
        instance = BaseDataProvider()
        with self.assertRaises(UnsupportedLocale):
            instance._setup_locale('unsupported_locale')

    def test_update_dict(self):
        instance = BaseDataProvider()
        initial = {'a': 1, 'b': {'c': 2}}
        other = {'b': {'d': 3}, 'e': 4}
        result = instance._update_dict(initial, other)
        self.assertEqual(result, {'a': 1, 'b': {'c': 2, 'd': 3}, 'e': 4})

    def test_pull(self):
        instance = BaseDataProvider()
        instance._datafile = 'test.json'
        instance._pull()
        self.assertIsInstance(instance._data, dict)

    def test_get_current_locale(self):
        instance = BaseDataProvider()
        result = instance.get_current_locale()
        self.assertEqual(result, locales.DEFAULT_LOCALE)

    def test_override_locale(self):
        instance = BaseDataProvider()
        instance._override_locale(locales.EN)
        self.assertEqual(instance.locale, locales.EN)

    def test_override_locale_context_manager(self):
        instance = BaseDataProvider()
        with instance.override_locale(locales.EN):
            self.assertEqual(instance.locale, locales.EN)
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)

    def test_str_method(self):
        instance = BaseDataProvider()
        result = instance.__str__()
        self.assertEqual(result, f"BaseDataProvider <{locales.DEFAULT_LOCALE}>")

if __name__ == '__main__':
    unittest.main()