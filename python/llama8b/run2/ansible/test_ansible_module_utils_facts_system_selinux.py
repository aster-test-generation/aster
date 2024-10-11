import unittest
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector


class TestSelinuxFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('selinux', facts_dict)
        self.assertIn('selinux_python_present', facts_dict)
        self.assertIn('status', facts_dict['selinux'])
        self.assertIn('policyvers', facts_dict['selinux'])
        self.assertIn('config_mode', facts_dict['selinux'])
        self.assertIn('mode', facts_dict['selinux'])
        self.assertIn('type', facts_dict['selinux'])

    def test_collect_missing_selinux(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertFalse(facts_dict['selinux_python_present'])
        self.assertIn('status', facts_dict['selinux'])
        self.assertEqual(facts_dict['selinux']['status'], 'Missing selinux Python library')

    def test_collect_enabled(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertTrue(facts_dict['selinux_python_present'])
        self.assertIn('status', facts_dict['selinux'])
        self.assertEqual(facts_dict['selinux']['status'], 'enabled')

    def test_collect_disabled(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertTrue(facts_dict['selinux_python_present'])
        self.assertIn('status', facts_dict['selinux'])
        self.assertEqual(facts_dict['selinux']['status'], 'disabled')

    def test_collect_policyvers(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('policyvers', facts_dict['selinux'])
        self.assertNotEqual(facts_dict['selinux']['policyvers'], 'unknown')

    def test_collect_config_mode(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('config_mode', facts_dict['selinux'])
        self.assertNotEqual(facts_dict['selinux']['config_mode'], 'unknown')

    def test_collect_mode(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('mode', facts_dict['selinux'])
        self.assertNotEqual(facts_dict['selinux']['mode'], 'unknown')

    def test_collect_type(self):
        collector = SelinuxFactCollector()
        facts_dict = collector.collect()
        self.assertIn('type', facts_dict['selinux'])
        self.assertNotEqual(facts_dict['selinux']['type'], 'unknown')

if __name__ == '__main__':
    unittest.main()