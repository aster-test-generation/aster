import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                name=dict(type='list', elements='str'),
                version=dict(type='str'),
                requirements=dict(type='str'),
                virtualenv=dict(type='path'),
                virtualenv_site_packages=dict(type='bool', default=False),
                virtualenv_command=dict(type='path', default='virtualenv'),
                virtualenv_python=dict(type='str'),
                state=dict(type='str', choices=['absent', 'forcereinstall', 'latest', 'present'], default='present'),
                extra_args=dict(type='str'),
                editable=dict(type='bool', default=False),
                chdir=dict(type='path'),
                executable=dict(type='path'),
                umask=dict(type='str')
            ),
            supports_check_mode=True
        )

    def test_documentation(self):
        self.assertIn('module: pip', DOCUMENTATION)

    def test_examples(self):
        self.assertIn('- name: Install bottle python package', EXAMPLES)

    def test_return(self):
        self.assertIn('cmd:', RETURN)

    def test_setuptools_imp_err(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

    def test_special_package_checkers(self):
        self.assertIn('setuptools', _SPECIAL_PACKAGE_CHECKERS)
        self.assertIn('pip', _SPECIAL_PACKAGE_CHECKERS)

    def test_vcs_re(self):
        self.assertIsNotNone(_VCS_RE.match('git+https://example.com/repo.git'))

    def test_op_dict(self):
        self.assertEqual(op_dict['>='], operator.ge)
        self.assertEqual(op_dict['<='], operator.le)
        self.assertEqual(op_dict['>'], operator.gt)
        self.assertEqual(op_dict['<'], operator.lt)
        self.assertEqual(op_dict['=='], operator.eq)
        self.assertEqual(op_dict['!='], operator.ne)
        self.assertEqual(op_dict['~='], operator.ge)

    def test_module_init(self):
        self.assertIsInstance(self.module, AnsibleModule)

    def test_module_argument_spec(self):
        self.assertIn('name', self.module.argument_spec)
        self.assertIn('version', self.module.argument_spec)
        self.assertIn('requirements', self.module.argument_spec)
        self.assertIn('virtualenv', self.module.argument_spec)
        self.assertIn('virtualenv_site_packages', self.module.argument_spec)
        self.assertIn('virtualenv_command', self.module.argument_spec)
        self.assertIn('virtualenv_python', self.module.argument_spec)
        self.assertIn('state', self.module.argument_spec)
        self.assertIn('extra_args', self.module.argument_spec)
        self.assertIn('editable', self.module.argument_spec)
        self.assertIn('chdir', self.module.argument_spec)
        self.assertIn('executable', self.module.argument_spec)
        self.assertIn('umask', self.module.argument_spec)

    def test_module_supports_check_mode(self):
        self.assertTrue(self.module.supports_check_mode)

if __name__ == '__main__':
    unittest.main()