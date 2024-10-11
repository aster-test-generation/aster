from ansible.context import CLIArgs
import unittest
from ansible.context import CLIARGS, _init_global_context, cliargs_deferred_get


class TestCLIARGS(unittest.TestCase):
    def test_init(self):
        cli_args = {'foo': 'bar'}
        _init_global_context(cli_args)
        self.assertIsInstance(CLIARGS, CLIArgs)

    def test_get(self):
        cli_args = {'foo': 'bar'}
        _init_global_context(cli_args)
        self.assertEqual(CLIARGS.get('foo'), 'bar')

    def test_str(self):
        cli_args = {'foo': 'bar'}
        _init_global_context(cli_args)
        self.assertEqual(str(CLIARGS), "CLIArgs({'foo': 'bar'})")

    def test_repr(self):
        cli_args = {'foo': 'bar'}
        _init_global_context(cli_args)
        self.assertEqual(repr(CLIARGS), "CLIArgs({'foo': 'bar'})")

class TestCliArgsDeferredGet(unittest.TestCase):
    def test_deferred_get(self):
        cli_args = {'foo': 'bar'}
        _init_global_context(cli_args)
        deferred_get = cliargs_deferred_get('foo')
        self.assertEqual(deferred_get(), 'bar')

    def test_deferred_get_default(self):
        cli_args = {}
        _init_global_context(cli_args)
        deferred_get = cliargs_deferred_get('foo', default='baz')
        self.assertEqual(deferred_get(), 'baz')

    def test_deferred_get_shallowcopy(self):
        cli_args = {'foo': [1, 2, 3]}
        _init_global_context(cli_args)
        deferred_get = cliargs_deferred_get('foo', shallowcopy=True)
        self.assertEqual(deferred_get(), [1, 2, 3])

    def test_deferred_get_mapping(self):
        cli_args = {'foo': {'bar': 'baz'}}
        _init_global_context(cli_args)
        deferred_get = cliargs_deferred_get('foo', shallowcopy=True)
        self.assertEqual(deferred_get(), {'bar': 'baz'})

class TestCLIARGS(unittest.TestCase):
    def test_init(self):
        instance = CLIARGS
        self.assertIsInstance(instance, CLIArgs)

    def test_get(self):
        instance = CLIARGS
        result = instance.get('key', default='default')
        self.assertEqual(result, 'default')

class TestInitGlobalContext(unittest.TestCase):
    def test_init_global_context(self):
        _init_global_context({'key': 'value'})
        self.assertIsInstance(CLIARGS, GlobalCLIArgs)

class TestCliargsDeferredGet(unittest.TestCase):
    def test_cliargs_deferred_get(self):
        deferred_get = cliargs_deferred_get('key', default='default')
        result = deferred_get()
        self.assertEqual(result, 'default')

    def test_cliargs_deferred_get_shallowcopy(self):
        deferred_get = cliargs_deferred_get('key', default=['value'], shallowcopy=True)
        result = deferred_get()
        self.assertEqual(result, ['value'])

    def test_cliargs_deferred_get_mapping(self):
        deferred_get = cliargs_deferred_get('key', default={'key': 'value'}, shallowcopy=True)
        result = deferred_get()
        self.assertEqual(result, {'key': 'value'})

    def test_cliargs_deferred_get_set(self):
        deferred_get = cliargs_deferred_get('key', default={'value'}, shallowcopy=True)
        result = deferred_get()
        self.assertEqual(result, {'value'})

if __name__ == '__main__':
    unittest.main()