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

    def run_command(self, command, use_unsafe_shell=True):
        return 0, 'output', ''

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

    def test_collect_no_module(self):
        instance = ServiceMgrFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertEqual(result, {})

    def test_collect_no_collected_facts(self):
        instance = ServiceMgrFactCollector()
        module = MockModule()  # create a mock module object
        result = instance.collect(module)
        self.assertIsInstance(result, dict)
        self.assertEqual(result, {})

    def test_private_method__get_proc_1(self):
        instance = ServiceMgrFactCollector()
        module = MockModule()  # create a mock module object
        result = instance._ServiceMgrFactCollector__get_proc_1(module)
        self.assertIsNone(result)

    def test_private_method__get_service_mgr_name(self):
        instance = ServiceMgrFactCollector()
        proc_1 = 'init'
        result = instance._ServiceMgrFactCollector__get_service_mgr_name(proc_1)
        self.assertEqual(result, 'init')

    def test_str_method(self):
        instance = ServiceMgrFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'ServiceMgrFactCollector')

    def test_repr_method(self):
        instance = ServiceMgrFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'ServiceMgrFactCollector()')

class MockModule:
    def __init__(self):
        self.get_bin_path = Mock()
        self.run_command = Mock()

if __name__ == '__main__':
    unittest.main()