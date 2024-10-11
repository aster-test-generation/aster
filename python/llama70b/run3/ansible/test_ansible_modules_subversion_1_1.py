from ansible.modules.subversion import AnsibleModule
import unittest
from ansible.modules.subversion import Subversion, DOCUMENTATION, EXAMPLES, RETURN


class TestSubversion(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        self.assertIsNotNone(instance)

    def test_has_option_password_from_stdin(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        self.assertTrue(instance.has_option_password_from_stdin())

    def test_exec(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        result = instance._exec(['info', '/dest'])
        self.assertIsNotNone(result)

    def test_is_svn_repo(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        self.assertFalse(instance.is_svn_repo())

    def test_checkout(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance.checkout()

    def test_export(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        instance.export()

    def test_switch(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        self.assertFalse(instance.switch())

    def test_update(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        self.assertFalse(instance.update())

    def test_revert(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        self.assertFalse(instance.revert())

    def test_get_revision(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        result = instance.get_revision()
        self.assertIsNotNone(result)

    def test_str_method(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        result = instance.__str__()
        self.assertIsNotNone(result)

    def test_repr_method(self):
        module = AnsibleModule({})
        instance = Subversion(module, '/dest', 'svn+ssh://example.org/repo', 'HEAD', 'username', 'password', 'svn', True)
        result = instance.__repr__()
        self.assertIsNotNone(result)

class TestDocumentation(unittest.TestCase):
    def test_documentation(self):
        self.assertIsNotNone(DOCUMENTATION)

class TestExamples(unittest.TestCase):
    def test_examples(self):
        self.assertIsNotNone(EXAMPLES)

class TestReturn(unittest.TestCase):
    def test_return(self):
        self.assertIsNotNone(RETURN)

if __name__ == '__main__':
    unittest.main()