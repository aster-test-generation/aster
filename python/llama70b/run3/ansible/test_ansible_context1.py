import unittest
from ansible.context import CLIARGS, _init_global_context, cliargs_deferred_get

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