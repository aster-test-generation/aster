import unittest
from mimesis.providers.base import BaseDataProvider, BaseProvider


class TestBaseProvider(unittest.TestCase):
    def test_init(self):
        provider = BaseProvider()
        self.assertIsNone(provider.seed)
        self.assertEqual(provider.random, random)
        provider = BaseProvider(seed=12345)
        self.assertEqual(provider.seed, 12345)
        self.assertEqual(provider.random, random)
        provider.reseed(seed=54321)
        self.assertEqual(provider.seed, 54321)
        self.assertEqual(provider.random, random)

    def test_validate_enum(self):
        class TestEnum(Enum):
            one = 1
            two = 2
        provider = BaseProvider()
        result = provider._validate_enum(None, TestEnum)
        self.assertIn(result, [1, 2])
        result = provider._validate_enum(TestEnum.one, TestEnum)
        self.assertEqual(result, 1)
        with self.assertRaises(NonEnumerableError):
            provider._validate_enum(3, TestEnum)

    def test_str(self):
        provider = BaseProvider()
        self.assertEqual(str(provider), 'BaseProvider')

class TestBaseDataProvider(unittest.TestCase):
    def test_init(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.locale, locales.DEFAULT_LOCALE)
        self.assertEqual(provider._data, {})
        self.assertEqual(provider._datafile, '')
        self.assertEqual(provider._data_dir, Path(__file__).parent.parent.joinpath('data'))
        provider = BaseDataProvider(locale='en')
        self.assertEqual(provider.locale, 'en')
        with self.assertRaises(UnsupportedLocale):
            BaseDataProvider(locale='invalid')

    def test_update_dict(self):
        initial = {'a': 1, 'b': {'c': 2}}
        other = {'b': {'d': 3}, 'e': 4}
        result = BaseDataProvider._update_dict(initial, other)
        expected = {'a': 1, 'b': {'c': 2, 'd': 3}, 'e': 4}
        self.assertEqual(result, expected)

    def test_pull(self):
        provider = BaseDataProvider()
        provider._pull()
        self.assertIsNotNone(provider._data)

    def test_get_current_locale(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.get_current_locale(), locales.DEFAULT_LOCALE)

    def test_override_locale(self):
        provider = BaseDataProvider()
        with provider.override_locale('en'):
            self.assertEqual(provider.locale, 'en')
        self.assertEqual(provider.locale, locales.DEFAULT_LOCALE)

    def test_str(self):
        provider = BaseDataProvider()
        self.assertEqual(str(provider), 'BaseDataProvider <{}>'.format(locales.DEFAULT_LOCALE))

if __name__ == '__main__':
    unittest.main()