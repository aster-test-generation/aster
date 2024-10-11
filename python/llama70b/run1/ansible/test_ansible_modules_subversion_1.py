import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        self.assertIsInstance(instance, Subversion)

    def test_get_remote_revision(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance.get_remote_revision()
        self.assertIsInstance(result, str)

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
        self.assertIsInstance(result, list)

    def test_str(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = str(instance)
        self.assertIsInstance(result, str)

    def test_repr(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = repr(instance)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()