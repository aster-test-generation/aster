import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.pip import _fail, _SPECIAL_PACKAGE_CHECKERS, _VCS_RE, op_dict

class TestPipModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.cmd = "pip install ansible"
        self.out = "Successfully installed ansible"
        self.err = ""

    def test_fail_with_stdout(self):
        self.out = "stdout message"
        with self.assertRaises(Exception) as context:
            _fail(self.module, self.cmd, self.out, self.err)
        self.assertIn('stdout: stdout message', str(context.exception))

    def test_fail_with_stderr(self):
        self.err = "stderr message"
        with self.assertRaises(Exception) as context:
            _fail(self.module, self.cmd, self.out, self.err)
        self.assertIn(':stderr: stderr message', str(context.exception))

    def test_fail_with_stdout_and_stderr(self):
        self.out = "stdout message"
        self.err = "stderr message"
        with self.assertRaises(Exception) as context:
            _fail(self.module, self.cmd, self.out, self.err)
        self.assertIn('stdout: stdout message\n:stderr: stderr message', str(context.exception))

    def test_special_package_checkers(self):
        self.assertIn('setuptools', _SPECIAL_PACKAGE_CHECKERS)
        self.assertIn('pip', _SPECIAL_PACKAGE_CHECKERS)
        self.assertEqual(_SPECIAL_PACKAGE_CHECKERS['setuptools'], 'import setuptools; print(setuptools.__version__)')
        self.assertEqual(_SPECIAL_PACKAGE_CHECKERS['pip'], 'import pkg_resources; print(pkg_resources.get_distribution("pip").version)')

    def test_vcs_re(self):
        self.assertTrue(_VCS_RE.match('git+https://example.com/repo.git'))
        self.assertTrue(_VCS_RE.match('svn+https://example.com/repo'))
        self.assertTrue(_VCS_RE.match('hg+https://example.com/repo'))
        self.assertTrue(_VCS_RE.match('bzr+https://example.com/repo'))
        self.assertFalse(_VCS_RE.match('https://example.com/repo'))

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