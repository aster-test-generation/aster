import unittest
from mimesis.builtins.pt_br import BrazilSpecProvider


class TestBrazilSpecProvider(unittest.TestCase):
    def setUp(self):
        self.provider = BrazilSpecProvider()

    def test_init(self):
        self.assertIsInstance(self.provider, BrazilSpecProvider)

    def test_cpf_with_mask(self):
        cpf = self.provider.cpf(with_mask=True)
        self.assertRegex(cpf, r'\d{3}\.\d{3}\.\d{3}-\d{2}')

    def test_cpf_without_mask(self):
        cpf = self.provider.cpf(with_mask=False)
        self.assertRegex(cpf, r'\d{11}')

    def test_cnpj_with_mask(self):
        cnpj = self.provider.cnpj(with_mask=True)
        self.assertRegex(cnpj, r'\d{2}\.\d{3}\.\d{3}/\d{4}-\d{2}')

    def test_cnpj_without_mask(self):
        cnpj = self.provider.cnpj(with_mask=False)
        self.assertRegex(cnpj, r'\d{14}')

    def test_private_get_verifying_digit_cpf(self):
        cpf = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        peso = 10
        result = self.provider._BrazilSpecProvider__get_verifying_digit_cpf(cpf, peso)
        self.assertIsInstance(result, int)

    def test_private_get_verifying_digit_cnpj(self):
        cnpj = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2]
        peso = 5
        result = self.provider._BrazilSpecProvider__get_verifying_digit_cnpj(cnpj, peso)
        self.assertIsInstance(result, int)

if __name__ == '__main__':
    unittest.main()