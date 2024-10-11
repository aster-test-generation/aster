from ansible.modules.subversion import AnsibleModule
import unittest
from ansible.modules.subversion import Subversion, DOCUMENTATION, EXAMPLES, RETURN


class TestSubversion(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        self.assertIsNotNone(instance)

    def test_has_option_password_from_stdin(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        self.assertTrue(instance.has_option_password_from_stdin())

    def test_exec(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance._exec(['info', '/src/checkout'])
        self.assertIsNotNone(result)

    def test_is_svn_repo(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        self.assertTrue(instance.is_svn_repo())

    def test_checkout(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        instance.checkout()

    def test_export(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/export'})
        instance = Subversion(module, '/src/export', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        instance.export()

    def test_switch(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        self.assertTrue(instance.switch())

    def test_update(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        self.assertTrue(instance.update())

    def test_revert(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        self.assertTrue(instance.revert())

    def test_get_revision(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance.get_revision()
        self.assertIsNotNone(result)

    def test_str_method(self):
        module = AnsibleModule({'repo': 'svn+ssh://an.example.org/path/to/repo', 'dest': '/src/checkout'})
        instance = Subversion(module, '/src/checkout', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', False)
        result = instance.__str__()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()