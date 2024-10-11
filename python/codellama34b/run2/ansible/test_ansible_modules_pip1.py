
import unittest
from ansible.modules.pip import *

class TestPip(unittest.TestCase):
    def test_is_package_name(self):
        result = _is_package_name("name")
        self.assertEqual(result, True)

    def test_is_package_name_with_operator(self):
        result = _is_package_name(">=")
        self.assertEqual(result, False)

    def test_is_package_name_with_version(self):
        result = _is_package_name("name==1.0")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_operator(self):
        result = _is_package_name("name>=1.0")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators(self):
        result = _is_package_name("name>=1.0,<=2.0")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces(self):
        result = _is_package_name("name >= 1.0, <= 2.0")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals_and_tilde(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6, ~= 1.7")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals_and_tilde_and_other_chars(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6, ~= 1.7, !@#$%^&*()_+")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals_and_tilde_and_other_chars_and_spaces(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6, ~= 1.7, !@#$%^&*()_+ ")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals_and_tilde_and_other_chars_and_spaces_and_commas(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6, ~= 1.7, !@#$%^&*()_+ ,")
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()