import unittest
from ansible.modules.subversion import Subversion, DOCUMENTATION, EXAMPLES, RETURN


class TestSubversion(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        self.assertIsNotNone(instance)

    def test_get_remote_revision(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance.get_remote_revision()
        self.assertIsNotNone(result)

    def test_has_local_mods(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance.has_local_mods()
        self.assertIsInstance(result, bool)

    def test_needs_update(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance.needs_update()
        self.assertIsInstance(result, tuple)

    def test_exec(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance._exec(['info', instance.repo])
        self.assertIsNotNone(result)

    def test_private_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance._Subversion__exec(['info', instance.repo])
        self.assertIsNotNone(result)

    def test_str_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance.__str__()
        self.assertIsNotNone(result)

    def test_repr_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance.__repr__()
        self.assertIsNotNone(result)

    def test_eq_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance1 = Subversion(module1, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        module2 = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance2 = Subversion(module2, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()