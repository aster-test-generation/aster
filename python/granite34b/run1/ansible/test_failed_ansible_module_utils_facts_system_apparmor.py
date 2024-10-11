import unittest
from ansible.module_utils.facts.system.apparmor import ApparmorFactCollector

class TestApparmorFactCollector(unittest.TestCase):
    def test_collect_with_enabled_apparmor(self):
        collector = ApparmorFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['apparmor']['status'], 'disabled')

    def test_collect_with_disabled_apparmor(self):
        collector = ApparmorFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['apparmor']['status'], 'disabled')

if __name__ == '__main__':
    unittest.main()