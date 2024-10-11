import unittest
from ansible.module_utils.facts.system.service_mgr import *


class TestServiceMgrFactCollector(unittest.TestCase):
    def test_is_systemd_managed(self):
        module = None
        result = ServiceMgrFactCollector.is_systemd_managed(module)
        self.assertEqual(result, False)

    def test_is_systemd_managed_offline(self):
        module = None
        result = ServiceMgrFactCollector.is_systemd_managed_offline(module)
        self.assertEqual(result, False)

    def test_collect(self):
        module = None
        collected_facts = None
        result = ServiceMgrFactCollector().collect(module, collected_facts)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()