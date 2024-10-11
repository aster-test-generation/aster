import unittest
from ansible.module_utils.common import sys_info
from unittest.mock import patch
from ansible.module_utils import distro

class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        with patch.object(distro, 'id') as mock_id:
            mock_id.return_value = 'Amzn'
            result = sys_info.get_distribution()
            self.assertEqual(result, 'Amazon')

    def test_get_distribution_version(self):
        with patch.object(distro, 'version') as mock_version:
            mock_version.return_value = '1.2.3'
            result = sys_info.get_distribution_version()
            self.assertEqual(result, '1.2.3')

    def test_get_distribution_codename(self):
        with patch.object(distro, 'os_release_info') as mock_os_release_info:
            mock_os_release_info.return_value = {'version_codename': 'codename'}
            result = sys_info.get_distribution_codename()
            self.assertEqual(result, 'codename')

if __name__ == '__main__':
    unittest.main()