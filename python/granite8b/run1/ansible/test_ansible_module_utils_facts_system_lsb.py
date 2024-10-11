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
        self.assertIsInstance(result, dict)

    def test_get_fact(self):
        facts = Facts()
        result = facts.get_fact('ansible_os_family')
        self.assertEqual(result, 'Debian')

    def test_get_var(self):
        facts = Facts()
        result = facts.get_var('ansible_os_family')
        self.assertEqual(result, 'Debian')

    def test_get_vars(self):
        facts = Facts()
        result = facts.get_vars()
        self.assertIsInstance(result, dict)

    def test_get_network_facts(self):
        facts = Facts()
        result = facts.get_network_facts()
        self.assertIsInstance(result, dict)

    def test_get_public_ip(self):
        facts = Facts()
        result = facts.get_public_ip()
        self.assertEqual(result, '192.168.1.1')

    def test_get_local_ip(self):
        facts = Facts()
        result = facts.get_local_ip()
        self.assertEqual(result, '192.168.1.1')

    def test_get_domain(self):
        facts = Facts()
        result = facts.get_domain()
        self.assertEqual(result, 'example.com')

    def test_get_env(self):
        facts = Facts()
        result = facts.get_env()
        self.assertIsInstance(result, dict)

    def test_get_fact_path(self):
        facts = Facts()
        result = facts.get_fact_path('ansible_os_family')
        self.assertEqual(result, '/etc/ansible/facts.d/os_family.fact')

    def test_get_default_fact_path(self):
        facts = Facts()
        result = facts.get_default_fact_path('ansible_os_family')
        self.assertEqual(result, '/etc/ansible/facts.d/os_family.fact')

    def test_get_custom_fact_path(self):
        facts = Facts()
        result = facts.get_custom_fact_path('ansible_os_family')
        self.assertEqual(result, '/etc/ansible/facts.d/os_family.fact')

    def test_get_file_content(self):
        facts = Facts()
        result = facts.get_file_content('/etc/ansible/facts.d/os_family.fact')
        self.assertEqual(result, 'ansible_os_family: Debian')

    def test_get_file_lines(self):
        facts = Facts()
        result = facts.get_file_lines('/etc/ansible/facts.d/os_family.fact')
        self.assertEqual(result, ['ansible_os_family: Debian'])

    def test_get_value_from_file(self):
        facts = Facts()
        result = facts.get_value_from_file('/etc/ansible/facts.d/os_family.fact', 'ansible_os_family')
        self.assertEqual(result, 'Debian')

    def test_get_value_from_file_with_default(self):
        facts = Facts()
        result = facts.get_value_from_file('/etc/ansible/facts.d/os_family.fact', 'ansible_os_family', default='Ubuntu')
        self.assertEqual(result, 'Debian')

    def test_get_value_from_file_with_default_and_value(self):
        facts = Facts()
        result = facts.get_value_from_file('/etc/ansible/facts.d/os_family.fact', 'ansible_os_family', default='Ubuntu', value='Debian')
        self.assertEqual(result, 'Debian')

if __name__ == '__main__':
    unittest.main()