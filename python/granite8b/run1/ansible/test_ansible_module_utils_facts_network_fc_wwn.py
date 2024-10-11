import unittest
from ansible.module_utils.facts.facts.network.fc_wwn import FcWwnInitiatorFactCollector


class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def test_collect_linux(self):
        collector = FcWwnInitiatorFactCollector()
        fc_facts = collector.collect()
        self.assertIn('fibre_channel_wwn', fc_facts)
        self.assertGreater(len(fc_facts['fibre_channel_wwn']), 0)

    def test_collect_sunos(self):
        collector = FcWwnInitiatorFactCollector()
        fc_facts = collector.collect()
        self.assertIn('fibre_channel_wwn', fc_facts)
        self.assertGreater(len(fc_facts['fibre_channel_wwn']), 0)

    def test_collect_aix(self):
        collector = FcWwnInitiatorFactCollector()
        fc_facts = collector.collect()
        self.assertIn('fibre_channel_wwn', fc_facts)
        self.assertGreater(len(fc_facts['fibre_channel_wwn']), 0)

    def test_collect_hpux(self):
        collector = FcWwnInitiatorFactCollector()
        fc_facts = collector.collect()
        self.assertIn('fibre_channel_wwn', fc_facts)
        self.assertGreater(len(fc_facts['fibre_channel_wwn']), 0)

if __name__ == '__main__':
    unittest.main()