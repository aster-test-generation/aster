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

    def test_collect_with_keydir(self):
        collector = SshPubKeyFactCollector()
        keydir = '/etc/ssh'
        result = collector.collect(module=None, collected_facts=None, keydir=keydir)
        self.assertIsInstance(result, dict)
        self.assertIn('ssh_host_pub_keys', result)
        self.assertIn('ssh_host_key_dsa_public', result)
        self.assertIn('ssh_host_key_rsa_public', result)
        self.assertIn('ssh_host_key_ecdsa_public', result)
        self.assertIn('ssh_host_key_ed25519_public', result)

    def test_collect_with_algo(self):
        collector = SshPubKeyFactCollector()
        algo = 'rsa'
        result = collector.collect(module=None, collected_facts=None, algo=algo)
        self.assertIsInstance(result, dict)
        self.assertIn('ssh_host_key_rsa_public', result)

    def test_get_file_content(self):
        collector = SshPubKeyFactCollector()
        key_filename = '/etc/ssh/ssh_host_rsa_key.pub'
        keydata = collector.get_file_content(key_filename)
        self.assertIsInstance(keydata, str)

    def test_split_keydata(self):
        collector = SshPubKeyFactCollector()
        keydata = 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC...'  # sample key data
        (keytype, key) = collector.split_keydata(keydata)
        self.assertEqual(keytype, 'ssh-rsa')
        self.assertIsInstance(key, str)

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