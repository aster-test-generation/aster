import unittest
from ansible.context import CLIARGS, _init_global_context, cliargs_deferred_get


class TestCLIARGS(unittest.TestCase):
    def test_init(self):
        cli_args = {'foo': 'bar'}
        _init_global_context(cli_args)
        self.assertEqual(CLIARGS.__dict__, cli_args)

    def test_get(self):
        cli_args = {'foo': 'bar'}
        _init_global_context(cli_args)
        self.assertEqual(CLIARGS.get('foo'), 'bar')

    def test_str(self):
        cli_args = {'foo': 'bar'}
        _init_global_context(cli_args)
        self.assertEqual(str(CLIARGS), "{'foo': 'bar'}")

    def test_repr(self):
        cli_args = {'foo': 'bar'}
        _init_global_context(cli_args)
        self.assertEqual(repr(CLIARGS), "GlobalCLIArgs({'foo': 'bar'})")

class TestCliargsDeferredGet(unittest.TestCase):
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

    def test_deferred_get_shallowcopy_mapping(self):
        cli_args = {'foo': {'a': 1, 'b': 2}}
        _init_global_context(cli_args)
        deferred_get = cliargs_deferred_get('foo', shallowcopy=True)
        self.assertEqual(deferred_get(), {'a': 1, 'b': 2})

if __name__ == '__main__':
    unittest.main()