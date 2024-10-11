import unittest
from mimesis.builtins.ru import RussiaSpecProvider


class TestRussiaSpecProvider(unittest.TestCase):
    def setUp(self):
        self.provider = RussiaSpecProvider()

    def test_generate_sentence(self):
        sentence = self.provider.generate_sentence()
        self.assertIsInstance(sentence, str)
        self.assertGreater(len(sentence), 0)

    def test_patronymic(self):
        patronymic = self.provider.patronymic()
        self.assertIsInstance(patronymic, str)
        self.assertGreater(len(patronymic), 0)

    def test_passport_series(self):
        series = self.provider.passport_series()
        self.assertIsInstance(series, str)
        self.assertEqual(len(series), 6)

    def test_passport_number(self):
        number = self.provider.passport_number()
        self.assertIsInstance(number, int)
        self.assertGreater(number, 0)

    def test_series_and_number(self):
        series_and_number = self.provider.series_and_number()
        self.assertIsInstance(series_and_number, str)
        self.assertEqual(len(series_and_number), 10)

    def test_snils(self):
        snils = self.provider.snils()
        self.assertIsInstance(snils, str)
        self.assertEqual(len(snils), 11)

    def test_inn(self):
        inn = self.provider.inn()
        self.assertIsInstance(inn, str)
        self.assertEqual(len(inn), 10)

    def test_ogrn(self):
        ogrn = self.provider.ogrn()
        self.assertIsInstance(ogrn, str)
        self.assertEqual(len(ogrn), 13)

    def test_bic(self):
        bic = self.provider.bic()
        self.assertIsInstance(bic, str)
        self.assertEqual(len(bic), 11)

    def test_kpp(self):
        kpp = self.provider.kpp()
        self.assertIsInstance(kpp, str)
        self.assertEqual(len(kpp), 9)

if __name__ == '__main__':
    unittest.main()