import unittest
from mimesis.providers.base import *


class TestBaseProvider(unittest.TestCase):
    def test_init(self):
        instance = BaseProvider()
        self.assertEqual(instance.seed, None)
        self.assertEqual(instance.random, random)
    def test_reseed(self):
        instance = BaseProvider()
        instance.reseed()
        self.assertEqual(instance.seed, None)
        self.assertEqual(instance.random, random)
        instance.reseed(1)
        self.assertEqual(instance.seed, 1)
        self.assertNotEqual(instance.random, random)
    def test_validate_enum(self):
        instance = BaseProvider()
        result = instance._validate_enum(None, locales.Locale)
        self.assertEqual(result, locales.Locale.en)
        result = instance._validate_enum(locales.Locale.en, locales.Locale)
        self.assertEqual(result, locales.Locale.en)
        with self.assertRaises(NonEnumerableError):
            instance._validate_enum(1, locales.Locale)
    def test_str(self):
        instance = BaseProvider()
        result = instance.__str__()
        self.assertEqual(result, "BaseProvider")
class TestBaseDataProvider(unittest.TestCase):
    def test_init(self):
        instance = BaseDataProvider()
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)
        self.assertEqual(instance._data, {})
        self.assertEqual(instance._datafile, '')
        self.assertEqual(instance._data_dir, Path(__file__).parent.parent.joinpath('data'))
    def test_setup_locale(self):
        instance = BaseDataProvider()
        instance._setup_locale()
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)
        instance._setup_locale(locales.EN)
        self.assertEqual(instance.locale, locales.EN)
        with self.assertRaises(UnsupportedLocale):
            instance._setup_locale(1)
    def test_update_dict(self):
        instance = BaseDataProvider()
        result = instance._update_dict({}, {})
        self.assertEqual(result, {})
        result = instance._update_dict({1: 1}, {1: 2})
        self.assertEqual(result, {1: 2})
        result = instance._update_dict({1: 1}, {2: 2})
        self.assertEqual(result, {1: 1, 2: 2})
        result = instance._update_dict({1: {2: 3}}, {1: 2})
        self.assertEqual(result, {1: 2})
        result = instance._update_dict({1: {2: 3}}, {1: {2: 4}})
        self.assertEqual(result, {1: {2: 4}})
    def test_pull(self):
        instance = BaseDataProvider()
        instance._pull()
        self.assertEqual(instance._data, {})
    def test_get_current_locale(self):
        instance = BaseDataProvider()
        result = instance.get_current_locale()
        self.assertEqual(result, locales.DEFAULT_LOCALE)
    def test_override_locale(self):
        instance = BaseDataProvider()
        instance._override_locale()
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)
        self.assertEqual(instance._data, {})
        instance._override_locale(locales.EN)
        self.assertEqual(instance.locale, locales.EN)
        self.assertEqual(instance._data, {})

if __name__ == '__main__':
    unittest.main()