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

    def test_validate_enum(self):
        instance = BaseProvider()
        result = instance._validate_enum(None, locales.DEFAULT_LOCALE)
        self.assertEqual(result, locales.DEFAULT_LOCALE)

    def test_str(self):
        instance = BaseProvider()
        result = instance.__str__()
        self.assertEqual(result, "BaseProvider")

class TestBaseDataProvider(unittest.TestCase):
    def test_init(self):
        instance = BaseDataProvider()
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)
        self.assertEqual(instance.seed, None)
        self.assertEqual(instance.random, random)
        self.assertEqual(instance._data, {})
        self.assertEqual(instance._datafile, "")

    def test_setup_locale(self):
        instance = BaseDataProvider()
        instance._setup_locale()
        self.assertEqual(instance.locale, locales.DEFAULT_LOCALE)

    def test_update_dict(self):
        instance = BaseDataProvider()
        result = instance._update_dict({}, {})
        self.assertEqual(result, {})

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
        self.assertEqual(instance.seed, None)
        self.assertEqual(instance.random, random)
        self.assertEqual(instance._data, {})
        self.assertEqual(instance._datafile, "")

if __name__ == '__main__':
    unittest.main()