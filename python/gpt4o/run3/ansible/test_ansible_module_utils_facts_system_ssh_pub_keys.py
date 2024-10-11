import unittest
from unittest.mock import patch, mock_open
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector
from ansible.module_utils.facts.utils import get_file_content


class TestSshPubKeyFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = SshPubKeyFactCollector()

    def test_collect_no_keys(self):
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value=None):
            result = self.collector.collect()
            self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_keys(self):
        key_data = "ssh-rsa AAAAB3NzaC1yc2EAAAABIwAAAQEArv1... user@hostname"
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value=key_data):
            result = self.collector.collect()
            self.assertIn('ssh_host_key_rsa_public', result)
            self.assertEqual(result['ssh_host_key_rsa_public'], 'AAAAB3NzaC1yc2EAAAADAQABAAABgQCn38xCxxKpGx4N/1qNbdVk3BU+/REsEz/0FfdAjOpQ/8JjBTxYperkSfZT+SUyx61brVhKSjqPRTiV37XWDCaMtV51SgvEUCKhDn9ReUq1YEzYEqx2Ohq948Bee8T1LLyV8f+Xg2vseziM7u5KhDqMWalcmN/5fk8DXAmoHEd/QH7h5fU2va0gRraWXi5OpL8UtB6VEnYR4YjyQt3YuzMaoyNzwZ8w0VANMPSQQuWuK6epY/w9IbXyTNm8M4e0iXOaVIk/zUO20a/6Zeo2JfcsI7lPJsLb5cgxVmJAflDH+E+ZDretkAE+kawM/O4123ftVaWZHbjZgIaeksHaYvA0We5CVP4hhoavXgZAVJMoA85oKn+zPMSvpplyG1igy5Up1Ux42LjdnRE2aosoVsyhTZ9dbNrUhEhqBM4vRZWEKj6QXp7tTVWEgH+mxJjLRtoArDA0MmAnGkukbnGKgETOVBLKFDtSvg8jv309+QnY7aZO7O77GiEH/1qel72ZeV0=')
            self.assertEqual(result['ssh_host_key_rsa_public_keytype'], 'ssh-rsa')

    def test_collect_with_partial_keys(self):
        key_data = "ssh-dss AAAAB3NzaC1kc3MAAACBAP1... user@hostname"
        with patch('ansible.module_utils.facts.utils.get_file_content', side_effect=[key_data, None, None, None]):
            result = self.collector.collect()
            self.assertIn('ssh_host_key_rsa_public', result)
            self.assertEqual(result['ssh_host_key_dsa_public'], 'AAAAB3NzaC1kc3MAAACBAP1...')
            self.assertEqual(result['ssh_host_key_dsa_public_keytype'], 'ssh-dss')

    def test_collect_with_multiple_keys(self):
        key_data_rsa = "ssh-rsa AAAAB3NzaC1yc2EAAAABIwAAAQEArv1... user@hostname"
        key_data_dsa = "ssh-dss AAAAB3NzaC1kc3MAAACBAP1... user@hostname"
        with patch('ansible.module_utils.facts.utils.get_file_content', side_effect=[key_data_dsa, key_data_rsa, None, None]):
            result = self.collector.collect()
            self.assertIn('ssh_host_key_rsa_public', result)
            self.assertIn('ssh_host_key_rsa_public', result)
            self.assertEqual(result['ssh_host_key_dsa_public'], 'AAAAB3NzaC1kc3MAAACBAP1...')
            self.assertEqual(result['ssh_host_key_dsa_public_keytype'], 'ssh-dss')
            self.assertEqual(result['ssh_host_key_rsa_public'], 'AAAAB3NzaC1yc2EAAAABIwAAAQEArv1...')
            self.assertEqual(result['ssh_host_key_rsa_public_keytype'], 'ssh-rsa')

    def test_collect_with_no_module(self):
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value=None):
            result = self.collector.collect(module=None)
            self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_no_collected_facts(self):
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value=None):
            result = self.collector.collect(collected_facts=None)
            self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

if __name__ == '__main__':
    unittest.main()