import os
import unittest
from ansible.module_utils.facts.system.apparmor import ApparmorFactCollector


class TestApparmorFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = ApparmorFactCollector()
        facts_dict = collector.collect()
        self.assertIn('apparmor', facts_dict)
        apparmor_facts = facts_dict['apparmor']
        self.assertIn('status', apparmor_facts)
        status = apparmor_facts['status']
        self.assertIn(status, ('enabled', 'disabled'))

    def test_status(self):
        collector = ApparmorFactCollector()
        facts_dict = collector.collect()
        apparmor_facts = facts_dict['apparmor']
        status = apparmor_facts['status']
        self.assertEqual(status, 'enabled' if os.path.exists('/sys/kernel/security/apparmor') else 'disabled')

if __name__ == '__main__':
    unittest.main()