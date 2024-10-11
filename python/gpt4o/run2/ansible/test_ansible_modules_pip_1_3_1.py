import operator
import unittest
from ansible.modules.pip import _is_package_name, _VCS_RE, _SPECIAL_PACKAGE_CHECKERS, op_dict


class TestPipModule(unittest.TestCase):
    def test_is_package_name_true(self):
        result = _is_package_name("bottle")
        self.assertTrue(result)

    def test_is_package_name_false(self):
        result = _is_package_name(">=1.0.0")
        self.assertFalse(result)

    def test_vcs_re_match(self):
        result = _VCS_RE.match("git+https://github.com/ansible/ansible.git")
        self.assertIsNotNone(result)

    def test_vcs_re_no_match(self):
        result = _VCS_RE.match("https://github.com/ansible/ansible.git")
        self.assertIsNone(result)

    def test_special_package_checkers_setuptools(self):
        result = _SPECIAL_PACKAGE_CHECKERS['setuptools']
        self.assertEqual(result, 'import setuptools; print(setuptools.__version__)')

    def test_special_package_checkers_pip(self):
        result = _SPECIAL_PACKAGE_CHECKERS['pip']
        self.assertEqual(result, 'import pkg_resources; print(pkg_resources.get_distribution("pip").version)')

    def test_op_dict_ge(self):
        result = op_dict['>=']
        self.assertEqual(result, operator.ge)

    def test_op_dict_le(self):
        result = op_dict['<=']
        self.assertEqual(result, operator.le)

    def test_op_dict_gt(self):
        result = op_dict['>']
        self.assertEqual(result, operator.gt)

    def test_op_dict_lt(self):
        result = op_dict['<']
        self.assertEqual(result, operator.lt)

    def test_op_dict_eq(self):
        result = op_dict['==']
        self.assertEqual(result, operator.eq)

    def test_op_dict_ne(self):
        result = op_dict['!=']
        self.assertEqual(result, operator.ne)

    def test_op_dict_tilde_eq(self):
        result = op_dict['~=']
        self.assertEqual(result, operator.ge)

if __name__ == '__main__':
    unittest.main()