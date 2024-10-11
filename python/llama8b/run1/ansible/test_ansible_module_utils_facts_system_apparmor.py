import os
import unittest
from ansible.module_utils.facts.system.apparmor import ApparmorFactCollector


class TestApparmorFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = ApparmorFactCollector()
        facts_dict = collector.collect()
        self.assertIn('apparmor', facts_dict)
        self.assertIn('status', facts_dict['apparmor'])
        self.assertIn('/sys/kernel/security/apparmor', os.listdir('/sys/kernel/security/'))

    def test_collect_disabled(self):
        collector = ApparmorFactCollector()
        facts_dict = collector.collect()
        self.assertIn('apparmor', facts_dict)
        self.assertIn('status', facts_dict['apparmor'])
        self.assertNotIn('/sys/kernel/security/apparmor', os.listdir('/sys/kernel/security/'))

    def test_collect_init(self):
        collector = ApparmorFactCollector()
        self.assertEqual(collector.name, 'apparmor')
        self.assertEqual(collector._fact_ids, set())

    def test_collect_str(self):
        collector = ApparmorFactCollector()
        result = str(collector)
        self.assertEqual(result, 'ApparmorFactCollector')

    def test_collect_repr(self):
        collector = ApparmorFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'ApparmorFactCollector()')

    def test_collect_eq(self):
        collector1 = ApparmorFactCollector()
        collector2 = ApparmorFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()