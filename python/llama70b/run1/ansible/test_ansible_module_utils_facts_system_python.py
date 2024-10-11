import unittest
from ansible.module_utils.facts.system.python import PythonFactCollector, HAS_SSLCONTEXT


class TestPythonFactCollector(unittest.TestCase):
    def test_init(self):
        instance = PythonFactCollector()
        self.assertIsInstance(instance, PythonFactCollector)

    def test_name(self):
        instance = PythonFactCollector()
        self.assertEqual(instance.name, 'python')

    def test_fact_ids(self):
        instance = PythonFactCollector()
        self.assertIsInstance(instance._fact_ids, set)

    def test_collect(self):
        instance = PythonFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('python', result)
        self.assertIn('version', result['python'])
        self.assertIn('version_info', result['python'])
        self.assertIn('executable', result['python'])
        self.assertIn('has_sslcontext', result['python'])

    def test_collect_with_module(self):
        instance = PythonFactCollector()
        result = instance.collect(module='test_module')
        self.assertIsInstance(result, dict)
        self.assertIn('python', result)

    def test_collect_with_collected_facts(self):
        instance = PythonFactCollector()
        result = instance.collect(collected_facts={'test_fact': 'test_value'})
        self.assertIsInstance(result, dict)
        self.assertIn('python', result)

    def test_str_method(self):
        instance = PythonFactCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = PythonFactCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = PythonFactCollector()
        instance2 = PythonFactCollector()
        self.assertEqual(instance1, instance2)

    def test_private_method__init__(self):
        instance = PythonFactCollector()
        result = instance._PythonFactCollector__init__()
        self.assertIsNone(result)

    def test_protected_method_fact_ids(self):
        instance = PythonFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)

if __name__ == '__main__':
    unittest.main()