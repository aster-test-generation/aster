import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.hardware.netbsd import NetBSDHardware, NetBSDHardwareCollector
from ansible.module_utils.facts.timeout import TimeoutError


class TestNetBSDHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hardware = NetBSDHardware(self.module)

    @patch('ansible.module_utils.facts.hardware.netbsd.get_sysctl')
    @patch.object(NetBSDHardware, 'get_cpu_facts', return_value={'processor': ['Intel']})
    @patch.object(NetBSDHardware, 'get_memory_facts', return_value={'memtotal_mb': 1024})
    @patch.object(NetBSDHardware, 'get_mount_facts', return_value={'mounts': []})
    @patch.object(NetBSDHardware, 'get_dmi_facts', return_value={'product_name': 'NetBSD'})
    def test_populate(self, mock_dmi, mock_mount, mock_memory, mock_cpu, mock_sysctl):
        mock_sysctl.return_value = {'machdep': 'value'}
        result = self.hardware.populate()
        self.assertEqual(result, {
            'processor': ['Intel'],
            'memtotal_mb': 1024,
            'mounts': [],
            'product_name': 'NetBSD'
        })

    @patch('ansible.module_utils.facts.hardware.netbsd.os.access', return_value=True)
    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=[
        'model name: Intel(R) CPU',
        'physical id: 0',
        'cpu cores: 4'
    ])
    def test_get_cpu_facts(self, mock_get_file_lines, mock_os_access):
        result = self.hardware.get_cpu_facts()
        self.assertEqual(result, {
            'processor': ['Intel(R) CPU'],
            'processor_count': 1,
            'processor_cores': 4
        })

    @patch('ansible.module_utils.facts.hardware.netbsd.os.access', return_value=True)
    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=[
        'MemTotal: 2048 kB',
        'SwapTotal: 1024 kB'
    ])
    def test_get_memory_facts(self, mock_get_file_lines, mock_os_access):
        result = self.hardware.get_memory_facts()
        self.assertEqual(result, {
            'memtotal_mb': 2,
            'swaptotal_mb': 1
        })

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_content', return_value='device / mount fstype options')
    @patch('ansible.module_utils.facts.hardware.netbsd.get_mount_size', return_value={'size': 100})
    def test_get_mount_facts(self, mock_get_mount_size, mock_get_file_content):
        result = self.hardware.get_mount_facts()
        self.assertEqual(result, {
            'mounts': [{
                'mount': 'mount',
                'device': 'device',
                'fstype': 'fstype',
                'options': 'options',
                'size': 100
            }]
        })

    @patch('ansible.module_utils.facts.hardware.netbsd.get_sysctl', return_value={
        'machdep.dmi.system-product': 'NetBSD Product',
        'machdep.dmi.system-version': '1.0',
        'machdep.dmi.system-uuid': 'UUID',
        'machdep.dmi.system-serial': 'Serial',
        'machdep.dmi.system-vendor': 'Vendor'
    })
    def test_get_dmi_facts(self, mock_get_sysctl):
        self.hardware.sysctl = mock_get_sysctl.return_value
        result = self.hardware.get_dmi_facts()
        self.assertEqual(result, {
            'product_name': 'NetBSD Product',
            'product_version': '1.0',
            'product_uuid': 'UUID',
            'product_serial': 'Serial',
            'system_vendor': 'Vendor'
        })

class TestNetBSDHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = NetBSDHardwareCollector()
        self.assertEqual(collector._fact_class, NetBSDHardware)

    def test_platform(self):
        collector = NetBSDHardwareCollector()
        self.assertEqual(collector._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()