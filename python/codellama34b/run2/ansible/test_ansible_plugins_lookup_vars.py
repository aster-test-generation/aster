import unittest
from ansible.plugins.lookup import vars


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run(terms=None, variables=None, **kwargs)
        self.assertEqual(result, None)

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options(var_options=None, direct=None)
        self.assertEqual(result, None)

    def test_get_option(self):
        instance = LookupModule()
        result = instance.get_option(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()