import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test___init__(self):
        instance = SshPubKeyFactCollector()
        self.assertIsInstance(instance, SshPubKeyFactCollector)

    def test_name(self):
        instance = SshPubKeyFactCollector()
        self.assertEqual(instance.name, 'ssh_pub_keys')

    def test__fact_ids(self):
        instance = SshPubKeyFactCollector()
        self.assertEqual(instance._fact_ids, set(['ssh_host_pub_keys',
                                                  'ssh_host_key_dsa_public',
                                                  'ssh_host_key_rsa_public',
                                                  'ssh_host_key_ecdsa_public',
                                                  'ssh_host_key_ed25519_public']))

    def test_collect(self):
        instance = SshPubKeyFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)

    def test___str__(self):
        instance = SshPubKeyFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'SshPubKeyFactCollector')

    def test___repr__(self):
        instance = SshPubKeyFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'SshPubKeyFactCollector()')

    def test___eq__(self):
        instance1 = SshPubKeyFactCollector()
        instance2 = SshPubKeyFactCollector()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()