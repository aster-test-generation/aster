import unittest
from ansible.module_utils.facts.compat import *


class TestGetAllFacts(unittest.TestCase):
    def test_get_all_facts(self):
        from ansible.module_utils.basic import AnsibleModule
        result = get_all_facts(module)
        self.assertEqual(result, {})

class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts(self):
        from ansible.module_utils.basic import AnsibleModule
        result = ansible_facts(module)
        self.assertEqual(result, {})

class TestGetAllFacts(unittest.TestCase):
    def test_get_all_facts(self):
        module = None
        result = get_all_facts(module)
        self.assertEqual(result, None)

    def test_ansible_facts(self):
        module = None
        result = ansible_facts(module)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()