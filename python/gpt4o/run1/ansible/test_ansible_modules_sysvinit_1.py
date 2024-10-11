import unittest
from ansible.modules.sysvinit import *


class TestSysvinitModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                name=dict(type='str', required=True, aliases=['service']),
                state=dict(type='str', choices=['started', 'stopped', 'restarted', 'reloaded']),
                enabled=dict(type='bool'),
                sleep=dict(type='int', default=1),
                pattern=dict(type='str'),
                runlevels=dict(type='list', elements='str'),
                arguments=dict(type='str', aliases=['args']),
                daemonize=dict(type='bool', default=False)
            ),
            supports_check_mode=True
        )

    def test_documentation(self):
        self.assertIsInstance(DOCUMENTATION, str)

    def test_examples(self):
        self.assertIsInstance(EXAMPLES, str)

    def test_return(self):
        self.assertIsInstance(RETURN, str)

    def test_module_initialization(self):
        self.assertIsInstance(self.module, AnsibleModule)

    def test_argument_spec(self):
        self.assertIn('name', self.module.argument_spec)
        self.assertIn('state', self.module.argument_spec)
        self.assertIn('enabled', self.module.argument_spec)
        self.assertIn('sleep', self.module.argument_spec)
        self.assertIn('pattern', self.module.argument_spec)
        self.assertIn('runlevels', self.module.argument_spec)
        self.assertIn('arguments', self.module.argument_spec)
        self.assertIn('daemonize', self.module.argument_spec)

    def test_argument_spec_defaults(self):
        self.assertEqual(self.module.argument_spec['sleep']['default'], 1)
        self.assertEqual(self.module.argument_spec['daemonize']['default'], False)

    def test_argument_spec_types(self):
        self.assertEqual(self.module.argument_spec['name']['type'], 'str')
        self.assertEqual(self.module.argument_spec['state']['type'], 'str')
        self.assertEqual(self.module.argument_spec['enabled']['type'], 'bool')
        self.assertEqual(self.module.argument_spec['sleep']['type'], 'int')
        self.assertEqual(self.module.argument_spec['pattern']['type'], 'str')
        self.assertEqual(self.module.argument_spec['runlevels']['type'], 'list')
        self.assertEqual(self.module.argument_spec['arguments']['type'], 'str')
        self.assertEqual(self.module.argument_spec['daemonize']['type'], 'bool')

    def test_argument_spec_choices(self):
        self.assertIn('started', self.module.argument_spec['state']['choices'])
        self.assertIn('stopped', self.module.argument_spec['state']['choices'])
        self.assertIn('restarted', self.module.argument_spec['state']['choices'])
        self.assertIn('reloaded', self.module.argument_spec['state']['choices'])

if __name__ == '__main__':
    unittest.main()