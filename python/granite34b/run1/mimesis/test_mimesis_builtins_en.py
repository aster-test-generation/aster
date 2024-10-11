import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def setUp(self):
        self.usa_provider = USASpecProvider()

    def test_tracking_number(self):
        tracking_number = self.usa_provider.tracking_number()
        self.assertIsInstance(tracking_number, str)

    def test_ssn(self):
        ssn = self.usa_provider.ssn()
        self.assertIsInstance(ssn, str)
        self.assertEqual(len(ssn), 11)

    def test_personality(self):
        personality = self.usa_provider.personality()
        self.assertIn(personality, ('ISFJ', 'ISTJ', 'INFJ', 'INTJ', 'ISTP', 'ISFP', 'INFP', 'INTP', 'ESTP', 'ESFP', 'ENFP', 'ENTP', 'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))

if __name__ == '__main__':
    unittest.main()