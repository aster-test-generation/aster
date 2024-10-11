import unittest
from ansible.modules.pip import _get_cmd_options, _VCS_RE, op_dict


class TestPipModule(unittest.TestCase):
    def setUp(self):
        self.module = unittest.mock()
        self.module.run_command = unittest.mock.Mock(return_value=(0, '--help\n--option1\n--option2', ''))

    def test_get_cmd_options_success(self):
        cmd = 'pip'
        result = _get_cmd_options(self.module, cmd)
        self.assertEqual(result, ['--help', '--option1', '--option2'])

    def test_get_cmd_options_failure(self):
        self.module.run_command = unittest.mock.Mock(return_value=(1, '', 'error'))
        cmd = 'pip'
        with self.assertRaises(Exception) as context:
            _get_cmd_options(self.module, cmd)
        self.assertIn('Could not get output from pip --help', str(context.exception))

    def test_vcs_re(self):
        self.assertTrue(_VCS_RE.match('git+https://example.com/repo.git'))
        self.assertFalse(_VCS_RE.match('https://example.com/repo.git'))

    def test_op_dict(self):
        self.assertTrue(op_dict['>='](2, 1))
        self.assertFalse(op_dict['>='](1, 2))
        self.assertTrue(op_dict['<='](1, 2))
        self.assertFalse(op_dict['<='](2, 1))
        self.assertTrue(op_dict['>'](2, 1))
        self.assertFalse(op_dict['>'](1, 2))
        self.assertTrue(op_dict['<'](1, 2))
        self.assertFalse(op_dict['<'](2, 1))
        self.assertTrue(op_dict['=='](1, 1))
        self.assertFalse(op_dict['=='](1, 2))
        self.assertTrue(op_dict['!='](1, 2))
        self.assertFalse(op_dict['!='](1, 1))
        self.assertTrue(op_dict['~='](2, 1))
        self.assertFalse(op_dict['~='](1, 2))

if __name__ == '__main__':
    unittest.main()