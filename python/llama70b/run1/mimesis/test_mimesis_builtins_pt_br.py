import unittest
from mimesis.builtins.pt_br import BrazilSpecProvider


class TestBrazilSpecProvider(unittest.TestCase):
    def test_init(self):
        instance = BrazilSpecProvider()
        self.assertIsNotNone(instance)

    def test_cpf(self):
        instance = BrazilSpecProvider()
        result = instance.cpf()
        self.assertIsInstance(result, str)

    def test_cpf_with_mask(self):
        instance = BrazilSpecProvider()
        result = instance.cpf(with_mask=True)
        self.assertIsInstance(result, str)

    def test_cnpj(self):
        instance = BrazilSpecProvider()
        result = instance.cnpj()
        self.assertIsInstance(result, str)

    def test_cnpj_with_mask(self):
        instance = BrazilSpecProvider()
        result = instance.cnpj(with_mask=True)
        self.assertIsInstance(result, str)

    def test_get_verifying_digit_cpf(self):
        instance = BrazilSpecProvider()
        result = instance.cpf.__code__.co_consts[1](instance, [1, 2, 3, 4, 5, 6, 7, 8, 9], 10)
        self.assertIsInstance(result, int)

    def test_get_verifying_digit_cnpj(self):
        instance = BrazilSpecProvider()
        result = instance.cnpj.__code__.co_consts[1](instance, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12], 5)
        self.assertIsInstance(result, int)

    def test_Meta_name(self):
        instance = BrazilSpecProvider()
        result = instance.Meta.name
        self.assertEqual(result, 'brazil_provider')

    def test_str_method(self):
        instance = BrazilSpecProvider()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = BrazilSpecProvider()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = BrazilSpecProvider()
        instance2 = BrazilSpecProvider()
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()