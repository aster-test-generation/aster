import unittest
from ansible.modules.subversion import *



class TestSubversion(unittest.TestCase):
    def test_subversion(self):
        instance = Subversion.Subversion()
        result = instance.subversion()
        self.assertEqual(result, None)

    def test_checkout(self):
        instance = Subversion(self.url, self.username, self.password)
        result = instance.checkout()
        self.assertEqual(result, None)

    def test_export(self):
        instance = Subversion(self)
        result = instance.export()
        self.assertEqual(result, None)

    def test_switch(self):
        instance = Subversion(self)
        result = instance.switch()
        self.assertEqual(result, None)

    def test_update(self):
        instance = Subversion(None)
        result = instance.update()
        self.assertEqual(result, None)

    def test_get_revision(self):
        instance = Subversion(self.path)
        result = instance.get_revision()
        self.assertEqual(result, None)

    def test_get_remote_revision(self):
        instance = Subversion(None)
        result = instance.get_remote_revision()
        self.assertEqual(result, None)

    def test_has_local_mods(self):
        instance = Subversion
        result = instance.has_local_mods()
        self.assertEqual(result, None)

    def test_revert(self):
        instance = Subversion(None)
        result = instance.revert()
        self.assertEqual(result, None)

    def test_needs_update(self):
        instance = Subversion(self.repo_url, self.repo_path)
        result = instance.needs_update()
        self.assertEqual(result, None)

    def test_is_svn_repo(self):
        instance = Subversion(self)
        result = instance.is_svn_repo()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()