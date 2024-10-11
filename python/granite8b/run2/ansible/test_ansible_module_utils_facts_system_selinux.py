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

if __name__ == '__main__':
    unittest.main()