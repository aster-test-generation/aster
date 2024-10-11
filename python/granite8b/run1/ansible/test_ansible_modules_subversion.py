import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def test_has_option_password_from_stdin(self):
        subversion = Subversion(None, None, None, None, None, None, True)
        self.assertFalse(subversion.has_option_password_from_stdin())
        subversion = Subversion(None, None, None, None, None, None, True)
        self.assertTrue(subversion.has_option_password_from_stdin())

    def test__exec(self):
        subversion = Subversion(None, None, None, None, None, None, True)
        self.assertEqual(subversion._exec(['echo', 'test']), ['test'])

    def test_is_svn_repo(self):
        subversion = Subversion(None, None, None, None, None, None, True)
        self.assertFalse(subversion.is_svn_repo())

    def test_checkout(self):
        subversion = Subversion(None, None, None, None, None, None, True)
        subversion.checkout(False)

    def test_export(self):
        subversion = Subversion(None, None, None, None, None, None, True)
        subversion.export(False)

    def test_switch(self):
        subversion = Subversion(None, None, None, None, None, None, True)
        self.assertFalse(subversion.switch())

    def test_update(self):
        subversion = Subversion(None, None, None, None, None, None, True)
        self.assertFalse(subversion.update())

    def test_revert(self):
        subversion = Subversion(None, None, None, None, None, None, True)
        self.assertFalse(subversion.revert())

    def test_get_revision(self):
        subversion = Subversion(None, None, None, None, None, None, True)
        self.assertEqual(subversion.get_revision(), ('Unable to get revision', 'Unable to get URL'))

if __name__ == '__main__':
    unittest.main()