import unittest
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector, SELINUX_MODE_DICT


class TestSelinuxFactCollector(unittest.TestCase):
    def test_collect(self):
        facts_dict = SelinuxFactCollector().collect()
        self.assertIn('selinux', facts_dict)
        self.assertIn('selinux_python_present', facts_dict)
        self.assertIn('status', facts_dict['selinux'])
        self.assertIn('policyvers', facts_dict['selinux'])
        self.assertIn('config_mode', facts_dict['selinux'])
        self.assertIn('mode', facts_dict['selinux'])
        self.assertIn('type', facts_dict['selinux'])

    def test_collect_with_selinux_disabled(self):
        facts_dict = SelinuxFactCollector().collect()
        self.assertEqual(facts_dict['selinux']['status'], 'disabled')

    def test_collect_with_selinux_enabled(self):
        facts_dict = SelinuxFactCollector().collect()
        self.assertEqual(facts_dict['selinux']['status'], 'enabled')

    def test_collect_with_unknown_policyvers(self):
        facts_dict = SelinuxFactCollector().collect()
        self.assertEqual(facts_dict['selinux']['policyvers'], 'unknown')

    def test_collect_with_unknown_config_mode(self):
        facts_dict = SelinuxFactCollector().collect()
        self.assertEqual(facts_dict['selinux']['config_mode'], 'unknown')

    def test_collect_with_unknown_mode(self):
        facts_dict = SelinuxFactCollector().collect()
        self.assertEqual(facts_dict['selinux']['mode'], 'unknown')

    def test_collect_with_unknown_type(self):
        facts_dict = SelinuxFactCollector().collect()
        self.assertEqual(facts_dict['selinux']['type'], 'unknown')

if __name__ == '__main__':
    unittest.main()