import unittest
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector


class TestSelinuxFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        self.assertIn('selinux_python_present', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertIn('status', selinux_facts)
        self.assertIn('policyvers', selinux_facts)
        self.assertIn('config_mode', selinux_facts)
        self.assertIn('mode', selinux_facts)
        self.assertIn('type', selinux_facts)

    def test_collect_missing_selinux_python_library(self):
        collector = SelinuxFactCollector()
        with self.assertRaises(ImportError):
            collector.collect()

    def test_collect_disabled_selinux(self):
        collector = SelinuxFactCollector()
        with self.assertRaises(ImportError):
            collector.collect()

    def test_collect_enabled_selinux(self):
        collector = SelinuxFactCollector()
        with self.assertRaises(ImportError):
            collector.collect()

    def test_collect_unknown_policyvers(self):
        collector = SelinuxFactCollector()
        with self.assertRaises(ImportError):
            collector.collect()

    def test_collect_unknown_config_mode(self):
        collector = SelinuxFactCollector()
        with self.assertRaises(ImportError):
            collector.collect()

    def test_collect_unknown_mode(self):
        collector = SelinuxFactCollector()
        with self.assertRaises(ImportError):
            collector.collect()

    def test_collect_unknown_type(self):
        collector = SelinuxFactCollector()
        with self.assertRaises(ImportError):
            collector.collect()

if __name__ == '__main__':
    unittest.main()