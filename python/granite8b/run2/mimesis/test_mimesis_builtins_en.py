import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def test_tracking_number(self):
        provider = USASpecProvider()
        tracking_number = provider.tracking_number()
        self.assertIsInstance(tracking_number, str)
        self.assertEqual(len(tracking_number), 10)

    def test_ssn(self):
        provider = USASpecProvider()
        ssn = provider.ssn()
        self.assertIsInstance(ssn, str)
        self.assertEqual(len(ssn), 11)

    def test_personality(self):
        provider = USASpecProvider()
        personality = provider.personality()
        self.assertIsInstance(personality, str)
        self.assertIn(personality, ('ISFJ', 'ISTJ', 'INFJ', 'INTJ', 'ISTP', 'ISFP', 'INFP', 'INTP', 'ESTP', 'ESFP', 'ENFP', 'ENTP', 'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))

if __name__ == '__main__':
    unittest.main()