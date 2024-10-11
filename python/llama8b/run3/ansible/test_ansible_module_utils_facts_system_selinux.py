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

    def test_is_selinux_enabled(self):
        collector = SelinuxFactCollector()
        self.assertFalse(collector.is_selinux_enabled())

    def test_security_policyvers(self):
        collector = SelinuxFactCollector()
        self.assertEqual(collector.security_policyvers(), 'unknown')

    def test_security_getenforce(self):
        collector = SelinuxFactCollector()
        self.assertEqual(collector.security_getenforce(), 'unknown')

    def test_getenforcemode(self):
        collector = SelinuxFactCollector()
        self.assertEqual(collector.getenforcemode(), 'unknown')

    def test_getpolicytype(self):
        collector = SelinuxFactCollector()
        self.assertEqual(collector.getpolicytype(), 'unknown')

    def test_str_method(self):
        collector = SelinuxFactCollector()
        result = str(collector)
        self.assertEqual(result, 'SelinuxFactCollector')

    def test_repr_method(self):
        collector = SelinuxFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'SelinuxFactCollector()')

if __name__ == '__main__':
    unittest.main()