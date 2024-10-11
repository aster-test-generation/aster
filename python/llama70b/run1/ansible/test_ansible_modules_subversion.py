import unittest
from ansible.modules.subversion import Subversion, AnsibleModule


class TestSubversion(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        self.assertIsInstance(svn, Subversion)

    def test_get_remote_revision(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        result = svn.get_remote_revision()
        self.assertEqual(result, 'HEAD')

    def test_checkout(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        svn.checkout()
        self.assertTrue(os.path.exists('/dest'))

    def test_export(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        svn.export(force=True)
        self.assertTrue(os.path.exists('/dest'))

    def test_is_svn_repo(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        result = svn.is_svn_repo()
        self.assertTrue(result)

    def test_has_local_mods(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        result = svn.has_local_mods()
        self.assertFalse(result)

    def test_needs_update(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        check, before, after = svn.needs_update()
        self.assertTrue(check)

    def test_switch(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        result = svn.switch()
        self.assertTrue(result)

    def test_revert(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        result = svn.revert()
        self.assertTrue(result)

    def test_update(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        result = svn.update()
        self.assertTrue(result)

    def test_get_revision(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        result = svn.get_revision()
        self.assertEqual(result, 'HEAD')

    def test___init__(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        self.assertIsInstance(svn, Subversion)

    def test___str__(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        result = str(svn)
        self.assertEqual(result, 'Subversion instance')

    def test___repr__(self):
        module = AnsibleModule()
        svn = Subversion(module, '/dest', 'repo', 'revision', 'username', 'password', 'svn_path', True)
        result = repr(svn)
        self.assertEqual(result, 'Subversion(module, /dest, repo, revision, username, password, svn_path, True)')

class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule()
        self.assertIsInstance(module, AnsibleModule)

    def test___str__(self):
        module = AnsibleModule()
        result = str(module)
        self.assertEqual(result, 'AnsibleModule instance')

    def test___repr__(self):
        module = AnsibleModule()
        result = repr(module)
        self.assertEqual(result, 'AnsibleModule()')

    def test_exit_json(self):
        module = AnsibleModule()
        module.exit_json(changed=True, after='HEAD')
        self.assertTrue(True)  # this method does not return anything, so we just assert True

if __name__ == '__main__':
    unittest.main()