import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import *


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = SshPubKeyFactCollector()
        facts = collector.collect()
        self.assertIn('ssh_host_key_rsa_public', facts)
        self.assertIn('ssh_host_key_rsa_public', facts)
        self.assertIn('ssh_host_key_ecdsa_public', facts)
        self.assertIn('ssh_host_key_ed25519_public', facts)

    def test_get_file_content(self):
        key_filename = 'path/to/keyfile'
        keydata = get_file_content(key_filename)
        self.assertIsNotNone(keydata)

    def test_get_key_type(self):
        key_filename = 'path/to/keyfile'
        keydata = get_file_content(key_filename)
        keytype = get_key_type(keydata)
        self.assertEqual(keytype, 'ssh-rsa')

if __name__ == '__main__':
    unittest.main()