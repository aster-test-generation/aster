import unittest
from ansible.context import *


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = CLIArgs({})
        self.assertEqual(instance.args, {})

    def test_get(self):
        instance = CLIArgs({})
        result = instance.get('key')
        self.assertEqual(result, None)

    def test_from_options(self):
        result = GlobalCLIArgs.from_options({})
        self.assertEqual(result.args, {})

    def test_deferred_get(self):
        instance = CLIArgs({})
        result = instance.deferred_get('key')
        self.assertEqual(result, None)

    def test_deferred_get_shallowcopy(self):
        instance = CLIArgs(None)
        result = instance.deferred_get('key', shallowcopy=True)
        self.assertEqual(result, None)

    def test_deferred_get_default(self):
        instance = CLIArgs(None)
        result = instance.deferred_get('key', default='default')
        self.assertEqual(result, 'default')

    def test_deferred_get_default_shallowcopy(self):
        instance = CLIArgs(None)
        result = instance.deferred_get('key', default='default', shallowcopy=True)
        self.assertEqual(result, 'default')

    def test_deferred_get_not_shallowcopy(self):
        instance = CLIArgs(None)
        result = instance.deferred_get('key', shallowcopy=False)
        self.assertEqual(result, None)

    def test_deferred_get_not_shallowcopy_default(self):
        instance = CLIArgs({})
        result = instance.deferred_get('key', default='default', shallowcopy=False)
        self.assertEqual(result, 'default')


class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = GlobalCLIArgs(None)
        self.assertEqual(instance.args, {})

    def test_from_options(self):
        result = GlobalCLIArgs.from_options({})
        self.assertEqual(result.args, {})

    def test_deferred_get(self):
        from src.cli.global_cli_args import GlobalCLIArgs
        result = instance.deferred_get('key')
        self.assertEqual(result, None)

    def test_deferred_get_shallowcopy(self):
        instance = GlobalCLIArgs({})
        result = instance.deferred_get('key', shallowcopy=True)
        self.assertEqual(result, None)

    def test_deferred_get_default(self):
        instance = GlobalCLIArgs()
        result = instance.deferred_get('key', default='default')
        self.assertEqual(result, 'default')

    def test_deferred_get_default_shallowcopy(self):
        instance = GlobalCLIArgs({})
        result = instance.deferred_get('key', default='default', shallowcopy=True)
        self.assertEqual(result, 'default')

    def test_deferred_get_not_shallowcopy(self):
        instance = GlobalCLIArgs({})
        result = instance.deferred_get('key', shallowcopy=False)
        self.assertEqual(result, None)

    def test_deferred_get_not_shallowcopy_default(self):
        instance = GlobalCLIArgs({})
        result = instance.deferred_get('key', default='default', shallowcopy=False)
        self.assertEqual(result, 'default')


class Test_init_global_context(unittest.TestCase):
    def test_init_global_context(self):
        result = init_global_context({})
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()