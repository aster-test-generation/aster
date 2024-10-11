import unittest
from mimesis.providers.base import BaseDataProvider, BaseProvider


class TestBaseProvider(unittest.TestCase):
    def test_base_provider_init(self):
        provider = BaseProvider()
        self.assertIsNone(provider.seed)
        self.assertIsInstance(provider.random, Random)

    def test_base_provider_reseed(self):
        provider = BaseProvider(seed=42)
        self.assertEqual(provider.seed, 42)
        provider.reseed(100)
        self.assertEqual(provider.seed, 100)

    def test_base_provider_validate_enum(self):
        class TestEnum(Enum):
            one = 1
            two = 2

        provider = BaseProvider()
        item = provider._validate_enum(None, TestEnum)
        self.assertIn(item, [1, 2])
        item = provider._validate_enum(TestEnum.one, TestEnum)
        self.assertEqual(item, 1)
        with self.assertRaises(NonEnumerableError):
            provider._validate_enum(3, TestEnum)

    def test_base_provider_str(self):
        provider = BaseProvider()
        self.assertEqual(str(provider), "BaseProvider")

class TestBaseDataProvider(unittest.TestCase):
    def test_base_data_provider_init(self):
        provider = BaseDataProvider()
        self.assertEqual(provider.locale, locales.DEFAULT_LOCALE)
        self.assertEqual(provider._datafile, "")
        self.assertEqual(provider._data_dir, Path(__file__).parent.parent.joinpath('data'))

    def test_base_data_provider_setup_locale(self):
        provider = BaseDataProvider()
        provider._setup_locale(locale="en")
        self.assertEqual(provider.locale, "en")
        with self.assertRaises(UnsupportedLocale):
            provider._setup_locale(locale="invalid")

    def test_base_data_provider_update_dict(self):
        initial = {"a": 1, "b": {"c": 2}}
        other = {"b": {"d": 3}, "e": 4}
        expected = {"a": 1, "b": {"c": 2, "d": 3}, "e": 4}
        provider = BaseDataProvider()
        result = provider._update_dict(initial, other)
        self.assertEqual(result, expected)

    def test_base_data_provider_pull(self):
        provider = BaseDataProvider()
        provider._pull(datafile="test.json")
        self.assertEqual(provider._data, {"key": "value"})

    def test_base_data_provider_get_current_locale(self):
        provider = BaseDataProvider()
        provider.locale = "en"
        self.assertEqual(provider.get_current_locale(), "en")

    def test_base_data_provider_override_locale(self):
        provider = BaseDataProvider()
        with provider.override_locale(locale="en"):
            self.assertEqual(provider.locale, "en")
        self.assertEqual(provider.locale, locales.DEFAULT_LOCALE)

    def test_base_data_provider_str(self):
        provider = BaseDataProvider()
        provider.locale = "en"
        self.assertEqual(str(provider), "BaseDataProvider <en>")

if __name__ == '__main__':
    unittest.main()