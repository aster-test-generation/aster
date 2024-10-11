import unittest
from mimesis.builtins.pt_br import BrazilSpecProvider


class TestBrazilSpecProvider(unittest.TestCase):
    def setUp(self):
        self.provider = BrazilSpecProvider()

    def test_cpf(self):
        cpf = self.provider.cpf()
        self.assertEqual(len(cpf), 11)

    def test_cnpj(self):
        cnpj = self.provider.cnpj()
        self.assertEqual(len(cnpj), 14)

    def test_private_method(self):
        cpf = self.provider._BrazilSpecProvider__get_verifying_digit_cpf([1, 2, 3, 4, 5, 6, 7, 8, 9], 10)
        self.assertEqual(cpf, 1)

    def test_protected_method(self):
        cnpj = self.provider._BrazilSpecProvider__get_verifying_digit_cnpj([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12], 5)
        self.assertEqual(cnpj, 1)

    def test_magic_method(self):
        self.assertEqual(self.provider.__str__(), "BrazilSpecProvider")
        self.assertEqual(self.provider.__repr__(), "BrazilSpecProvider()")

if __name__ == '__main__':
    unittest.main()