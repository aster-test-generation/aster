import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=False), version=dict(required=False)))
        self.assertIsInstance(module, AnsibleModule)

    def test_get_pip(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=False), version=dict(required=False)))
        pip = _get_pip(module)
        self.assertIsInstance(pip, list)

    def test__have_pip_module(self):
        self.assertTrue(_have_pip_module())

    def test_op_dict(self):
        self.assertIsInstance(op_dict, dict)
        self.assertIn('>=', op_dict)
        self.assertIn('<=', op_dict)
        self.assertIn('>', op_dict)
        self.assertIn('<', op_dict)
        self.assertIn('==', op_dict)
        self.assertIn('!=', op_dict)
        self.assertIn('~=', op_dict)

    def test_VCS_RE(self):
        self.assertIsInstance(_VCS_RE, re.Pattern)
        self.assertTrue(_VCS_RE.match('svn+'))

    def test_SPECIAL_PACKAGE_CHECKERS(self):
        self.assertIsInstance(_SPECIAL_PACKAGE_CHECKERS, dict)
        self.assertIn('setuptools', _SPECIAL_PACKAGE_CHECKERS)
        self.assertIn('pip', _SPECIAL_PACKAGE_CHECKERS)

    def test_SETUPTOOLS_IMP_ERR(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

    def test_DOCUMENTATION(self):
        self.assertIsInstance(DOCUMENTATION, str)

    def test_RETURN(self):
        self.assertIsInstance(RETURN, str)

    def test_EXAMPLES(self):
        self.assertIsInstance(EXAMPLES, str)

if __name__ == '__main__':
    unittest.main()