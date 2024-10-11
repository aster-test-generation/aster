import unittest
from mimesis.builtins.en import USASpecProvider

class TestUSASpecProvider(unittest.TestCase):
    def test_tracking_number(self):
        instance = USASpecProvider()
        result = instance.tracking_number('usps')
        self.assertEqual(len(result), 12)
    def test_ssn(self):
        instance = USASpecProvider()
        result = instance.ssn()
        self.assertEqual(len(result), 11)
    def test_personality(self):
        instance = USASpecProvider()
        result = instance.personality('mbti')
        self.assertIn(result, ('ISFJ', 'ISTJ', 'INFJ', 'INTJ',
                               'ISTP', 'ISFP', 'INFP', 'INTP',
                               'ESTP', 'ESFP', 'ENFP', 'ENTP',
                               'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))
    def test_personality_rheti(self):
        instance = USASpecProvider()
        result = instance.personality('rheti')
        self.assertIn(result, range(1, 11))

if __name__ == '__main__':
    unittest.main()