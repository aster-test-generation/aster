import unittest
from ansible.module_utils.facts.system.python import *


class TestPythonFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = PythonFactCollector()
        result = instance.collect()
        self.assertIsNotNone(result)

    def test_name(self):
        instance = PythonFactCollector()
        result = instance.name
        self.assertEqual(result, "python")

    def test_collect_with_module(self):
        instance = PythonFactCollector()
        result = instance.collect(module=None)
        self.assertIsNotNone(result)

    def test_collect_with_collected_facts(self):
        instance = PythonFactCollector()
        result = instance.collect(collected_facts=None)
        self.assertIsNotNone(result)

    def test_collect_with_module_and_collected_facts(self):
        instance = PythonFactCollector()
        result = instance.collect(module=None, collected_facts=None)
        self.assertIsNotNone(result)

    def test_fact_ids(self):
        instance = PythonFactCollector()
        result = instance._fact_ids
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()