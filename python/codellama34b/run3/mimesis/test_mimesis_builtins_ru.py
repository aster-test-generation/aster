import unittest
from mimesis.builtins.ru import RussiaSpecProvider



class TestRussiaSpecProvider(unittest.TestCase):
    def test_generate_sentence(self):
        instance = RussiaSpecProvider()
        result = instance.generate_sentence()
        self.assertIsInstance(result, str)

    def test_patronymic(self):
        instance = RussiaSpecProvider()
        result = instance.patronymic()
        self.assertIsInstance(result, str)

    def test_passport_series(self):
        instance = RussiaSpecProvider()
        result = instance.passport_series()
        self.assertIsInstance(result, str)

    def test_passport_number(self):
        instance = RussiaSpecProvider()
        result = instance.passport_number()
        self.assertIsInstance(result, int)

    def test_series_and_number(self):
        instance = RussiaSpecProvider()
        result = instance.series_and_number()
        self.assertIsInstance(result, str)

    def test_snils(self):
        instance = RussiaSpecProvider()
        result = instance.snils()
        self.assertIsInstance(result, str)

    def test_inn(self):
        instance = RussiaSpecProvider()
        result = instance.inn()
        self.assertIsInstance(result, str)

    def test_ogrn(self):
        instance = RussiaSpecProvider()
        result = instance.ogrn()
        self.assertIsInstance(result, str)

    def test_bic(self):
        instance = RussiaSpecProvider()
        result = instance.bic()
        self.assertIsInstance(result, str)

    def test_kpp(self):
        instance = RussiaSpecProvider()
        result = instance.kpp()
        self.assertIsInstance(result, str)

    def test_generate_sentence_with_gender(self):
        instance = RussiaSpecProvider()
        result = instance.generate_sentence(gender=Gender.FEMALE)
        self.assertIsInstance(result, str)

    def test_patronymic_with_gender(self):
        instance = RussiaSpecProvider()
        result = instance.patronymic(gender=Gender.MALE)
        self.assertIsInstance(result, str)

    def test_passport_series_with_year(self):
        instance = RussiaSpecProvider()
        result = instance.passport_series(year=1999)
        self.assertIsInstance(result, str)

    def test_series_and_number_with_year(self):
        instance = RussiaSpecProvider()
        result = instance.series_and_number(year=1999)
        self.assertIsInstance(result, str)

    def test_snils_with_year(self):
        instance = RussiaSpecProvider()
        result = instance.snils(year=1999)
        self.assertIsInstance(result, str)

    def test_inn_with_year(self):
        instance = RussiaSpecProvider()
        result = instance.inn(year=1999)
        self.assertIsInstance(result, str)

    def test_ogrn_with_year(self):
        instance = RussiaSpecProvider()
        result = instance.ogrn(year=1999)
        self.assertIsInstance(result, str)

    def test_bic_with_year(self):
        instance = RussiaSpecProvider()
        result = instance.bic(year=1999)
        self.assertIsInstance(result, str)

    def test_kpp_with_year(self):
        instance = RussiaSpecProvider()
        result = instance.kpp(year=1999)
        self.assertIsInstance(result, str)

    def test_generate_sentence_with_seed(self):
        instance = RussiaSpecProvider(seed=123)
        result = instance.generate_sentence()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()