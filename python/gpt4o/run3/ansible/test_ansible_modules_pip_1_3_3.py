import unittest
from ansible.modules.pip import _get_cmd_options, _VCS_RE, _SPECIAL_PACKAGE_CHECKERS, op_dict


class MockModule:
    def run_command(self, cmd):
        if '--help' in cmd:
            return 0, '--help --version --quiet', ''
        return 1, '', 'error'

    def fail_json(self, msg):
        raise Exception(msg)

class TestPipModule(unittest.TestCase):
    def setUp(self):
        self.module = MockModule()

    def test_get_cmd_options_success(self):
        cmd = 'pip'
        result = _get_cmd_options(self.module, cmd)
        self.assertEqual(result, ['--help', '--version', '--quiet'])

    def test_get_cmd_options_failure(self):
        self.module.run_command = lambda cmd: (1, '', 'error')
        with self.assertRaises(Exception) as context:
            _get_cmd_options(self.module, 'pip')
        self.assertTrue('Could not get output from pip --help: error' in str(context.exception))

    def test_vcs_re(self):
        self.assertTrue(_VCS_RE.match('git+https://example.com/repo.git'))
        self.assertFalse(_VCS_RE.match('https://example.com/repo.git'))

    def test_special_package_checkers(self):
        self.assertIn('setuptools', _SPECIAL_PACKAGE_CHECKERS)
        self.assertIn('pip', _SPECIAL_PACKAGE_CHECKERS)

    def test_op_dict(self):
        self.assertEqual(op_dict['>='](2, 1), True)
        self.assertEqual(op_dict['<='](1, 2), True)
        self.assertEqual(op_dict['>'](2, 1), True)
        self.assertEqual(op_dict['<'](1, 2), True)
        self.assertEqual(op_dict['=='](2, 2), True)
        self.assertEqual(op_dict['!='](2, 1), True)
        self.assertEqual(op_dict['~='](2, 1), True)

if __name__ == '__main__':
    unittest.main()