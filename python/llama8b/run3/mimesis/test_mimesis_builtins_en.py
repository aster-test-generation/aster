import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def test_init(self):
        provider = USASpecProvider()
        self.assertEqual(provider.locale, 'en')
        self.assertIsNone(provider.seed)

    def test_init_with_seed(self):
        provider = USASpecProvider(seed=123)
        self.assertEqual(provider.locale, 'en')
        self.assertEqual(provider.seed, 123)

    def test_tracking_number(self):
        provider = USASpecProvider()
        self.assertEqual(len(provider.tracking_number('usps')), 20)
        self.assertEqual(len(provider.tracking_number('fedex')), 20)
        self.assertEqual(len(provider.tracking_number('ups')), 20)

    def test_ssn(self):
        provider = USASpecProvider()
        ssn = provider.ssn()
        self.assertEqual(len(ssn), 12)
        self.assertTrue(ssn[0:3].isdigit())
        self.assertTrue(ssn[4:6].isdigit())
        self.assertTrue(ssn[7:].isdigit())

    def test_personality(self):
        provider = USASpecProvider()
        self.assertIn(provider.personality('mbti'), ('ISFJ', 'ISTJ', 'INFJ', 'INTJ', 'ISTP', 'ISFP', 'INFP', 'INTP', 'ESTP', 'ESFP', 'ENFP', 'ENTP', 'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))
        self.assertEqual(provider.personality('rheti'), 1)

    def test_personality_invalid_category(self):
        provider = USASpecProvider()
        with self.assertRaises(ValueError):
            provider.personality('invalid_category')

    def test_tracking_number_invalid_service(self):
        provider = USASpecProvider()
        with self.assertRaises(ValueError):
            provider.tracking_number('invalid_service')

if __name__ == '__main__':
    unittest.main()