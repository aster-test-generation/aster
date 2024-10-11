import unittest
from ansible.modules.subversion import *


class TestSubversion(unittest.TestCase):
    def test_has_option_password_from_stdin(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.has_option_password_from_stdin()
        self.assertIsInstance(result, bool)

    def test_exec(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance._exec(None)
        self.assertIsInstance(result, list)

    def test_is_svn_repo(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.is_svn_repo()
        self.assertIsInstance(result, bool)

    def test_checkout(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.checkout()
        self.assertIsNone(result)

    def test_export(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.export()
        self.assertIsNone(result)

    def test_switch(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.switch()
        self.assertIsInstance(result, bool)

    def test_update(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.update()
        self.assertIsInstance(result, bool)

    def test_revert(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.revert()
        self.assertIsInstance(result, bool)

    def test_get_revision(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.get_revision()
        self.assertIsInstance(result, tuple)

if __name__ == '__main__':
    unittest.main()