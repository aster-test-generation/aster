import unittest
from ansible.modules.pip import *



class TestPip(unittest.TestCase):
    def test_get_pip_version(self):
        self.assertEqual(get_pip_version(), 'pip 20.0.2')

    def test_get_pip_command(self):
        self.assertEqual(get_pip_command(), 'pip3')

    def test_get_pip_executable(self):
        self.assertEqual(get_pip_executable(), 'pip3')

    def test_get_pip_executable_version(self):
        self.assertEqual(get_pip_executable_version(), 'pip 19.0.3')

    def test_get_pip_executable_version_error(self):
        self.assertEqual(get_pip_executable_version_error(), 'pip 20.0.2')

    def test_get_pip_executable_version_error_msg(self):
        self.assertEqual(get_pip_executable_version_error_msg(), 'pip')

    def test_get_pip_executable_version_error_exception(self):
        self.assertEqual(get_pip_executable_version_error_exception(), 'pip')

    def test_get_pip_executable_version_error_traceback(self):
        self.assertEqual(get_pip_executable_version_error_traceback(), 'pip')

    def test_get_pip_executable_version_error_stdout(self):
        self.assertEqual(get_pip_executable_version_error_stdout(), 'pip')

    def test_get_pip_executable_version_error_stderr(self):
        self.assertEqual(get_pip_executable_version_error_stderr(), 'pip')

    def test_get_pip_executable_version_error_cmd(self):
        self.assertEqual(get_pip_executable_version_error_cmd(), 'pip')

    def test_get_pip_executable_version_error_rc(self):
        self.assertEqual(get_pip_executable_version_error_rc(), 'pip 20.3.3')

    def test_get_pip_executable_version_error_out(self):
        self.assertEqual(get_pip_executable_version_error_out(), 'pip 20.0.2')

    def test_get_pip_executable_version_error_err(self):
        self.assertEqual(get_pip_executable_version_error_err(), 'pip 20.3.3')

    def test_get_pip_executable_version_error_result(self):
        self.assertEqual(get_pip_executable_version_error_result(), 'pip 20.0.2')

    def test_get_pip_executable_version_error_failed(self):
        self.assertEqual(get_pip_executable_version_error_failed(), 'pip')

    def test_get_pip_executable_version_error_changed(self):
        self.assertEqual(get_pip_executable_version_error_changed(), 'pip 20.0.2')

    def test_get_pip_executable_version_error_msg(self):
        self.assertEqual(get_pip_executable_version_error_msg(), 'pip 20.3.4')

    def test_get_pip_executable_version_error_exception(self):
        self.assertEqual(get_pip_executable_version_error_exception(), 'pip')

    def test_get_pip_executable_version_error_traceback(self):
        self.assertEqual(get_pip_executable_version_error_traceback(), 'pip')

    def test_get_pip_executable_version_error_stdout(self):
        self.assertEqual(get_pip_executable_version_error_stdout(), 'pip 20.0.2')

    def test_get_pip_executable_version_error_stderr(self):
        self.assertEqual(get_pip_executable_version_error_stderr(), 'pip 19.0.3')

    def test_get_pip_executable_version_error_cmd(self):
        self.assertEqual(get_pip_executable_version_error_cmd(), 'pip')

if __name__ == '__main__':
    unittest.main()