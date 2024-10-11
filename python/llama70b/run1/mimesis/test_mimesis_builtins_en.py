import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def test_init(self):
        instance = USASpecProvider()
        self.assertIsNotNone(instance)

    def test_init_with_seed(self):
        instance = USASpecProvider(seed=42)
        self.assertIsNotNone(instance)

    def test_tracking_number_usps(self):
        instance = USASpecProvider()
        result = instance.tracking_number(service='usps')
        self.assertIsInstance(result, str)

    def test_tracking_number_fedex(self):
        instance = USASpecProvider()
        result = instance.tracking_number(service='fedex')
        self.assertIsInstance(result, str)

    def test_tracking_number_ups(self):
        instance = USASpecProvider()
        result = instance.tracking_number(service='ups')
        self.assertIsInstance(result, str)

    def test_tracking_number_invalid_service(self):
        instance = USASpecProvider()
        with self.assertRaises(ValueError):
            instance.tracking_number(service='invalid')

    def test_ssn(self):
        instance = USASpecProvider()
        result = instance.ssn()
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 11)

    def test_personality_mbti(self):
        instance = USASpecProvider()
        result = instance.personality(category='mbti')
        self.assertIsInstance(result, str)
        self.assertIn(result, ('ISFJ', 'ISTJ', 'INFJ', 'INTJ',
                              'ISTP', 'ISFP', 'INFP', 'INTP',
                              'ESTP', 'ESFP', 'ENFP', 'ENTP',
                              'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))

    def test_personality_rheti(self):
        instance = USASpecProvider()
        result = instance.personality(category='rheti')
        self.assertIsInstance(result, int)
        self.assertGreaterEqual(result, 1)
        self.assertLessEqual(result, 10)

    def test_meta_name(self):
        instance = USASpecProvider()
        self.assertEqual(instance.Meta.name, 'usa_provider')

    def test_str_method(self):
        instance = USASpecProvider()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = USASpecProvider()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = USASpecProvider()
        instance2 = USASpecProvider()
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()