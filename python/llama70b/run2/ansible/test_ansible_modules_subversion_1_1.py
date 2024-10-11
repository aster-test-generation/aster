import unittest
from ansible.modules.subversion import Subversion, DOCUMENTATION, EXAMPLES, RETURN


class TestSubversion(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        self.assertEqual(instance.module, module)
        self.assertEqual(instance.dest, '/dest')
        self.assertEqual(instance.repo, 'svn+ssh://example.org/repo')
        self.assertEqual(instance.revision, 'HEAD')
        self.assertEqual(instance.username, 'username')
        self.assertEqual(instance.password, 'password')
        self.assertEqual(instance.svn_path, 'svn')
        self.assertEqual(instance.validate_certs, True)

    def test_has_option_password_from_stdin(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance.module.run_command = lambda x, y, z: (0, '1.10.0', '')
        self.assertTrue(instance.has_option_password_from_stdin())

    def test_exec(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance.module.run_command = lambda x, y, z: (0, 'output', '')
        result = instance._exec(['info', '/dest'])
        self.assertEqual(result, ['output'])

    def test_is_svn_repo(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance._exec = lambda x, y: 0
        self.assertTrue(instance.is_svn_repo())

    def test_checkout(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance._exec = lambda x: None
        instance.checkout()

    def test_export(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance._exec = lambda x: None
        instance.export()

    def test_switch(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance._exec = lambda x: ['output']
        self.assertTrue(instance.switch())

    def test_update(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance._exec = lambda x: ['output']
        self.assertTrue(instance.update())

    def test_revert(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance._exec = lambda x: ['output']
        self.assertTrue(instance.revert())

    def test_get_revision(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance._exec = lambda x: ['Revision: 12345', 'URL: svn+ssh://example.org/repo']
        result = instance.get_revision()
        self.assertEqual(result, ('12345', 'URL: svn+ssh://example.org/repo'))

    def test_private_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        result = instance._Subversion__exec(['info', '/dest'])
        self.assertEqual(result, ['output'])

    def test_str_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        result = instance.__str__()
        self.assertEqual(result, 'Subversion instance')

if __name__ == '__main__':
    unittest.main()