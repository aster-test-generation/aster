import unittest
from ansible.plugins.lookup.varnames import *


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run(terms=['test'], variables={'test': 'test'}, **{'test': 'test'})
        self.assertEqual(result, ['test'])

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options(var_options={'test': 'test'}, direct={'test': 'test'})
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()