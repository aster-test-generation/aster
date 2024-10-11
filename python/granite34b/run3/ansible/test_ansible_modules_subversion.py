import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def test_private_method(self):
        svn = Subversion(None, None, None, None, None, None, None, None)
        self.assertEqual(svn._private_method(), "This is a private method")

    def test_protected_method(self):
        svn = Subversion(None, None, None, None, None, None, None, None)
        self.assertEqual(svn._protected_method(), "This is a protected method")

    def test_magic_method(self):
        svn = Subversion(None, None, None, None, None, None, None, None)
        self.assertEqual(svn.__str__(), "This is a magic method")

if __name__ == '__main__':
    unittest.main()