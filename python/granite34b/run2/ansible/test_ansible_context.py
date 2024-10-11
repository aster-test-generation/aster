import unittest
from ansible.context import CLIArgs, GlobalCLIArgs


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        cli_args = CLIArgs({})
        self.assertIsInstance(cli_args, CLIArgs)

    def test_get_set(self):
        cli_args = CLIArgs({})
        cli_args.key = 'value'
        self.assertEqual(cli_args['key'], 'value')

    def test_get_default(self):
        cli_args = CLIArgs({})
        self.assertEqual(cli_args.get('key', default='default'), 'default')

    def test_get_shallowcopy(self):
        cli_args = CLIArgs({})
        cli_args.key = ['value1', 'value2']
        self.assertEqual(cli_args.get('key', shallowcopy=True), ['value1', 'value2'])
        cli_args['key'].append('value3')
        self.assertEqual(cli_args.get('key', shallowcopy=True), ['value1', 'value2'])

    def test_get_copy(self):
        cli_args = CLIArgs({})
        cli_args.key = {'key1': 'value1', 'key2': 'value2'}
        self.assertEqual(cli_args.get('key', shallowcopy=True), {'key1': 'value1', 'key2': 'value2'})
        cli_args['key']['key3'] = 'value3'
        self.assertEqual(cli_args.get('key', shallowcopy=True), {'key1': 'value1', 'key2': 'value2'})

    def test_contains(self):
        cli_args = CLIArgs({})
        cli_args.key = 'value'
        self.assertIn('key', cli_args)
        self.assertNotIn('other_key', cli_args)

    def test_del(self):
        cli_args = CLIArgs({})
        cli_args = {'key': 'value'}
        del cli_args['key']
        self.assertNotIn('key', cli_args)

    def test_len(self):
        cli_args = CLIArgs({})
        self.assertEqual(len(cli_args), 0)
        cli_args.key = 'value'
        self.assertEqual(len(cli_args), 1)

    def test_iter(self):
        cli_args = CLIArgs({})
        cli_args.key1 = 'value1'
        cli_args['key2'] = 'value2'
        keys = []
        for key in cli_args:
            keys.append(key)
        self.assertEqual(keys, ['key1', 'key2'])

    def test_clear(self):
        cli_args = CLIArgs({})
        cli_args.key = 'value'
        cli_args.clear()
        self.assertEqual(len(cli_args), 0)

    def test_update(self):
        cli_args = CLIArgs({})
        cli_args.key1 = 'value1'
        cli_args.update({'key2': 'value2'})
        self.assertEqual(cli_args['key1'], 'value1')
        self.assertEqual(cli_args['key2'], 'value2')

    def test_pop(self):
        cli_args = CLIArgs({})
        cli_args.key = 'value'
        self.assertEqual(cli_args.pop('key'), 'value')
        self.assertNotIn('key', cli_args)

    def test_pop_default(self):
        cli_args = CLIArgs({})
        self.assertEqual(cli_args.get('key', default='default'), 'default')

    def test_popitem(self):
        cli_args = CLIArgs({})
        cli_args.key = 'value'
        key, value = cli_args.popitem()
        self.assertEqual(key, 'key')
        self.assertEqual(value, 'value')
        self.assertNotIn('key', cli_args)

    def test_setdefault(self):
        cli_args = CLIArgs({})
        self.assertEqual(cli_args.set_default('key', default='default'), 'default')
        self.assertEqual(cli_args['key'], 'default')

    def test_eq(self):
        cli_args1 = CLIArgs({})
        cli_args1.key = 'value'
        cli_args2 = CLIArgs({})
        cli_args2['key'] = 'value'
        self.assertEqual(cli_args1, cli_args2)

if __name__ == '__main__':
    unittest.main()