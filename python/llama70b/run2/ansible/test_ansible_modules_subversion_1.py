import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', 'username', 'password', '/usr/bin/svn', False)
        self.assertIsNotNone(instance)

    def test_get_remote_revision(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', 'username', 'password', '/usr/bin/svn', False)
        result = instance.get_remote_revision()
        self.assertIsInstance(result, str)

    def test_has_local_mods(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', 'username', 'password', '/usr/bin/svn', False)
        result = instance.has_local_mods()
        self.assertIsInstance(result, bool)

    def test_needs_update(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', 'username', 'password', '/usr/bin/svn', False)
        result = instance.needs_update()
        self.assertIsInstance(result, tuple)

    def test__exec(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', 'username', 'password', '/usr/bin/svn', False)
        result = instance._Subversion__exec(['info', 'svn+ssh://an.example.org/path/to/repo'])
        self.assertIsInstance(result, list)

    def test_str_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', 'username', 'password', '/usr/bin/svn', False)
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', 'username', 'password', '/usr/bin/svn', False)
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()