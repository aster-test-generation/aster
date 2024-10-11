import unittest
from mimesis.builtins.pt_br import BrazilSpecProvider


class TestBrazilSpecProvider(unittest.TestCase):
    def test_init(self):
        instance = BrazilSpecProvider()
        self.assertEqual(instance.locale, 'pt-br')

    def test_cpf(self):
        instance = BrazilSpecProvider()
        result = instance.cpf()
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 14)

    def test_cpf_with_mask(self):
        instance = BrazilSpecProvider()
        result = instance.cpf(with_mask=True)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 18)

    def test_cnpj(self):
        instance = BrazilSpecProvider()
        result = instance.cnpj()
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 14)

    def test_cnpj_with_mask(self):
        instance = BrazilSpecProvider()
        result = instance.cnpj(with_mask=True)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 18)

    def test_get_verifying_digit_cpf(self):
        instance = BrazilSpecProvider()
        cpf = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        peso = 10
        result = instance._BrazilSpecProvider__get_verifying_digit_cpf(cpf, peso)
        self.assertIsInstance(result, int)

    def test_get_verifying_digit_cnpj(self):
        instance = BrazilSpecProvider()
        cnpj = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
        peso = 5
        result = instance._BrazilSpecProvider__get_verifying_digit_cnpj(cnpj, peso)
        self.assertIsInstance(result, int)

    def test_str_method(self):
        instance = BrazilSpecProvider()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = BrazilSpecProvider()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()