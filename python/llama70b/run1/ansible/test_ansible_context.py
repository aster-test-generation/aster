import unittest
from ansible.context import CLIARGS, _init_global_context, cliargs_deferred_get


class TestCLIARGS(unittest.TestCase):
    def test_CLIARGS_init(self):
        self.assertIsInstance(CLIARGS, CLIArgs)

    def test_CLIARGS_get(self):
        self.assertIsNone(CLIARGS.get('nonexistent_key'))

class Test_init_global_context(unittest.TestCase):
    def test_init_global_context(self):
        _init_global_context({'foo': 'bar'})
        self.assertIsInstance(CLIARGS, GlobalCLIArgs)

class Test_cliargs_deferred_get(unittest.TestCase):
    def test_cliargs_deferred_get(self):
        deferred_get = cliargs_deferred_get('foo', default='baz')
        self.assertEqual(deferred_get(), 'baz')

    def test_cliargs_deferred_get_shallowcopy(self):
        deferred_get = cliargs_deferred_get('foo', default=['bar'], shallowcopy=True)
        self.assertEqual(deferred_get(), ['bar'])

    def test_cliargs_deferred_get_mapping(self):
        deferred_get = cliargs_deferred_get('foo', default={'bar': 'baz'}, shallowcopy=True)
        self.assertEqual(deferred_get(), {'bar': 'baz'})

    def test_cliargs_deferred_get_set(self):
        deferred_get = cliargs_deferred_get('foo', default={'bar', 'baz'}, shallowcopy=True)
        self.assertEqual(deferred_get(), {'bar', 'baz'})

if __name__ == '__main__':
    unittest.main()