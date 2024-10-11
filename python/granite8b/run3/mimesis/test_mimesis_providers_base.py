from mimesis.providers.base import Random
import unittest
from mimesis.providers.base import BaseProvider, BaseDataProvider


class TestBaseProvider(unittest.TestCase):
    def test___init__(self):
        provider = BaseProvider()
        self.assertIsInstance(provider.random, Random)
        self.assertEqual(provider.seed, None)
        provider = BaseProvider(seed=123)
        self.assertIsInstance(provider.random, Random)
        self.assertEqual(provider.seed, 123)

    def test_reseed(self):
        provider = BaseProvider(seed=123)
        self.assertEqual(provider.seed, 123)
        provider.reseed(seed=456)
        self.assertEqual(provider.seed, 456)
        provider.reseed()
        self.assertIsNotNone(provider.seed)

    def test___str__(self):
        provider = BaseProvider()
        self.assertEqual(str(provider), 'BaseProvider')

class TestBaseDataProvider(unittest.TestCase):
    def test___init__(self):
        provider = BaseDataProvider()
        self.assertIsInstance(provider.random, Random)
        self.assertEqual(provider.seed, None)
        provider = BaseDataProvider(seed=123)
        self.assertIsInstance(provider.random, Random)
        self.assertEqual(provider.seed, 123)
        provider = BaseDataProvider(locale='en')
        self.assertEqual(provider.locale, 'en')
        provider = BaseDataProvider(locale='en_US')
        self.assertEqual(provider.locale, 'en_US')

    def test_reseed(self):
        provider = BaseDataProvider(seed=123)
        self.assertEqual(provider.seed, 123)
        provider.reseed(seed=456)
        self.assertEqual(provider.seed, 456)
        provider.reseed()
        self.assertIsNotNone(provider.seed)

if __name__ == '__main__':
    unittest.main()