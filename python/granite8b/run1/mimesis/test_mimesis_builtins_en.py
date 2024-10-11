import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def test_tracking_number(self):
        instance = USASpecProvider()
        result = instance.tracking_number()
        self.assertEqual(len(result), 10)

    def test_ssn(self):
        instance = USASpecProvider()
        result = instance.ssn()
        self.assertEqual(len(result), 11)

    def test_personality(self):
        instance = USASpecProvider()
        result = instance.personality()
        self.assertTrue(result in ('ISFJ', 'ISTJ', 'INFJ', 'INTJ', 'ISTP', 'ISFP', 'INFP', 'INTP', 'ESTP', 'ESFP', 'ENFP', 'ENTP', 'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ', 1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

if __name__ == '__main__':
    unittest.main()