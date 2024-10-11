import operator
import unittest
from ansible.modules.pip import _have_pip_module, _VCS_RE, _SPECIAL_PACKAGE_CHECKERS, op_dict


class TestPipModule(unittest.TestCase):
    def test_have_pip_module(self):
        result = _have_pip_module()
        self.assertIsInstance(result, bool)

    def test_vcs_re(self):
        match = _VCS_RE.match('git+https://github.com/ansible/ansible.git')
        self.assertIsNotNone(match)
        self.assertEqual(match.group(1), 'git')

    def test_special_package_checkers(self):
        self.assertIn('setuptools', _SPECIAL_PACKAGE_CHECKERS)
        self.assertIn('pip', _SPECIAL_PACKAGE_CHECKERS)
        self.assertEqual(_SPECIAL_PACKAGE_CHECKERS['setuptools'], 'import setuptools; print(setuptools.__version__)')
        self.assertEqual(_SPECIAL_PACKAGE_CHECKERS['pip'], 'import pkg_resources; print(pkg_resources.get_distribution("pip").version)')

    def test_op_dict(self):
        self.assertIn('>=', op_dict)
        self.assertIn('<=', op_dict)
        self.assertIn('>', op_dict)
        self.assertIn('<', op_dict)
        self.assertIn('==', op_dict)
        self.assertIn('!=', op_dict)
        self.assertIn('~=', op_dict)
        self.assertEqual(op_dict['>='], operator.ge)
        self.assertEqual(op_dict['<='], operator.le)
        self.assertEqual(op_dict['>'], operator.gt)
        self.assertEqual(op_dict['<'], operator.lt)
        self.assertEqual(op_dict['=='], operator.eq)
        self.assertEqual(op_dict['!='], operator.ne)
        self.assertEqual(op_dict['~='], operator.ge)

if __name__ == '__main__':
    unittest.main()