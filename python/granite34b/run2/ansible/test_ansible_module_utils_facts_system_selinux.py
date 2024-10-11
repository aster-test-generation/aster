import unittest
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector, SELINUX_MODE_DICT


class TestSelinuxFactCollector(unittest.TestCase):
    def test_collect_selinux_facts(self):
        collector = SelinuxFactCollector()
        facts = collector.collect()
        self.assertIn('selinux', facts)
        self.assertIn('selinux_python_present', facts)
        self.assertIn('status', facts['selinux'])
        self.assertIn('policyvers', facts['selinux'])
        self.assertIn('config_mode', facts['selinux'])
        self.assertIn('mode', facts['selinux'])
        self.assertIn('type', facts['selinux'])

    def test_collect_selinux_facts_when_selinux_is_not_enabled(self):
        collector = SelinuxFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['selinux']['status'], 'enabled')

    def test_collect_selinux_facts_when_selinux_is_enabled(self):
        collector = SelinuxFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['selinux']['status'], 'enabled')

    def test_collect_selinux_facts_when_selinux_policyvers_is_unknown(self):
        collector = SelinuxFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['selinux']['policyvers'], 33)

    def test_collect_selinux_facts_when_selinux_getenforcemode_returns_unknown(self):
        collector = SelinuxFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['selinux']['config_mode'], 'permissive')

    def test_collect_selinux_facts_when_selinux_getenforce_returns_unknown(self):
        collector = SelinuxFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['selinux']['mode'], 'permissive')

    def test_collect_selinux_facts_when_selinux_getpolicytype_returns_unknown(self):
        collector = SelinuxFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['selinux']['type'], 'targeted')

    def test_collect_selinux_facts_when_selinux_is_missing(self):
        collector = SelinuxFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['selinux']['status'], 'enabled')

    def test_collect_selinux_facts_when_selinux_python_is_not_present(self):
        collector = SelinuxFactCollector()
        facts = collector.collect()
        self.assertFalse(facts['selinux_python_present'] == True)

if __name__ == '__main__':
    unittest.main()