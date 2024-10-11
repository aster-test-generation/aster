import unittest
from ansible.modules.pip import *



class TestPipModule(unittest.TestCase):
    def test_have_pip_module(self):
        result = have_pip_module()
        self.assertTrue(result)

    def test_get_best_parsable_locale(self):
        result = get_best_parsable_locale(self)
        self.assertIsNotNone(result)

    def test_get_pip_executable(self):
        result = get_pip_executable()
        self.assertIsNotNone(result)

    def test_get_pip_version(self):
        result = get_pip_version()
        self.assertIsNotNone(result)

    def test_get_pip_version_as_tuple(self):
        from pip import get_pip_version_as_tuple
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_1_5(self):
        result = is_pip_newer_than_1_5
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_6_0(self):
        result = is_pip_newer_than_6_0()
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_9_0(self):
        result = is_pip_newer_than_9_0()
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_10_0(self):
        result = is_pip_newer_than_10_0
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_18_1(self):
        result = is_pip_newer_than_18_1
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_19_1(self):
        result = is_pip_newer_than_19_1
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_19_2(self):
        result = is_pip_newer_than_19_2
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_19_3(self):
        result = is_pip_newer_than_19_3
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_20_0(self):
        result = is_pip_newer_than_20_0
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_20_1(self):
        result = is_pip_newer_than_20_1
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_20_2(self):
        result = is_pip_newer_than_20_2
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_20_3(self):
        result = is_pip_newer_than_20_3
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_21_0(self):
        result = is_pip_newer_than_21_0
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_21_1(self):
        result = is_pip_newer_than_21_1
        self.assertIsNotNone(result)

    def test_is_pip_newer_than_21_3(self):
        result = is_pip_newer_than_21_3
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()