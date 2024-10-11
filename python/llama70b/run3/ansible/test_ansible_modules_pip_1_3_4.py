import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        instance = PipModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test_documentation(self):
        self.assertIsInstance(DOCUMENTATION, str)

    def test_examples(self):
        self.assertIsInstance(EXAMPLES, str)

    def test_return(self):
        self.assertIsInstance(RETURN, str)

    def test_setuptools_imp_err(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

    def test_special_package_checkers(self):
        self.assertIsInstance(_SPECIAL_PACKAGE_CHECKERS, dict)

    def test_vcs_re(self):
        self.assertIsInstance(_VCS_RE, re.Pattern)

    def test_op_dict(self):
        self.assertIsInstance(op_dict, dict)

    def test_get_packages(self):
        module = AnsibleModule()
        pip = ['pip']
        chdir = '/tmp'
        result = _get_packages(module, pip, chdir)
        self.assertIsInstance(result, tuple)

    def test__fail(self):
        module = AnsibleModule()
        command = ['pip', 'list']
        out = 'output'
        err = 'error'
        with self.assertRaises(SystemExit):
            _fail(module, command, out, err)

if __name__ == '__main__':
    unittest.main()