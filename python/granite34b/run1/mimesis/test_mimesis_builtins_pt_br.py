import unittest
from mimesis.builtins.pt_br import BrazilSpecProvider


class TestBrazilSpecProvider(unittest.TestCase):
    def setUp(self):
        self.provider = BrazilSpecProvider()

    def test_cpf(self):
        cpf = self.provider.cpf()
        self.assertEqual(len(cpf), 11)
        self.assertTrue(cpf.isdigit())

    def test_cnpj(self):
        cnpj = self.provider.cnpj()
        self.assertEqual(len(cnpj), 14)
        self.assertTrue(cnpj.isdigit())

if __name__ == '__main__':
    unittest.main()