import unittest
from ansible.plugins.lookup.varnames import *


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run(terms=["term1", "term2"], variables={"term1": "value1", "term2": "value2"})
        self.assertEqual(result, ["term1", "term2"])

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options(var_options={"term1": "value1", "term2": "value2"}, direct={"term1": "value1", "term2": "value2"})
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()