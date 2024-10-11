import re
import unittest
from ansible.module_utils.facts.system.platform import PlatformFactCollector, SOLARIS_I86_RE_PATTERN, solaris_i86_re


class TestPlatformFactCollector(unittest.TestCase):
    def test___init__(self):
        instance = PlatformFactCollector()
        self.assertIsInstance(instance, PlatformFactCollector)

    def test_name(self):
        instance = PlatformFactCollector()
        self.assertEqual(instance.name, 'platform')

    def test__fact_ids(self):
        instance = PlatformFactCollector()
        self.assertEqual(instance._fact_ids, set(['system', 'kernel', 'kernel_version', 'machine', 'python_version', 'architecture', 'machine_id']))

    def test_collect(self):
        instance = PlatformFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('system', result)
        self.assertIn('kernel', result)
        self.assertIn('kernel_version', result)
        self.assertIn('machine', result)
        self.assertIn('python_version', result)
        self.assertIn('architecture', result)
        self.assertIn('machine_id', result)

    def test___str__(self):
        instance = PlatformFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'PlatformFactCollector')

    def test___repr__(self):
        instance = PlatformFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'PlatformFactCollector()')

    def test___eq__(self):
        instance1 = PlatformFactCollector()
        instance2 = PlatformFactCollector()
        self.assertEqual(instance1, instance2)

    def test_collect_with_module(self):
        instance = PlatformFactCollector()
        module = object()  # mock module object
        result = instance.collect(module=module)
        self.assertIsInstance(result, dict)

    def test_collect_with_collected_facts(self):
        instance = PlatformFactCollector()
        collected_facts = {}  # mock collected facts
        result = instance.collect(collected_facts=collected_facts)
        self.assertIsInstance(result, dict)

    def test_solaris_i86_re_pattern(self):
        self.assertEqual(SOLARIS_I86_RE_PATTERN, r'i([3456]86|86pc)')

    def test_solaris_i86_re(self):
        self.assertIsInstance(solaris_i86_re, re.Pattern)

if __name__ == '__main__':
    unittest.main()