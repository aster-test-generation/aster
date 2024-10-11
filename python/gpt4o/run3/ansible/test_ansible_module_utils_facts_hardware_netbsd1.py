import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.hardware.netbsd import NetBSDHardware, NetBSDHardwareCollector
from ansible.module_utils.facts.timeout import TimeoutError

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