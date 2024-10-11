import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        instance = PipModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test_documentation(self):
        self.assertEqual(DOCUMENTATION, '\n---\nmodule: pip\n...')

    def test_examples(self):
        self.assertEqual(EXAMPLES, '\n- name: Install bottle python package\n...')

    def test_return(self):
        self.assertEqual(RETURN, '\ncmd:\n  description: pip command used by the module\n...')

    def test_setuptools_imp_err(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

    def test__special_package_checkers(self):
        self.assertEqual(_SPECIAL_PACKAGE_CHECKERS, {'setuptools': 'import setuptools; print(setuptools.__version__)', 'pip': 'import pkg_resources; print(pkg_resources.get_distribution("pip").version)'})

    def test__vcs_re(self):
        self.assertIsInstance(_VCS_RE, re.Pattern)

    def test_op_dict(self):
        self.assertEqual(op_dict, {'>=': operator.ge, '<=': operator.le, '>': operator.gt, '<': operator.lt, '==': operator.eq, '!=': operator.ne, '~=': operator.ge})

    def test__get_package_info(self):
        module = AnsibleModule()
        package = 'setuptools'
        env = None
        result = _get_package_info(module, package, env)
        self.assertIsInstance(result, str)

    def test__get_package_info_with_env(self):
        module = AnsibleModule()
        package = 'setuptools'
        env = '/path/to/env'
        result = _get_package_info(module, package, env)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()