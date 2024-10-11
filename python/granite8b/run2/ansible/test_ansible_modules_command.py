import unittest
from ansible.modules.command import check_command


class TestCheckCommand(unittest.TestCase):
    def test_check_command_with_list(self):
        module = None
        commandline = ['curl', 'http://example.com']
        check_command(module, commandline)

    def test_check_command_with_string(self):
        module = None
        commandline = 'curl http://example.com'
        check_command(module, commandline)

    def test_check_command_with_invalid_command(self):
        module = None
        commandline = 'invalid_command'
        with self.assertRaises(OSError):
            check_command(module, commandline)

if __name__ == '__main__':
    unittest.main()