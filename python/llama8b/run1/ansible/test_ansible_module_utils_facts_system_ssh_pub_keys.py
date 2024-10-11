import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = SshPubKeyFactCollector()
        result = collector.collect(module=None, collected_facts=None)
        self.assertIsInstance(result, dict)

    def test_collect_with_file_content(self):
        collector = SshPubKeyFactCollector()
        keydata = 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC...'  # dummy key data
        key_filename = 'path/to/key.pub'
        collector._get_file_content = lambda x: keydata
        collector._get_key_type = lambda x: 'ssh-rsa'
        result = collector.collect(module=None, collected_facts=None)
        self.assertIn('ssh_host_key_rsa_public', result)
        self.assertIn('ssh_host_key_rsa_public_keytype', result)

    def test_collect_without_file_content(self):
        collector = SshPubKeyFactCollector()
        key_filename = 'path/to/non_existent_key.pub'
        collector._get_file_content = lambda x: None
        result = collector.collect(module=None, collected_facts=None)
        self.assertNotIn('ssh_host_key_rsa_public', result)

    def test_get_file_content(self):
        collector = SshPubKeyFactCollector()
        keydata = 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC...'  # dummy key data
        collector._get_file_content = lambda x: keydata
        result = collector._get_file_content('path/to/key.pub')
        self.assertEqual(result, keydata)

    def test_get_key_type(self):
        collector = SshPubKeyFactCollector()
        keytype = 'ssh-rsa'
        collector._get_key_type = lambda x: keytype
        result = collector._get_key_type('path/to/key.pub')
        self.assertEqual(result, keytype)

    def test_str_method(self):
        collector = SshPubKeyFactCollector()
        result = str(collector)
        self.assertEqual(result, 'SshPubKeyFactCollector')

    def test_repr_method(self):
        collector = SshPubKeyFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'SshPubKeyFactCollector()')

if __name__ == '__main__':
    unittest.main()