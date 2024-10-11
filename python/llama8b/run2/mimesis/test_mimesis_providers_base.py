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
        self.assertEqual(provider._validate_enum(1, enum), 1)
        self.assertEqual(provider._validate_enum(None, enum), get_random_item(enum, provider.random))
        with self.assertRaises(NonEnumerableError):
            provider._validate_enum('a', enum)

    def test_str(self):
        provider = BaseProvider()
        self.assertEqual(provider.__str__(), 'BaseProvider')

    def test_repr(self):
        provider = BaseProvider()
        self.assertEqual(provider.__repr__(), 'BaseProvider()')

class TestBaseDataProvider(unittest.TestCase):
    def test_init(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.locale, locales.DEFAULT_LOCALE)
        self.assertEqual(provider.seed, None)
        self.assertEqual(provider.random, BaseProvider.random)

    def test_setup_locale(self):
        provider = BaseDataProvider()
        provider._setup_locale('en')
        self.assertEqual(provider.locale, 'en')

    def test_update_dict(self):
        provider = BaseDataProvider()
        initial = {}
        other = {'a': 1, 'b': {'c': 2}}
        result = provider._update_dict(initial, other)
        self.assertEqual(result, {'a': 1, 'b': {'c': 2}})

    def test_pull(self):
        provider = BaseDataProvider()
        provider._pull()
        self.assertIsNotNone(provider._data)

    def test_get_current_locale(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.get_current_locale(), locales.DEFAULT_LOCALE)

    def test_override_locale(self):
        provider = BaseDataProvider()
        provider._override_locale('en')
        self.assertEqual(provider.locale, 'en')
        provider._override_locale(locales.DEFAULT_LOCALE)
        self.assertEqual(provider.locale, locales.DEFAULT_LOCALE)

    def test_override_locale_context_manager(self):
        provider = BaseDataProvider()
        with provider.override_locale('en'):
            self.assertEqual(provider.locale, 'en')
        self.assertEqual(provider.locale, locales.DEFAULT_LOCALE)

    def test_str(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.__str__(), 'BaseDataProvider <{}>'.format(locales.DEFAULT_LOCALE))

    def test_repr(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.__repr__(), 'BaseDataProvider()')

if __name__ == '__main__':
    unittest.main()