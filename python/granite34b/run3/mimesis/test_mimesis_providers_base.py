import unittest
from mimesis.providers.base import BaseDataProvider, BaseProvider


class TestBaseProvider(unittest.TestCase):
    def test_base_provider_init(self):
        provider = BaseProvider()
        self.assertIsNone(provider.seed)
        self.assertEqual(provider.random, random)

    def test_base_provider_reseed(self):
        provider = BaseProvider()
        provider.reseed(12345)
        self.assertEqual(provider.seed, 12345)
        self.assertNotEqual(provider.random, random)

    def test_base_provider_validate_enum(self):
        class TestEnum(Enum):
            ONE = 1
            TWO = 2

        provider = BaseProvider()
        item = provider._validate_enum(None, TestEnum)
        self.assertIn(item, [1, 2])

        item = provider._validate_enum(TestEnum.ONE, TestEnum)
        self.assertEqual(item, 1)

        with self.assertRaises(NonEnumerableError):
            provider._validate_enum(3, TestEnum)

    def test_base_provider_str(self):
        provider = BaseProvider()
        self.assertEqual(str(provider), 'BaseProvider')

class TestBaseDataProvider(unittest.TestCase):
    def test_base_data_provider_init(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.locale, locales.DEFAULT_LOCALE)
        self.assertEqual(provider._data, {})
        self.assertEqual(provider._datafile, '')
        self.assertEqual(provider._data_dir, Path(__file__).parent.parent.joinpath('data'))

    def test_base_data_provider_setup_locale(self):
        provider = BaseDataProvider()
        provider._setup_locale('en')
        self.assertEqual(provider.locale, 'en')

        with self.assertRaises(UnsupportedLocale):
            provider._setup_locale('invalid_locale')

    def test_base_data_provider_update_dict(self):
        initial = {'a': 1, 'b': {'c': 2}}
        other = {'b': {'d': 3}, 'e': 4}
        expected = {'a': 1, 'b': {'c': 2, 'd': 3}, 'e': 4}

        provider = BaseDataProvider()
        result = provider._update_dict(initial, other)
        self.assertEqual(result, expected)

    def test_base_data_provider_pull(self):
        provider = BaseDataProvider()
        provider._pull('test_data.json')
        self.assertEqual(provider._data, {'key': 'value'})

    def test_base_data_provider_get_current_locale(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.get_current_locale(), locales.DEFAULT_LOCALE)

    def test_base_data_provider_override_locale(self):
        provider = BaseDataProvider()
        with provider.override_locale('en'):
            self.assertEqual(provider.locale, 'en')
        self.assertEqual(provider.locale, locales.DEFAULT_LOCALE)

    def test_base_data_provider_str(self):
        provider = BaseDataProvider()
        self.assertEqual(str(provider), 'BaseDataProvider <{}>'.format(locales.DEFAULT_LOCALE))

if __name__ == '__main__':
    unittest.main()