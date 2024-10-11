import unittest
from mimesis.providers.base import BaseProvider, BaseDataProvider
from mimesis.locales import DEFAULT_LOCALE, SUPPORTED_LOCALES, LOCALE_SEPARATOR
from mimesis.exceptions import NonEnumerableError, UnsupportedLocale
from mimesis.random import Random, random
from unittest.mock import patch, mock_open
import json


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

    def test_validate_enum_with_none_item(self):
        instance = BaseProvider()
        enum = [1, 2, 3]
        result = instance._validate_enum(None, enum)
        self.assertIn(result, enum)

    def test_validate_enum_with_valid_item(self):
        instance = BaseProvider()
        enum = [1, 2, 3]
        result = instance._validate_enum(2, enum)
        self.assertEqual(result, 2)

    def test_validate_enum_with_invalid_item(self):
        instance = BaseProvider()
        enum = [1, 2, 3]
        with self.assertRaises(NonEnumerableError):
            instance._validate_enum(4, enum)

    def test_str_method(self):
        instance = BaseProvider()
        self.assertEqual(str(instance), "BaseProvider")

class TestBaseDataProvider(unittest.TestCase):
    def setUp(self):
        self.instance = BaseDataProvider(locale=DEFAULT_LOCALE)

    def test_init(self):
        self.assertEqual(self.instance.locale, DEFAULT_LOCALE)
        self.assertEqual(self.instance._data, {})
        self.assertTrue(self.instance._data_dir.exists())

    def test_setup_locale_with_supported_locale(self):
        self.instance._setup_locale('en')
        self.assertEqual(self.instance.locale, 'en')

    def test_setup_locale_with_unsupported_locale(self):
        with self.assertRaises(UnsupportedLocale):
            self.instance._setup_locale('unsupported_locale')

    def test_update_dict(self):
        initial = {'a': 1, 'b': {'c': 2}}
        other = {'b': {'d': 3}, 'e': 4}
        result = self.instance._update_dict(initial, other)
        self.assertEqual(result, {'a': 1, 'b': {'c': 2, 'd': 3}, 'e': 4})

    @patch('builtins.open', new_callable=mock_open, read_data='{"key": "value"}')
    def test_pull(self, mock_file):
        self.instance._datafile = 'test.json'
        self.instance._pull()
        self.assertEqual(self.instance._data, {"key": "value"})

    def test_get_current_locale(self):
        self.assertEqual(self.instance.get_current_locale(), DEFAULT_LOCALE)

    def test_override_locale(self):
        with self.instance.override_locale('en'):
            self.assertEqual(self.instance.locale, 'en')
        self.assertEqual(self.instance.locale, DEFAULT_LOCALE)

    def test_str_method(self):
        self.assertEqual(str(self.instance), f"BaseDataProvider <{DEFAULT_LOCALE}>")

if __name__ == '__main__':
    unittest.main()