import unittest
from ansible.module_utils.facts.facts import Facts


class TestFacts(unittest.TestCase):
    def test_get_all_facts(self):
        facts = Facts()
        facts.populate()
        self.assertIsNotNone(facts.facts)

    def test_get_specific_fact(self):
        facts = Facts()
        facts.populate()
        self.assertEqual(facts.get_fact('ansible_os_family'), 'Debian')

    def test_get_nonexistent_fact(self):
        facts = Facts()
        facts.populate()
        self.assertIsNone(facts.get_fact('ansible_nonexistent_fact'))

if __name__ == '__main__':
    unittest.main()