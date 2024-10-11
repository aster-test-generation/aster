import unittest
from ansible.modules.command import CommandModule


class TestCommandModule(unittest.TestCase):
    def test___init__(self):
        instance = CommandModule()
        self.assertIsInstance(instance, CommandModule)

    def test_run_command(self):
        instance = CommandModule()
        result = instance.run_command(['echo', 'hello'])
        self.assertEqual(result, (0, 'hello\n', ''))

    def test__execute_module(self):
        instance = CommandModule()
        result = instance._execute_module({'command': 'echo hello'})
        self.assertEqual(result, {'changed': True, 'stdout': 'hello\n', 'stderr': '', 'rc': 0})

    def test__parse_params(self):
        instance = CommandModule()
        result = instance._parse_params({'command': 'echo hello'})
        self.assertEqual(result, ['echo', 'hello'])

    def test__get_stderr(self):
        instance = CommandModule()
        result = instance._get_stderr({'stderr': 'error message'})
        self.assertEqual(result, 'error message')

    def test__get_stdout(self):
        instance = CommandModule()
        result = instance._get_stdout({'stdout': 'output message'})
        self.assertEqual(result, 'output message')

    def test__get_rc(self):
        instance = CommandModule()
        result = instance._get_rc({'rc': 0})
        self.assertEqual(result, 0)

    def test__get_start_time(self):
        instance = CommandModule()
        result = instance._get_start_time({'start': '2022-01-01 00:00:00'})
        self.assertEqual(result, '2022-01-01 00:00:00')

    def test__get_end_time(self):
        instance = CommandModule()
        result = instance._get_end_time({'end': '2022-01-01 00:00:01'})
        self.assertEqual(result, '2022-01-01 00:00:01')

    def test__get_delta_time(self):
        instance = CommandModule()
        result = instance._get_delta_time({'delta': '0:00:01'})
        self.assertEqual(result, '0:00:01')

    def test___str__(self):
        instance = CommandModule()
        result = instance.__str__()
        self.assertEqual(result, 'CommandModule')

    def test___repr__(self):
        instance = CommandModule()
        result = instance.__repr__()
        self.assertEqual(result, 'CommandModule()')

if __name__ == '__main__':
    unittest.main()