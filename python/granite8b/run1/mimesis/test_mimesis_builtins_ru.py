import unittest
from mimesis.builtins.ru import RussiaSpecProvider


class TestRussiaSpecProvider(unittest.TestCase):
    def test_generate_sentence(self):
        provider = RussiaSpecProvider()
        sentence = provider.generate_sentence()
        self.assertIsInstance(sentence, str)
        self.assertGreater(len(sentence), 0)

    def test_patronymic(self):
        provider = RussiaSpecProvider()
        patronymic = provider.patronymic()
        self.assertIsInstance(patronymic, str)
        self.assertGreater(len(patronymic), 0)

    def test_passport_series(self):
        provider = RussiaSpecProvider()
        series = provider.passport_series()
        self.assertIsInstance(series, str)
        self.assertEqual(len(series), 2)

    def test_passport_number(self):
        provider = RussiaSpecProvider()
        number = provider.passport_number()
        self.assertIsInstance(number, int)
        self.assertGreater(number, 0)

    def test_series_and_number(self):
        provider = RussiaSpecProvider()
        series_and_number = provider.series_and_number()
        self.assertIsInstance(series_and_number, str)
        self.assertEqual(len(series_and_number), 11)

    def test_snils(self):
        provider = RussiaSpecProvider()
        snils = provider.snils()
        self.assertIsInstance(snils, str)
        self.assertEqual(len(snils), 11)

    def test_inn(self):
        provider = RussiaSpecProvider()
        inn = provider.inn()
        self.assertIsInstance(inn, str)
        self.assertEqual(len(inn), 10)

    def test_ogrn(self):
        provider = RussiaSpecProvider()
        ogrn = provider.ogrn()
        self.assertIsInstance(ogrn, str)
        self.assertEqual(len(ogrn), 13)

    def test_bic(self):
        provider = RussiaSpecProvider()
        bic = provider.bic()
        self.assertIsInstance(bic, str)
        self.assertEqual(len(bic), 11)

    def test_kpp(self):
        provider = RussiaSpecProvider()
        kpp = provider.kpp()
        self.assertIsInstance(kpp, str)
        self.assertEqual(len(kpp), 9)

if __name__ == '__main__':
    unittest.main()