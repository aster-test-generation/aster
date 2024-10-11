import unittest
from mimesis.builtins.ru import RussiaSpecProvider
from mimesis.enums import Gender


class TestRussiaSpecProvider(unittest.TestCase):
    def setUp(self):
        self.provider = RussiaSpecProvider()

    def test_generate_sentence(self):
        sentence = self.provider.generate_sentence()
        self.assertIsInstance(sentence, str)

    def test_patronymic(self):
        patronymic = self.provider.patronymic()
        self.assertIsInstance(patronymic, str)
        patronymic_female = self.provider.patronymic(gender=Gender.FEMALE)
        self.assertIsInstance(patronymic_female, str)
        patronymic_male = self.provider.patronymic(gender=Gender.MALE)
        self.assertIsInstance(patronymic_male, str)

    def test_passport_series(self):
        series = self.provider.passport_series()
        self.assertIsInstance(series, str)
        series_with_year = self.provider.passport_series(year=2023)
        self.assertIsInstance(series_with_year, str)

    def test_passport_number(self):
        number = self.provider.passport_number()
        self.assertIsInstance(number, int)

    def test_series_and_number(self):
        series_and_number = self.provider.series_and_number()
        self.assertIsInstance(series_and_number, str)

    def test_snils(self):
        snils = self.provider.snils()
        self.assertIsInstance(snils, str)

    def test_inn(self):
        inn = self.provider.inn()
        self.assertIsInstance(inn, str)

    def test_ogrn(self):
        ogrn = self.provider.ogrn()
        self.assertIsInstance(ogrn, str)

    def test_bic(self):
        bic = self.provider.bic()
        self.assertIsInstance(bic, str)

    def test_kpp(self):
        kpp = self.provider.kpp()
        self.assertIsInstance(kpp, str)

if __name__ == '__main__':
    unittest.main()