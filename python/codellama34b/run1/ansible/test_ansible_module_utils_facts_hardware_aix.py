import unittest
from ansible.module_utils.facts.hardware.aix import *


class TestAIXHardware(unittest.TestCase):
    def test_populate(self):
        instance = AIXHardware(module)
        result = instance.populate()
        self.assertIsNotNone(result)

    def test_get_cpu_facts(self):
        instance = AIXHardware(module)
        result = instance.get_cpu_facts()
        self.assertIsNotNone(result)

    def test_get_memory_facts(self):
        instance = AIXHardware('module')
        result = instance.get_memory_facts()
        self.assertIsNotNone(result)

    def test_get_dmi_facts(self):
        instance = AIXHardware(module)
        result = instance.get_dmi_facts()
        self.assertIsNotNone(result)

    def test_get_vgs_facts(self):
        instance = AIXHardware(module)
        result = instance.get_vgs_facts()
        self.assertIsNotNone(result)

    def test_get_mount_facts(self):
        instance = AIXHardware(module)
        result = instance.get_mount_facts()
        self.assertIsNotNone(result)

    def test_get_device_facts(self):
        instance = AIXHardware(module)
        result = instance.get_device_facts()
        self.assertIsNotNone(result)

class TestAIXHardwareCollector(unittest.TestCase):
    def test_collect(self):
        instance = AIXHardwareCollector()
        result = instance.collect()
        self.assertIsNotNone(result)

    def test_get_fact_class(self):
        instance = AIXHardwareCollector()
        result = instance.get_fact_class()
        self.assertIsNotNone(result)

    def test_get_platform(self):
        instance = AIXHardwareCollector()
        result = instance.get_platform()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()