import unittest
from ansible.module_utils.facts.network.fc_wwn import FcWwnInitiatorFactCollector


class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = FcWwnInitiatorFactCollector()
        fc_facts = collector.collect()
        self.assertIn('fibre_channel_wwn', fc_facts)
        self.assertIsInstance(fc_facts['fibre_channel_wwn'], list)

if __name__ == '__main__':
    unittest.main()