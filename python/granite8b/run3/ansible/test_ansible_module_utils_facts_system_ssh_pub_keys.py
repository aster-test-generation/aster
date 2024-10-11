import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import *


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('ssh_host_key_rsa_public', result)
        self.assertIn('ssh_host_key_rsa_public', result)
        self.assertIn('ssh_host_key_ecdsa_public', result)
        self.assertIn('ssh_host_key_ed25519_public', result)
        self.assertEqual(result['ssh_host_key_dsa_public_keytype'], 'ssh-dss')
        self.assertEqual(result['ssh_host_key_rsa_public_keytype'], 'ssh-rsa')
        self.assertEqual(result['ssh_host_key_ecdsa_public_keytype'], 'ecdsa-sha2-nistp256')
        self.assertEqual(result['ssh_host_key_ed25519_public_keytype'], 'ssh-ed25519')

    def test_get_file_content(self):
        result = get_file_content('/etc/ssh/ssh_host_dsa_key.pub')
        self.assertIsNotNone(result)
        self.assertEqual(result[0:3], 'ssh-dss')

    def test__fact_ids(self):
        self.assertEqual(SshPubKeyFactCollector._fact_ids, set(['ssh_host_pub_keys',
                                                                   'ssh_host_key_dsa_public',
                                                                   'ssh_host_key_rsa_public',
                                                                   'ssh_host_key_ecdsa_public',
                                                                   'ssh_host_key_ed25519_public']))

    def test_name(self):
        self.assertEqual(SshPubKeyFactCollector.name, 'ssh_pub_keys')

if __name__ == '__main__':
    unittest.main()