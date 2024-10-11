import unittest
from ansible.module_utils.facts.hardware.netbsd import NetBSDHardware, NetBSDHardwareCollector


class TestNetBSDHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        # Test case for get_cpu_facts method
        # Create an instance of NetBSDHardware class
        instance = NetBSDHardware(module=None)
        # Mock the sysctl method to return mock data
        instance.sysctl = {'machdep.cpu.brand_string': 'Intel(R) Core(TM) i7-8550U CPU @ 1.80GHz'}
        # Call the get_cpu_facts method
        result = instance.get_cpu_facts()
        # Assert that the result contains the expected CPU facts
        self.assertEqual(result, {'processor': ['Intel(R) Core(TM) i7-8550U CPU @ 1.80GHz']})

    def test_get_memory_facts(self):
        # Test case for get_memory_facts method
        # Create an instance of NetBSDHardware class
        instance = NetBSDHardware(module=None)
        # Mock the sysctl method to return mock data
        instance.sysctl = {'hw.physmem': 8589934592}
        # Call the get_memory_facts method
        result = instance.get_memory_facts()
        # Assert that the result contains the expected memory facts
        self.assertEqual(result, {'memtotal_mb': 8192, 'memfree_mb': 0})

    def test_get_mount_facts(self):
        # Test case for get_mount_facts method
        # Create an instance of NetBSDHardware class
        instance = NetBSDHardware(module=None)
        # Mock the get_file_content and get_mount_size methods to return mock data
        instance.get_file_content = lambda x: '/dev/ada0s1a / ext2fs rw 1 1\n/dev/ada0s1b /home ext2fs rw 1 2'
        instance.get_mount_size = lambda x: {'size_total': 1024, 'size_available': 512}
        # Call the get_mount_facts method
        result = instance.get_mount_facts()
        # Assert that the result contains the expected mount facts
        self.assertEqual(result, {'mounts': [{'mount': '/', 'device': '/dev/ada0s1a', 'fstype': 'ext2fs', 'options': 'rw', 'size_total': 1024, 'size_available': 512}, {'mount': '/home', 'device': '/dev/ada0s1b', 'fstype': 'ext2fs', 'options': 'rw', 'size_total': 1024, 'size_available': 512}]})

if __name__ == '__main__':
    unittest.main()