import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def test_tracking_number(self):
        instance = USASpecProvider()
        result = instance.tracking_number(service='usps')
        self.assertEqual(len(result), 12)

    def test_ssn(self):
        instance = USASpecProvider()
        result = instance.ssn()
        self.assertEqual(len(result), 11)

    def test_personality(self):
        instance = USASpecProvider()
        result = instance.personality(category='mbti')
        self.assertIn(result, ('ISFJ', 'ISTJ', 'INFJ', 'INTJ',
                               'ISTP', 'ISFP', 'INFP', 'INTP',
                               'ESTP', 'ESFP', 'ENFP', 'ENTP',
                               'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))

    def test_personality_rheti(self):
        instance = USASpecProvider()
        result = instance.personality(category='rheti')
        self.assertIn(result, range(1, 11))

    def test_init(self):
        instance = USASpecProvider()
        result = instance.__init__()
        self.assertEqual(result, None)

    def test_str_method(self):
        instance = USASpecProvider()
        result = instance.__str__()
        self.assertEqual(result, 'USA Spec Provider')

    def test_repr_method(self):
        instance = USASpecProvider()
        result = instance.__repr__()
        self.assertEqual(result, 'USA Spec Provider')

    def test_eq_method(self):
        instance = USASpecProvider()
        result = instance.__eq__()
        self.assertEqual(result, None)

    def test_custom_code(self):
        instance = USASpecProvider()
        result = instance.random.custom_code(mask='@')
        self.assertEqual(len(result), 1)

    def test_randint(self):
        instance = USASpecProvider()
        result = instance.random.randint(1, 10)
        self.assertIn(result, range(1, 11))

    def test_choice(self):
        instance = USASpecProvider()
        result = instance.random.choice(('a', 'b', 'c'))
        self.assertIn(result, ('a', 'b', 'c'))

if __name__ == '__main__':
    unittest.main()