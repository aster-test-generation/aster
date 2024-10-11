import unittest
from ansible.module_utils.facts.facts import Facts


class TestFacts(unittest.TestCase):
    def test_get_value(self):
        facts = Facts()
        result = facts.get_value('ansible_os_family')
        self.assertEqual(result, 'Debian')

    def test_get_all_facts(self):
        facts = Facts()
        result = facts.get_all_facts()
        self.assertEqual(result['ansible_os_family'], 'Debian')

    def test_get_specific_fact(self):
        facts = Facts()
        result = facts.get_specific_fact('ansible_os_family')
        self.assertEqual(result, 'Debian')

    def test_get_fact_path(self):
        facts = Facts()
        result = facts.get_fact_path('ansible_os_family')
        self.assertEqual(result, '/etc/ansible/facts.d/os_family.fact')

    def test_get_network_facts(self):
        facts = Facts()
        result = facts.get_network_facts()
        self.assertEqual(result['ansible_default_ipv4']['gateway'], '192.168.1.1')

    def test_get_distribution(self):
        facts = Facts()
        result = facts.get_distribution()
        self.assertEqual(result, 'Debian')

    def test_get_distribution_version(self):
        facts = Facts()
        result = facts.get_distribution_version()
        self.assertEqual(result, '10')

    def test_get_pkg_mgr_path(self):
        facts = Facts()
        result = facts.get_pkg_mgr_path()
        self.assertEqual(result, '/usr/bin/apt-get')

    def test_get_service_mgr(self):
        facts = Facts()
        result = facts.get_service_mgr()
        self.assertEqual(result, 'systemd')

    def test_get_selinux_facts(self):
        facts = Facts()
        result = facts.get_selinux_facts()
        self.assertEqual(result['status'], 'enabled')

    def test_get_env(self):
        facts = Facts()
        result = facts.get_env()
        self.assertEqual(result['HOME'], '/root')

    def test_get_fact_path(self):
        facts = Facts()
        result = facts.get_fact_path('ansible_os_family')
        self.assertEqual(result, '/etc/ansible/facts.d/os_family.fact')

    def test_get_user_facts(self):
        facts = Facts()
        result = facts.get_user_facts()
        self.assertEqual(result['ansible_user_dir'], '/root')

    def test_get_virtual(self):
        facts = Facts()
        result = facts.get_virtual()
        self.assertEqual(result['ansible_virtualization_type'], 'docker')

    def test_get_facter_facts(self):
        facts = Facts()
        result = facts.get_facter_facts()
        self.assertEqual(result['osfamily'], 'Debian')

if __name__ == '__main__':
    unittest.main()