import os
import unittest
from ansible.module_utils.facts.system.service_mgr import ServiceMgrFactCollector


class TestServiceMgrFactCollector(unittest.TestCase):
    def test_init(self):
        instance = ServiceMgrFactCollector()
        self.assertIsInstance(instance, ServiceMgrFactCollector)

    def test_name(self):
        instance = ServiceMgrFactCollector()
        self.assertEqual(instance.name, 'service_mgr')

    def test_fact_ids(self):
        instance = ServiceMgrFactCollector()
        self.assertIsInstance(instance._fact_ids, set)

    def test_required_facts(self):
        instance = ServiceMgrFactCollector()
        self.assertIsInstance(instance.required_facts, set)
        self.assertEqual(instance.required_facts, {'platform', 'distribution'})

    def test_is_systemd_managed(self):
        instance = ServiceMgrFactCollector()
        module = MockModule()  # create a mock module object
        self.assertFalse(instance.is_systemd_managed(module))
        module.get_bin_path.return_value = '/path/to/systemctl'
        self.assertTrue(instance.is_systemd_managed(module))

    def test_is_systemd_managed_offline(self):
        instance = ServiceMgrFactCollector()
        module = MockModule()  # create a mock module object
        self.assertFalse(instance.is_systemd_managed_offline(module))
        module.get_bin_path.return_value = '/path/to/systemctl'
        os.path.islink.return_value = True
        os.readlink.return_value = 'systemd'
        self.assertTrue(instance.is_systemd_managed_offline(module))

    def test_collect(self):
        instance = ServiceMgrFactCollector()
        module = MockModule()  # create a mock module object
        collected_facts = {'platform': 'Linux', 'distribution': 'Ubuntu'}
        result = instance.collect(module, collected_facts)
        self.assertIsInstance(result, dict)
        self.assertEqual(result['service_mgr'], 'systemd')

    def test_private_method__init__(self):
        instance = ServiceMgrFactCollector()
        self.assertIsInstance(instance, ServiceMgrFactCollector)

    def test_magic_method__str__(self):
        instance = ServiceMgrFactCollector()
        self.assertEqual(str(instance), 'ServiceMgrFactCollector')

    def test_magic_method__repr__(self):
        instance = ServiceMgrFactCollector()
        self.assertEqual(repr(instance), 'ServiceMgrFactCollector()')

class MockModule:
    def get_bin_path(self, path):
        return '/path/to/' + path

    def run_command(self, cmd, use_unsafe_shell=True):
        return 0, 'output', ''

if __name__ == '__main__':
    unittest.main()