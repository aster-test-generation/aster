import unittest
from ansible.module_utils.facts.system.ssh_pub_keys import SshPubKeyFactCollector


class TestSshPubKeyFactCollector(unittest.TestCase):
    def test_collect_with_no_module(self):
        collector = SshPubKeyFactCollector()
        collected_facts = collector.collect()
        self.assertIsInstance(collected_facts, dict)

    def test_collect_with_module(self):
        module = 'test_module'
        collector = SshPubKeyFactCollector()
        collected_facts = collector.collect(module=module)
        self.assertIsInstance(collected_facts, dict)

    def test_collect_with_collected_facts(self):
        collected_facts = {}
        collector = SshPubKeyFactCollector()
        collected_facts = collector.collect(collected_facts=collected_facts)
        self.assertIsInstance(collected_facts, dict)

    def test_collect_with_all_parameters(self):
        module = 'test_module'
        collected_facts = {}
        collector = SshPubKeyFactCollector()
        collected_facts = collector.collect(module=module, collected_facts=collected_facts)
        self.assertIsInstance(collected_facts, dict)

if __name__ == '__main__':
    unittest.main()