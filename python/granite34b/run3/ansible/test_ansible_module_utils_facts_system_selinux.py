import unittest
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector, SELINUX_MODE_DICT


class TestSelinuxFactCollector(unittest.TestCase):
    def test_collect_selinux_facts(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertIn('status', selinux_facts)
        self.assertIn('policyvers', selinux_facts)
        self.assertIn('config_mode', selinux_facts)
        self.assertIn('mode', selinux_facts)
        self.assertIn('type', selinux_facts)

    def test_collect_selinux_facts_when_selinux_is_not_enabled(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertEqual(selinux_facts['status'], 'disabled')

    def test_collect_selinux_facts_when_selinux_is_enabled(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertEqual(selinux_facts['status'], 'enabled')

    def test_collect_selinux_facts_when_selinux_python_library_is_missing(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertEqual(selinux_facts['status'], 'enabled')

    def test_collect_selinux_facts_when_selinux_python_library_is_present(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertEqual(selinux_facts['status'], 'enabled')

    def test_collect_selinux_facts_when_selinux_policyvers_is_unknown(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertEqual(selinux_facts['policyvers'], 33)

    def test_collect_selinux_facts_when_selinux_getenforcemode_is_unknown(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertEqual(selinux_facts['config_mode'], 'permissive')

    def test_collect_selinux_facts_when_selinux_getenforce_is_unknown(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertEqual(selinux_facts['mode'], 'permissive')

    def test_collect_selinux_facts_when_selinux_getpolicytype_is_unknown(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertEqual(selinux_facts['type'], 'targeted')

    def test_collect_selinux_facts_when_selinux_getenforcemode_is_valid(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        selinux_facts = facts_dict['selinux']
        self.assertIn(selinux_facts['config_mode'], SELINUX_MODE_DICT.values())

if __name__ == '__main__':
    unittest.main()