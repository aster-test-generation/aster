import unittest
from ansible.module_utils.facts.system.lsb import LSBFactCollector
from unittest.mock import MagicMock


class TestLSBFactCollector(unittest.TestCase):
    def test_lsb_release_bin(self):
        module = MagicMock()
        module.run_command.return_value = (0, "LSB Version:    :core-4.1-amd64:core-4.1-noarch\nDistributor ID: Ubuntu\nDescription:    Ubuntu 16.04.6 LTS\nRelease:        16.04\nCodename:       xenial", "")
        collector = LSBFactCollector()
        result = collector._lsb_release_bin(self)
        self.assertEqual(result, {'release': '16.04', 'id': 'Ubuntu', 'description': 'Ubuntu 16.04.6 LTS', 'codename': 'xenial'})

    def test_lsb_release_file(self):
        etc_lsb_release_location = '/etc/lsb-release'
        with self.assertRaises(PermissionError):
            f.write("DISTRIB_ID=Ubuntu\nDISTRIB_RELEASE=16.04\nDISTRIB_DESCRIPTION=\"Ubuntu 16.04.6 LTS\"\nDISTRIB_CODENAME=xenial")
        collector = LSBFactCollector()
        result = collector._lsb_release_file(etc_lsb_release_location)
        self.assertEqual(result, {'release': '16.04', 'id': 'Ubuntu', 'description': 'Ubuntu 16.04.6 LTS', 'codename': 'xenial'})
        os.remove(etc_lsb_release_location)

    def test_collect(self):
        module = MagicMock()
        collector = LSBFactCollector()
        result = collector.collect(module)
        self.assertEqual(result, {'lsb': {'release': '16.04', 'id': 'Ubuntu', 'description': 'Ubuntu 16.04.6 LTS', 'codename': 'xenial', 'major_release': '16.04'}})

if __name__ == '__main__':
    unittest.main()