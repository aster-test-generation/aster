import unittest
from mimesis.providers.base import *


class TestBaseProvider(unittest.TestCase):
    def test_init(self):
        instance = BaseProvider()
        self.assertIsInstance(instance, BaseProvider)
    def test_reseed(self):
        instance = BaseProvider()
        instance.reseed()
        self.assertIsInstance(instance, BaseProvider)
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
        self.assertIsInstance(instance, BaseDataProvider)
    def test_setup_locale(self):
        instance = BaseDataProvider()
        instance._setup_locale(locales.DEFAULT_LOCALE)
        self.assertIsInstance(instance, BaseDataProvider)
    def test_update_dict(self):
        instance = BaseDataProvider()
        result = instance._update_dict({}, {})
        self.assertEqual(result, {})
    def test_pull(self):
        instance = BaseDataProvider()
        instance._pull()
        self.assertIsInstance(instance, BaseDataProvider)
    def test_get_current_locale(self):
        instance = BaseDataProvider()
        result = instance.get_current_locale()
        self.assertEqual(result, locales.DEFAULT_LOCALE)
    def test_override_locale(self):
        instance = BaseDataProvider()
        instance._override_locale(locales.EN)
        self.assertIsInstance(instance, BaseDataProvider)
    def test_override_locale_context(self):
        instance = BaseDataProvider()
        with instance.override_locale(locales.EN):
            pass
        self.assertIsInstance(instance, BaseDataProvider)
    def test_str(self):
        instance = BaseDataProvider()
        result = instance.__str__()
        self.assertEqual(result, "BaseDataProvider <en>")

if __name__ == '__main__':
    unittest.main()