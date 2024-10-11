import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = SshPubKeyFactCollector()
        result = collector.collect(module=None, collected_facts=None)
        self.assertIsInstance(result, dict)
        self.assertIn('ssh_host_pub_keys', result)
        self.assertIn('ssh_host_key_dsa_public', result)
        self.assertIn('ssh_host_key_rsa_public', result)
        self.assertIn('ssh_host_key_ecdsa_public', result)
        self.assertIn('ssh_host_key_ed25519_public', result)

    def test_collect_with_file_content(self):
        collector = SshPubKeyFactCollector()
        keydata = 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC...'  # sample key data
        key_filename = 'path/to/key.pub'
        collector._get_file_content = lambda x: keydata
        result = collector.collect(module=None, collected_facts=None)
        self.assertIn('ssh_host_key_rsa_public', result)
        self.assertEqual(result['ssh_host_key_rsa_public'], keydata)

    def test_get_file_content(self):
        collector = SshPubKeyFactCollector()
        keydata = 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC...'  # sample key data
        collector._get_file_content = lambda x: keydata
        result = collector._get_file_content(key_filename='path/to/key.pub')
        self.assertEqual(result, keydata)

    def test_init(self):
        collector = SshPubKeyFactCollector()
        self.assertEqual(collector.name, 'ssh_pub_keys')
        self.assertEqual(collector._fact_ids, {'ssh_host_pub_keys', 'ssh_host_key_dsa_public', 'ssh_host_key_rsa_public', 'ssh_host_key_ecdsa_public', 'ssh_host_key_ed25519_public'})

    def test_str(self):
        collector = SshPubKeyFactCollector()
        result = str(collector)
        self.assertEqual(result, 'SshPubKeyFactCollector')

    def test_repr(self):
        collector = SshPubKeyFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'SshPubKeyFactCollector()')

if __name__ == '__main__':
    unittest.main()