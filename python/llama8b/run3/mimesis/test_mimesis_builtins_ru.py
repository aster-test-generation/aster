import unittest
from mimesis.builtins.ru import RussiaSpecProvider


class TestRussiaSpecProvider(unittest.TestCase):
    def test_init(self):
        provider = RussiaSpecProvider()
        self.assertEqual(provider.locale, 'ru')
        self.assertEqual(provider.seed, None)

    def test_generate_sentence(self):
        provider = RussiaSpecProvider()
        sentence = provider.generate_sentence()
        self.assertIsInstance(sentence, str)

    def test_patronymic(self):
        provider = RussiaSpecProvider()
        patronymic = provider.patronymic()
        self.assertIsInstance(patronymic, str)

    def test_passport_series(self):
        provider = RussiaSpecProvider()
        series = provider.passport_series()
        self.assertIsInstance(series, str)

    def test_passport_number(self):
        provider = RussiaSpecProvider()
        number = provider.passport_number()
        self.assertIsInstance(number, int)

    def test_series_and_number(self):
        provider = RussiaSpecProvider()
        series_and_number = provider.series_and_number()
        self.assertIsInstance(series_and_number, str)

    def test_snils(self):
        provider = RussiaSpecProvider()
        snils = provider.snils()
        self.assertIsInstance(snils, str)

    def test_inn(self):
        provider = RussiaSpecProvider()
        inn = provider.inn()
        self.assertIsInstance(inn, str)

    def test_ogrn(self):
        provider = RussiaSpecProvider()
        ogrn = provider.ogrn()
        self.assertIsInstance(ogrn, str)

    def test_bic(self):
        provider = RussiaSpecProvider()
        bic = provider.bic()
        self.assertIsInstance(bic, str)

    def test_kpp(self):
        provider = RussiaSpecProvider()
        kpp = provider.kpp()
        self.assertIsInstance(kpp, str)

    def test_str(self):
        provider = RussiaSpecProvider()
        self.assertIsInstance(str(provider), str)

    def test_repr(self):
        provider = RussiaSpecProvider()
        self.assertIsInstance(repr(provider), str)

if __name__ == '__main__':
    unittest.main()