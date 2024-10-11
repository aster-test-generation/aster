from mimesis.builtins.en import Seed
import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def test_init(self):
        provider = USASpecProvider()
        self.assertEqual(provider.locale, 'en')
        self.assertIsNone(provider.seed)

    def test_init_with_seed(self):
        provider = USASpecProvider(Seed(42))
        self.assertEqual(provider.locale, 'en')
        self.assertEqual(provider.seed, 42)

    def test_tracking_number(self):
        provider = USASpecProvider()
        self.assertEqual(len(provider.tracking_number()), 20)

    def test_tracking_number_usps(self):
        provider = USASpecProvider()
        self.assertIn(provider.tracking_number('usps'), '@@')

    def test_tracking_number_fedex(self):
        provider = USASpecProvider()
        self.assertIn(provider.tracking_number('fedex'), ' ')

    def test_tracking_number_ups(self):
        provider = USASpecProvider()
        self.assertIn(provider.tracking_number('ups'), '1Z@')

    def test_ssn(self):
        provider = USASpecProvider()
        ssn = provider.ssn()
        self.assertEqual(len(ssn), 12)
        self.assertRegex(ssn, r'^\d{3}-\d{2}-\d{4}$')

    def test_personality_mbti(self):
        provider = USASpecProvider()
        personality = provider.personality('mbti')
        self.assertIn(personality, ('ISFJ', 'ISTJ', 'INFJ', 'INTJ', 'ISTP', 'ISFP', 'INFP', 'INTP', 'ESTP', 'ESFP', 'ENFP', 'ENTP', 'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))

    def test_personality_rheti(self):
        provider = USASpecProvider()
        personality = provider.personality('rheti')
        self.assertIsInstance(personality, int)
        self.assertGreaterEqual(personality, 1)
        self.assertLessEqual(personality, 10)

    def test_str(self):
        provider = USASpecProvider()
        self.assertEqual(str(provider), 'USASpecProvider')

    def test_repr(self):
        provider = USASpecProvider()
        self.assertEqual(repr(provider), 'USASpecProvider()')

if __name__ == '__main__':
    unittest.main()