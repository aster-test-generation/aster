import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.system.lsb import LSBFactCollector


class TestLSBFactCollector(unittest.TestCase):
    def test_lsb_release_bin(self):
        module = MagicMock()
        module.run_command.return_value = (0, "Distributor ID: Ubuntu\nDescription:    Ubuntu 20.04.3 LTS\nRelease:    20.04\nCodename:   focal", "")
        lsb_path = "/path/to/lsb_release"
        collector = LSBFactCollector()
        lsb_facts = collector._lsb_release_bin(lsb_path, module)
        self.assertEqual(lsb_facts, {'id': 'Ubuntu', 'description': 'Ubuntu 20.04.3 LTS', 'release': '20.04', 'codename': 'focal'})

    def test_lsb_release_file(self):
        etc_lsb_release_location = "/etc/lsb-release"
        collector = LSBFactCollector()
        lsb_facts = collector._lsb_release_file(etc_lsb_release_location)
        self.assertEqual(lsb_facts, {'id': 'Ubuntu', 'release': '20.04', 'description': 'Ubuntu 20.04.3 LTS', 'codename': 'focal'})

    def test_collect(self):
        module = MagicMock()
        module.get_bin_path.return_value = "/path/to/lsb_release"
        collector = LSBFactCollector()
        facts_dict = collector.collect(module=module)
        self.assertEqual(facts_dict, {'lsb': {'id': 'Ubuntu', 'description': 'Ubuntu 20.04.3 LTS', 'release': '20.04', 'codename': 'focal', 'major_release': '20.04'}})

if __name__ == '__main__':
    unittest.main()