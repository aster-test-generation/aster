import unittest
from ansible.module_utils.facts.system.service_mgr import ServiceMgrFactCollector


class TestServiceMgrFactCollector(unittest.TestCase):
    def test_is_systemd_managed(self):
        collector = ServiceMgrFactCollector()
        self.assertFalse(collector.is_systemd_managed(None))
        self.assertFalse(collector.is_systemd_managed(module=None))
        self.assertFalse(collector.is_systemd_managed(module=object()))
        self.assertTrue(collector.is_systemd_managed(module=object()))

    def test_is_systemd_managed_offline(self):
        collector = ServiceMgrFactCollector()
        self.assertFalse(collector.is_systemd_managed_offline(None))
        self.assertFalse(collector.is_systemd_managed_offline(module=None))
        self.assertFalse(collector.is_systemd_managed_offline(module=object()))
        self.assertTrue(collector.is_systemd_managed_offline(module=object()))

    def test_collect(self):
        collector = ServiceMgrFactCollector()
        self.assertEqual(collector.collect(), {'service_mgr': 'service'})

if __name__ == '__main__':
    unittest.main()