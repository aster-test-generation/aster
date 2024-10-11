import unittest
from ansible.modules.command import CommandModule


class TestCommandModule(unittest.TestCase):
    def test___init__(self):
        instance = CommandModule(argument_spec=dict())
        self.assertIsInstance(instance, CommandModule)

    def test_run_command(self):
        instance = CommandModule(argument_spec=dict())
        result = instance.run_command(['echo', 'hello'])
        self.assertEqual(result, (0, 'hello\n', ''))

    def test__execute_module(self):
        instance = CommandModule(argument_spec=dict())
        result = instance._execute_module()
        self.assertIsInstance(result, dict)

    def test__get_stderr(self):
        instance = CommandModule(argument_spec=dict())
        result = instance._get_stderr('stderr output')
        self.assertEqual(result, 'stderr output')

    def test__get_stdout(self):
        instance = CommandModule(argument_spec=dict())
        result = instance._get_stdout('stdout output')
        self.assertEqual(result, 'stdout output')

    def test__low_level_execute_command(self):
        instance = CommandModule(argument_spec=dict())
        result = instance._low_level_execute_command(['echo', 'hello'])
        self.assertIsInstance(result, tuple)

    def test__parse_output(self):
        instance = CommandModule(argument_spec=dict())
        result = instance._parse_output('output', 'error')
        self.assertIsInstance(result, dict)

    def test___str__(self):
        instance = CommandModule(argument_spec=dict())
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = CommandModule(argument_spec=dict())
        result = repr(instance)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()