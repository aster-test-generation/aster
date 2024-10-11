import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.hardware.netbsd import NetBSDHardware, NetBSDHardwareCollector
from ansible.module_utils.facts.timeout import TimeoutError


class TestNetBSDHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hardware = NetBSDHardware(self.module)

    @patch('ansible.module_utils.facts.hardware.netbsd.get_sysctl')
    def test_populate(self, mock_get_sysctl):
        mock_get_sysctl.return_value = {'machdep.dmi.system-product': 'TestProduct'}
        self.hardware.get_cpu_facts = MagicMock(return_value={'processor': ['Intel']})
        self.hardware.get_memory_facts = MagicMock(return_value={'memtotal_mb': 1024})
        self.hardware.get_mount_facts = MagicMock(return_value={'mounts': []})
        self.hardware.get_dmi_facts = MagicMock(return_value={'product_name': 'TestProduct'})

        result = self.hardware.populate()
        self.assertIn('processor', result)
        self.assertIn('memtotal_mb', result)
        self.assertIn('mounts', result)
        self.assertIn('product_name', result)

    @patch('ansible.module_utils.facts.hardware.netbsd.os.access', return_value=True)
    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=[
        'model name: Intel(R) Xeon(R) CPU',
        'physical id: 0',
        'cpu cores: 4'
    ])
    def test_get_cpu_facts(self, mock_get_file_lines, mock_os_access):
        result = self.hardware.get_cpu_facts()
        self.assertEqual(result['processor'], ['Intel(R) Xeon(R) CPU'])
        self.assertEqual(result['processor_count'], 1)
        self.assertEqual(result['processor_cores'], 4)

    @patch('ansible.module_utils.facts.hardware.netbsd.os.access', return_value=True)
    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=[
        'MemTotal: 2048 kB',
        'SwapTotal: 1024 kB'
    ])
    def test_get_memory_facts(self, mock_get_file_lines, mock_os_access):
        result = self.hardware.get_memory_facts()
        self.assertEqual(result['memtotal_mb'], 2)
        self.assertEqual(result['swaptotal_mb'], 1)

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_content', return_value='device / mount fstype options')
    @patch('ansible.module_utils.facts.hardware.netbsd.get_mount_size', return_value={'size': 1024})
    def test_get_mount_facts(self, mock_get_mount_size, mock_get_file_content):
        result = self.hardware.get_mount_facts()
        self.assertEqual(result['mounts'][0]['mount'], '/')
        self.assertEqual(result['mounts'][0]['device'], 'device')
        self.assertEqual(result['mounts'][0]['fstype'], 'mount')
        self.assertEqual(result['mounts'][0]['options'], 'options')
        self.assertEqual(result['mounts'][0]['size'], 1024)

    @patch('ansible.module_utils.facts.hardware.netbsd.get_sysctl', return_value={
        'machdep.dmi.system-product': 'TestProduct',
        'machdep.dmi.system-version': '1.0',
        'machdep.dmi.system-uuid': '1234-5678',
        'machdep.dmi.system-serial': 'SN123456',
        'machdep.dmi.system-vendor': 'TestVendor'
    })
    def test_get_dmi_facts(self, mock_get_sysctl):
        self.hardware.sysctl = mock_get_sysctl.return_value
        result = self.hardware.get_dmi_facts()
        self.assertEqual(result['product_name'], 'TestProduct')
        self.assertEqual(result['product_version'], '1.0')
        self.assertEqual(result['product_uuid'], '1234-5678')
        self.assertEqual(result['product_serial'], 'SN123456')
        self.assertEqual(result['system_vendor'], 'TestVendor')

class TestNetBSDHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = NetBSDHardwareCollector()
        self.assertEqual(collector._fact_class, NetBSDHardware)

    def test_platform(self):
        collector = NetBSDHardwareCollector()
        self.assertEqual(collector._platform, 'NetBSD')

class TestNetBSDHardware(unittest.TestCase):
    def setUp(self):
        self.instance = NetBSDHardware(module=MagicMock())

    @patch('ansible.module_utils.facts.hardware.netbsd.get_sysctl')
    @patch('ansible.module_utils.facts.hardware.netbsd.NetBSDHardware.get_cpu_facts')
    @patch('ansible.module_utils.facts.hardware.netbsd.NetBSDHardware.get_memory_facts')
    @patch('ansible.module_utils.facts.hardware.netbsd.NetBSDHardware.get_mount_facts')
    @patch('ansible.module_utils.facts.hardware.netbsd.NetBSDHardware.get_dmi_facts')
    def test_populate(self, mock_get_dmi_facts, mock_get_mount_facts, mock_get_memory_facts, mock_get_cpu_facts, mock_get_sysctl):
        mock_get_sysctl.return_value = {'machdep': 'value'}
        mock_get_cpu_facts.return_value = {'cpu': 'facts'}
        mock_get_memory_facts.return_value = {'memory': 'facts'}
        mock_get_mount_facts.return_value = {'mount': 'facts'}
        mock_get_dmi_facts.return_value = {'dmi': 'facts'}

        result = self.instance.populate()

        self.assertEqual(result, {'cpu': 'facts', 'memory': 'facts', 'mount': 'facts', 'dmi': 'facts'})

    @patch('os.access', return_value=True)
    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=[
        'model name: Intel(R) CPU',
        'physical id: 0',
        'cpu cores: 4'
    ])
    def test_get_cpu_facts(self, mock_get_file_lines, mock_os_access):
        result = self.instance.get_cpu_facts()
        self.assertEqual(result, {
            'processor': ['Intel(R) CPU'],
            'processor_count': 1,
            'processor_cores': 4
        })

    @patch('os.access', return_value=True)
    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=[
        'MemTotal: 2048 kB',
        'SwapTotal: 1024 kB',
        'MemFree: 1024 kB',
        'SwapFree: 512 kB'
    ])
    def test_get_memory_facts(self, mock_get_file_lines, mock_os_access):
        result = self.instance.get_memory_facts()
        self.assertEqual(result, {
            'memtotal_mb': 2,
            'swaptotal_mb': 1,
            'memfree_mb': 1,
            'swapfree_mb': 0
        })

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_content', return_value='device / mount fstype options')
    @patch('ansible.module_utils.facts.hardware.netbsd.get_mount_size', return_value={'size': '100G'})
    def test_get_mount_facts(self, mock_get_mount_size, mock_get_file_content):
        result = self.instance.get_mount_facts()
        self.assertEqual(result, {
            'mounts': [{
                'mount': 'mount',
                'device': 'device',
                'fstype': 'fstype',
                'options': 'options',
                'size': '100G'
            }]
        })

    @patch('ansible.module_utils.facts.hardware.netbsd.get_sysctl', return_value={
        'machdep.dmi.system-product': 'Product',
        'machdep.dmi.system-version': 'Version',
        'machdep.dmi.system-uuid': 'UUID',
        'machdep.dmi.system-serial': 'Serial',
        'machdep.dmi.system-vendor': 'Vendor'
    })
    def test_get_dmi_facts(self, mock_get_sysctl):
        self.instance.sysctl = mock_get_sysctl.return_value
        result = self.instance.get_dmi_facts()
        self.assertEqual(result, {
            'product_name': 'Product',
            'product_version': 'Version',
            'product_uuid': 'UUID',
            'product_serial': 'Serial',
            'system_vendor': 'Vendor'
        })

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_content', return_value=None)
    def test_get_mount_facts_no_fstab(self, mock_get_file_content):
        result = self.instance.get_mount_facts()
        self.assertEqual(result, {'mounts': []})

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=[])
    def test_get_cpu_facts_no_cpuinfo(self, mock_get_file_lines):
        result = self.instance.get_cpu_facts()
        self.assertEqual(result, {})

    @patch('os.access', return_value=False)
    def test_get_memory_facts_no_meminfo(self, mock_os_access):
        result = self.instance.get_memory_facts()
        self.assertEqual(result, {})

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_content', return_value=None)
    def test_get_mount_facts_no_mounts(self, mock_get_file_content):
        result = self.instance.get_mount_facts()
        self.assertEqual(result, {'mounts': []})

class TestNetBSDHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        self.assertEqual(NetBSDHardwareCollector._fact_class, NetBSDHardware)

    def test_platform(self):
        self.assertEqual(NetBSDHardwareCollector._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()