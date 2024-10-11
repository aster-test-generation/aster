import unittest
from ansible.context import *
from ansible.context import CLIArgs, GlobalCLIArgs, _init_global_context, cliargs_deferred_get


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = CLIArgs({})
        self.assertIsInstance(instance, CLIArgs)

    def test_get(self):
        instance = CLIArgs({})
        result = instance.get('key', default='default')
        self.assertEqual(result, 'default')

    def test_from_options(self):
        instance = CLIArgs({})
        result = GlobalCLIArgs.from_options(instance)
        self.assertIsInstance(result, GlobalCLIArgs)

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = GlobalCLIArgs({})
        self.assertIsInstance(instance, GlobalCLIArgs)

    def test_get(self):
        instance = GlobalCLIArgs({})
        result = instance.get('key', default='default')
        self.assertEqual(result, 'default')

    def test_from_options(self):
        instance = GlobalCLIArgs(None)
        result = GlobalCLIArgs.from_options(instance)
        self.assertIsInstance(result, GlobalCLIArgs)

class TestCLIArgsDeferredGet(unittest.TestCase):
    def test_init(self):
        from pytest_cases import CLIArgsDeferredGet
        self.assertIsInstance(instance, CLIArgsDeferredGet)

    def test_call(self):
        from pytest_cases import CLIArgsDeferredGet
        result = instance()
        self.assertEqual(result, 'default')

    def test_call_shallowcopy(self):
        instance = CLIArgsDeferredShallowCopy('key', default='default')
        result = instance()
        self.assertEqual(result, 'default')

class TestInitGlobalContext(unittest.TestCase):
    def test_init(self):
        instance = CLIArgs({})
        result = _init_global_context(instance)
        self.assertIsInstance(result, GlobalCLIArgs)

class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = CLIArgs({})
        self.assertEqual(instance.args, {})

    def test_get(self):
        instance = CLIArgs({})
        result = instance.get('key', default='default')
        self.assertEqual(result, 'default')

    def test_from_options(self):
        result = GlobalCLIArgs.from_options({})
        self.assertEqual(result.args, {})

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = GlobalCLIArgs({})
        self.assertEqual(instance.args, {})

    def test_get(self):
        instance = GlobalCLIArgs({})
        result = instance.get('key', default='default')
        self.assertEqual(result, 'default')

    def test_from_options(self):
        result = GlobalCLIArgs.from_options({})
        self.assertEqual(result.args, {})

class Test_init_global_context(unittest.TestCase):
    def test_init_global_context(self):
        result = _init_global_context({})
        self.assertEqual(result, None)

class Testcliargs_deferred_get(unittest.TestCase):
    def test_cliargs_deferred_get(self):
        result = cliargs_deferred_get('key', default='default')
        self.assertEqual(result, 'default')

if __name__ == '__main__':
    unittest.main()