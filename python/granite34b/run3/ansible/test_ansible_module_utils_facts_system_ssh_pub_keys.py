import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_collect_with_no_module(self):
        collector = SshPubKeyFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)

    def test_collect_with_module(self):
        collector = SshPubKeyFactCollector()
        module = object()
        result = collector.collect(module=module)
        self.assertIsInstance(result, dict)

    def test_collect_with_collected_facts(self):
        collector = SshPubKeyFactCollector()
        collected_facts = object()
        result = collector.collect(collected_facts=collected_facts)
        self.assertIsInstance(result, dict)

    def test_collect_with_all_parameters(self):
        collector = SshPubKeyFactCollector()
        module = object()
        collected_facts = object()
        result = collector.collect(module=module, collected_facts=collected_facts)
        self.assertIsInstance(result, dict)

    def test_collect_with_ssh_pub_key_facts(self):
        collector = SshPubKeyFactCollector()
        ssh_pub_key_facts = {'ssh_host_key_dsa_public': 'dsa_key', 'ssh_host_key_rsa_public': 'rsa_key', 'ssh_host_key_ecdsa_public': 'ecdsa_key', 'ssh_host_key_ed25519_public': 'ed25519_key'}
        result = collector.collect()
        self.assertIsInstance(result, dict)

    def test_collect_with_ssh_pub_key_facts_and_module(self):
        collector = SshPubKeyFactCollector()
        ssh_pub_key_facts = {'ssh_host_key_dsa_public': 'dsa_key', 'ssh_host_key_rsa_public': 'rsa_key', 'ssh_host_key_ecdsa_public': 'ecdsa_key', 'ssh_host_key_ed25519_public': 'ed25519_key'}
        module = object()
        result = collector.collect(module=module)
        self.assertIsInstance(result, dict)

    def test_collect_with_ssh_pub_key_facts_and_collected_facts(self):
        collector = SshPubKeyFactCollector()
        ssh_pub_key_facts = {'ssh_host_key_dsa_public': 'dsa_key', 'ssh_host_key_rsa_public': 'rsa_key', 'ssh_host_key_ecdsa_public': 'ecdsa_key', 'ssh_host_key_ed25519_public': 'ed25519_key'}
        collected_facts = object()
        result = collector.collect(host_facts=host_facts, collected_facts=collected_facts)
        self.assertIsInstance(result, dict)

    def test_collect_with_ssh_pub_key_facts_and_all_parameters(self):
        collector = SshPubKeyFactCollector()
        ssh_pub_key_facts = {'ssh_host_key_dsa_public': 'dsa_key', 'ssh_host_key_rsa_public': 'rsa_key', 'ssh_host_key_ecdsa_public': 'ecdsa_key', 'ssh_host_key_ed25519_public': 'ed25519_key'}
        module = object()
        collected_facts = object()
        result = collector.collect(module=module, collected_facts=collected_facts)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()