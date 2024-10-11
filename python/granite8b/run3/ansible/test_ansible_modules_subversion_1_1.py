import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def test_has_option_password_from_stdin(self):
        subversion = Subversion(None, None, None, None, None, None, None, validate_certs=False)
        self.assertFalse(subversion.has_option_password_from_stdin())
        subversion = Subversion(None, None, None, None, None, None, True)
        self.assertTrue(subversion.has_option_password_from_stdin())

    def test__exec(self):
        subversion = Subversion(None, None, None, None, None, None, None, validate_certs=None)
        self.assertEqual(subversion._exec([]), [])
        self.assertEqual(subversion._exec([], check_rc=False), 0)

    def test_is_svn_repo(self):
        subversion = Subversion(None, None, None, None, None, None, None, validate_certs=True)
        self.assertFalse(subversion.is_svn_repo())

    def test_checkout(self):
        subversion = Subversion(None, None, None, None, None, None, None, validate_certs=False)
        subversion.checkout()

    def test_export(self):
        subversion = Subversion(None, None, None, None, None, None, None, validate_certs=True)
        subversion.export()

    def test_switch(self):
        subversion = Subversion(None, None, None, None, None, None, None, validate_certs=True)
        self.assertFalse(subversion.switch())

    def test_update(self):
        subversion = Subversion(None, None, None, None, None, None, None, validate_certs=True)
        self.assertFalse(subversion.update())

    def test_revert(self):
        subversion = Subversion(None, None, None, None, None, None, None, validate_certs=True)
        self.assertFalse(subversion.revert())

    def test_get_revision(self):
        subversion = Subversion(None, None, None, None, None, None, None, validate_certs=True)
        self.assertEqual(subversion.get_revision(), ('Unable to get revision', 'Unable to get URL'))

if __name__ == '__main__':
    unittest.main()