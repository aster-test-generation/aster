import random
import unittest
from mimesis.providers.base import BaseProvider, BaseDataProvider


class TestBaseProvider(unittest.TestCase):
    def test___init__(self):
        instance = BaseProvider(seed=123)
        self.assertEqual(instance.seed, 123)
        self.assertEqual(instance.random, random)
        instance.reseed(seed=456)
        self.assertEqual(instance.seed, 456)
        self.assertNotEqual(instance.random, random)

if __name__ == '__main__':
    unittest.main()