
import unittest
from ansible.module_utils.facts.hardware.openbsd import *

class TestOpenBSDHardware(unittest.TestCase):
    def test_populate(self):
        hardware = OpenBSDHardware()
        hardware.sysctl = {}
        result = hardware.populate()
        self.assertIsNotNone(result)

    def test_get_processor_facts(self):
        hardware = OpenBSDHardware()
        hardware.sysctl = {'hw.model': 'model', 'hw.ncpuonline': 1}
        result = hardware.get_processor_facts()
        self.assertIsNotNone(result)

    def test_get_memory_facts(self):
        hardware = OpenBSDHardware()
        hardware.sysctl = {'hw.usermem': 1024}
        hardware.module = None
        result = hardware.get_memory_facts()
        self.assertIsNotNone(result)

    def test_get_device_facts(self):
        hardware = OpenBSDHardware()
        hardware.sysctl = {'hw.disknames': 'disknames'}
        result = hardware.get_device_facts()
        self.assertIsNotNone(result)

    def test_get_dmi_facts(self):
        hardware = OpenBSDHardware()
        hardware.sysctl = {'hw.product': 'product', 'hw.version': 'version', 'hw.uuid': 'uuid', 'hw.serialno': 'serialno', 'hw.vendor': 'vendor'}
        result = hardware.get_dmi_facts()
        self.assertIsNotNone(result)

    def test_get_uptime_facts(self):
        hardware = OpenBSDHardware()
        hardware.sysctl = {'kern.boottime': 1}
        hardware.module = None
        result = hardware.get_uptime_facts()
        self.assertIsNotNone(result)

    def test_get_mount_facts(self):
        hardware = OpenBSDHardware()
        hardware.module = None
        result = hardware.get_mount_facts()
        self.assertIsNotNone(result)


if __name__ == '__main__':
    unittest.main()