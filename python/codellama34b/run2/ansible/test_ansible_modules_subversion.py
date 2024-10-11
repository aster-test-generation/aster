import unittest
from ansible.modules.subversion import *

class TestSubversion(unittest.TestCase):
    def test_subversion(self):
        instance = Subversion()
        result = instance.subversion()
        self.assertEqual(result, "Subversion")

    def test_checkout(self):
        instance = Subversion()
        result = instance.checkout()
        self.assertEqual(result, "checkout")

    def test_export(self):
        instance = Subversion()
        result = instance.export()
        self.assertEqual(result, "export")

    def test_update(self):
        instance = Subversion()
        result = instance.update()
        self.assertEqual(result, "update")

    def test_switch(self):
        instance = Subversion()
        result = instance.switch()
        self.assertEqual(result, "switch")

    def test_revert(self):
        instance = Subversion()
        result = instance.revert()
        self.assertEqual(result, "revert")

    def test_get_revision(self):
        instance = Subversion()
        result = instance.get_revision()
        self.assertEqual(result, "get_revision")

    def test_get_remote_revision(self):
        instance = Subversion()
        result = instance.get_remote_revision()
        self.assertEqual(result, "get_remote_revision")

    def test_has_local_mods(self):
        instance = Subversion()
        result = instance.has_local_mods()
        self.assertEqual(result, "has_local_mods")

    def test_is_svn_repo(self):
        instance = Subversion()
        result = instance.is_svn_repo()
        self.assertEqual(result, "is_svn_repo")

    def test_needs_update(self):
        instance = Subversion()
        result = instance.needs_update()
        self.assertEqual(result, "needs_update")

    def test_run_command(self):
        instance = Subversion()
        result = instance.run_command()
        self.assertEqual(result, "run_command")

    def test_main(self):
        instance = Subversion()
        result = instance.main()
        self.assertEqual(result, "main")


if __name__ == '__main__':
    unittest.main()