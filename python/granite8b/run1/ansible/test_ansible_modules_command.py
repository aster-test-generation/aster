import unittest
from ansible.modules.command import main


class TestCommandModule(unittest.TestCase):
    def test_command_execution(self):
        module = AnsibleModule(argument_spec={})
        result = main(module)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'Clustering node rabbit@slave1 with rabbit@master …')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['cmd'], ['echo', 'hello'])

    def test_command_with_stdin(self):
        module = AnsibleModule(argument_spec={})
        result = main(module, stdin='hello')
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'Clustering node rabbit@slave1 with rabbit@master …')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['cmd'], ['echo', 'hello'])

    def test_command_with_executable(self):
        module = AnsibleModule(argument_spec={})
        result = main(module, executable='/bin/ls')
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'Clustering node rabbit@slave1 with rabbit@master …')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['cmd'], ['/bin/ls', '-l'])

    def test_command_with_creates(self):
        module = AnsibleModule(argument_spec={})
        result = main(module, creates='/tmp/test.txt')
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'Clustering node rabbit@slave1 with rabbit@master …')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['cmd'], ['echo', 'hello'])

    def test_command_with_removes(self):
        module = AnsibleModule(argument_spec={})
        result = main(module, removes='/tmp/test.txt')
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'Clustering node rabbit@slave1 with rabbit@master …')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['cmd'], ['echo', 'hello'])

    def test_command_with_warn(self):
        module = AnsibleModule(argument_spec={})
        result = main(module, warn=True)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'Clustering node rabbit@slave1 with rabbit@master …')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['cmd'], ['echo', 'hello'])

if __name__ == '__main__':
    unittest.main()