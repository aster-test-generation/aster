import unittest
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector


class TestSelinuxFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertIn('status', selinux_facts)
        self.assertIn('policyvers', selinux_facts)
        self.assertIn('config_mode', selinux_facts)
        self.assertIn('mode', selinux_facts)
        self.assertIn('type', selinux_facts)

    def test_is_selinux_enabled(self):
        collector = SelinuxFactCollector()
        self.assertTrue(collector._is_selinux_enabled())

    def test_security_policyvers(self):
        collector = SelinuxFactCollector()
        self.assertEqual(collector._security_policyvers, 'unknown')

    def test_selinux_getenforcemode(self):
        collector = SelinuxFactCollector()
        self.assertEqual(collector._selinux_getenforcemode(), (0, 0))

    def test_security_getenforce(self):
        collector = SelinuxFactCollector()
        self.assertEqual(collector._security_getenforce(), 1)

    def test_selinux_getpolicytype(self):
        collector = SelinuxFactCollector()
        self.assertEqual(collector._selinux_getpolicytype(), (0, 'targeted'))

if __name__ == '__main__':
    unittest.main()