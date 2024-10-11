import unittest
from ansible.modules.yum_repository import YumRepository


class TestYumRepository(unittest.TestCase):
    def test_private_method(self):
        instance = YumRepository()
        result = instance._private_method()
        self.assertEqual(result, expected_result)

    def test_protected_method(self):
        instance = YumRepository()
        result = instance._protected_method()
        self.assertEqual(result, expected_result)

    def test_magic_method(self):
        instance = YumRepository()
        result = instance.__magic_method()
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()