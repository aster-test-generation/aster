import unittest
from ansible.modules.pip import _is_package_name, _SPECIAL_PACKAGE_CHECKERS, _VCS_RE, op_dict
import operator


class TestPipModule(unittest.TestCase):
    def test_is_package_name_true(self):
        result = _is_package_name("bottle")
        self.assertTrue(result)

    def test_is_package_name_false(self):
        result = _is_package_name(">=1.0.0")
        self.assertFalse(result)

    def test_special_package_checkers_setuptools(self):
        self.assertIn('setuptools', _SPECIAL_PACKAGE_CHECKERS)
        self.assertEqual(_SPECIAL_PACKAGE_CHECKERS['setuptools'], 'import setuptools; print(setuptools.__version__)')

    def test_special_package_checkers_pip(self):
        self.assertIn('pip', _SPECIAL_PACKAGE_CHECKERS)
        self.assertEqual(_SPECIAL_PACKAGE_CHECKERS['pip'], 'import pkg_resources; print(pkg_resources.get_distribution("pip").version)')

    def test_vcs_re(self):
        self.assertIsNotNone(_VCS_RE.match('git+https://example.com/repo.git'))
        self.assertIsNone(_VCS_RE.match('https://example.com/repo.git'))

    def test_op_dict(self):
        self.assertEqual(op_dict['>='], operator.ge)
        self.assertEqual(op_dict['<='], operator.le)
        self.assertEqual(op_dict['>'], operator.gt)
        self.assertEqual(op_dict['<'], operator.lt)
        self.assertEqual(op_dict['=='], operator.eq)
        self.assertEqual(op_dict['!='], operator.ne)
        self.assertEqual(op_dict['~='], operator.ge)

if __name__ == '__main__':
    unittest.main()