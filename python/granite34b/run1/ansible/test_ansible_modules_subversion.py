import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def test_private_method(self):
        svn = Subversion()
        result = svn._private_method()
        self.assertEqual(result, expected_result)

    def test_protected_method(self):
        svn = Subversion()
        result = svn._protected_method()
        self.assertEqual(result, expected_result)

    def test_magic_method(self):
        svn = Subversion()
        result = svn.__magic_method()
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()