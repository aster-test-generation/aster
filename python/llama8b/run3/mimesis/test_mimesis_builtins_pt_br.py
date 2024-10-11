import unittest
from mimesis.builtins.pt_br import BrazilSpecProvider


class TestBrazilSpecProvider(unittest.TestCase):
    def test_init(self):
        instance = BrazilSpecProvider()
        self.assertEqual(instance.locale, 'pt-br')

    def test_cpf(self):
        instance = BrazilSpecProvider()
        cpf = instance.cpf(with_mask=True)
        self.assertEqual(len(cpf), 14)
        self.assertTrue(cpf.startswith(''))
        self.assertTrue(cpf.endswith('-'))

    def test_cnpj(self):
        instance = BrazilSpecProvider()
        cnpj = instance.cnpj(with_mask=True)
        self.assertEqual(len(cnpj), 18)
        self.assertTrue(cnpj.startswith(''))
        self.assertTrue(cnpj.endswith('/'))

    def test_cpf_without_mask(self):
        instance = BrazilSpecProvider()
        cpf = instance.cpf(with_mask=False)
        self.assertEqual(len(cpf), 11)

    def test_cnpj_without_mask(self):
        instance = BrazilSpecProvider()
        cnpj = instance.cnpj(with_mask=False)
        self.assertEqual(len(cnpj), 12)

    def test_get_verifying_digit_cpf(self):
        instance = BrazilSpecProvider()
        cpf = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        first_dv = instance._BrazilSpecProvider__get_verifying_digit_cpf(cpf, 10)
        self.assertEqual(first_dv, 0)

    def test_get_verifying_digit_cnpj(self):
        instance = BrazilSpecProvider()
        cnpj = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2]
        first_dv = instance._BrazilSpecProvider__get_verifying_digit_cnpj(cnpj, 5)
        self.assertEqual(first_dv, 0)

    def test_str(self):
        instance = BrazilSpecProvider()
        self.assertEqual(str(instance), 'BrazilSpecProvider')

    def test_repr(self):
        instance = BrazilSpecProvider()
        self.assertEqual(repr(instance), 'BrazilSpecProvider()')

if __name__ == '__main__':
    unittest.main()