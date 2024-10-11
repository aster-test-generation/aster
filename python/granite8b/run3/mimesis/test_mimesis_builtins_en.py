import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def test_tracking_number(self):
        provider = USASpecProvider()
        tracking_number = provider.tracking_number()
        self.assertTrue(tracking_number.startswith('@'))
        self.assertTrue(tracking_number.endswith('@'))
        self.assertEqual(len(tracking_number), 13)

    def test_ssn(self):
        provider = USASpecProvider()
        ssn = provider.ssn()
        self.assertEqual(len(ssn), 11)
        self.assertTrue(ssn.startswith('000'))
        self.assertTrue(ssn.endswith('0000'))

    def test_personality(self):
        provider = USASpecProvider()
        personality = provider.personality()
        self.assertTrue(personality in ('ISFJ', 'ISTJ', 'INFJ', 'INTJ', 'ISTP', 'ISFP', 'INFP', 'INTP', 'ESTP', 'ESFP', 'ENFP', 'ENTP', 'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))

if __name__ == '__main__':
    unittest.main()