import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector
from ansible.module_utils.facts.utils import get_file_content



class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_name(self):
        instance = SshPubKeyFactCollector()
        result = instance.name
        self.assertEqual(result, 'ssh_pub_keys')

    def test_collect(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect()
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_module(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect(module=None, collected_facts=None)
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_collected_facts(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect(module=None, collected_facts={})
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_module_and_collected_facts(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect(module=None, collected_facts={})
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_module_and_collected_facts_and_ssh_pub_keys(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect(module=None, collected_facts={'ssh_pub_keys': {}})
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_module_and_collected_facts_and_ssh_pub_keys_and_ssh_host_pub_keys(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect(module=None, collected_facts={'ssh_pub_keys': {'ssh_host_pub_keys': {}}})
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_module_and_collected_facts_and_ssh_pub_keys_and_ssh_host_pub_keys_and_ssh_host_key_dsa_public(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect(module=None, collected_facts={'ssh_pub_keys': {'ssh_host_pub_keys': {'ssh_host_key_dsa_public': {}}}})
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_module_and_collected_facts_and_ssh_pub_keys_and_ssh_host_pub_keys_and_ssh_host_key_rsa_public(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect(module=None, collected_facts={'ssh_pub_keys': {'ssh_host_pub_keys': {'ssh_host_key_rsa_public': {}}}})
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_module_and_collected_facts_and_ssh_pub_keys_and_ssh_host_pub_keys_and_ssh_host_key_ecdsa_public(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect(module=None, collected_facts={'ssh_pub_keys': {'ssh_host_pub_keys': {'ssh_host_key_ecdsa_public': {}}}})
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_collect_with_module_and_collected_facts_and_ssh_pub_keys_and_ssh_host_pub_keys_and_ssh_host_key_ed25519_public(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect(module=None, collected_facts={'ssh_pub_keys': {'ssh_host_pub_keys': {'ssh_host_key_ed25519_public': {}}}})
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

if __name__ == '__main__':
    unittest.main()