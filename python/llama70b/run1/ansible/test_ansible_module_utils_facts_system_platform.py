import re
import unittest
from ansible.module_utils.facts.system.platform import PlatformFactCollector, SOLARIS_I86_RE_PATTERN, solaris_i86_re


class TestPlatformFactCollector(unittest.TestCase):
    def test_init(self):
        instance = PlatformFactCollector()
        self.assertIsInstance(instance, PlatformFactCollector)

    def test_name(self):
        instance = PlatformFactCollector()
        self.assertEqual(instance.name, 'platform')

    def test_fact_ids(self):
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

    def test_private_method__init__(self):
        instance = PlatformFactCollector()
        result = instance._PlatformFactCollector__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = PlatformFactCollector()
        result = instance.__str__()
        self.assertEqual(result, "PlatformFactCollector")

    def test_repr_method(self):
        instance = PlatformFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, "PlatformFactCollector()")

    def test_eq_method(self):
        instance1 = PlatformFactCollector()
        instance2 = PlatformFactCollector()
        self.assertEqual(instance1, instance2)

class TestSOLARIS_I86_RE_PATTERN(unittest.TestCase):
    def test_pattern(self):
        self.assertEqual(SOLARIS_I86_RE_PATTERN, r'i([3456]86|86pc)')

class TestSolarisI86Re(unittest.TestCase):
    def test_compile(self):
        self.assertIsInstance(solaris_i86_re, re.Pattern)

if __name__ == '__main__':
    unittest.main()