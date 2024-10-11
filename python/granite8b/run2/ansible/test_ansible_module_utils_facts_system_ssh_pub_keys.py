import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = SshPubKeyFactCollector()
        facts = collector.collect()
        self.assertIn('ssh_host_key_rsa_public', facts)
        self.assertIn('ssh_host_key_rsa_public', facts)
        self.assertIn('ssh_host_key_ecdsa_public', facts)
        self.assertIn('ssh_host_key_ed25519_public', facts)
        self.assertEqual(facts['ssh_host_key_dsa_public_keytype'], 'ssh-dss')
        self.assertEqual(facts['ssh_host_key_rsa_public_keytype'], 'ssh-rsa')
        self.assertEqual(facts['ssh_host_key_ecdsa_public_keytype'], 'ecdsa-sha2-nistp256')
        self.assertEqual(facts['ssh_host_key_ed25519_public_keytype'], 'ssh-ed25519')

if __name__ == '__main__':
    unittest.main()