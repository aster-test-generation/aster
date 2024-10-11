import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def setUp(self):
        self.provider = USASpecProvider()

    def test_init(self):
        self.assertIsInstance(self.provider, USASpecProvider)

    def test_tracking_number_usps(self):
        result = self.provider.tracking_number('usps')
        self.assertTrue(result.startswith('@@'))

    def test_tracking_number_fedex(self):
        result = self.provider.tracking_number('fedex')
        self.assertTrue(result.startswith(''))

    def test_tracking_number_ups(self):
        result = self.provider.tracking_number('ups')
        self.assertTrue(result.startswith('1Z@'))

    def test_tracking_number_invalid_service(self):
        with self.assertRaises(ValueError):
            self.provider.tracking_number('dhl')

    def test_ssn(self):
        result = self.provider.ssn()
        self.assertRegex(result, r'^\d{3}-\d{2}-\d{4}$')

    def test_personality_mbti(self):
        result = self.provider.personality('mbti')
        self.assertIn(result, ('ISFJ', 'ISTJ', 'INFJ', 'INTJ',
                               'ISTP', 'ISFP', 'INFP', 'INTP',
                               'ESTP', 'ESFP', 'ENFP', 'ENTP',
                               'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))

    def test_personality_rheti(self):
        result = self.provider.personality('rheti')
        self.assertIn(result, range(1, 11))

    def test_meta_name(self):
        self.assertEqual(self.provider.Meta.name, 'usa_provider')

if __name__ == '__main__':
    unittest.main()