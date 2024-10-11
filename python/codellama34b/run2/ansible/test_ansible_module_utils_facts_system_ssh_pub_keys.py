import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector
from ansible.module_utils.facts.utils import get_file_content
from ansible.module_utils.facts.collector import BaseFactCollector



class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_name(self):
        instance = SshPubKeyFactCollector()
        result = instance.name
        self.assertEqual(result, 'ssh_pub_keys')

    def test_collect(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)

    def test__fact_ids(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)

    def test__fact_ids_elements(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, {'ssh_host_pub_keys', 'ssh_host_key_dsa_public', 'ssh_host_key_rsa_public', 'ssh_host_key_ecdsa_public', 'ssh_host_key_ed25519_public'})

    def test__fact_ids_elements_type(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)

    def test__fact_ids_elements_values(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, {'ssh_host_pub_keys', 'ssh_host_key_dsa_public', 'ssh_host_key_rsa_public', 'ssh_host_key_ecdsa_public', 'ssh_host_key_ed25519_public'})

    def test__fact_ids_elements_values_type(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)

    def test__fact_ids_elements_values_values(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, {'ssh_host_pub_keys', 'ssh_host_key_dsa_public', 'ssh_host_key_rsa_public', 'ssh_host_key_ecdsa_public', 'ssh_host_key_ed25519_public'})

    def test__fact_ids_elements_values_values_type(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)

    def test__fact_ids_elements_values_values_values(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, {'ssh_host_pub_keys', 'ssh_host_key_dsa_public', 'ssh_host_key_rsa_public', 'ssh_host_key_ecdsa_public', 'ssh_host_key_ed25519_public'})

    def test__fact_ids_elements_values_values_values_type(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)

    def test__fact_ids_elements_values_values_values_values(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, {'ssh_host_pub_keys', 'ssh_host_key_dsa_public', 'ssh_host_key_rsa_public', 'ssh_host_key_ecdsa_public', 'ssh_host_key_ed25519_public'})

if __name__ == '__main__':
    unittest.main()