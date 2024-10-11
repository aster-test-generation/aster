import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_collect_with_no_module(self):
        collector = SshPubKeyFactCollector()
        collected_facts = collector.collect()
        self.assertIsInstance(collected_facts, dict)

    def test_collect_with_module(self):
        module = object()
        collector = SshPubKeyFactCollector()
        collected_facts = collector.collect(module=module)
        self.assertIsInstance(collected_facts, dict)

    def test_collect_with_collected_facts(self):
        collected_facts = object()
        collector = SshPubKeyFactCollector()
        result = collector.collect(collected_facts=collected_facts)
        self.assertIsNot(result, collected_facts)

    def test_collect_with_ssh_pub_key_facts(self):
        ssh_pub_key_facts = {'fact1': 'value1', 'fact2': 'value2'}
        collector = SshPubKeyFactCollector()
        result = collector.collect()
        self.assertIs(result, ssh_pub_key_facts)

    def test_collect_with_algos(self):
        algos = ('dsa', 'rsa', 'ecdsa', 'ed25519')
        collector = SshPubKeyFactCollector()
        result = collector.collect()
        self.assertIs(result, algos)

    def test_collect_with_keydirs(self):
        keydirs = ['/etc/ssh', '/etc/openssh', '/etc']
        collector = SshPubKeyFactCollector()
        result = collector.collect()
        self.assertIs(result, keydirs)

    def test_collect_with_key_filename(self):
        key_filename = '/path/to/keyfile'
        collector = SshPubKeyFactCollector()
        result = collector.collect()
        self.assertIs(result, key_filename)

    def test_collect_with_keydata(self):
        keydata = 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCg2J1...'
        collector = SshPubKeyFactCollector()
        result = collector.collect(keydata=keydata)
        self.assertIs(result, keydata)

    def test_collect_with_keytype(self):
        keytype = 'ssh-rsa'
        collector = SshPubKeyFactCollector()
        result = collector.collect()
        self.assertIs(result, keytype)

    def test_collect_with_key(self):
        key = 'AAAAB3NzaC1yc2EAAAADAQABAAABgQCg2J1...'
        collector = SshPubKeyFactCollector()
        result = collector.collect(ssh_key=key)
        self.assertIs(result, key)

    def test_collect_with_factname(self):
        factname = 'ssh_host_key_dsa_public'
        collector = SshPubKeyFactCollector()
        result = collector.collect(hostname=factname)
        self.assertIs(result, factname)

    def test_collect_with_factname_keytype(self):
        factname_keytype = 'ssh_host_key_dsa_public_keytype'
        collector = SshPubKeyFactCollector()
        result = collector.collect(factname_keytype=factname_keytype)
        self.assertIs(result, factname_keytype)

if __name__ == '__main__':
    unittest.main()