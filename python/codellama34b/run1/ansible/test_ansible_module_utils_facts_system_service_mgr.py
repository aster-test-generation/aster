import unittest
from ansible.module_utils.facts.system.service_mgr import *


class TestServiceMgrFactCollector(unittest.TestCase):
    def test_is_systemd_managed(self):
        instance = ServiceMgrFactCollector()
        result = instance.is_systemd_managed(module=None)
        self.assertEqual(result, False)

    def test_is_systemd_managed_offline(self):
        instance = ServiceMgrFactCollector()
        result = instance.is_systemd_managed_offline(module=None)
        self.assertEqual(result, False)

    def test_collect(self):
        instance = ServiceMgrFactCollector()
        result = instance.collect(module=None, collected_facts=None)
        self.assertEqual(result, {'service_mgr': 'service'})


if __name__ == '__main__':
    unittest.main()