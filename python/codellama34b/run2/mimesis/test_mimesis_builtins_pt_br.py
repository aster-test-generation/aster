import unittest
from mimesis.builtins.pt_br import BrazilSpecProvider


class TestBrazilSpecProvider(unittest.TestCase):
    def test_cpf(self):
        instance = BrazilSpecProvider()
        result = instance.cpf(with_mask=True)
        self.assertEqual(len(result), 18)

    def test_cnpj(self):
        instance = BrazilSpecProvider()
        result = instance.cnpj(with_mask=True)
        self.assertEqual(len(result), 24)

if __name__ == '__main__':
    unittest.main()