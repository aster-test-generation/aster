import unittest
from mimesis.builtins.ru import RussiaSpecProvider


class TestRussiaSpecProvider(unittest.TestCase):
    def test_init(self):
        instance = RussiaSpecProvider()
        self.assertIsInstance(instance, RussiaSpecProvider)

    def test_generate_sentence(self):
        instance = RussiaSpecProvider()
        result = instance.generate_sentence()
        self.assertIsInstance(result, str)

    def test_patronymic(self):
        instance = RussiaSpecProvider()
        result = instance.patronymic(Gender.MALE)
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

    def test_private_method(self):
        instance = RussiaSpecProvider()
        result = instance._RussiaSpecProvider__pull(instance._datafile)
        self.assertIsNone(result)

    def test_protected_method(self):
        instance = RussiaSpecProvider()
        result = instance._validate_enum(Gender.MALE, Gender)
        self.assertEqual(result, Gender.MALE)

    def test_str_method(self):
        instance = RussiaSpecProvider()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = RussiaSpecProvider()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()