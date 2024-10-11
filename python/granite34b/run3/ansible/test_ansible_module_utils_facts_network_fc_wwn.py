import unittest
from ansible.module_utils.facts.network.fc_wwn import FcWwnInitiatorFactCollector


class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def test_collect_on_linux(self):
        collector = FcWwnInitiatorFactCollector()
        facts = collector.collect(module=None, collected_facts={})
        self.assertIn('fibre_channel_wwn', facts)
        self.assertIsInstance(facts['fibre_channel_wwn'], list)

    def test_collect_on_sunos(self):
        collector = FcWwnInitiatorFactCollector()
        facts = collector.collect(module=None, collected_facts={})
        self.assertIn('fibre_channel_wwn', facts)
        self.assertIsInstance(facts['fibre_channel_wwn'], list)

    def test_collect_on_aix(self):
        collector = FcWwnInitiatorFactCollector()
        facts = collector.collect(module=None, collected_facts={})
        self.assertIn('fibre_channel_wwn', facts)
        self.assertIsInstance(facts['fibre_channel_wwn'], list)

    def test_collect_on_hp_ux(self):
        collector = FcWwnInitiatorFactCollector()
        facts = collector.collect(module=None, collected_facts={})
        self.assertIn('fibre_channel_wwn', facts)
        self.assertIsInstance(facts['fibre_channel_wwn'], list)

if __name__ == '__main__':
    unittest.main()