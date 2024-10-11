import unittest
from ansible.modules.pip import _have_pip_module, _SPECIAL_PACKAGE_CHECKERS, _VCS_RE, op_dict


class TestPipModule(unittest.TestCase):
    def test_have_pip_module(self):
        result = _have_pip_module()
        self.assertIsInstance(result, bool)

    def test_special_package_checkers(self):
        self.assertIn('setuptools', _SPECIAL_PACKAGE_CHECKERS)
        self.assertIn('pip', _SPECIAL_PACKAGE_CHECKERS)

    def test_vcs_re(self):
        self.assertIsNotNone(_VCS_RE.match('git+https://example.com/repo.git'))
        self.assertIsNone(_VCS_RE.match('https://example.com/repo.git'))

    def test_op_dict(self):
        self.assertEqual(op_dict['>='](2, 1), True)
        self.assertEqual(op_dict['<='](1, 2), True)
        self.assertEqual(op_dict['>'](2, 1), True)
        self.assertEqual(op_dict['<'](1, 2), True)
        self.assertEqual(op_dict['=='](1, 1), True)
        self.assertEqual(op_dict['!='](1, 2), True)
        self.assertEqual(op_dict['~='](2, 1), True)

if __name__ == '__main__':
    unittest.main()