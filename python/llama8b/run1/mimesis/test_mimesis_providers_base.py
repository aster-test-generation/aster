import unittest
from mimesis.providers.base import BaseProvider, BaseDataProvider


class TestBaseProvider(unittest.TestCase):
    def test_init(self):
        provider = BaseProvider()
        self.assertEqual(provider.seed, None)
        self.assertEqual(provider.random, BaseProvider.random)

    def test_reseed(self):
        provider = BaseProvider()
        provider.reseed(123)
        self.assertEqual(provider.seed, 123)
        self.assertEqual(provider.random.seed, 123)

    def test_validate_enum(self):
        provider = BaseProvider()
        enum = [1, 2, 3]
        result = provider._validate_enum(1, enum)
        self.assertEqual(result, 1)
        result = provider._validate_enum(None, enum)
        self.assertIn(result, enum)
        with self.assertRaises(NonEnumerableError):
            provider._validate_enum('a', enum)

    def test_str(self):
        provider = BaseProvider()
        self.assertEqual(str(provider), 'BaseProvider')

    def test_repr(self):
        provider = BaseProvider()
        self.assertEqual(repr(provider), 'BaseProvider()')

class TestBaseDataProvider(unittest.TestCase):
    def test_init(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.seed, None)
        self.assertEqual(provider.locale, 'en')
        self.assertEqual(provider._data, {})
        self.assertEqual(provider._datafile, '')
        self.assertEqual(provider._data_dir, Path(__file__).parent.parent.joinpath('data'))

    def test_setup_locale(self):
        provider = BaseDataProvider()
        provider._setup_locale('fr')
        self.assertEqual(provider.locale, 'fr')
        with self.assertRaises(UnsupportedLocale):
            provider._setup_locale('invalid_locale')

    def test_update_dict(self):
        provider = BaseDataProvider()
        initial = {'a': 1, 'b': 2}
        other = {'a': 3, 'c': 4}
        result = provider._update_dict(initial, other)
        self.assertEqual(result, {'a': 3, 'b': 2, 'c': 4})

    def test_pull(self):
        provider = BaseDataProvider()
        provider._pull()
        self.assertEqual(provider._data, {})

    def test_get_current_locale(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.get_current_locale(), 'en')

    def test_override_locale(self):
        provider = BaseDataProvider()
        provider._override_locale('fr')
        self.assertEqual(provider.locale, 'fr')
        provider._override_locale('en')
        self.assertEqual(provider.locale, 'en')

    def test_override_locale_context_manager(self):
        provider = BaseDataProvider()
        with provider.override_locale('fr'):
            self.assertEqual(provider.locale, 'fr')
        self.assertEqual(provider.locale, 'en')

    def test_str(self):
        provider = BaseDataProvider()
        self.assertEqual(str(provider), 'BaseDataProvider <en>')

    def test_repr(self):
        provider = BaseDataProvider()
        self.assertEqual(repr(provider), 'BaseDataProvider()')

if __name__ == '__main__':
    unittest.main()