import unittest
from mimesis.builtins.en import USASpecProvider


class TestUSASpecProvider(unittest.TestCase):
    def test_init(self):
        provider = USASpecProvider()
        self.assertEqual(provider.locale, 'en')
        self.assertEqual(provider.seed, None)

    def test_tracking_number(self):
        provider = USASpecProvider()
        result = provider.tracking_number('usps')
        self.assertIsInstance(result, str)
        self.assertRegex(result, r'^@@')

    def test_ssn(self):
        provider = USASpecProvider()
        result = provider.ssn()
        self.assertIsInstance(result, str)
        self.assertRegex(result, r'^\d{3}-\d{2}-\d{4}$')

    def test_personality(self):
        provider = USASpecProvider()
        result = provider.personality('mbti')
        self.assertIsInstance(result, str)
        self.assertIn(result, ('ISFJ', 'ISTJ', 'INFJ', 'INTJ', 'ISTP', 'ISFP', 'INFP', 'INTP', 'ESTP', 'ESFP', 'ENFP', 'ENTP', 'ESTJ', 'ESFJ', 'ENFJ', 'ENTJ'))

    def test_personality_rheti(self):
        provider = USASpecProvider()
        result = provider.personality('rheti')
        self.assertIsInstance(result, int)
        self.assertGreaterEqual(result, 1)
        self.assertLessEqual(result, 10)

    def test_tracking_number_usps(self):
        provider = USASpecProvider()
        result = provider.tracking_number('usps')
        self.assertIn(result[0], ('@@',))

    def test_tracking_number_fedex(self):
        provider = USASpecProvider()
        result = provider.tracking_number('fedex')
        self.assertIn(result[0], ('', ''))

    def test_tracking_number_ups(self):
        provider = USASpecProvider()
        result = provider.tracking_number('ups')
        self.assertIn(result[0], ('1Z',))

    def test_private_init(self):
        provider = USASpecProvider()
        self.assertEqual(provider._USASpecProvider__locale, 'en')
        self.assertEqual(provider._USASpecProvider__seed, None)

if __name__ == '__main__':
    unittest.main()