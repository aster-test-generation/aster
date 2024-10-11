import unittest
from ansible.module_utils.facts.system.service_mgr import *


class TestServiceMgrFactCollector(unittest.TestCase):
    def test_is_systemd_managed(self):
        instance = ServiceMgrFactCollector()
        result = instance.is_systemd_managed(None)
        self.assertEqual(result, False)

    def test_is_systemd_managed_offline(self):
        instance = ServiceMgrFactCollector()
        result = instance.is_systemd_managed_offline(None)
        self.assertEqual(result, False)

    def test_collect(self):
        instance = ServiceMgrFactCollector()
        result = instance.collect(None)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()