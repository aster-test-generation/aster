import unittest
from mimesis.builtins.pt_br import BrazilSpecProvider


class TestBrazilSpecProvider(unittest.TestCase):
    def test_cpf(self):
        provider = BrazilSpecProvider()
        cpf = provider.cpf()
        self.assertEqual(len(cpf), 11)
        self.assertTrue(cpf.isnumeric())

    def test_cnpj(self):
        provider = BrazilSpecProvider()
        cnpj = provider.cnpj()
        self.assertEqual(len(cnpj), 14)
        self.assertTrue(cnpj.isnumeric())

if __name__ == '__main__':
    unittest.main()