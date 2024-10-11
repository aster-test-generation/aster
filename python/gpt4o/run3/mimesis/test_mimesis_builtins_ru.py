import unittest
from mimesis.builtins.ru import RussiaSpecProvider
from mimesis.enums import Gender


class TestRussiaSpecProvider(unittest.TestCase):
    def setUp(self):
        self.provider = RussiaSpecProvider()

    def test_generate_sentence(self):
        result = self.provider.generate_sentence()
        self.assertIsInstance(result, str)

    def test_patronymic_male(self):
        result = self.provider.patronymic(Gender.MALE)
        self.assertIsInstance(result, str)

    def test_patronymic_female(self):
        result = self.provider.patronymic(Gender.FEMALE)
        self.assertIsInstance(result, str)

    def test_passport_series_with_year(self):
        result = self.provider.passport_series(15)
        self.assertIsInstance(result, str)

    def test_passport_series_without_year(self):
        result = self.provider.passport_series()
        self.assertIsInstance(result, str)

    def test_passport_number(self):
        result = self.provider.passport_number()
        self.assertIsInstance(result, int)

    def test_series_and_number(self):
        result = self.provider.series_and_number()
        self.assertIsInstance(result, str)

    def test_snils(self):
        result = self.provider.snils()
        self.assertIsInstance(result, str)

    def test_inn(self):
        result = self.provider.inn()
        self.assertIsInstance(result, str)

    def test_ogrn(self):
        result = self.provider.ogrn()
        self.assertIsInstance(result, str)

    def test_bic(self):
        result = self.provider.bic()
        self.assertIsInstance(result, str)

    def test_kpp(self):
        result = self.provider.kpp()
        self.assertIsInstance(result, str)

    def test_private_method_control_sum_n2(self):
        numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
        result = self.provider._RussiaSpecProvider__control_sum(numbers, 'n2')
        self.assertIsInstance(result, int)

    def test_private_method_control_sum_n1(self):
        numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
        result = self.provider._RussiaSpecProvider__control_sum(numbers, 'n1')
        self.assertIsInstance(result, int)

    def test_meta_name(self):
        self.assertEqual(self.provider.Meta.name, 'russia_provider')

if __name__ == '__main__':
    unittest.main()