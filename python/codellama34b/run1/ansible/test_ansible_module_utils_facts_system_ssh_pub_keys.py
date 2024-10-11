import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector
from ansible.module_utils.facts.utils import get_file_content


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect()
        self.assertEqual(result, {'ssh_host_key_rsa_public': 'AAAAB3NzaC1yc[964 chars]519'})

    def test_name(self):
        instance = SshPubKeyFactCollector()
        result = instance.name
        self.assertEqual(result, 'ssh_pub_keys')

    def test__fact_ids(self):
        instance = SshPubKeyFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, {'ssh_host_pub_keys', 'ssh_host_key_dsa_public', 'ssh_host_key_rsa_public', 'ssh_host_key_ecdsa_public', 'ssh_host_key_ed25519_public'})


if __name__ == '__main__':
    unittest.main()