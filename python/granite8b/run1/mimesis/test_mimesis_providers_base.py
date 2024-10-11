from mimesis.providers.base import Random
import unittest
from mimesis.providers.base import BaseProvider, BaseDataProvider


class TestBaseProvider(unittest.TestCase):
    def test___init__(self):
        provider = BaseProvider()
        self.assertIsInstance(provider.random, Random)
        self.assertEqual(provider.seed, None)
        provider = BaseProvider(seed=42)
        self.assertEqual(provider.seed, 42)

    def test_reseed(self):
        provider = BaseProvider(seed=42)
        self.assertEqual(provider.seed, 42)
        provider.reseed(seed=1337)
        self.assertEqual(provider.seed, 1337)

    def test___str__(self):
        provider = BaseProvider()
        self.assertEqual(str(provider), 'BaseProvider')

class TestBaseDataProvider(unittest.TestCase):
    def test___init__(self):
        provider = BaseDataProvider()
        self.assertIsInstance(provider.random, Random)
        self.assertEqual(provider.seed, None)
        provider = BaseDataProvider(seed=42)
        self.assertEqual(provider.seed, 42)
        provider = BaseDataProvider(locale='en')
        self.assertEqual(provider.locale, 'en')

    def test_reseed(self):
        provider = BaseDataProvider(seed=42)
        self.assertEqual(provider.seed, 42)
        provider.reseed(seed=1337)
        self.assertEqual(provider.seed, 1337)

    def test___str__(self):
        provider = BaseDataProvider()
        self.assertEqual(str(provider), 'BaseDataProvider <en>')

    def test___override_locale(self):
        provider = BaseDataProvider(locale='en')
        self.assertEqual(provider.locale, 'en')
        provider._override_locale(locale='ru')
        self.assertEqual(provider.locale, 'ru')

    def test_override_locale(self):
        provider = BaseDataProvider(locale='en')
        self.assertEqual(provider.locale, 'en')
        with provider.override_locale(locale='ru'):
            self.assertEqual(provider.locale, 'ru')
        self.assertEqual(provider.locale, 'en')

    def test___pull(self):
        provider = BaseDataProvider(locale='en')
        self.assertEqual(provider._data, {})
        provider._pull(datafile='test.json')
        self.assertNotEqual(provider._data, {})

    def test_get_current_locale(self):
        provider = BaseDataProvider(locale='en')
        self.assertEqual(provider.get_current_locale(), 'en')

if __name__ == '__main__':
    unittest.main()