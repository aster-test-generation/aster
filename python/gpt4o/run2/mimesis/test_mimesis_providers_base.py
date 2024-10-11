import unittest
from unittest.mock import patch, mock_open
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
        with patch('mimesis.random.get_random_item', return_value=42):
            result = instance._validate_enum(None, [1, 2, 3])
            self.assertEqual(result, 42)

    def test_validate_enum_with_valid_item(self):
        instance = BaseProvider()
        result = instance._validate_enum(2, [1, 2, 3])
        self.assertEqual(result, 2)

    def test_validate_enum_with_invalid_item(self):
        instance = BaseProvider()
        with self.assertRaises(NonEnumerableError):
            instance._validate_enum(4, [1, 2, 3])

    def test_str_method(self):
        instance = BaseProvider()
        self.assertEqual(str(instance), 'BaseProvider')

class TestBaseDataProvider(unittest.TestCase):
    def test_init_with_locale_and_seed(self):
        instance = BaseDataProvider(locale='en', seed=42)
        self.assertEqual(instance.locale, 'en')
        self.assertEqual(instance.seed, 42)

    def test_init_without_locale_and_seed(self):
        instance = BaseDataProvider()
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)
        self.assertIsNone(instance.seed)

    def test_setup_locale_with_supported_locale(self):
        instance = BaseDataProvider()
        instance._setup_locale('en')
        self.assertEqual(instance.locale, 'en')

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

    @patch('builtins.open', new_callable=mock_open, read_data='{"key": "value"}')
    @patch('mimesis.providers.base.Path.joinpath', return_value='dummy_path')
    def test_pull(self, mock_joinpath, mock_open):
        instance = BaseDataProvider(locale='en')
        instance._datafile = 'datafile.json'
        instance._pull()
        self.assertEqual(instance._data, {"key": "value"})

    def test_get_current_locale(self):
        instance = BaseDataProvider(locale='en')
        self.assertEqual(instance.get_current_locale(), 'en')

    @patch.object(BaseDataProvider, '_pull')
    def test_override_locale(self, mock_pull):
        instance = BaseDataProvider(locale='en')
        with instance.override_locale('fr'):
            self.assertEqual(instance.locale, 'fr')
        self.assertEqual(instance.locale, 'en')

    def test_str_method(self):
        instance = BaseDataProvider(locale='en')
        self.assertEqual(str(instance), 'BaseDataProvider <en>')

if __name__ == '__main__':
    unittest.main()