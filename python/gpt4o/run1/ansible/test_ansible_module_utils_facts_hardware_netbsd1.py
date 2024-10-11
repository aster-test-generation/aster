import unittest
from unittest.mock import patch, mock_open, MagicMock
from ansible.module_utils.facts.hardware.netbsd import NetBSDHardware, NetBSDHardwareCollector
from ansible.module_utils.facts.timeout import TimeoutError

class TestNetBSDHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hardware = NetBSDHardware(self.module)

    @patch('ansible.module_utils.facts.hardware.netbsd.get_sysctl')
    def test_populate(self, mock_get_sysctl):
        mock_get_sysctl.return_value = {'machdep.dmi.system-product': 'TestProduct'}
        with patch.object(self.hardware, 'get_cpu_facts', return_value={'cpu': 'test_cpu'}):
            with patch.object(self.hardware, 'get_memory_facts', return_value={'memory': 'test_memory'}):
                with patch.object(self.hardware, 'get_mount_facts', return_value={'mount': 'test_mount'}):
                    with patch.object(self.hardware, 'get_dmi_facts', return_value={'dmi': 'test_dmi'}):
                        result = self.hardware.populate()
                        self.assertIn('cpu', result)
                        self.assertIn('memory', result)
                        self.assertIn('mount', result)
                        self.assertIn('dmi', result)

    @patch('ansible.module_utils.facts.hardware.netbsd.os.access', return_value=True)
    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=['model name: TestCPU'])
    def test_get_cpu_facts(self, mock_get_file_lines, mock_os_access):
        result = self.hardware.get_cpu_facts()
        self.assertIn('processor', result)
        self.assertEqual(result['processor'], ['TestCPU'])

    @patch('ansible.module_utils.facts.hardware.netbsd.os.access', return_value=True)
    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=['MemTotal: 2048 kB'])
    def test_get_memory_facts(self, mock_get_file_lines, mock_os_access):
        result = self.hardware.get_memory_facts()
        self.assertIn('memtotal_mb', result)
        self.assertEqual(result['memtotal_mb'], 2)

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_content', return_value='device / mount fstype options')
    @patch('ansible.module_utils.facts.hardware.netbsd.get_mount_size', return_value={'size': '100G'})
    def test_get_mount_facts(self, mock_get_mount_size, mock_get_file_content):
        result = self.hardware.get_mount_facts()
        self.assertIn('mounts', result)
        self.assertEqual(result['mounts'][0]['size'], '100G')

    @patch('ansible.module_utils.facts.hardware.netbsd.get_sysctl', return_value={'machdep.dmi.system-product': 'TestProduct'})
    def test_get_dmi_facts(self, mock_get_sysctl):
        self.hardware.sysctl = mock_get_sysctl.return_value
        result = self.hardware.get_dmi_facts()
        self.assertIn('product_name', result)
        self.assertEqual(result['product_name'], 'TestProduct')

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_content', return_value=None)
    def test_get_mount_facts_no_fstab(self, mock_get_file_content):
        result = self.hardware.get_mount_facts()
        self.assertEqual(result, {'mounts': []})

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_lines', return_value=[])
    def test_get_cpu_facts_no_cpuinfo(self, mock_get_file_lines):
        result = self.hardware.get_cpu_facts()
        self.assertEqual(result, {})

    @patch('ansible.module_utils.facts.hardware.netbsd.os.access', return_value=False)
    def test_get_memory_facts_no_meminfo(self, mock_os_access):
        result = self.hardware.get_memory_facts()
        self.assertEqual(result, {})

    @patch('ansible.module_utils.facts.hardware.netbsd.get_file_content', return_value='device / mount fstype options')
    @patch('ansible.module_utils.facts.hardware.netbsd.get_mount_size', side_effect=TimeoutError)
    def test_get_mount_facts_timeout(self, mock_get_mount_size, mock_get_file_content):
        result = self.hardware.get_mount_facts()
        self.assertEqual(result, {'mounts': []})

class TestNetBSDHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = NetBSDHardwareCollector()
        self.assertEqual(collector._fact_class, NetBSDHardware)

    def test_platform(self):
        collector = NetBSDHardwareCollector()
        self.assertEqual(collector._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()