import unittest
from ansible.module_utils.facts.system.python import *


class TestPythonFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = PythonFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

    def test_name(self):
        instance = PythonFactCollector()
        result = instance.name
        self.assertEqual(result, 'python')

    def test__fact_ids(self):
        instance = PythonFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()