import unittest
from ansible.module_utils.facts.system.local import *



class TestLocalFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = LocalFactCollector()
        result = instance.collect()
        self.assertEqual(result, {'local': {}})

    def test_collect_with_module(self):
        instance = LocalFactCollector()
        result = instance.collect(module=None)
        self.assertEqual(result, {'local': {}})

    def test_collect_with_collected_facts(self):
        instance = LocalFactCollector()
        result = instance.collect(collected_facts=None)
        self.assertEqual(result, {'local': {}})

    def test_collect_with_module_and_collected_facts(self):
        instance = LocalFactCollector()
        result = instance.collect(module=None, collected_facts=None)
        self.assertEqual(result, {'local': {}})

    def test_collect_with_module_and_collected_facts_and_fact_path(self):
        instance = LocalFactCollector()
        result = instance.collect(module=None, collected_facts=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_fact_path_and_fn(self):
        instance = LocalFactCollector()
        result = instance.collect(module=None, collected_facts=None, fact_path=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_fact_path_and_fn_and_out(self):
        instance = LocalFactCollector()
        result = instance.collect(module=None, collected_facts=None, fn=None, out=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_fact_path_and_fn_and_out_and_err(self):
        instance = LocalFactCollector()
        result = instance.collect(module=None, collected_facts=None, out=None, err=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_fact_path_and_fn_and_out_and_err_and_fact_base(self):
        instance = LocalFactCollector()
        result = instance.collect(module=None, collected_facts=None, fact_path=None, fn=None, out=None, err=None, fact_base=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_fact_path_and_fn_and_out_and_err_and_fact_base_and_cp(self):
        instance = LocalFactCollector()
        result = instance.collect(module=None, collected_facts=None, fact_path=None, fn=None, out=None, err=None, fact_base=None, cp=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_fact_path_and_fn_and_out_and_err_and_fact_base_and_cp_and_sect(self):
        instance = LocalFactCollector()
        result = instance.collect(module=None, collected_facts=None, fact_path=None, fn=None, out=None, err=None, fact_base=None, cp=None, sect=None)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()